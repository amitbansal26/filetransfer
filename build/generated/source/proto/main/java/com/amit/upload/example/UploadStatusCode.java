// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: upload/upload.proto

package com.amit.upload.example;

/**
 * Protobuf enum {@code grpcdemo.UploadStatusCode}
 */
public enum UploadStatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <code>Ok = 1;</code>
   */
  Ok(1),
  /**
   * <code>Failed = 2;</code>
   */
  Failed(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>Ok = 1;</code>
   */
  public static final int Ok_VALUE = 1;
  /**
   * <code>Failed = 2;</code>
   */
  public static final int Failed_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UploadStatusCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UploadStatusCode forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Ok;
      case 2: return Failed;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UploadStatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UploadStatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UploadStatusCode>() {
          public UploadStatusCode findValueByNumber(int number) {
            return UploadStatusCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.amit.upload.example.DemoProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UploadStatusCode[] VALUES = values();

  public static UploadStatusCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UploadStatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpcdemo.UploadStatusCode)
}

