// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.SortExecNode}
 */
public final class SortExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.SortExecNode)
    SortExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SortExecNode.newBuilder() to construct.
  private SortExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SortExecNode() {
    expr_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SortExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_SortExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_SortExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.SortExecNode.class, org.blaze.protobuf.SortExecNode.Builder.class);
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

  public static final int EXPR_FIELD_NUMBER = 2;
  private java.util.List<org.blaze.protobuf.PhysicalExprNode> expr_;
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.PhysicalExprNode> getExprList() {
    return expr_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getExprOrBuilderList() {
    return expr_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
   */
  @java.lang.Override
  public int getExprCount() {
    return expr_.size();
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getExpr(int index) {
    return expr_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getExprOrBuilder(
      int index) {
    return expr_.get(index);
  }

  public static final int FETCH_LIMIT_FIELD_NUMBER = 3;
  private org.blaze.protobuf.FetchLimit fetchLimit_;
  /**
   * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
   * @return Whether the fetchLimit field is set.
   */
  @java.lang.Override
  public boolean hasFetchLimit() {
    return fetchLimit_ != null;
  }
  /**
   * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
   * @return The fetchLimit.
   */
  @java.lang.Override
  public org.blaze.protobuf.FetchLimit getFetchLimit() {
    return fetchLimit_ == null ? org.blaze.protobuf.FetchLimit.getDefaultInstance() : fetchLimit_;
  }
  /**
   * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.FetchLimitOrBuilder getFetchLimitOrBuilder() {
    return getFetchLimit();
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
    for (int i = 0; i < expr_.size(); i++) {
      output.writeMessage(2, expr_.get(i));
    }
    if (fetchLimit_ != null) {
      output.writeMessage(3, getFetchLimit());
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
    for (int i = 0; i < expr_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, expr_.get(i));
    }
    if (fetchLimit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFetchLimit());
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
    if (!(obj instanceof org.blaze.protobuf.SortExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.SortExecNode other = (org.blaze.protobuf.SortExecNode) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getExprList()
        .equals(other.getExprList())) return false;
    if (hasFetchLimit() != other.hasFetchLimit()) return false;
    if (hasFetchLimit()) {
      if (!getFetchLimit()
          .equals(other.getFetchLimit())) return false;
    }
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
    if (getExprCount() > 0) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExprList().hashCode();
    }
    if (hasFetchLimit()) {
      hash = (37 * hash) + FETCH_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getFetchLimit().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.SortExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.SortExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.SortExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.SortExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.SortExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.SortExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.SortExecNode)
      org.blaze.protobuf.SortExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_SortExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_SortExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.SortExecNode.class, org.blaze.protobuf.SortExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.SortExecNode.newBuilder()
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
      if (exprBuilder_ == null) {
        expr_ = java.util.Collections.emptyList();
      } else {
        expr_ = null;
        exprBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (fetchLimitBuilder_ == null) {
        fetchLimit_ = null;
      } else {
        fetchLimit_ = null;
        fetchLimitBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_SortExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.SortExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.SortExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.SortExecNode build() {
      org.blaze.protobuf.SortExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.SortExecNode buildPartial() {
      org.blaze.protobuf.SortExecNode result = new org.blaze.protobuf.SortExecNode(this);
      int from_bitField0_ = bitField0_;
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      if (exprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          expr_ = java.util.Collections.unmodifiableList(expr_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.expr_ = expr_;
      } else {
        result.expr_ = exprBuilder_.build();
      }
      if (fetchLimitBuilder_ == null) {
        result.fetchLimit_ = fetchLimit_;
      } else {
        result.fetchLimit_ = fetchLimitBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.SortExecNode) {
        return mergeFrom((org.blaze.protobuf.SortExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.SortExecNode other) {
      if (other == org.blaze.protobuf.SortExecNode.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (exprBuilder_ == null) {
        if (!other.expr_.isEmpty()) {
          if (expr_.isEmpty()) {
            expr_ = other.expr_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExprIsMutable();
            expr_.addAll(other.expr_);
          }
          onChanged();
        }
      } else {
        if (!other.expr_.isEmpty()) {
          if (exprBuilder_.isEmpty()) {
            exprBuilder_.dispose();
            exprBuilder_ = null;
            expr_ = other.expr_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exprBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExprFieldBuilder() : null;
          } else {
            exprBuilder_.addAllMessages(other.expr_);
          }
        }
      }
      if (other.hasFetchLimit()) {
        mergeFetchLimit(other.getFetchLimit());
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
              if (exprBuilder_ == null) {
                ensureExprIsMutable();
                expr_.add(m);
              } else {
                exprBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFetchLimitFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private java.util.List<org.blaze.protobuf.PhysicalExprNode> expr_ =
      java.util.Collections.emptyList();
    private void ensureExprIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        expr_ = new java.util.ArrayList<org.blaze.protobuf.PhysicalExprNode>(expr_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> exprBuilder_;

    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode> getExprList() {
      if (exprBuilder_ == null) {
        return java.util.Collections.unmodifiableList(expr_);
      } else {
        return exprBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public int getExprCount() {
      if (exprBuilder_ == null) {
        return expr_.size();
      } else {
        return exprBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode getExpr(int index) {
      if (exprBuilder_ == null) {
        return expr_.get(index);
      } else {
        return exprBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder setExpr(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprIsMutable();
        expr_.set(index, value);
        onChanged();
      } else {
        exprBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder setExpr(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.set(index, builderForValue.build());
        onChanged();
      } else {
        exprBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder addExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprIsMutable();
        expr_.add(value);
        onChanged();
      } else {
        exprBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder addExpr(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExprIsMutable();
        expr_.add(index, value);
        onChanged();
      } else {
        exprBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder addExpr(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.add(builderForValue.build());
        onChanged();
      } else {
        exprBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder addExpr(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.add(index, builderForValue.build());
        onChanged();
      } else {
        exprBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder addAllExpr(
        java.lang.Iterable<? extends org.blaze.protobuf.PhysicalExprNode> values) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, expr_);
        onChanged();
      } else {
        exprBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder clearExpr() {
      if (exprBuilder_ == null) {
        expr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exprBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public Builder removeExpr(int index) {
      if (exprBuilder_ == null) {
        ensureExprIsMutable();
        expr_.remove(index);
        onChanged();
      } else {
        exprBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getExprBuilder(
        int index) {
      return getExprFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getExprOrBuilder(
        int index) {
      if (exprBuilder_ == null) {
        return expr_.get(index);  } else {
        return exprBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
         getExprOrBuilderList() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(expr_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addExprBuilder() {
      return getExprFieldBuilder().addBuilder(
          org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addExprBuilder(
        int index) {
      return getExprFieldBuilder().addBuilder(
          index, org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode expr = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode.Builder> 
         getExprBuilderList() {
      return getExprFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                expr_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private org.blaze.protobuf.FetchLimit fetchLimit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.FetchLimit, org.blaze.protobuf.FetchLimit.Builder, org.blaze.protobuf.FetchLimitOrBuilder> fetchLimitBuilder_;
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     * @return Whether the fetchLimit field is set.
     */
    public boolean hasFetchLimit() {
      return fetchLimitBuilder_ != null || fetchLimit_ != null;
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     * @return The fetchLimit.
     */
    public org.blaze.protobuf.FetchLimit getFetchLimit() {
      if (fetchLimitBuilder_ == null) {
        return fetchLimit_ == null ? org.blaze.protobuf.FetchLimit.getDefaultInstance() : fetchLimit_;
      } else {
        return fetchLimitBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    public Builder setFetchLimit(org.blaze.protobuf.FetchLimit value) {
      if (fetchLimitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fetchLimit_ = value;
        onChanged();
      } else {
        fetchLimitBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    public Builder setFetchLimit(
        org.blaze.protobuf.FetchLimit.Builder builderForValue) {
      if (fetchLimitBuilder_ == null) {
        fetchLimit_ = builderForValue.build();
        onChanged();
      } else {
        fetchLimitBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    public Builder mergeFetchLimit(org.blaze.protobuf.FetchLimit value) {
      if (fetchLimitBuilder_ == null) {
        if (fetchLimit_ != null) {
          fetchLimit_ =
            org.blaze.protobuf.FetchLimit.newBuilder(fetchLimit_).mergeFrom(value).buildPartial();
        } else {
          fetchLimit_ = value;
        }
        onChanged();
      } else {
        fetchLimitBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    public Builder clearFetchLimit() {
      if (fetchLimitBuilder_ == null) {
        fetchLimit_ = null;
        onChanged();
      } else {
        fetchLimit_ = null;
        fetchLimitBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    public org.blaze.protobuf.FetchLimit.Builder getFetchLimitBuilder() {
      
      onChanged();
      return getFetchLimitFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    public org.blaze.protobuf.FetchLimitOrBuilder getFetchLimitOrBuilder() {
      if (fetchLimitBuilder_ != null) {
        return fetchLimitBuilder_.getMessageOrBuilder();
      } else {
        return fetchLimit_ == null ?
            org.blaze.protobuf.FetchLimit.getDefaultInstance() : fetchLimit_;
      }
    }
    /**
     * <code>.plan.protobuf.FetchLimit fetch_limit = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.FetchLimit, org.blaze.protobuf.FetchLimit.Builder, org.blaze.protobuf.FetchLimitOrBuilder> 
        getFetchLimitFieldBuilder() {
      if (fetchLimitBuilder_ == null) {
        fetchLimitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.FetchLimit, org.blaze.protobuf.FetchLimit.Builder, org.blaze.protobuf.FetchLimitOrBuilder>(
                getFetchLimit(),
                getParentForChildren(),
                isClean());
        fetchLimit_ = null;
      }
      return fetchLimitBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.SortExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.SortExecNode)
  private static final org.blaze.protobuf.SortExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.SortExecNode();
  }

  public static org.blaze.protobuf.SortExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SortExecNode>
      PARSER = new com.google.protobuf.AbstractParser<SortExecNode>() {
    @java.lang.Override
    public SortExecNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<SortExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SortExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.SortExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
