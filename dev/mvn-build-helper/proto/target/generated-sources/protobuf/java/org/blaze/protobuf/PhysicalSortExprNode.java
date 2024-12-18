// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.PhysicalSortExprNode}
 */
public final class PhysicalSortExprNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.PhysicalSortExprNode)
    PhysicalSortExprNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhysicalSortExprNode.newBuilder() to construct.
  private PhysicalSortExprNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhysicalSortExprNode() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhysicalSortExprNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalSortExprNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalSortExprNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.PhysicalSortExprNode.class, org.blaze.protobuf.PhysicalSortExprNode.Builder.class);
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

  public static final int ASC_FIELD_NUMBER = 2;
  private boolean asc_;
  /**
   * <code>bool asc = 2;</code>
   * @return The asc.
   */
  @java.lang.Override
  public boolean getAsc() {
    return asc_;
  }

  public static final int NULLS_FIRST_FIELD_NUMBER = 3;
  private boolean nullsFirst_;
  /**
   * <code>bool nulls_first = 3;</code>
   * @return The nullsFirst.
   */
  @java.lang.Override
  public boolean getNullsFirst() {
    return nullsFirst_;
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
    if (asc_ != false) {
      output.writeBool(2, asc_);
    }
    if (nullsFirst_ != false) {
      output.writeBool(3, nullsFirst_);
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
    if (asc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, asc_);
    }
    if (nullsFirst_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, nullsFirst_);
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
    if (!(obj instanceof org.blaze.protobuf.PhysicalSortExprNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.PhysicalSortExprNode other = (org.blaze.protobuf.PhysicalSortExprNode) obj;

    if (hasExpr() != other.hasExpr()) return false;
    if (hasExpr()) {
      if (!getExpr()
          .equals(other.getExpr())) return false;
    }
    if (getAsc()
        != other.getAsc()) return false;
    if (getNullsFirst()
        != other.getNullsFirst()) return false;
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
    hash = (37 * hash) + ASC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAsc());
    hash = (37 * hash) + NULLS_FIRST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullsFirst());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalSortExprNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.PhysicalSortExprNode prototype) {
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
   * Protobuf type {@code plan.protobuf.PhysicalSortExprNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.PhysicalSortExprNode)
      org.blaze.protobuf.PhysicalSortExprNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalSortExprNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalSortExprNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.PhysicalSortExprNode.class, org.blaze.protobuf.PhysicalSortExprNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.PhysicalSortExprNode.newBuilder()
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
      asc_ = false;

      nullsFirst_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalSortExprNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalSortExprNode getDefaultInstanceForType() {
      return org.blaze.protobuf.PhysicalSortExprNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalSortExprNode build() {
      org.blaze.protobuf.PhysicalSortExprNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalSortExprNode buildPartial() {
      org.blaze.protobuf.PhysicalSortExprNode result = new org.blaze.protobuf.PhysicalSortExprNode(this);
      if (exprBuilder_ == null) {
        result.expr_ = expr_;
      } else {
        result.expr_ = exprBuilder_.build();
      }
      result.asc_ = asc_;
      result.nullsFirst_ = nullsFirst_;
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
      if (other instanceof org.blaze.protobuf.PhysicalSortExprNode) {
        return mergeFrom((org.blaze.protobuf.PhysicalSortExprNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.PhysicalSortExprNode other) {
      if (other == org.blaze.protobuf.PhysicalSortExprNode.getDefaultInstance()) return this;
      if (other.hasExpr()) {
        mergeExpr(other.getExpr());
      }
      if (other.getAsc() != false) {
        setAsc(other.getAsc());
      }
      if (other.getNullsFirst() != false) {
        setNullsFirst(other.getNullsFirst());
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
            case 16: {
              asc_ = input.readBool();

              break;
            } // case 16
            case 24: {
              nullsFirst_ = input.readBool();

              break;
            } // case 24
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

    private boolean asc_ ;
    /**
     * <code>bool asc = 2;</code>
     * @return The asc.
     */
    @java.lang.Override
    public boolean getAsc() {
      return asc_;
    }
    /**
     * <code>bool asc = 2;</code>
     * @param value The asc to set.
     * @return This builder for chaining.
     */
    public Builder setAsc(boolean value) {
      
      asc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool asc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAsc() {
      
      asc_ = false;
      onChanged();
      return this;
    }

    private boolean nullsFirst_ ;
    /**
     * <code>bool nulls_first = 3;</code>
     * @return The nullsFirst.
     */
    @java.lang.Override
    public boolean getNullsFirst() {
      return nullsFirst_;
    }
    /**
     * <code>bool nulls_first = 3;</code>
     * @param value The nullsFirst to set.
     * @return This builder for chaining.
     */
    public Builder setNullsFirst(boolean value) {
      
      nullsFirst_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool nulls_first = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNullsFirst() {
      
      nullsFirst_ = false;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.PhysicalSortExprNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.PhysicalSortExprNode)
  private static final org.blaze.protobuf.PhysicalSortExprNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.PhysicalSortExprNode();
  }

  public static org.blaze.protobuf.PhysicalSortExprNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhysicalSortExprNode>
      PARSER = new com.google.protobuf.AbstractParser<PhysicalSortExprNode>() {
    @java.lang.Override
    public PhysicalSortExprNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhysicalSortExprNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhysicalSortExprNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.PhysicalSortExprNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

