// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.RssShuffleWriterExecNode}
 */
public final class RssShuffleWriterExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.RssShuffleWriterExecNode)
    RssShuffleWriterExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RssShuffleWriterExecNode.newBuilder() to construct.
  private RssShuffleWriterExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RssShuffleWriterExecNode() {
    rssPartitionWriterResourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RssShuffleWriterExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_RssShuffleWriterExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_RssShuffleWriterExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.RssShuffleWriterExecNode.class, org.blaze.protobuf.RssShuffleWriterExecNode.Builder.class);
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

  public static final int OUTPUT_PARTITIONING_FIELD_NUMBER = 2;
  private org.blaze.protobuf.PhysicalHashRepartition outputPartitioning_;
  /**
   * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
   * @return Whether the outputPartitioning field is set.
   */
  @java.lang.Override
  public boolean hasOutputPartitioning() {
    return outputPartitioning_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
   * @return The outputPartitioning.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalHashRepartition getOutputPartitioning() {
    return outputPartitioning_ == null ? org.blaze.protobuf.PhysicalHashRepartition.getDefaultInstance() : outputPartitioning_;
  }
  /**
   * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalHashRepartitionOrBuilder getOutputPartitioningOrBuilder() {
    return getOutputPartitioning();
  }

  public static final int RSS_PARTITION_WRITER_RESOURCE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object rssPartitionWriterResourceId_;
  /**
   * <code>string rss_partition_writer_resource_id = 3;</code>
   * @return The rssPartitionWriterResourceId.
   */
  @java.lang.Override
  public java.lang.String getRssPartitionWriterResourceId() {
    java.lang.Object ref = rssPartitionWriterResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rssPartitionWriterResourceId_ = s;
      return s;
    }
  }
  /**
   * <code>string rss_partition_writer_resource_id = 3;</code>
   * @return The bytes for rssPartitionWriterResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRssPartitionWriterResourceIdBytes() {
    java.lang.Object ref = rssPartitionWriterResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rssPartitionWriterResourceId_ = b;
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
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    if (outputPartitioning_ != null) {
      output.writeMessage(2, getOutputPartitioning());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rssPartitionWriterResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rssPartitionWriterResourceId_);
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
    if (outputPartitioning_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOutputPartitioning());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rssPartitionWriterResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rssPartitionWriterResourceId_);
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
    if (!(obj instanceof org.blaze.protobuf.RssShuffleWriterExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.RssShuffleWriterExecNode other = (org.blaze.protobuf.RssShuffleWriterExecNode) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (hasOutputPartitioning() != other.hasOutputPartitioning()) return false;
    if (hasOutputPartitioning()) {
      if (!getOutputPartitioning()
          .equals(other.getOutputPartitioning())) return false;
    }
    if (!getRssPartitionWriterResourceId()
        .equals(other.getRssPartitionWriterResourceId())) return false;
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
    if (hasOutputPartitioning()) {
      hash = (37 * hash) + OUTPUT_PARTITIONING_FIELD_NUMBER;
      hash = (53 * hash) + getOutputPartitioning().hashCode();
    }
    hash = (37 * hash) + RSS_PARTITION_WRITER_RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRssPartitionWriterResourceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.RssShuffleWriterExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.RssShuffleWriterExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.RssShuffleWriterExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.RssShuffleWriterExecNode)
      org.blaze.protobuf.RssShuffleWriterExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_RssShuffleWriterExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_RssShuffleWriterExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.RssShuffleWriterExecNode.class, org.blaze.protobuf.RssShuffleWriterExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.RssShuffleWriterExecNode.newBuilder()
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
      if (outputPartitioningBuilder_ == null) {
        outputPartitioning_ = null;
      } else {
        outputPartitioning_ = null;
        outputPartitioningBuilder_ = null;
      }
      rssPartitionWriterResourceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_RssShuffleWriterExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.RssShuffleWriterExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.RssShuffleWriterExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.RssShuffleWriterExecNode build() {
      org.blaze.protobuf.RssShuffleWriterExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.RssShuffleWriterExecNode buildPartial() {
      org.blaze.protobuf.RssShuffleWriterExecNode result = new org.blaze.protobuf.RssShuffleWriterExecNode(this);
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      if (outputPartitioningBuilder_ == null) {
        result.outputPartitioning_ = outputPartitioning_;
      } else {
        result.outputPartitioning_ = outputPartitioningBuilder_.build();
      }
      result.rssPartitionWriterResourceId_ = rssPartitionWriterResourceId_;
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
      if (other instanceof org.blaze.protobuf.RssShuffleWriterExecNode) {
        return mergeFrom((org.blaze.protobuf.RssShuffleWriterExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.RssShuffleWriterExecNode other) {
      if (other == org.blaze.protobuf.RssShuffleWriterExecNode.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (other.hasOutputPartitioning()) {
        mergeOutputPartitioning(other.getOutputPartitioning());
      }
      if (!other.getRssPartitionWriterResourceId().isEmpty()) {
        rssPartitionWriterResourceId_ = other.rssPartitionWriterResourceId_;
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
                  getInputFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getOutputPartitioningFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              rssPartitionWriterResourceId_ = input.readStringRequireUtf8();

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

    private org.blaze.protobuf.PhysicalHashRepartition outputPartitioning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalHashRepartition, org.blaze.protobuf.PhysicalHashRepartition.Builder, org.blaze.protobuf.PhysicalHashRepartitionOrBuilder> outputPartitioningBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     * @return Whether the outputPartitioning field is set.
     */
    public boolean hasOutputPartitioning() {
      return outputPartitioningBuilder_ != null || outputPartitioning_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     * @return The outputPartitioning.
     */
    public org.blaze.protobuf.PhysicalHashRepartition getOutputPartitioning() {
      if (outputPartitioningBuilder_ == null) {
        return outputPartitioning_ == null ? org.blaze.protobuf.PhysicalHashRepartition.getDefaultInstance() : outputPartitioning_;
      } else {
        return outputPartitioningBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    public Builder setOutputPartitioning(org.blaze.protobuf.PhysicalHashRepartition value) {
      if (outputPartitioningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputPartitioning_ = value;
        onChanged();
      } else {
        outputPartitioningBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    public Builder setOutputPartitioning(
        org.blaze.protobuf.PhysicalHashRepartition.Builder builderForValue) {
      if (outputPartitioningBuilder_ == null) {
        outputPartitioning_ = builderForValue.build();
        onChanged();
      } else {
        outputPartitioningBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    public Builder mergeOutputPartitioning(org.blaze.protobuf.PhysicalHashRepartition value) {
      if (outputPartitioningBuilder_ == null) {
        if (outputPartitioning_ != null) {
          outputPartitioning_ =
            org.blaze.protobuf.PhysicalHashRepartition.newBuilder(outputPartitioning_).mergeFrom(value).buildPartial();
        } else {
          outputPartitioning_ = value;
        }
        onChanged();
      } else {
        outputPartitioningBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    public Builder clearOutputPartitioning() {
      if (outputPartitioningBuilder_ == null) {
        outputPartitioning_ = null;
        onChanged();
      } else {
        outputPartitioning_ = null;
        outputPartitioningBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    public org.blaze.protobuf.PhysicalHashRepartition.Builder getOutputPartitioningBuilder() {
      
      onChanged();
      return getOutputPartitioningFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    public org.blaze.protobuf.PhysicalHashRepartitionOrBuilder getOutputPartitioningOrBuilder() {
      if (outputPartitioningBuilder_ != null) {
        return outputPartitioningBuilder_.getMessageOrBuilder();
      } else {
        return outputPartitioning_ == null ?
            org.blaze.protobuf.PhysicalHashRepartition.getDefaultInstance() : outputPartitioning_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalHashRepartition output_partitioning = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalHashRepartition, org.blaze.protobuf.PhysicalHashRepartition.Builder, org.blaze.protobuf.PhysicalHashRepartitionOrBuilder> 
        getOutputPartitioningFieldBuilder() {
      if (outputPartitioningBuilder_ == null) {
        outputPartitioningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalHashRepartition, org.blaze.protobuf.PhysicalHashRepartition.Builder, org.blaze.protobuf.PhysicalHashRepartitionOrBuilder>(
                getOutputPartitioning(),
                getParentForChildren(),
                isClean());
        outputPartitioning_ = null;
      }
      return outputPartitioningBuilder_;
    }

    private java.lang.Object rssPartitionWriterResourceId_ = "";
    /**
     * <code>string rss_partition_writer_resource_id = 3;</code>
     * @return The rssPartitionWriterResourceId.
     */
    public java.lang.String getRssPartitionWriterResourceId() {
      java.lang.Object ref = rssPartitionWriterResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rssPartitionWriterResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rss_partition_writer_resource_id = 3;</code>
     * @return The bytes for rssPartitionWriterResourceId.
     */
    public com.google.protobuf.ByteString
        getRssPartitionWriterResourceIdBytes() {
      java.lang.Object ref = rssPartitionWriterResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rssPartitionWriterResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rss_partition_writer_resource_id = 3;</code>
     * @param value The rssPartitionWriterResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setRssPartitionWriterResourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rssPartitionWriterResourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string rss_partition_writer_resource_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRssPartitionWriterResourceId() {
      
      rssPartitionWriterResourceId_ = getDefaultInstance().getRssPartitionWriterResourceId();
      onChanged();
      return this;
    }
    /**
     * <code>string rss_partition_writer_resource_id = 3;</code>
     * @param value The bytes for rssPartitionWriterResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setRssPartitionWriterResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rssPartitionWriterResourceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.RssShuffleWriterExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.RssShuffleWriterExecNode)
  private static final org.blaze.protobuf.RssShuffleWriterExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.RssShuffleWriterExecNode();
  }

  public static org.blaze.protobuf.RssShuffleWriterExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RssShuffleWriterExecNode>
      PARSER = new com.google.protobuf.AbstractParser<RssShuffleWriterExecNode>() {
    @java.lang.Override
    public RssShuffleWriterExecNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<RssShuffleWriterExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RssShuffleWriterExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.RssShuffleWriterExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
