// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.PhysicalBinaryExprNode}
 */
public final class PhysicalBinaryExprNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.PhysicalBinaryExprNode)
    PhysicalBinaryExprNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhysicalBinaryExprNode.newBuilder() to construct.
  private PhysicalBinaryExprNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhysicalBinaryExprNode() {
    op_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhysicalBinaryExprNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalBinaryExprNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalBinaryExprNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.PhysicalBinaryExprNode.class, org.blaze.protobuf.PhysicalBinaryExprNode.Builder.class);
  }

  public static final int L_FIELD_NUMBER = 1;
  private org.blaze.protobuf.PhysicalExprNode l_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
   * @return Whether the l field is set.
   */
  @java.lang.Override
  public boolean hasL() {
    return l_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
   * @return The l.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getL() {
    return l_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : l_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getLOrBuilder() {
    return getL();
  }

  public static final int R_FIELD_NUMBER = 2;
  private org.blaze.protobuf.PhysicalExprNode r_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
   * @return Whether the r field is set.
   */
  @java.lang.Override
  public boolean hasR() {
    return r_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
   * @return The r.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getR() {
    return r_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : r_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getROrBuilder() {
    return getR();
  }

  public static final int OP_FIELD_NUMBER = 3;
  private volatile java.lang.Object op_;
  /**
   * <code>string op = 3;</code>
   * @return The op.
   */
  @java.lang.Override
  public java.lang.String getOp() {
    java.lang.Object ref = op_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      op_ = s;
      return s;
    }
  }
  /**
   * <code>string op = 3;</code>
   * @return The bytes for op.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOpBytes() {
    java.lang.Object ref = op_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      op_ = b;
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
    if (l_ != null) {
      output.writeMessage(1, getL());
    }
    if (r_ != null) {
      output.writeMessage(2, getR());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(op_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, op_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (l_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getL());
    }
    if (r_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getR());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(op_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, op_);
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
    if (!(obj instanceof org.blaze.protobuf.PhysicalBinaryExprNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.PhysicalBinaryExprNode other = (org.blaze.protobuf.PhysicalBinaryExprNode) obj;

    if (hasL() != other.hasL()) return false;
    if (hasL()) {
      if (!getL()
          .equals(other.getL())) return false;
    }
    if (hasR() != other.hasR()) return false;
    if (hasR()) {
      if (!getR()
          .equals(other.getR())) return false;
    }
    if (!getOp()
        .equals(other.getOp())) return false;
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
    if (hasL()) {
      hash = (37 * hash) + L_FIELD_NUMBER;
      hash = (53 * hash) + getL().hashCode();
    }
    if (hasR()) {
      hash = (37 * hash) + R_FIELD_NUMBER;
      hash = (53 * hash) + getR().hashCode();
    }
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + getOp().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalBinaryExprNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.PhysicalBinaryExprNode prototype) {
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
   * Protobuf type {@code plan.protobuf.PhysicalBinaryExprNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.PhysicalBinaryExprNode)
      org.blaze.protobuf.PhysicalBinaryExprNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalBinaryExprNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalBinaryExprNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.PhysicalBinaryExprNode.class, org.blaze.protobuf.PhysicalBinaryExprNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.PhysicalBinaryExprNode.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lBuilder_ == null) {
        l_ = null;
      } else {
        l_ = null;
        lBuilder_ = null;
      }
      if (rBuilder_ == null) {
        r_ = null;
      } else {
        r_ = null;
        rBuilder_ = null;
      }
      op_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalBinaryExprNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalBinaryExprNode getDefaultInstanceForType() {
      return org.blaze.protobuf.PhysicalBinaryExprNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalBinaryExprNode build() {
      org.blaze.protobuf.PhysicalBinaryExprNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalBinaryExprNode buildPartial() {
      org.blaze.protobuf.PhysicalBinaryExprNode result = new org.blaze.protobuf.PhysicalBinaryExprNode(this);
      if (lBuilder_ == null) {
        result.l_ = l_;
      } else {
        result.l_ = lBuilder_.build();
      }
      if (rBuilder_ == null) {
        result.r_ = r_;
      } else {
        result.r_ = rBuilder_.build();
      }
      result.op_ = op_;
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
      if (other instanceof org.blaze.protobuf.PhysicalBinaryExprNode) {
        return mergeFrom((org.blaze.protobuf.PhysicalBinaryExprNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.PhysicalBinaryExprNode other) {
      if (other == org.blaze.protobuf.PhysicalBinaryExprNode.getDefaultInstance()) return this;
      if (other.hasL()) {
        mergeL(other.getL());
      }
      if (other.hasR()) {
        mergeR(other.getR());
      }
      if (!other.getOp().isEmpty()) {
        op_ = other.op_;
        onChanged();
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
                  getLFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              op_ = input.readStringRequireUtf8();

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

    private org.blaze.protobuf.PhysicalExprNode l_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> lBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     * @return Whether the l field is set.
     */
    public boolean hasL() {
      return lBuilder_ != null || l_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     * @return The l.
     */
    public org.blaze.protobuf.PhysicalExprNode getL() {
      if (lBuilder_ == null) {
        return l_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : l_;
      } else {
        return lBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    public Builder setL(org.blaze.protobuf.PhysicalExprNode value) {
      if (lBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        l_ = value;
        onChanged();
      } else {
        lBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    public Builder setL(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (lBuilder_ == null) {
        l_ = builderForValue.build();
        onChanged();
      } else {
        lBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    public Builder mergeL(org.blaze.protobuf.PhysicalExprNode value) {
      if (lBuilder_ == null) {
        if (l_ != null) {
          l_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(l_).mergeFrom(value).buildPartial();
        } else {
          l_ = value;
        }
        onChanged();
      } else {
        lBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    public Builder clearL() {
      if (lBuilder_ == null) {
        l_ = null;
        onChanged();
      } else {
        l_ = null;
        lBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getLBuilder() {
      
      onChanged();
      return getLFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getLOrBuilder() {
      if (lBuilder_ != null) {
        return lBuilder_.getMessageOrBuilder();
      } else {
        return l_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : l_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode l = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getLFieldBuilder() {
      if (lBuilder_ == null) {
        lBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getL(),
                getParentForChildren(),
                isClean());
        l_ = null;
      }
      return lBuilder_;
    }

    private org.blaze.protobuf.PhysicalExprNode r_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> rBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     * @return Whether the r field is set.
     */
    public boolean hasR() {
      return rBuilder_ != null || r_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     * @return The r.
     */
    public org.blaze.protobuf.PhysicalExprNode getR() {
      if (rBuilder_ == null) {
        return r_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : r_;
      } else {
        return rBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    public Builder setR(org.blaze.protobuf.PhysicalExprNode value) {
      if (rBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        r_ = value;
        onChanged();
      } else {
        rBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    public Builder setR(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (rBuilder_ == null) {
        r_ = builderForValue.build();
        onChanged();
      } else {
        rBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    public Builder mergeR(org.blaze.protobuf.PhysicalExprNode value) {
      if (rBuilder_ == null) {
        if (r_ != null) {
          r_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(r_).mergeFrom(value).buildPartial();
        } else {
          r_ = value;
        }
        onChanged();
      } else {
        rBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    public Builder clearR() {
      if (rBuilder_ == null) {
        r_ = null;
        onChanged();
      } else {
        r_ = null;
        rBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getRBuilder() {
      
      onChanged();
      return getRFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getROrBuilder() {
      if (rBuilder_ != null) {
        return rBuilder_.getMessageOrBuilder();
      } else {
        return r_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : r_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode r = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getRFieldBuilder() {
      if (rBuilder_ == null) {
        rBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getR(),
                getParentForChildren(),
                isClean());
        r_ = null;
      }
      return rBuilder_;
    }

    private java.lang.Object op_ = "";
    /**
     * <code>string op = 3;</code>
     * @return The op.
     */
    public java.lang.String getOp() {
      java.lang.Object ref = op_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        op_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string op = 3;</code>
     * @return The bytes for op.
     */
    public com.google.protobuf.ByteString
        getOpBytes() {
      java.lang.Object ref = op_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        op_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string op = 3;</code>
     * @param value The op to set.
     * @return This builder for chaining.
     */
    public Builder setOp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      op_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string op = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOp() {
      
      op_ = getDefaultInstance().getOp();
      onChanged();
      return this;
    }
    /**
     * <code>string op = 3;</code>
     * @param value The bytes for op to set.
     * @return This builder for chaining.
     */
    public Builder setOpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      op_ = value;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.PhysicalBinaryExprNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.PhysicalBinaryExprNode)
  private static final org.blaze.protobuf.PhysicalBinaryExprNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.PhysicalBinaryExprNode();
  }

  public static org.blaze.protobuf.PhysicalBinaryExprNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhysicalBinaryExprNode>
      PARSER = new com.google.protobuf.AbstractParser<PhysicalBinaryExprNode>() {
    @java.lang.Override
    public PhysicalBinaryExprNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhysicalBinaryExprNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhysicalBinaryExprNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.PhysicalBinaryExprNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
