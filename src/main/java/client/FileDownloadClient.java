package client;

import com.amit.upload.example.Chunk;
import com.amit.upload.example.DownloadFileRequest;
import com.amit.upload.example.DownloadServiceGrpc;
import com.amit.upload.example.UploadServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.*;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDownloadClient {

    private final DownloadServiceGrpc.DownloadServiceBlockingStub blockingStub;
    private final DownloadServiceGrpc.DownloadServiceStub nonBlockingStub;

    private ManagedChannel channel;
    private static Logger logger;
    public FileDownloadClient(String host, int port) throws IOException{
        this(ManagedChannelBuilder.forAddress(host, port)
                .keepAliveTime(60, TimeUnit.SECONDS)
                .keepAliveWithoutCalls(true)
                .usePlaintext());
    }
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    private FileDownloadClient(ManagedChannelBuilder channelBuilder) throws IOException{
        logger = Logger.getLogger("logger.info");
        logger.setLevel(Level.INFO);

        File logFile = new File("src/main/log/downloadclient.log");
        FileHandler fileHandler = new FileHandler(logFile.getAbsolutePath(), 10240, 1, true);
        fileHandler.setLevel(Level.INFO);
        fileHandler.setFormatter(new FileUploadClient.MyLogFormatter());
        logger.addHandler(fileHandler);
        channel = channelBuilder.build();
        blockingStub = DownloadServiceGrpc.newBlockingStub(channel);
        nonBlockingStub = DownloadServiceGrpc.newStub(channel);
    }

    public ByteArrayOutputStream downloadFile(String fileName) {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final CountDownLatch finishLatch = new CountDownLatch(1);
        final AtomicBoolean completed = new AtomicBoolean(false);

        StreamObserver<Chunk> streamObserver = new StreamObserver<Chunk>() {
            @Override
            public void onNext(Chunk dataChunk) {

                try {

                    bos.write(dataChunk.getContent().toByteArray());
                } catch (IOException e) {
                    logger.info("error on write to byte array stream");
                    onError(e);
                }
            }

            @Override
            public void onError(Throwable t) {
                logger.info("downloadFile() error" + t.getMessage());
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("downloadFile() has been completed!");
                completed.compareAndSet(false, true);
                finishLatch.countDown();
            }
        };

        try {

            DownloadFileRequest.Builder builder = DownloadFileRequest
                    .newBuilder()
                    .setFileName(fileName);

            nonBlockingStub.downloadFile(builder.build(), streamObserver);

            finishLatch.await(5, TimeUnit.MINUTES);

            if (!completed.get()) {
                throw new Exception("The downloadFile() method did not complete");
            }

        } catch (Exception e) {
            logger.info("The downloadFile() method did not complete");
            e.printStackTrace();
            e.getMessage();
        }

        return bos;
    }


    public static void main(String[] args) throws InterruptedException, IOException {
        String hostname = "127.0.0.1";
        int chunkSize = Integer.parseInt("100");
        FileDownloadClient client = new FileDownloadClient(hostname, 8980);
        Date start = new Date();
        ByteArrayOutputStream bos = client.downloadFile("file-10M");
        bos.writeTo(new FileOutputStream(new File("src/main/resources/test.txt")));
        Date end = new Date();
        float diff = end.getTime() - start.getTime();
        System.out.println(String.valueOf(diff / 1000) + "s");
        client.shutdown();
    }

}
