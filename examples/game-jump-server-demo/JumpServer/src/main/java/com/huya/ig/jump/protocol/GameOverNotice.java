// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

/**
 * <pre>
 * 游戏结束
 * </pre>
 *
 * Protobuf type {@code pb.GameOverNotice}
 */
public  final class GameOverNotice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.GameOverNotice)
    GameOverNoticeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameOverNotice.newBuilder() to construct.
  private GameOverNotice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameOverNotice() {
    rank_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GameOverNotice(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              rank_ = new java.util.ArrayList<com.huya.ig.jump.protocol.Player>();
              mutable_bitField0_ |= 0x00000001;
            }
            rank_.add(
                input.readMessage(com.huya.ig.jump.protocol.Player.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        rank_ = java.util.Collections.unmodifiableList(rank_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameOverNotice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameOverNotice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.huya.ig.jump.protocol.GameOverNotice.class, com.huya.ig.jump.protocol.GameOverNotice.Builder.class);
  }

  public static final int RANK_FIELD_NUMBER = 1;
  private java.util.List<com.huya.ig.jump.protocol.Player> rank_;
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  public java.util.List<com.huya.ig.jump.protocol.Player> getRankList() {
    return rank_;
  }
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  public java.util.List<? extends com.huya.ig.jump.protocol.PlayerOrBuilder> 
      getRankOrBuilderList() {
    return rank_;
  }
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  public int getRankCount() {
    return rank_.size();
  }
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  public com.huya.ig.jump.protocol.Player getRank(int index) {
    return rank_.get(index);
  }
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  public com.huya.ig.jump.protocol.PlayerOrBuilder getRankOrBuilder(
      int index) {
    return rank_.get(index);
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
    for (int i = 0; i < rank_.size(); i++) {
      output.writeMessage(1, rank_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rank_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rank_.get(i));
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
    if (!(obj instanceof com.huya.ig.jump.protocol.GameOverNotice)) {
      return super.equals(obj);
    }
    com.huya.ig.jump.protocol.GameOverNotice other = (com.huya.ig.jump.protocol.GameOverNotice) obj;

    boolean result = true;
    result = result && getRankList()
        .equals(other.getRankList());
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
    if (getRankCount() > 0) {
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + getRankList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.GameOverNotice parseFrom(
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
  public static Builder newBuilder(com.huya.ig.jump.protocol.GameOverNotice prototype) {
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
   * <pre>
   * 游戏结束
   * </pre>
   *
   * Protobuf type {@code pb.GameOverNotice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.GameOverNotice)
      com.huya.ig.jump.protocol.GameOverNoticeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameOverNotice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameOverNotice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.huya.ig.jump.protocol.GameOverNotice.class, com.huya.ig.jump.protocol.GameOverNotice.Builder.class);
    }

    // Construct using com.huya.ig.jump.protocol.GameOverNotice.newBuilder()
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
        getRankFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rankBuilder_ == null) {
        rank_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rankBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_GameOverNotice_descriptor;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.GameOverNotice getDefaultInstanceForType() {
      return com.huya.ig.jump.protocol.GameOverNotice.getDefaultInstance();
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.GameOverNotice build() {
      com.huya.ig.jump.protocol.GameOverNotice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.GameOverNotice buildPartial() {
      com.huya.ig.jump.protocol.GameOverNotice result = new com.huya.ig.jump.protocol.GameOverNotice(this);
      int from_bitField0_ = bitField0_;
      if (rankBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          rank_ = java.util.Collections.unmodifiableList(rank_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rank_ = rank_;
      } else {
        result.rank_ = rankBuilder_.build();
      }
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
      if (other instanceof com.huya.ig.jump.protocol.GameOverNotice) {
        return mergeFrom((com.huya.ig.jump.protocol.GameOverNotice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.huya.ig.jump.protocol.GameOverNotice other) {
      if (other == com.huya.ig.jump.protocol.GameOverNotice.getDefaultInstance()) return this;
      if (rankBuilder_ == null) {
        if (!other.rank_.isEmpty()) {
          if (rank_.isEmpty()) {
            rank_ = other.rank_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRankIsMutable();
            rank_.addAll(other.rank_);
          }
          onChanged();
        }
      } else {
        if (!other.rank_.isEmpty()) {
          if (rankBuilder_.isEmpty()) {
            rankBuilder_.dispose();
            rankBuilder_ = null;
            rank_ = other.rank_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rankBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRankFieldBuilder() : null;
          } else {
            rankBuilder_.addAllMessages(other.rank_);
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
      com.huya.ig.jump.protocol.GameOverNotice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.huya.ig.jump.protocol.GameOverNotice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.huya.ig.jump.protocol.Player> rank_ =
      java.util.Collections.emptyList();
    private void ensureRankIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        rank_ = new java.util.ArrayList<com.huya.ig.jump.protocol.Player>(rank_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.huya.ig.jump.protocol.Player, com.huya.ig.jump.protocol.Player.Builder, com.huya.ig.jump.protocol.PlayerOrBuilder> rankBuilder_;

    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public java.util.List<com.huya.ig.jump.protocol.Player> getRankList() {
      if (rankBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rank_);
      } else {
        return rankBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public int getRankCount() {
      if (rankBuilder_ == null) {
        return rank_.size();
      } else {
        return rankBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public com.huya.ig.jump.protocol.Player getRank(int index) {
      if (rankBuilder_ == null) {
        return rank_.get(index);
      } else {
        return rankBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder setRank(
        int index, com.huya.ig.jump.protocol.Player value) {
      if (rankBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRankIsMutable();
        rank_.set(index, value);
        onChanged();
      } else {
        rankBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder setRank(
        int index, com.huya.ig.jump.protocol.Player.Builder builderForValue) {
      if (rankBuilder_ == null) {
        ensureRankIsMutable();
        rank_.set(index, builderForValue.build());
        onChanged();
      } else {
        rankBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder addRank(com.huya.ig.jump.protocol.Player value) {
      if (rankBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRankIsMutable();
        rank_.add(value);
        onChanged();
      } else {
        rankBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder addRank(
        int index, com.huya.ig.jump.protocol.Player value) {
      if (rankBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRankIsMutable();
        rank_.add(index, value);
        onChanged();
      } else {
        rankBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder addRank(
        com.huya.ig.jump.protocol.Player.Builder builderForValue) {
      if (rankBuilder_ == null) {
        ensureRankIsMutable();
        rank_.add(builderForValue.build());
        onChanged();
      } else {
        rankBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder addRank(
        int index, com.huya.ig.jump.protocol.Player.Builder builderForValue) {
      if (rankBuilder_ == null) {
        ensureRankIsMutable();
        rank_.add(index, builderForValue.build());
        onChanged();
      } else {
        rankBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder addAllRank(
        java.lang.Iterable<? extends com.huya.ig.jump.protocol.Player> values) {
      if (rankBuilder_ == null) {
        ensureRankIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rank_);
        onChanged();
      } else {
        rankBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder clearRank() {
      if (rankBuilder_ == null) {
        rank_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rankBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public Builder removeRank(int index) {
      if (rankBuilder_ == null) {
        ensureRankIsMutable();
        rank_.remove(index);
        onChanged();
      } else {
        rankBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public com.huya.ig.jump.protocol.Player.Builder getRankBuilder(
        int index) {
      return getRankFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public com.huya.ig.jump.protocol.PlayerOrBuilder getRankOrBuilder(
        int index) {
      if (rankBuilder_ == null) {
        return rank_.get(index);  } else {
        return rankBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public java.util.List<? extends com.huya.ig.jump.protocol.PlayerOrBuilder> 
         getRankOrBuilderList() {
      if (rankBuilder_ != null) {
        return rankBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rank_);
      }
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public com.huya.ig.jump.protocol.Player.Builder addRankBuilder() {
      return getRankFieldBuilder().addBuilder(
          com.huya.ig.jump.protocol.Player.getDefaultInstance());
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public com.huya.ig.jump.protocol.Player.Builder addRankBuilder(
        int index) {
      return getRankFieldBuilder().addBuilder(
          index, com.huya.ig.jump.protocol.Player.getDefaultInstance());
    }
    /**
     * <pre>
     * 玩家排行榜
     * </pre>
     *
     * <code>repeated .pb.Player rank = 1;</code>
     */
    public java.util.List<com.huya.ig.jump.protocol.Player.Builder> 
         getRankBuilderList() {
      return getRankFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.huya.ig.jump.protocol.Player, com.huya.ig.jump.protocol.Player.Builder, com.huya.ig.jump.protocol.PlayerOrBuilder> 
        getRankFieldBuilder() {
      if (rankBuilder_ == null) {
        rankBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.huya.ig.jump.protocol.Player, com.huya.ig.jump.protocol.Player.Builder, com.huya.ig.jump.protocol.PlayerOrBuilder>(
                rank_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        rank_ = null;
      }
      return rankBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pb.GameOverNotice)
  }

  // @@protoc_insertion_point(class_scope:pb.GameOverNotice)
  private static final com.huya.ig.jump.protocol.GameOverNotice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.huya.ig.jump.protocol.GameOverNotice();
  }

  public static com.huya.ig.jump.protocol.GameOverNotice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameOverNotice>
      PARSER = new com.google.protobuf.AbstractParser<GameOverNotice>() {
    @java.lang.Override
    public GameOverNotice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GameOverNotice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameOverNotice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameOverNotice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.huya.ig.jump.protocol.GameOverNotice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

