// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.PhysicalCaseNode}
 */
public final class PhysicalCaseNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.PhysicalCaseNode)
    PhysicalCaseNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhysicalCaseNode.newBuilder() to construct.
  private PhysicalCaseNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhysicalCaseNode() {
    whenThenExpr_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhysicalCaseNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalCaseNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalCaseNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.PhysicalCaseNode.class, org.blaze.protobuf.PhysicalCaseNode.Builder.class);
  }

  public static final int EXPR_FIELD_NUMBER = 1;
  private org.blaze.protobuf.PhysicalExprNode expr_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
   * @return Whether the expr field is set.
   */
  @java.lang.Override
  public boolean hasExpr() {
    return expr_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
   * @return The expr.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getExpr() {
    return expr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : expr_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getExprOrBuilder() {
    return getExpr();
  }

  public static final int WHEN_THEN_EXPR_FIELD_NUMBER = 2;
  private java.util.List<org.blaze.protobuf.PhysicalWhenThen> whenThenExpr_;
  /**
   * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.PhysicalWhenThen> getWhenThenExprList() {
    return whenThenExpr_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.PhysicalWhenThenOrBuilder> 
      getWhenThenExprOrBuilderList() {
    return whenThenExpr_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
   */
  @java.lang.Override
  public int getWhenThenExprCount() {
    return whenThenExpr_.size();
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalWhenThen getWhenThenExpr(int index) {
    return whenThenExpr_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalWhenThenOrBuilder getWhenThenExprOrBuilder(
      int index) {
    return whenThenExpr_.get(index);
  }

  public static final int ELSE_EXPR_FIELD_NUMBER = 3;
  private org.blaze.protobuf.PhysicalExprNode elseExpr_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
   * @return Whether the elseExpr field is set.
   */
  @java.lang.Override
  public boolean hasElseExpr() {
    return elseExpr_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
   * @return The elseExpr.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getElseExpr() {
    return elseExpr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : elseExpr_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getElseExprOrBuilder() {
    return getElseExpr();
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
    if (expr_ != null) {
      output.writeMessage(1, getExpr());
    }
    for (int i = 0; i < whenThenExpr_.size(); i++) {
      output.writeMessage(2, whenThenExpr_.get(i));
    }
    if (elseExpr_ != null) {
      output.writeMessage(3, getElseExpr());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (expr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExpr());
    }
    for (int i = 0; i < whenThenExpr_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, whenThenExpr_.get(i));
    }
    if (elseExpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getElseExpr());
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
    if (!(obj instanceof org.blaze.protobuf.PhysicalCaseNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.PhysicalCaseNode other = (org.blaze.protobuf.PhysicalCaseNode) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (!getWhenThenExprList()
        .equals(other.getWhenThenExprList())) return false;
    if (hasElseExpr() != other.hasElseExpr()) return false;
    if (hasElseExpr()) {
      if (!getElseExpr()
          .equals(other.getElseExpr())) return false;
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
    if (hasExpr()) {
      hash = (37 * hash) + EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getExpr().hashCode();
    }
    if (getWhenThenExprCount() > 0) {
      hash = (37 * hash) + WHEN_THEN_EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getWhenThenExprList().hashCode();
    }
    if (hasElseExpr()) {
      hash = (37 * hash) + ELSE_EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getElseExpr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalCaseNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.PhysicalCaseNode prototype) {
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
   * Protobuf type {@code plan.protobuf.PhysicalCaseNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.PhysicalCaseNode)
      org.blaze.protobuf.PhysicalCaseNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalCaseNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalCaseNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.PhysicalCaseNode.class, org.blaze.protobuf.PhysicalCaseNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.PhysicalCaseNode.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (exprBuilder_ == null) {
        expr_ = null;
      } else {
        expr_ = null;
        exprBuilder_ = null;
      }
      if (whenThenExprBuilder_ == null) {
        whenThenExpr_ = java.util.Collections.emptyList();
      } else {
        whenThenExpr_ = null;
        whenThenExprBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (elseExprBuilder_ == null) {
        elseExpr_ = null;
      } else {
        elseExpr_ = null;
        elseExprBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalCaseNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalCaseNode getDefaultInstanceForType() {
      return org.blaze.protobuf.PhysicalCaseNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalCaseNode build() {
      org.blaze.protobuf.PhysicalCaseNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalCaseNode buildPartial() {
      org.blaze.protobuf.PhysicalCaseNode result = new org.blaze.protobuf.PhysicalCaseNode(this);
      int from_bitField0_ = bitField0_;
      if (exprBuilder_ == null) {
        result.expr_ = expr_;
      } else {
        result.expr_ = exprBuilder_.build();
      }
      if (whenThenExprBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          whenThenExpr_ = java.util.Collections.unmodifiableList(whenThenExpr_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.whenThenExpr_ = whenThenExpr_;
      } else {
        result.whenThenExpr_ = whenThenExprBuilder_.build();
      }
      if (elseExprBuilder_ == null) {
        result.elseExpr_ = elseExpr_;
      } else {
        result.elseExpr_ = elseExprBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.PhysicalCaseNode) {
        return mergeFrom((org.blaze.protobuf.PhysicalCaseNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.PhysicalCaseNode other) {
      if (other == org.blaze.protobuf.PhysicalCaseNode.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (whenThenExprBuilder_ == null) {
        if (!other.whenThenExpr_.isEmpty()) {
          if (whenThenExpr_.isEmpty()) {
            whenThenExpr_ = other.whenThenExpr_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWhenThenExprIsMutable();
            whenThenExpr_.addAll(other.whenThenExpr_);
          }
          onChanged();
        }
      } else {
        if (!other.whenThenExpr_.isEmpty()) {
          if (whenThenExprBuilder_.isEmpty()) {
            whenThenExprBuilder_.dispose();
            whenThenExprBuilder_ = null;
            whenThenExpr_ = other.whenThenExpr_;
            bitField0_ = (bitField0_ & ~0x00000001);
            whenThenExprBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWhenThenExprFieldBuilder() : null;
          } else {
            whenThenExprBuilder_.addAllMessages(other.whenThenExpr_);
          }
        }
      }
      if (other.hasElseExpr()) {
        mergeElseExpr(other.getElseExpr());
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
                  getExprFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              org.blaze.protobuf.PhysicalWhenThen m =
                  input.readMessage(
                      org.blaze.protobuf.PhysicalWhenThen.parser(),
                      extensionRegistry);
              if (whenThenExprBuilder_ == null) {
                ensureWhenThenExprIsMutable();
                whenThenExpr_.add(m);
              } else {
                whenThenExprBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getElseExprFieldBuilder().getBuilder(),
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

    private org.blaze.protobuf.PhysicalExprNode expr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> exprBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     * @return Whether the expr field is set.
     */
    public boolean hasExpr() {
      return exprBuilder_ != null || expr_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     * @return The expr.
     */
    public org.blaze.protobuf.PhysicalExprNode getExpr() {
      if (exprBuilder_ == null) {
        return expr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : expr_;
      } else {
        return exprBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    public Builder setExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (exprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expr_ = value;
        onChanged();
      } else {
        exprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    public Builder setExpr(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (exprBuilder_ == null) {
        expr_ = builderForValue.build();
        onChanged();
      } else {
        exprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    public Builder mergeExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (exprBuilder_ == null) {
        if (expr_ != null) {
          expr_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(expr_).mergeFrom(value).buildPartial();
        } else {
          expr_ = value;
        }
        onChanged();
      } else {
        exprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    public Builder clearExpr() {
      if (exprBuilder_ == null) {
        expr_ = null;
        onChanged();
      } else {
        expr_ = null;
        exprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getExprBuilder() {
      
      onChanged();
      return getExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getExprOrBuilder() {
      if (exprBuilder_ != null) {
        return exprBuilder_.getMessageOrBuilder();
      } else {
        return expr_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : expr_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expr = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getExprFieldBuilder() {
      if (exprBuilder_ == null) {
        exprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getExpr(),
                getParentForChildren(),
                isClean());
        expr_ = null;
      }
      return exprBuilder_;
    }

    private java.util.List<org.blaze.protobuf.PhysicalWhenThen> whenThenExpr_ =
      java.util.Collections.emptyList();
    private void ensureWhenThenExprIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        whenThenExpr_ = new java.util.ArrayList<org.blaze.protobuf.PhysicalWhenThen>(whenThenExpr_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalWhenThen, org.blaze.protobuf.PhysicalWhenThen.Builder, org.blaze.protobuf.PhysicalWhenThenOrBuilder> whenThenExprBuilder_;

    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalWhenThen> getWhenThenExprList() {
      if (whenThenExprBuilder_ == null) {
        return java.util.Collections.unmodifiableList(whenThenExpr_);
      } else {
        return whenThenExprBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public int getWhenThenExprCount() {
      if (whenThenExprBuilder_ == null) {
        return whenThenExpr_.size();
      } else {
        return whenThenExprBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalWhenThen getWhenThenExpr(int index) {
      if (whenThenExprBuilder_ == null) {
        return whenThenExpr_.get(index);
      } else {
        return whenThenExprBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder setWhenThenExpr(
        int index, org.blaze.protobuf.PhysicalWhenThen value) {
      if (whenThenExprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWhenThenExprIsMutable();
        whenThenExpr_.set(index, value);
        onChanged();
      } else {
        whenThenExprBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder setWhenThenExpr(
        int index, org.blaze.protobuf.PhysicalWhenThen.Builder builderForValue) {
      if (whenThenExprBuilder_ == null) {
        ensureWhenThenExprIsMutable();
        whenThenExpr_.set(index, builderForValue.build());
        onChanged();
      } else {
        whenThenExprBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder addWhenThenExpr(org.blaze.protobuf.PhysicalWhenThen value) {
      if (whenThenExprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWhenThenExprIsMutable();
        whenThenExpr_.add(value);
        onChanged();
      } else {
        whenThenExprBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder addWhenThenExpr(
        int index, org.blaze.protobuf.PhysicalWhenThen value) {
      if (whenThenExprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWhenThenExprIsMutable();
        whenThenExpr_.add(index, value);
        onChanged();
      } else {
        whenThenExprBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder addWhenThenExpr(
        org.blaze.protobuf.PhysicalWhenThen.Builder builderForValue) {
      if (whenThenExprBuilder_ == null) {
        ensureWhenThenExprIsMutable();
        whenThenExpr_.add(builderForValue.build());
        onChanged();
      } else {
        whenThenExprBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder addWhenThenExpr(
        int index, org.blaze.protobuf.PhysicalWhenThen.Builder builderForValue) {
      if (whenThenExprBuilder_ == null) {
        ensureWhenThenExprIsMutable();
        whenThenExpr_.add(index, builderForValue.build());
        onChanged();
      } else {
        whenThenExprBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder addAllWhenThenExpr(
        java.lang.Iterable<? extends org.blaze.protobuf.PhysicalWhenThen> values) {
      if (whenThenExprBuilder_ == null) {
        ensureWhenThenExprIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, whenThenExpr_);
        onChanged();
      } else {
        whenThenExprBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder clearWhenThenExpr() {
      if (whenThenExprBuilder_ == null) {
        whenThenExpr_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        whenThenExprBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public Builder removeWhenThenExpr(int index) {
      if (whenThenExprBuilder_ == null) {
        ensureWhenThenExprIsMutable();
        whenThenExpr_.remove(index);
        onChanged();
      } else {
        whenThenExprBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalWhenThen.Builder getWhenThenExprBuilder(
        int index) {
      return getWhenThenExprFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalWhenThenOrBuilder getWhenThenExprOrBuilder(
        int index) {
      if (whenThenExprBuilder_ == null) {
        return whenThenExpr_.get(index);  } else {
        return whenThenExprBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.PhysicalWhenThenOrBuilder> 
         getWhenThenExprOrBuilderList() {
      if (whenThenExprBuilder_ != null) {
        return whenThenExprBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(whenThenExpr_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalWhenThen.Builder addWhenThenExprBuilder() {
      return getWhenThenExprFieldBuilder().addBuilder(
          org.blaze.protobuf.PhysicalWhenThen.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalWhenThen.Builder addWhenThenExprBuilder(
        int index) {
      return getWhenThenExprFieldBuilder().addBuilder(
          index, org.blaze.protobuf.PhysicalWhenThen.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalWhenThen when_then_expr = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalWhenThen.Builder> 
         getWhenThenExprBuilderList() {
      return getWhenThenExprFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalWhenThen, org.blaze.protobuf.PhysicalWhenThen.Builder, org.blaze.protobuf.PhysicalWhenThenOrBuilder> 
        getWhenThenExprFieldBuilder() {
      if (whenThenExprBuilder_ == null) {
        whenThenExprBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.PhysicalWhenThen, org.blaze.protobuf.PhysicalWhenThen.Builder, org.blaze.protobuf.PhysicalWhenThenOrBuilder>(
                whenThenExpr_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        whenThenExpr_ = null;
      }
      return whenThenExprBuilder_;
    }

    private org.blaze.protobuf.PhysicalExprNode elseExpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> elseExprBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     * @return Whether the elseExpr field is set.
     */
    public boolean hasElseExpr() {
      return elseExprBuilder_ != null || elseExpr_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     * @return The elseExpr.
     */
    public org.blaze.protobuf.PhysicalExprNode getElseExpr() {
      if (elseExprBuilder_ == null) {
        return elseExpr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : elseExpr_;
      } else {
        return elseExprBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    public Builder setElseExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (elseExprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        elseExpr_ = value;
        onChanged();
      } else {
        elseExprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    public Builder setElseExpr(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (elseExprBuilder_ == null) {
        elseExpr_ = builderForValue.build();
        onChanged();
      } else {
        elseExprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    public Builder mergeElseExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (elseExprBuilder_ == null) {
        if (elseExpr_ != null) {
          elseExpr_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(elseExpr_).mergeFrom(value).buildPartial();
        } else {
          elseExpr_ = value;
        }
        onChanged();
      } else {
        elseExprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    public Builder clearElseExpr() {
      if (elseExprBuilder_ == null) {
        elseExpr_ = null;
        onChanged();
      } else {
        elseExpr_ = null;
        elseExprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getElseExprBuilder() {
      
      onChanged();
      return getElseExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getElseExprOrBuilder() {
      if (elseExprBuilder_ != null) {
        return elseExprBuilder_.getMessageOrBuilder();
      } else {
        return elseExpr_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : elseExpr_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode else_expr = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getElseExprFieldBuilder() {
      if (elseExprBuilder_ == null) {
        elseExprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getElseExpr(),
                getParentForChildren(),
                isClean());
        elseExpr_ = null;
      }
      return elseExprBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.PhysicalCaseNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.PhysicalCaseNode)
  private static final org.blaze.protobuf.PhysicalCaseNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.PhysicalCaseNode();
  }

  public static org.blaze.protobuf.PhysicalCaseNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhysicalCaseNode>
      PARSER = new com.google.protobuf.AbstractParser<PhysicalCaseNode>() {
    @java.lang.Override
    public PhysicalCaseNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhysicalCaseNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhysicalCaseNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.PhysicalCaseNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

