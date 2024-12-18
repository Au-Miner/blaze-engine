// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.PhysicalWhenThen}
 */
public final class PhysicalWhenThen extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.PhysicalWhenThen)
    PhysicalWhenThenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhysicalWhenThen.newBuilder() to construct.
  private PhysicalWhenThen(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhysicalWhenThen() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhysicalWhenThen();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalWhenThen_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalWhenThen_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.PhysicalWhenThen.class, org.blaze.protobuf.PhysicalWhenThen.Builder.class);
  }

  public static final int WHEN_EXPR_FIELD_NUMBER = 1;
  private org.blaze.protobuf.PhysicalExprNode whenExpr_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
   * @return Whether the whenExpr field is set.
   */
  @java.lang.Override
  public boolean hasWhenExpr() {
    return whenExpr_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
   * @return The whenExpr.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getWhenExpr() {
    return whenExpr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : whenExpr_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getWhenExprOrBuilder() {
    return getWhenExpr();
  }

  public static final int THEN_EXPR_FIELD_NUMBER = 2;
  private org.blaze.protobuf.PhysicalExprNode thenExpr_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
   * @return Whether the thenExpr field is set.
   */
  @java.lang.Override
  public boolean hasThenExpr() {
    return thenExpr_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
   * @return The thenExpr.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getThenExpr() {
    return thenExpr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : thenExpr_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getThenExprOrBuilder() {
    return getThenExpr();
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
    if (whenExpr_ != null) {
      output.writeMessage(1, getWhenExpr());
    }
    if (thenExpr_ != null) {
      output.writeMessage(2, getThenExpr());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (whenExpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWhenExpr());
    }
    if (thenExpr_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getThenExpr());
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
    if (!(obj instanceof org.blaze.protobuf.PhysicalWhenThen)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.PhysicalWhenThen other = (org.blaze.protobuf.PhysicalWhenThen) obj;

    if (hasWhenExpr() != other.hasWhenExpr()) return false;
    if (hasWhenExpr()) {
      if (!getWhenExpr()
          .equals(other.getWhenExpr())) return false;
    }
    if (hasThenExpr() != other.hasThenExpr()) return false;
    if (hasThenExpr()) {
      if (!getThenExpr()
          .equals(other.getThenExpr())) return false;
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
    if (hasWhenExpr()) {
      hash = (37 * hash) + WHEN_EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getWhenExpr().hashCode();
    }
    if (hasThenExpr()) {
      hash = (37 * hash) + THEN_EXPR_FIELD_NUMBER;
      hash = (53 * hash) + getThenExpr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.PhysicalWhenThen parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.PhysicalWhenThen prototype) {
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
   * Protobuf type {@code plan.protobuf.PhysicalWhenThen}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.PhysicalWhenThen)
      org.blaze.protobuf.PhysicalWhenThenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalWhenThen_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalWhenThen_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.PhysicalWhenThen.class, org.blaze.protobuf.PhysicalWhenThen.Builder.class);
    }

    // Construct using org.blaze.protobuf.PhysicalWhenThen.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (whenExprBuilder_ == null) {
        whenExpr_ = null;
      } else {
        whenExpr_ = null;
        whenExprBuilder_ = null;
      }
      if (thenExprBuilder_ == null) {
        thenExpr_ = null;
      } else {
        thenExpr_ = null;
        thenExprBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_PhysicalWhenThen_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalWhenThen getDefaultInstanceForType() {
      return org.blaze.protobuf.PhysicalWhenThen.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalWhenThen build() {
      org.blaze.protobuf.PhysicalWhenThen result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.PhysicalWhenThen buildPartial() {
      org.blaze.protobuf.PhysicalWhenThen result = new org.blaze.protobuf.PhysicalWhenThen(this);
      if (whenExprBuilder_ == null) {
        result.whenExpr_ = whenExpr_;
      } else {
        result.whenExpr_ = whenExprBuilder_.build();
      }
      if (thenExprBuilder_ == null) {
        result.thenExpr_ = thenExpr_;
      } else {
        result.thenExpr_ = thenExprBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.PhysicalWhenThen) {
        return mergeFrom((org.blaze.protobuf.PhysicalWhenThen)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.PhysicalWhenThen other) {
      if (other == org.blaze.protobuf.PhysicalWhenThen.getDefaultInstance()) return this;
      if (other.hasWhenExpr()) {
        mergeWhenExpr(other.getWhenExpr());
      }
      if (other.hasThenExpr()) {
        mergeThenExpr(other.getThenExpr());
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
                  getWhenExprFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getThenExprFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private org.blaze.protobuf.PhysicalExprNode whenExpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> whenExprBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     * @return Whether the whenExpr field is set.
     */
    public boolean hasWhenExpr() {
      return whenExprBuilder_ != null || whenExpr_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     * @return The whenExpr.
     */
    public org.blaze.protobuf.PhysicalExprNode getWhenExpr() {
      if (whenExprBuilder_ == null) {
        return whenExpr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : whenExpr_;
      } else {
        return whenExprBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    public Builder setWhenExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (whenExprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        whenExpr_ = value;
        onChanged();
      } else {
        whenExprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    public Builder setWhenExpr(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (whenExprBuilder_ == null) {
        whenExpr_ = builderForValue.build();
        onChanged();
      } else {
        whenExprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    public Builder mergeWhenExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (whenExprBuilder_ == null) {
        if (whenExpr_ != null) {
          whenExpr_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(whenExpr_).mergeFrom(value).buildPartial();
        } else {
          whenExpr_ = value;
        }
        onChanged();
      } else {
        whenExprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    public Builder clearWhenExpr() {
      if (whenExprBuilder_ == null) {
        whenExpr_ = null;
        onChanged();
      } else {
        whenExpr_ = null;
        whenExprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getWhenExprBuilder() {
      
      onChanged();
      return getWhenExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getWhenExprOrBuilder() {
      if (whenExprBuilder_ != null) {
        return whenExprBuilder_.getMessageOrBuilder();
      } else {
        return whenExpr_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : whenExpr_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode when_expr = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getWhenExprFieldBuilder() {
      if (whenExprBuilder_ == null) {
        whenExprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getWhenExpr(),
                getParentForChildren(),
                isClean());
        whenExpr_ = null;
      }
      return whenExprBuilder_;
    }

    private org.blaze.protobuf.PhysicalExprNode thenExpr_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> thenExprBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     * @return Whether the thenExpr field is set.
     */
    public boolean hasThenExpr() {
      return thenExprBuilder_ != null || thenExpr_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     * @return The thenExpr.
     */
    public org.blaze.protobuf.PhysicalExprNode getThenExpr() {
      if (thenExprBuilder_ == null) {
        return thenExpr_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : thenExpr_;
      } else {
        return thenExprBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    public Builder setThenExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (thenExprBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        thenExpr_ = value;
        onChanged();
      } else {
        thenExprBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    public Builder setThenExpr(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (thenExprBuilder_ == null) {
        thenExpr_ = builderForValue.build();
        onChanged();
      } else {
        thenExprBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    public Builder mergeThenExpr(org.blaze.protobuf.PhysicalExprNode value) {
      if (thenExprBuilder_ == null) {
        if (thenExpr_ != null) {
          thenExpr_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(thenExpr_).mergeFrom(value).buildPartial();
        } else {
          thenExpr_ = value;
        }
        onChanged();
      } else {
        thenExprBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    public Builder clearThenExpr() {
      if (thenExprBuilder_ == null) {
        thenExpr_ = null;
        onChanged();
      } else {
        thenExpr_ = null;
        thenExprBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getThenExprBuilder() {
      
      onChanged();
      return getThenExprFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getThenExprOrBuilder() {
      if (thenExprBuilder_ != null) {
        return thenExprBuilder_.getMessageOrBuilder();
      } else {
        return thenExpr_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : thenExpr_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode then_expr = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getThenExprFieldBuilder() {
      if (thenExprBuilder_ == null) {
        thenExprBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getThenExpr(),
                getParentForChildren(),
                isClean());
        thenExpr_ = null;
      }
      return thenExprBuilder_;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.PhysicalWhenThen)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.PhysicalWhenThen)
  private static final org.blaze.protobuf.PhysicalWhenThen DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.PhysicalWhenThen();
  }

  public static org.blaze.protobuf.PhysicalWhenThen getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhysicalWhenThen>
      PARSER = new com.google.protobuf.AbstractParser<PhysicalWhenThen>() {
    @java.lang.Override
    public PhysicalWhenThen parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhysicalWhenThen> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhysicalWhenThen> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.PhysicalWhenThen getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

