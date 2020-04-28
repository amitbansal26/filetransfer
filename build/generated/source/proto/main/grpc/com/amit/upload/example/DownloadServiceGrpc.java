package com.amit.upload.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: upload/upload.proto")
public final class DownloadServiceGrpc {

  private DownloadServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcdemo.DownloadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.amit.upload.example.DownloadFileRequest,
      com.amit.upload.example.Chunk> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "downloadFile",
      requestType = com.amit.upload.example.DownloadFileRequest.class,
      responseType = com.amit.upload.example.Chunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.amit.upload.example.DownloadFileRequest,
      com.amit.upload.example.Chunk> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<com.amit.upload.example.DownloadFileRequest, com.amit.upload.example.Chunk> getDownloadFileMethod;
    if ((getDownloadFileMethod = DownloadServiceGrpc.getDownloadFileMethod) == null) {
      synchronized (DownloadServiceGrpc.class) {
        if ((getDownloadFileMethod = DownloadServiceGrpc.getDownloadFileMethod) == null) {
          DownloadServiceGrpc.getDownloadFileMethod = getDownloadFileMethod =
              io.grpc.MethodDescriptor.<com.amit.upload.example.DownloadFileRequest, com.amit.upload.example.Chunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "downloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.amit.upload.example.DownloadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.amit.upload.example.Chunk.getDefaultInstance()))
              .setSchemaDescriptor(new DownloadServiceMethodDescriptorSupplier("downloadFile"))
              .build();
        }
      }
    }
    return getDownloadFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DownloadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DownloadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DownloadServiceStub>() {
        @java.lang.Override
        public DownloadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DownloadServiceStub(channel, callOptions);
        }
      };
    return DownloadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DownloadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DownloadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DownloadServiceBlockingStub>() {
        @java.lang.Override
        public DownloadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DownloadServiceBlockingStub(channel, callOptions);
        }
      };
    return DownloadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DownloadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DownloadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DownloadServiceFutureStub>() {
        @java.lang.Override
        public DownloadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DownloadServiceFutureStub(channel, callOptions);
        }
      };
    return DownloadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DownloadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void downloadFile(com.amit.upload.example.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<com.amit.upload.example.Chunk> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDownloadFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.amit.upload.example.DownloadFileRequest,
                com.amit.upload.example.Chunk>(
                  this, METHODID_DOWNLOAD_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class DownloadServiceStub extends io.grpc.stub.AbstractAsyncStub<DownloadServiceStub> {
    private DownloadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownloadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DownloadServiceStub(channel, callOptions);
    }

    /**
     */
    public void downloadFile(com.amit.upload.example.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<com.amit.upload.example.Chunk> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DownloadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DownloadServiceBlockingStub> {
    private DownloadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownloadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DownloadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.amit.upload.example.Chunk> downloadFile(
        com.amit.upload.example.DownloadFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DownloadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DownloadServiceFutureStub> {
    private DownloadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownloadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DownloadServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DOWNLOAD_FILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DownloadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DownloadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((com.amit.upload.example.DownloadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.amit.upload.example.Chunk>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DownloadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DownloadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.amit.upload.example.DemoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DownloadService");
    }
  }

  private static final class DownloadServiceFileDescriptorSupplier
      extends DownloadServiceBaseDescriptorSupplier {
    DownloadServiceFileDescriptorSupplier() {}
  }

  private static final class DownloadServiceMethodDescriptorSupplier
      extends DownloadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DownloadServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DownloadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DownloadServiceFileDescriptorSupplier())
              .addMethod(getDownloadFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
