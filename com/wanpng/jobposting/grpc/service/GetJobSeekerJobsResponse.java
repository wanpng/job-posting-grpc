// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/job_posting_service.grpc.proto

package com.wanpng.jobposting.grpc.service;

/**
 * Protobuf type {@code protos.service.GetJobSeekerJobsResponse}
 */
public final class GetJobSeekerJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.GetJobSeekerJobsResponse)
    GetJobSeekerJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetJobSeekerJobsResponse.newBuilder() to construct.
  private GetJobSeekerJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetJobSeekerJobsResponse() {
    hiddenJobs_ = java.util.Collections.emptyList();
    savedJobs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetJobSeekerJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetJobSeekerJobsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hiddenJobs_ = new java.util.ArrayList<com.wanpng.jobposting.grpc.service.Job>();
              mutable_bitField0_ |= 0x00000001;
            }
            hiddenJobs_.add(
                input.readMessage(com.wanpng.jobposting.grpc.service.Job.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              savedJobs_ = new java.util.ArrayList<com.wanpng.jobposting.grpc.service.Job>();
              mutable_bitField0_ |= 0x00000002;
            }
            savedJobs_.add(
                input.readMessage(com.wanpng.jobposting.grpc.service.Job.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        hiddenJobs_ = java.util.Collections.unmodifiableList(hiddenJobs_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        savedJobs_ = java.util.Collections.unmodifiableList(savedJobs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetJobSeekerJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetJobSeekerJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.class, com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.Builder.class);
  }

  public static final int HIDDENJOBS_FIELD_NUMBER = 1;
  private java.util.List<com.wanpng.jobposting.grpc.service.Job> hiddenJobs_;
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.wanpng.jobposting.grpc.service.Job> getHiddenJobsList() {
    return hiddenJobs_;
  }
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wanpng.jobposting.grpc.service.JobOrBuilder> 
      getHiddenJobsOrBuilderList() {
    return hiddenJobs_;
  }
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  @java.lang.Override
  public int getHiddenJobsCount() {
    return hiddenJobs_.size();
  }
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  @java.lang.Override
  public com.wanpng.jobposting.grpc.service.Job getHiddenJobs(int index) {
    return hiddenJobs_.get(index);
  }
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  @java.lang.Override
  public com.wanpng.jobposting.grpc.service.JobOrBuilder getHiddenJobsOrBuilder(
      int index) {
    return hiddenJobs_.get(index);
  }

  public static final int SAVEDJOBS_FIELD_NUMBER = 2;
  private java.util.List<com.wanpng.jobposting.grpc.service.Job> savedJobs_;
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.wanpng.jobposting.grpc.service.Job> getSavedJobsList() {
    return savedJobs_;
  }
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wanpng.jobposting.grpc.service.JobOrBuilder> 
      getSavedJobsOrBuilderList() {
    return savedJobs_;
  }
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  @java.lang.Override
  public int getSavedJobsCount() {
    return savedJobs_.size();
  }
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  @java.lang.Override
  public com.wanpng.jobposting.grpc.service.Job getSavedJobs(int index) {
    return savedJobs_.get(index);
  }
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  @java.lang.Override
  public com.wanpng.jobposting.grpc.service.JobOrBuilder getSavedJobsOrBuilder(
      int index) {
    return savedJobs_.get(index);
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
    for (int i = 0; i < hiddenJobs_.size(); i++) {
      output.writeMessage(1, hiddenJobs_.get(i));
    }
    for (int i = 0; i < savedJobs_.size(); i++) {
      output.writeMessage(2, savedJobs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hiddenJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hiddenJobs_.get(i));
    }
    for (int i = 0; i < savedJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, savedJobs_.get(i));
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
    if (!(obj instanceof com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse)) {
      return super.equals(obj);
    }
    com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse other = (com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse) obj;

    if (!getHiddenJobsList()
        .equals(other.getHiddenJobsList())) return false;
    if (!getSavedJobsList()
        .equals(other.getSavedJobsList())) return false;
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
    if (getHiddenJobsCount() > 0) {
      hash = (37 * hash) + HIDDENJOBS_FIELD_NUMBER;
      hash = (53 * hash) + getHiddenJobsList().hashCode();
    }
    if (getSavedJobsCount() > 0) {
      hash = (37 * hash) + SAVEDJOBS_FIELD_NUMBER;
      hash = (53 * hash) + getSavedJobsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parseFrom(
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
  public static Builder newBuilder(com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse prototype) {
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
   * Protobuf type {@code protos.service.GetJobSeekerJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.GetJobSeekerJobsResponse)
      com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetJobSeekerJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetJobSeekerJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.class, com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.Builder.class);
    }

    // Construct using com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.newBuilder()
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
        getHiddenJobsFieldBuilder();
        getSavedJobsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hiddenJobsBuilder_ == null) {
        hiddenJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hiddenJobsBuilder_.clear();
      }
      if (savedJobsBuilder_ == null) {
        savedJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        savedJobsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobposting.grpc.service.JobPostingServiceProtos.internal_static_protos_service_GetJobSeekerJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse getDefaultInstanceForType() {
      return com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse build() {
      com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse buildPartial() {
      com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse result = new com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (hiddenJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hiddenJobs_ = java.util.Collections.unmodifiableList(hiddenJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hiddenJobs_ = hiddenJobs_;
      } else {
        result.hiddenJobs_ = hiddenJobsBuilder_.build();
      }
      if (savedJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          savedJobs_ = java.util.Collections.unmodifiableList(savedJobs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.savedJobs_ = savedJobs_;
      } else {
        result.savedJobs_ = savedJobsBuilder_.build();
      }
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
      if (other instanceof com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse) {
        return mergeFrom((com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse other) {
      if (other == com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse.getDefaultInstance()) return this;
      if (hiddenJobsBuilder_ == null) {
        if (!other.hiddenJobs_.isEmpty()) {
          if (hiddenJobs_.isEmpty()) {
            hiddenJobs_ = other.hiddenJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHiddenJobsIsMutable();
            hiddenJobs_.addAll(other.hiddenJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.hiddenJobs_.isEmpty()) {
          if (hiddenJobsBuilder_.isEmpty()) {
            hiddenJobsBuilder_.dispose();
            hiddenJobsBuilder_ = null;
            hiddenJobs_ = other.hiddenJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hiddenJobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHiddenJobsFieldBuilder() : null;
          } else {
            hiddenJobsBuilder_.addAllMessages(other.hiddenJobs_);
          }
        }
      }
      if (savedJobsBuilder_ == null) {
        if (!other.savedJobs_.isEmpty()) {
          if (savedJobs_.isEmpty()) {
            savedJobs_ = other.savedJobs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSavedJobsIsMutable();
            savedJobs_.addAll(other.savedJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.savedJobs_.isEmpty()) {
          if (savedJobsBuilder_.isEmpty()) {
            savedJobsBuilder_.dispose();
            savedJobsBuilder_ = null;
            savedJobs_ = other.savedJobs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            savedJobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSavedJobsFieldBuilder() : null;
          } else {
            savedJobsBuilder_.addAllMessages(other.savedJobs_);
          }
        }
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
      com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.wanpng.jobposting.grpc.service.Job> hiddenJobs_ =
      java.util.Collections.emptyList();
    private void ensureHiddenJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hiddenJobs_ = new java.util.ArrayList<com.wanpng.jobposting.grpc.service.Job>(hiddenJobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.jobposting.grpc.service.Job, com.wanpng.jobposting.grpc.service.Job.Builder, com.wanpng.jobposting.grpc.service.JobOrBuilder> hiddenJobsBuilder_;

    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public java.util.List<com.wanpng.jobposting.grpc.service.Job> getHiddenJobsList() {
      if (hiddenJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hiddenJobs_);
      } else {
        return hiddenJobsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public int getHiddenJobsCount() {
      if (hiddenJobsBuilder_ == null) {
        return hiddenJobs_.size();
      } else {
        return hiddenJobsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job getHiddenJobs(int index) {
      if (hiddenJobsBuilder_ == null) {
        return hiddenJobs_.get(index);
      } else {
        return hiddenJobsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder setHiddenJobs(
        int index, com.wanpng.jobposting.grpc.service.Job value) {
      if (hiddenJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHiddenJobsIsMutable();
        hiddenJobs_.set(index, value);
        onChanged();
      } else {
        hiddenJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder setHiddenJobs(
        int index, com.wanpng.jobposting.grpc.service.Job.Builder builderForValue) {
      if (hiddenJobsBuilder_ == null) {
        ensureHiddenJobsIsMutable();
        hiddenJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        hiddenJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder addHiddenJobs(com.wanpng.jobposting.grpc.service.Job value) {
      if (hiddenJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHiddenJobsIsMutable();
        hiddenJobs_.add(value);
        onChanged();
      } else {
        hiddenJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder addHiddenJobs(
        int index, com.wanpng.jobposting.grpc.service.Job value) {
      if (hiddenJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHiddenJobsIsMutable();
        hiddenJobs_.add(index, value);
        onChanged();
      } else {
        hiddenJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder addHiddenJobs(
        com.wanpng.jobposting.grpc.service.Job.Builder builderForValue) {
      if (hiddenJobsBuilder_ == null) {
        ensureHiddenJobsIsMutable();
        hiddenJobs_.add(builderForValue.build());
        onChanged();
      } else {
        hiddenJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder addHiddenJobs(
        int index, com.wanpng.jobposting.grpc.service.Job.Builder builderForValue) {
      if (hiddenJobsBuilder_ == null) {
        ensureHiddenJobsIsMutable();
        hiddenJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        hiddenJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder addAllHiddenJobs(
        java.lang.Iterable<? extends com.wanpng.jobposting.grpc.service.Job> values) {
      if (hiddenJobsBuilder_ == null) {
        ensureHiddenJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hiddenJobs_);
        onChanged();
      } else {
        hiddenJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder clearHiddenJobs() {
      if (hiddenJobsBuilder_ == null) {
        hiddenJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hiddenJobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public Builder removeHiddenJobs(int index) {
      if (hiddenJobsBuilder_ == null) {
        ensureHiddenJobsIsMutable();
        hiddenJobs_.remove(index);
        onChanged();
      } else {
        hiddenJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job.Builder getHiddenJobsBuilder(
        int index) {
      return getHiddenJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public com.wanpng.jobposting.grpc.service.JobOrBuilder getHiddenJobsOrBuilder(
        int index) {
      if (hiddenJobsBuilder_ == null) {
        return hiddenJobs_.get(index);  } else {
        return hiddenJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public java.util.List<? extends com.wanpng.jobposting.grpc.service.JobOrBuilder> 
         getHiddenJobsOrBuilderList() {
      if (hiddenJobsBuilder_ != null) {
        return hiddenJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hiddenJobs_);
      }
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job.Builder addHiddenJobsBuilder() {
      return getHiddenJobsFieldBuilder().addBuilder(
          com.wanpng.jobposting.grpc.service.Job.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job.Builder addHiddenJobsBuilder(
        int index) {
      return getHiddenJobsFieldBuilder().addBuilder(
          index, com.wanpng.jobposting.grpc.service.Job.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
     */
    public java.util.List<com.wanpng.jobposting.grpc.service.Job.Builder> 
         getHiddenJobsBuilderList() {
      return getHiddenJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.jobposting.grpc.service.Job, com.wanpng.jobposting.grpc.service.Job.Builder, com.wanpng.jobposting.grpc.service.JobOrBuilder> 
        getHiddenJobsFieldBuilder() {
      if (hiddenJobsBuilder_ == null) {
        hiddenJobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wanpng.jobposting.grpc.service.Job, com.wanpng.jobposting.grpc.service.Job.Builder, com.wanpng.jobposting.grpc.service.JobOrBuilder>(
                hiddenJobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hiddenJobs_ = null;
      }
      return hiddenJobsBuilder_;
    }

    private java.util.List<com.wanpng.jobposting.grpc.service.Job> savedJobs_ =
      java.util.Collections.emptyList();
    private void ensureSavedJobsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        savedJobs_ = new java.util.ArrayList<com.wanpng.jobposting.grpc.service.Job>(savedJobs_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.jobposting.grpc.service.Job, com.wanpng.jobposting.grpc.service.Job.Builder, com.wanpng.jobposting.grpc.service.JobOrBuilder> savedJobsBuilder_;

    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public java.util.List<com.wanpng.jobposting.grpc.service.Job> getSavedJobsList() {
      if (savedJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(savedJobs_);
      } else {
        return savedJobsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public int getSavedJobsCount() {
      if (savedJobsBuilder_ == null) {
        return savedJobs_.size();
      } else {
        return savedJobsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job getSavedJobs(int index) {
      if (savedJobsBuilder_ == null) {
        return savedJobs_.get(index);
      } else {
        return savedJobsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder setSavedJobs(
        int index, com.wanpng.jobposting.grpc.service.Job value) {
      if (savedJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSavedJobsIsMutable();
        savedJobs_.set(index, value);
        onChanged();
      } else {
        savedJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder setSavedJobs(
        int index, com.wanpng.jobposting.grpc.service.Job.Builder builderForValue) {
      if (savedJobsBuilder_ == null) {
        ensureSavedJobsIsMutable();
        savedJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        savedJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder addSavedJobs(com.wanpng.jobposting.grpc.service.Job value) {
      if (savedJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSavedJobsIsMutable();
        savedJobs_.add(value);
        onChanged();
      } else {
        savedJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder addSavedJobs(
        int index, com.wanpng.jobposting.grpc.service.Job value) {
      if (savedJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSavedJobsIsMutable();
        savedJobs_.add(index, value);
        onChanged();
      } else {
        savedJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder addSavedJobs(
        com.wanpng.jobposting.grpc.service.Job.Builder builderForValue) {
      if (savedJobsBuilder_ == null) {
        ensureSavedJobsIsMutable();
        savedJobs_.add(builderForValue.build());
        onChanged();
      } else {
        savedJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder addSavedJobs(
        int index, com.wanpng.jobposting.grpc.service.Job.Builder builderForValue) {
      if (savedJobsBuilder_ == null) {
        ensureSavedJobsIsMutable();
        savedJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        savedJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder addAllSavedJobs(
        java.lang.Iterable<? extends com.wanpng.jobposting.grpc.service.Job> values) {
      if (savedJobsBuilder_ == null) {
        ensureSavedJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, savedJobs_);
        onChanged();
      } else {
        savedJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder clearSavedJobs() {
      if (savedJobsBuilder_ == null) {
        savedJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        savedJobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public Builder removeSavedJobs(int index) {
      if (savedJobsBuilder_ == null) {
        ensureSavedJobsIsMutable();
        savedJobs_.remove(index);
        onChanged();
      } else {
        savedJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job.Builder getSavedJobsBuilder(
        int index) {
      return getSavedJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public com.wanpng.jobposting.grpc.service.JobOrBuilder getSavedJobsOrBuilder(
        int index) {
      if (savedJobsBuilder_ == null) {
        return savedJobs_.get(index);  } else {
        return savedJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public java.util.List<? extends com.wanpng.jobposting.grpc.service.JobOrBuilder> 
         getSavedJobsOrBuilderList() {
      if (savedJobsBuilder_ != null) {
        return savedJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(savedJobs_);
      }
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job.Builder addSavedJobsBuilder() {
      return getSavedJobsFieldBuilder().addBuilder(
          com.wanpng.jobposting.grpc.service.Job.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public com.wanpng.jobposting.grpc.service.Job.Builder addSavedJobsBuilder(
        int index) {
      return getSavedJobsFieldBuilder().addBuilder(
          index, com.wanpng.jobposting.grpc.service.Job.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.service.Job savedJobs = 2;</code>
     */
    public java.util.List<com.wanpng.jobposting.grpc.service.Job.Builder> 
         getSavedJobsBuilderList() {
      return getSavedJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.jobposting.grpc.service.Job, com.wanpng.jobposting.grpc.service.Job.Builder, com.wanpng.jobposting.grpc.service.JobOrBuilder> 
        getSavedJobsFieldBuilder() {
      if (savedJobsBuilder_ == null) {
        savedJobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wanpng.jobposting.grpc.service.Job, com.wanpng.jobposting.grpc.service.Job.Builder, com.wanpng.jobposting.grpc.service.JobOrBuilder>(
                savedJobs_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        savedJobs_ = null;
      }
      return savedJobsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protos.service.GetJobSeekerJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:protos.service.GetJobSeekerJobsResponse)
  private static final com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse();
  }

  public static com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetJobSeekerJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetJobSeekerJobsResponse>() {
    @java.lang.Override
    public GetJobSeekerJobsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetJobSeekerJobsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetJobSeekerJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetJobSeekerJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobposting.grpc.service.GetJobSeekerJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

