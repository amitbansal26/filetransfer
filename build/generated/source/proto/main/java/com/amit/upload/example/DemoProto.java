// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: upload/upload.proto

package com.amit.upload.example;

public final class DemoProto {
  private DemoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcdemo_Chunk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcdemo_Chunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcdemo_UploadStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcdemo_UploadStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcdemo_DownloadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcdemo_DownloadFileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023upload/upload.proto\022\010grpcdemo\"\030\n\005Chunk" +
      "\022\017\n\007Content\030\001 \001(\014\"I\n\014UploadStatus\022\017\n\007Mes" +
      "sage\030\001 \001(\t\022(\n\004Code\030\002 \001(\0162\032.grpcdemo.Uplo" +
      "adStatusCode\"\'\n\023DownloadFileRequest\022\020\n\010f" +
      "ileName\030\001 \001(\t*3\n\020UploadStatusCode\022\013\n\007Unk" +
      "nown\020\000\022\006\n\002Ok\020\001\022\n\n\006Failed\020\0022F\n\rUploadServ" +
      "ice\0225\n\006Upload\022\017.grpcdemo.Chunk\032\026.grpcdem" +
      "o.UploadStatus\"\000(\0012S\n\017DownloadService\022@\n" +
      "\014downloadFile\022\035.grpcdemo.DownloadFileReq" +
      "uest\032\017.grpcdemo.Chunk0\001B,\n\027com.amit.uplo" +
      "ad.exampleB\tDemoProtoP\001\242\002\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpcdemo_Chunk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcdemo_Chunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcdemo_Chunk_descriptor,
        new java.lang.String[] { "Content", });
    internal_static_grpcdemo_UploadStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcdemo_UploadStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcdemo_UploadStatus_descriptor,
        new java.lang.String[] { "Message", "Code", });
    internal_static_grpcdemo_DownloadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpcdemo_DownloadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcdemo_DownloadFileRequest_descriptor,
        new java.lang.String[] { "FileName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
