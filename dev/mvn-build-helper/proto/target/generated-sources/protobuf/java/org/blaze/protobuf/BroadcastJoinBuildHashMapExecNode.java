// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.BroadcastJoinBuildHashMapExecNode}
 */
public final class BroadcastJoinBuildHashMapExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.BroadcastJoinBuildHashMapExecNode)
    BroadcastJoinBuildHashMapExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BroadcastJoinBuildHashMapExecNode.newBuilder() to construct.
  private BroadcastJoinBuildHashMapExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BroadcastJoinBuildHashMapExecNode() {
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BroadcastJoinBuildHashMapExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_BroadcastJoinBuildHashMapExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_BroadcastJoinBuildHashMapExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.class, org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private org.blaze.protobuf.PhysicalPlanNode input_;
  /**
   * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
   * @return The input.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalPlanNode getInput() {
    return input_ == null ? org.blaze.protobuf.PhysicalPlanNode.getDefaultInstance() : input_;
  }
  /**
   * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalPlanNodeOrBuilder getInputOrBuilder() {
    return getInput();
  }

  public static final int KEYS_FIELD_NUMBER = 2;
  private java.util.List<org.blaze.protobuf.PhysicalExprNode> keys_;
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.PhysicalExprNode> getKeysList() {
    return keys_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  @java.lang.Override
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getKeysOrBuilder(
      int index) {
    return keys_.get(index);
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
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    for (int i = 0; i < keys_.size(); i++) {
      output.writeMessage(2, keys_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInput());
    }
    for (int i = 0; i < keys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, keys_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode other = (org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getKeysList()
        .equals(other.getKeysList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.BroadcastJoinBuildHashMapExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.BroadcastJoinBuildHashMapExecNode)
      org.blaze.protobuf.BroadcastJoinBuildHashMapExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_BroadcastJoinBuildHashMapExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_BroadcastJoinBuildHashMapExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.class, org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inputBuilder_ == null) {
        input_ = null;
      } else {
        input_ = null;
        inputBuilder_ = null;
      }
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
      } else {
        keys_ = null;
        keysBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_BroadcastJoinBuildHashMapExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode build() {
      org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode buildPartial() {
      org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode result = new org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode(this);
      int from_bitField0_ = bitField0_;
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode) {
        return mergeFrom((org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode other) {
      if (other == org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeysIsMutable();
            keys_.addAll(other.keys_);
          }
          onChanged();
        }
      } else {
        if (!other.keys_.isEmpty()) {
          if (keysBuilder_.isEmpty()) {
            keysBuilder_.dispose();
            keysBuilder_ = null;
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeysFieldBuilder() : null;
          } else {
            keysBuilder_.addAllMessages(other.keys_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getInputFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              org.blaze.protobuf.PhysicalExprNode m =
                  input.readMessage(
                      org.blaze.protobuf.PhysicalExprNode.parser(),
                      extensionRegistry);
              if (keysBuilder_ == null) {
                ensureKeysIsMutable();
                keys_.add(m);
              } else {
                keysBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.blaze.protobuf.PhysicalPlanNode input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalPlanNode, org.blaze.protobuf.PhysicalPlanNode.Builder, org.blaze.protobuf.PhysicalPlanNodeOrBuilder> inputBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return inputBuilder_ != null || input_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     * @return The input.
     */
    public org.blaze.protobuf.PhysicalPlanNode getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? org.blaze.protobuf.PhysicalPlanNode.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    public Builder setInput(org.blaze.protobuf.PhysicalPlanNode value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
        onChanged();
      } else {
        inputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    public Builder setInput(
        org.blaze.protobuf.PhysicalPlanNode.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
        onChanged();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    public Builder mergeInput(org.blaze.protobuf.PhysicalPlanNode value) {
      if (inputBuilder_ == null) {
        if (input_ != null) {
          input_ =
            org.blaze.protobuf.PhysicalPlanNode.newBuilder(input_).mergeFrom(value).buildPartial();
        } else {
          input_ = value;
        }
        onChanged();
      } else {
        inputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    public Builder clearInput() {
      if (inputBuilder_ == null) {
        input_ = null;
        onChanged();
      } else {
        input_ = null;
        inputBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    public org.blaze.protobuf.PhysicalPlanNode.Builder getInputBuilder() {
      
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    public org.blaze.protobuf.PhysicalPlanNodeOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            org.blaze.protobuf.PhysicalPlanNode.getDefaultInstance() : input_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalPlanNode input = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalPlanNode, org.blaze.protobuf.PhysicalPlanNode.Builder, org.blaze.protobuf.PhysicalPlanNodeOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalPlanNode, org.blaze.protobuf.PhysicalPlanNode.Builder, org.blaze.protobuf.PhysicalPlanNodeOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private java.util.List<org.blaze.protobuf.PhysicalExprNode> keys_ =
      java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new java.util.ArrayList<org.blaze.protobuf.PhysicalExprNode>(keys_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> keysBuilder_;

    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public int getKeysCount() {
      if (keysBuilder_ == null) {
        return keys_.size();
      } else {
        return keysBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder setKeys(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.set(index, value);
        onChanged();
      } else {
        keysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder setKeys(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.set(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder addKeys(org.blaze.protobuf.PhysicalExprNode value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(value);
        onChanged();
      } else {
        keysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder addKeys(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(index, value);
        onChanged();
      } else {
        keysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder addKeys(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder addKeys(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends org.blaze.protobuf.PhysicalExprNode> values) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keys_);
        onChanged();
      } else {
        keysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public Builder removeKeys(int index) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.remove(index);
        onChanged();
      } else {
        keysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getKeysBuilder(
        int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getKeysOrBuilder(
        int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);  } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
         getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addKeysBuilder() {
      return getKeysFieldBuilder().addBuilder(
          org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addKeysBuilder(
        int index) {
      return getKeysFieldBuilder().addBuilder(
          index, org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode keys = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode.Builder> 
         getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                keys_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keys_ = null;
      }
      return keysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.BroadcastJoinBuildHashMapExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.BroadcastJoinBuildHashMapExecNode)
  private static final org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode();
  }

  public static org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BroadcastJoinBuildHashMapExecNode>
      PARSER = new com.google.protobuf.AbstractParser<BroadcastJoinBuildHashMapExecNode>() {
    @java.lang.Override
    public BroadcastJoinBuildHashMapExecNode parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BroadcastJoinBuildHashMapExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BroadcastJoinBuildHashMapExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.BroadcastJoinBuildHashMapExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
