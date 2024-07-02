// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.FilterExecNode}
 */
public final class FilterExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.FilterExecNode)
    FilterExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilterExecNode.newBuilder() to construct.
  private FilterExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilterExecNode() {
    expr_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilterExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_FilterExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_FilterExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.FilterExecNode.class, org.blaze.protobuf.FilterExecNode.Builder.class);
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.blaze.protobuf.FilterExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.FilterExecNode other = (org.blaze.protobuf.FilterExecNode) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (!getExprList()
        .equals(other.getExprList())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.FilterExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.FilterExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.FilterExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.FilterExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.FilterExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.FilterExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.FilterExecNode)
      org.blaze.protobuf.FilterExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_FilterExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_FilterExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.FilterExecNode.class, org.blaze.protobuf.FilterExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.FilterExecNode.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_FilterExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.FilterExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.FilterExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.FilterExecNode build() {
      org.blaze.protobuf.FilterExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.FilterExecNode buildPartial() {
      org.blaze.protobuf.FilterExecNode result = new org.blaze.protobuf.FilterExecNode(this);
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
      if (other instanceof org.blaze.protobuf.FilterExecNode) {
        return mergeFrom((org.blaze.protobuf.FilterExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.FilterExecNode other) {
      if (other == org.blaze.protobuf.FilterExecNode.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.FilterExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.FilterExecNode)
  private static final org.blaze.protobuf.FilterExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.FilterExecNode();
  }

  public static org.blaze.protobuf.FilterExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterExecNode>
      PARSER = new com.google.protobuf.AbstractParser<FilterExecNode>() {
    @java.lang.Override
    public FilterExecNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilterExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.FilterExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
