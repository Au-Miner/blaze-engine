// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.ParquetScanExecNode}
 */
public final class ParquetScanExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.ParquetScanExecNode)
    ParquetScanExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParquetScanExecNode.newBuilder() to construct.
  private ParquetScanExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParquetScanExecNode() {
    pruningPredicates_ = java.util.Collections.emptyList();
    fsResourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ParquetScanExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ParquetScanExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ParquetScanExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.ParquetScanExecNode.class, org.blaze.protobuf.ParquetScanExecNode.Builder.class);
  }

  public static final int BASE_CONF_FIELD_NUMBER = 1;
  private org.blaze.protobuf.FileScanExecConf baseConf_;
  /**
   * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
   * @return Whether the baseConf field is set.
   */
  @java.lang.Override
  public boolean hasBaseConf() {
    return baseConf_ != null;
  }
  /**
   * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
   * @return The baseConf.
   */
  @java.lang.Override
  public org.blaze.protobuf.FileScanExecConf getBaseConf() {
    return baseConf_ == null ? org.blaze.protobuf.FileScanExecConf.getDefaultInstance() : baseConf_;
  }
  /**
   * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.FileScanExecConfOrBuilder getBaseConfOrBuilder() {
    return getBaseConf();
  }

  public static final int PRUNING_PREDICATES_FIELD_NUMBER = 2;
  private java.util.List<org.blaze.protobuf.PhysicalExprNode> pruningPredicates_;
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.PhysicalExprNode> getPruningPredicatesList() {
    return pruningPredicates_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
      getPruningPredicatesOrBuilderList() {
    return pruningPredicates_;
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
   */
  @java.lang.Override
  public int getPruningPredicatesCount() {
    return pruningPredicates_.size();
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getPruningPredicates(int index) {
    return pruningPredicates_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getPruningPredicatesOrBuilder(
      int index) {
    return pruningPredicates_.get(index);
  }

  public static final int FSRESOURCEID_FIELD_NUMBER = 3;
  private volatile java.lang.Object fsResourceId_;
  /**
   * <code>string fsResourceId = 3;</code>
   * @return The fsResourceId.
   */
  @java.lang.Override
  public java.lang.String getFsResourceId() {
    java.lang.Object ref = fsResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fsResourceId_ = s;
      return s;
    }
  }
  /**
   * <code>string fsResourceId = 3;</code>
   * @return The bytes for fsResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFsResourceIdBytes() {
    java.lang.Object ref = fsResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fsResourceId_ = b;
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
    if (baseConf_ != null) {
      output.writeMessage(1, getBaseConf());
    }
    for (int i = 0; i < pruningPredicates_.size(); i++) {
      output.writeMessage(2, pruningPredicates_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fsResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fsResourceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseConf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseConf());
    }
    for (int i = 0; i < pruningPredicates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, pruningPredicates_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fsResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fsResourceId_);
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
    if (!(obj instanceof org.blaze.protobuf.ParquetScanExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.ParquetScanExecNode other = (org.blaze.protobuf.ParquetScanExecNode) obj;

    if (hasBaseConf() != other.hasBaseConf()) return false;
    if (hasBaseConf()) {
      if (!getBaseConf()
          .equals(other.getBaseConf())) return false;
    }
    if (!getPruningPredicatesList()
        .equals(other.getPruningPredicatesList())) return false;
    if (!getFsResourceId()
        .equals(other.getFsResourceId())) return false;
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
    if (hasBaseConf()) {
      hash = (37 * hash) + BASE_CONF_FIELD_NUMBER;
      hash = (53 * hash) + getBaseConf().hashCode();
    }
    if (getPruningPredicatesCount() > 0) {
      hash = (37 * hash) + PRUNING_PREDICATES_FIELD_NUMBER;
      hash = (53 * hash) + getPruningPredicatesList().hashCode();
    }
    hash = (37 * hash) + FSRESOURCEID_FIELD_NUMBER;
    hash = (53 * hash) + getFsResourceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ParquetScanExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.ParquetScanExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.ParquetScanExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.ParquetScanExecNode)
      org.blaze.protobuf.ParquetScanExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ParquetScanExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ParquetScanExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.ParquetScanExecNode.class, org.blaze.protobuf.ParquetScanExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.ParquetScanExecNode.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (baseConfBuilder_ == null) {
        baseConf_ = null;
      } else {
        baseConf_ = null;
        baseConfBuilder_ = null;
      }
      if (pruningPredicatesBuilder_ == null) {
        pruningPredicates_ = java.util.Collections.emptyList();
      } else {
        pruningPredicates_ = null;
        pruningPredicatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      fsResourceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ParquetScanExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.ParquetScanExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.ParquetScanExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.ParquetScanExecNode build() {
      org.blaze.protobuf.ParquetScanExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.ParquetScanExecNode buildPartial() {
      org.blaze.protobuf.ParquetScanExecNode result = new org.blaze.protobuf.ParquetScanExecNode(this);
      int from_bitField0_ = bitField0_;
      if (baseConfBuilder_ == null) {
        result.baseConf_ = baseConf_;
      } else {
        result.baseConf_ = baseConfBuilder_.build();
      }
      if (pruningPredicatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pruningPredicates_ = java.util.Collections.unmodifiableList(pruningPredicates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pruningPredicates_ = pruningPredicates_;
      } else {
        result.pruningPredicates_ = pruningPredicatesBuilder_.build();
      }
      result.fsResourceId_ = fsResourceId_;
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
      if (other instanceof org.blaze.protobuf.ParquetScanExecNode) {
        return mergeFrom((org.blaze.protobuf.ParquetScanExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.ParquetScanExecNode other) {
      if (other == org.blaze.protobuf.ParquetScanExecNode.getDefaultInstance()) return this;
      if (other.hasBaseConf()) {
        mergeBaseConf(other.getBaseConf());
      }
      if (pruningPredicatesBuilder_ == null) {
        if (!other.pruningPredicates_.isEmpty()) {
          if (pruningPredicates_.isEmpty()) {
            pruningPredicates_ = other.pruningPredicates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePruningPredicatesIsMutable();
            pruningPredicates_.addAll(other.pruningPredicates_);
          }
          onChanged();
        }
      } else {
        if (!other.pruningPredicates_.isEmpty()) {
          if (pruningPredicatesBuilder_.isEmpty()) {
            pruningPredicatesBuilder_.dispose();
            pruningPredicatesBuilder_ = null;
            pruningPredicates_ = other.pruningPredicates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pruningPredicatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPruningPredicatesFieldBuilder() : null;
          } else {
            pruningPredicatesBuilder_.addAllMessages(other.pruningPredicates_);
          }
        }
      }
      if (!other.getFsResourceId().isEmpty()) {
        fsResourceId_ = other.fsResourceId_;
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
                  getBaseConfFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              org.blaze.protobuf.PhysicalExprNode m =
                  input.readMessage(
                      org.blaze.protobuf.PhysicalExprNode.parser(),
                      extensionRegistry);
              if (pruningPredicatesBuilder_ == null) {
                ensurePruningPredicatesIsMutable();
                pruningPredicates_.add(m);
              } else {
                pruningPredicatesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              fsResourceId_ = input.readStringRequireUtf8();

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

    private org.blaze.protobuf.FileScanExecConf baseConf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.FileScanExecConf, org.blaze.protobuf.FileScanExecConf.Builder, org.blaze.protobuf.FileScanExecConfOrBuilder> baseConfBuilder_;
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     * @return Whether the baseConf field is set.
     */
    public boolean hasBaseConf() {
      return baseConfBuilder_ != null || baseConf_ != null;
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     * @return The baseConf.
     */
    public org.blaze.protobuf.FileScanExecConf getBaseConf() {
      if (baseConfBuilder_ == null) {
        return baseConf_ == null ? org.blaze.protobuf.FileScanExecConf.getDefaultInstance() : baseConf_;
      } else {
        return baseConfBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    public Builder setBaseConf(org.blaze.protobuf.FileScanExecConf value) {
      if (baseConfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseConf_ = value;
        onChanged();
      } else {
        baseConfBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    public Builder setBaseConf(
        org.blaze.protobuf.FileScanExecConf.Builder builderForValue) {
      if (baseConfBuilder_ == null) {
        baseConf_ = builderForValue.build();
        onChanged();
      } else {
        baseConfBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    public Builder mergeBaseConf(org.blaze.protobuf.FileScanExecConf value) {
      if (baseConfBuilder_ == null) {
        if (baseConf_ != null) {
          baseConf_ =
            org.blaze.protobuf.FileScanExecConf.newBuilder(baseConf_).mergeFrom(value).buildPartial();
        } else {
          baseConf_ = value;
        }
        onChanged();
      } else {
        baseConfBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    public Builder clearBaseConf() {
      if (baseConfBuilder_ == null) {
        baseConf_ = null;
        onChanged();
      } else {
        baseConf_ = null;
        baseConfBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    public org.blaze.protobuf.FileScanExecConf.Builder getBaseConfBuilder() {
      
      onChanged();
      return getBaseConfFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    public org.blaze.protobuf.FileScanExecConfOrBuilder getBaseConfOrBuilder() {
      if (baseConfBuilder_ != null) {
        return baseConfBuilder_.getMessageOrBuilder();
      } else {
        return baseConf_ == null ?
            org.blaze.protobuf.FileScanExecConf.getDefaultInstance() : baseConf_;
      }
    }
    /**
     * <code>.plan.protobuf.FileScanExecConf base_conf = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.FileScanExecConf, org.blaze.protobuf.FileScanExecConf.Builder, org.blaze.protobuf.FileScanExecConfOrBuilder> 
        getBaseConfFieldBuilder() {
      if (baseConfBuilder_ == null) {
        baseConfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.FileScanExecConf, org.blaze.protobuf.FileScanExecConf.Builder, org.blaze.protobuf.FileScanExecConfOrBuilder>(
                getBaseConf(),
                getParentForChildren(),
                isClean());
        baseConf_ = null;
      }
      return baseConfBuilder_;
    }

    private java.util.List<org.blaze.protobuf.PhysicalExprNode> pruningPredicates_ =
      java.util.Collections.emptyList();
    private void ensurePruningPredicatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pruningPredicates_ = new java.util.ArrayList<org.blaze.protobuf.PhysicalExprNode>(pruningPredicates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> pruningPredicatesBuilder_;

    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode> getPruningPredicatesList() {
      if (pruningPredicatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pruningPredicates_);
      } else {
        return pruningPredicatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public int getPruningPredicatesCount() {
      if (pruningPredicatesBuilder_ == null) {
        return pruningPredicates_.size();
      } else {
        return pruningPredicatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode getPruningPredicates(int index) {
      if (pruningPredicatesBuilder_ == null) {
        return pruningPredicates_.get(index);
      } else {
        return pruningPredicatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder setPruningPredicates(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (pruningPredicatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.set(index, value);
        onChanged();
      } else {
        pruningPredicatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder setPruningPredicates(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (pruningPredicatesBuilder_ == null) {
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.set(index, builderForValue.build());
        onChanged();
      } else {
        pruningPredicatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder addPruningPredicates(org.blaze.protobuf.PhysicalExprNode value) {
      if (pruningPredicatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.add(value);
        onChanged();
      } else {
        pruningPredicatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder addPruningPredicates(
        int index, org.blaze.protobuf.PhysicalExprNode value) {
      if (pruningPredicatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.add(index, value);
        onChanged();
      } else {
        pruningPredicatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder addPruningPredicates(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (pruningPredicatesBuilder_ == null) {
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.add(builderForValue.build());
        onChanged();
      } else {
        pruningPredicatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder addPruningPredicates(
        int index, org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (pruningPredicatesBuilder_ == null) {
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.add(index, builderForValue.build());
        onChanged();
      } else {
        pruningPredicatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder addAllPruningPredicates(
        java.lang.Iterable<? extends org.blaze.protobuf.PhysicalExprNode> values) {
      if (pruningPredicatesBuilder_ == null) {
        ensurePruningPredicatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pruningPredicates_);
        onChanged();
      } else {
        pruningPredicatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder clearPruningPredicates() {
      if (pruningPredicatesBuilder_ == null) {
        pruningPredicates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pruningPredicatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public Builder removePruningPredicates(int index) {
      if (pruningPredicatesBuilder_ == null) {
        ensurePruningPredicatesIsMutable();
        pruningPredicates_.remove(index);
        onChanged();
      } else {
        pruningPredicatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getPruningPredicatesBuilder(
        int index) {
      return getPruningPredicatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getPruningPredicatesOrBuilder(
        int index) {
      if (pruningPredicatesBuilder_ == null) {
        return pruningPredicates_.get(index);  } else {
        return pruningPredicatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
         getPruningPredicatesOrBuilderList() {
      if (pruningPredicatesBuilder_ != null) {
        return pruningPredicatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pruningPredicates_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addPruningPredicatesBuilder() {
      return getPruningPredicatesFieldBuilder().addBuilder(
          org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder addPruningPredicatesBuilder(
        int index) {
      return getPruningPredicatesFieldBuilder().addBuilder(
          index, org.blaze.protobuf.PhysicalExprNode.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.PhysicalExprNode pruning_predicates = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.PhysicalExprNode.Builder> 
         getPruningPredicatesBuilderList() {
      return getPruningPredicatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getPruningPredicatesFieldBuilder() {
      if (pruningPredicatesBuilder_ == null) {
        pruningPredicatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                pruningPredicates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pruningPredicates_ = null;
      }
      return pruningPredicatesBuilder_;
    }

    private java.lang.Object fsResourceId_ = "";
    /**
     * <code>string fsResourceId = 3;</code>
     * @return The fsResourceId.
     */
    public java.lang.String getFsResourceId() {
      java.lang.Object ref = fsResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fsResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fsResourceId = 3;</code>
     * @return The bytes for fsResourceId.
     */
    public com.google.protobuf.ByteString
        getFsResourceIdBytes() {
      java.lang.Object ref = fsResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fsResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fsResourceId = 3;</code>
     * @param value The fsResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setFsResourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fsResourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fsResourceId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFsResourceId() {
      
      fsResourceId_ = getDefaultInstance().getFsResourceId();
      onChanged();
      return this;
    }
    /**
     * <code>string fsResourceId = 3;</code>
     * @param value The bytes for fsResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setFsResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fsResourceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.ParquetScanExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.ParquetScanExecNode)
  private static final org.blaze.protobuf.ParquetScanExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.ParquetScanExecNode();
  }

  public static org.blaze.protobuf.ParquetScanExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParquetScanExecNode>
      PARSER = new com.google.protobuf.AbstractParser<ParquetScanExecNode>() {
    @java.lang.Override
    public ParquetScanExecNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<ParquetScanExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParquetScanExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.ParquetScanExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

