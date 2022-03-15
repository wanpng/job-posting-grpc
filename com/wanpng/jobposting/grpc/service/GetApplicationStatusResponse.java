// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/job_posting_service.grpc.proto

package com.wanpng.jobposting.grpc.service;

/**
 * Protobuf type {@code protos.service.GetApplicationStatusResponse}
 */
public final class GetApplicationStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.GetApplicationStatusResponse)
    GetApplicationStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetApplicationStatusResponse.newBuilder() to construct.
  private GetApplicationStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetApplicationStatusResponse() {
    applicationStatus_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetApplicationStatusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetApplicationStatusResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            applicationStatuId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            applicationStatus_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetApplicationStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetApplicationStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.class, com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.Builder.class);
  }

  public static final int APPLICATION_STATU_ID_FIELD_NUMBER = 1;
  private int applicationStatuId_;
  /**
   * <code>int32 application_statu_id = 1;</code>
   * @return The applicationStatuId.
   */
  @java.lang.Override
  public int getApplicationStatuId() {
    return applicationStatuId_;
  }

  public static final int APPLICATION_STATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object applicationStatus_;
  /**
   * <code>string application_status = 2;</code>
   * @return The applicationStatus.
   */
  @java.lang.Override
  public java.lang.String getApplicationStatus() {
    java.lang.Object ref = applicationStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string application_status = 2;</code>
   * @return The bytes for applicationStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationStatusBytes() {
    java.lang.Object ref = applicationStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (applicationStatuId_ != 0) {
      output.writeInt32(1, applicationStatuId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationStatus_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, applicationStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (applicationStatuId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, applicationStatuId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationStatus_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, applicationStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse)) {
      return super.equals(obj);
    }
    com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse other = (com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse) obj;

    if (getApplicationStatuId()
        != other.getApplicationStatuId()) return false;
    if (!getApplicationStatus()
        .equals(other.getApplicationStatus())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APPLICATION_STATU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationStatuId();
    hash = (37 * hash) + APPLICATION_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code protos.service.GetApplicationStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.GetApplicationStatusResponse)
      com.wanpng.jobposting.grpc.service.GetApplicationStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetApplicationStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetApplicationStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.class, com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.Builder.class);
    }

    // Construct using com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      applicationStatuId_ = 0;

      applicationStatus_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetApplicationStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse getDefaultInstanceForType() {
      return com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse build() {
      com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse buildPartial() {
      com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse result = new com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse(this);
      result.applicationStatuId_ = applicationStatuId_;
      result.applicationStatus_ = applicationStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse) {
        return mergeFrom((com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse other) {
      if (other == com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse.getDefaultInstance()) return this;
      if (other.getApplicationStatuId() != 0) {
        setApplicationStatuId(other.getApplicationStatuId());
      }
      if (!other.getApplicationStatus().isEmpty()) {
        applicationStatus_ = other.applicationStatus_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int applicationStatuId_ ;
    /**
     * <code>int32 application_statu_id = 1;</code>
     * @return The applicationStatuId.
     */
    @java.lang.Override
    public int getApplicationStatuId() {
      return applicationStatuId_;
    }
    /**
     * <code>int32 application_statu_id = 1;</code>
     * @param value The applicationStatuId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationStatuId(int value) {
      
      applicationStatuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 application_statu_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationStatuId() {
      
      applicationStatuId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object applicationStatus_ = "";
    /**
     * <code>string application_status = 2;</code>
     * @return The applicationStatus.
     */
    public java.lang.String getApplicationStatus() {
      java.lang.Object ref = applicationStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string application_status = 2;</code>
     * @return The bytes for applicationStatus.
     */
    public com.google.protobuf.ByteString
        getApplicationStatusBytes() {
      java.lang.Object ref = applicationStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string application_status = 2;</code>
     * @param value The applicationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      applicationStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string application_status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationStatus() {
      
      applicationStatus_ = getDefaultInstance().getApplicationStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string application_status = 2;</code>
     * @param value The bytes for applicationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      applicationStatus_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protos.service.GetApplicationStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:protos.service.GetApplicationStatusResponse)
  private static final com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse();
  }

  public static com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetApplicationStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetApplicationStatusResponse>() {
    @java.lang.Override
    public GetApplicationStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetApplicationStatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetApplicationStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetApplicationStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobposting.grpc.service.GetApplicationStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

