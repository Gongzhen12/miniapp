// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

/**
 * Protobuf type {@code pb.RoomConnectedNotice}
 */
public  final class RoomConnectedNotice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.RoomConnectedNotice)
    RoomConnectedNoticeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomConnectedNotice.newBuilder() to construct.
  private RoomConnectedNotice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomConnectedNotice() {
    ret_ = 0;
    uid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoomConnectedNotice(
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
          case 8: {
            int rawValue = input.readEnum();

            ret_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            uid_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_RoomConnectedNotice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_RoomConnectedNotice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.huya.ig.jump.protocol.RoomConnectedNotice.class, com.huya.ig.jump.protocol.RoomConnectedNotice.Builder.class);
  }

  public static final int RET_FIELD_NUMBER = 1;
  private int ret_;
  /**
   * <code>.pb.EJoinRet ret = 1;</code>
   */
  public int getRetValue() {
    return ret_;
  }
  /**
   * <code>.pb.EJoinRet ret = 1;</code>
   */
  public com.huya.ig.jump.protocol.EJoinRet getRet() {
    @SuppressWarnings("deprecation")
    com.huya.ig.jump.protocol.EJoinRet result = com.huya.ig.jump.protocol.EJoinRet.valueOf(ret_);
    return result == null ? com.huya.ig.jump.protocol.EJoinRet.UNRECOGNIZED : result;
  }

  public static final int UID_FIELD_NUMBER = 2;
  private volatile java.lang.Object uid_;
  /**
   * <code>string uid = 2;</code>
   */
  public java.lang.String getUid() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uid_ = s;
      return s;
    }
  }
  /**
   * <code>string uid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUidBytes() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uid_ = b;
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
    if (ret_ != com.huya.ig.jump.protocol.EJoinRet.SUCCESS.getNumber()) {
      output.writeEnum(1, ret_);
    }
    if (!getUidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ret_ != com.huya.ig.jump.protocol.EJoinRet.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ret_);
    }
    if (!getUidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uid_);
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
    if (!(obj instanceof com.huya.ig.jump.protocol.RoomConnectedNotice)) {
      return super.equals(obj);
    }
    com.huya.ig.jump.protocol.RoomConnectedNotice other = (com.huya.ig.jump.protocol.RoomConnectedNotice) obj;

    boolean result = true;
    result = result && ret_ == other.ret_;
    result = result && getUid()
        .equals(other.getUid());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RET_FIELD_NUMBER;
    hash = (53 * hash) + ret_;
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.RoomConnectedNotice parseFrom(
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
  public static Builder newBuilder(com.huya.ig.jump.protocol.RoomConnectedNotice prototype) {
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
   * Protobuf type {@code pb.RoomConnectedNotice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.RoomConnectedNotice)
      com.huya.ig.jump.protocol.RoomConnectedNoticeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_RoomConnectedNotice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_RoomConnectedNotice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.huya.ig.jump.protocol.RoomConnectedNotice.class, com.huya.ig.jump.protocol.RoomConnectedNotice.Builder.class);
    }

    // Construct using com.huya.ig.jump.protocol.RoomConnectedNotice.newBuilder()
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
      ret_ = 0;

      uid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_RoomConnectedNotice_descriptor;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.RoomConnectedNotice getDefaultInstanceForType() {
      return com.huya.ig.jump.protocol.RoomConnectedNotice.getDefaultInstance();
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.RoomConnectedNotice build() {
      com.huya.ig.jump.protocol.RoomConnectedNotice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.RoomConnectedNotice buildPartial() {
      com.huya.ig.jump.protocol.RoomConnectedNotice result = new com.huya.ig.jump.protocol.RoomConnectedNotice(this);
      result.ret_ = ret_;
      result.uid_ = uid_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.huya.ig.jump.protocol.RoomConnectedNotice) {
        return mergeFrom((com.huya.ig.jump.protocol.RoomConnectedNotice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.huya.ig.jump.protocol.RoomConnectedNotice other) {
      if (other == com.huya.ig.jump.protocol.RoomConnectedNotice.getDefaultInstance()) return this;
      if (other.ret_ != 0) {
        setRetValue(other.getRetValue());
      }
      if (!other.getUid().isEmpty()) {
        uid_ = other.uid_;
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
      com.huya.ig.jump.protocol.RoomConnectedNotice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.huya.ig.jump.protocol.RoomConnectedNotice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ret_ = 0;
    /**
     * <code>.pb.EJoinRet ret = 1;</code>
     */
    public int getRetValue() {
      return ret_;
    }
    /**
     * <code>.pb.EJoinRet ret = 1;</code>
     */
    public Builder setRetValue(int value) {
      ret_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.pb.EJoinRet ret = 1;</code>
     */
    public com.huya.ig.jump.protocol.EJoinRet getRet() {
      @SuppressWarnings("deprecation")
      com.huya.ig.jump.protocol.EJoinRet result = com.huya.ig.jump.protocol.EJoinRet.valueOf(ret_);
      return result == null ? com.huya.ig.jump.protocol.EJoinRet.UNRECOGNIZED : result;
    }
    /**
     * <code>.pb.EJoinRet ret = 1;</code>
     */
    public Builder setRet(com.huya.ig.jump.protocol.EJoinRet value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ret_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.pb.EJoinRet ret = 1;</code>
     */
    public Builder clearRet() {
      
      ret_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object uid_ = "";
    /**
     * <code>string uid = 2;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uid = 2;</code>
     */
    public Builder setUid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uid = 2;</code>
     */
    public Builder clearUid() {
      
      uid_ = getDefaultInstance().getUid();
      onChanged();
      return this;
    }
    /**
     * <code>string uid = 2;</code>
     */
    public Builder setUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uid_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.RoomConnectedNotice)
  }

  // @@protoc_insertion_point(class_scope:pb.RoomConnectedNotice)
  private static final com.huya.ig.jump.protocol.RoomConnectedNotice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.huya.ig.jump.protocol.RoomConnectedNotice();
  }

  public static com.huya.ig.jump.protocol.RoomConnectedNotice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomConnectedNotice>
      PARSER = new com.google.protobuf.AbstractParser<RoomConnectedNotice>() {
    @java.lang.Override
    public RoomConnectedNotice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoomConnectedNotice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoomConnectedNotice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomConnectedNotice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.huya.ig.jump.protocol.RoomConnectedNotice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

