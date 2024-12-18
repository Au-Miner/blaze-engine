// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.ShuffleWriterExecNode}
 */
public final class ShuffleWriterExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.ShuffleWriterExecNode)
    ShuffleWriterExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShuffleWriterExecNode.newBuilder() to construct.
  private ShuffleWriterExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShuffleWriterExecNode() {
    outputDataFile_ = "";
    outputIndexFile_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShuffleWriterExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ShuffleWriterExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ShuffleWriterExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.ShuffleWriterExecNode.class, org.blaze.protobuf.ShuffleWriterExecNode.Builder.class);
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

  public static final int OUTPUT_DATA_FILE_FIELD_NUMBER = 3;
  private volatile java.lang.Object outputDataFile_;
  /**
   * <code>string output_data_file = 3;</code>
   * @return The outputDataFile.
   */
  @java.lang.Override
  public java.lang.String getOutputDataFile() {
    java.lang.Object ref = outputDataFile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputDataFile_ = s;
      return s;
    }
  }
  /**
   * <code>string output_data_file = 3;</code>
   * @return The bytes for outputDataFile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputDataFileBytes() {
    java.lang.Object ref = outputDataFile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputDataFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_INDEX_FILE_FIELD_NUMBER = 4;
  private volatile java.lang.Object outputIndexFile_;
  /**
   * <code>string output_index_file = 4;</code>
   * @return The outputIndexFile.
   */
  @java.lang.Override
  public java.lang.String getOutputIndexFile() {
    java.lang.Object ref = outputIndexFile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputIndexFile_ = s;
      return s;
    }
  }
  /**
   * <code>string output_index_file = 4;</code>
   * @return The bytes for outputIndexFile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputIndexFileBytes() {
    java.lang.Object ref = outputIndexFile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputIndexFile_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputDataFile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, outputDataFile_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputIndexFile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, outputIndexFile_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputDataFile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, outputDataFile_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputIndexFile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, outputIndexFile_);
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
    if (!(obj instanceof org.blaze.protobuf.ShuffleWriterExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.ShuffleWriterExecNode other = (org.blaze.protobuf.ShuffleWriterExecNode) obj;

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
    if (!getOutputDataFile()
        .equals(other.getOutputDataFile())) return false;
    if (!getOutputIndexFile()
        .equals(other.getOutputIndexFile())) return false;
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
    hash = (37 * hash) + OUTPUT_DATA_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getOutputDataFile().hashCode();
    hash = (37 * hash) + OUTPUT_INDEX_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getOutputIndexFile().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.ShuffleWriterExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.ShuffleWriterExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.ShuffleWriterExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.ShuffleWriterExecNode)
      org.blaze.protobuf.ShuffleWriterExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ShuffleWriterExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ShuffleWriterExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.ShuffleWriterExecNode.class, org.blaze.protobuf.ShuffleWriterExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.ShuffleWriterExecNode.newBuilder()
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
      outputDataFile_ = "";

      outputIndexFile_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_ShuffleWriterExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.ShuffleWriterExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.ShuffleWriterExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.ShuffleWriterExecNode build() {
      org.blaze.protobuf.ShuffleWriterExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.ShuffleWriterExecNode buildPartial() {
      org.blaze.protobuf.ShuffleWriterExecNode result = new org.blaze.protobuf.ShuffleWriterExecNode(this);
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
      result.outputDataFile_ = outputDataFile_;
      result.outputIndexFile_ = outputIndexFile_;
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
      if (other instanceof org.blaze.protobuf.ShuffleWriterExecNode) {
        return mergeFrom((org.blaze.protobuf.ShuffleWriterExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.ShuffleWriterExecNode other) {
      if (other == org.blaze.protobuf.ShuffleWriterExecNode.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (other.hasOutputPartitioning()) {
        mergeOutputPartitioning(other.getOutputPartitioning());
      }
      if (!other.getOutputDataFile().isEmpty()) {
        outputDataFile_ = other.outputDataFile_;
        onChanged();
      }
      if (!other.getOutputIndexFile().isEmpty()) {
        outputIndexFile_ = other.outputIndexFile_;
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
              outputDataFile_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 34: {
              outputIndexFile_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private java.lang.Object outputDataFile_ = "";
    /**
     * <code>string output_data_file = 3;</code>
     * @return The outputDataFile.
     */
    public java.lang.String getOutputDataFile() {
      java.lang.Object ref = outputDataFile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputDataFile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string output_data_file = 3;</code>
     * @return The bytes for outputDataFile.
     */
    public com.google.protobuf.ByteString
        getOutputDataFileBytes() {
      java.lang.Object ref = outputDataFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputDataFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string output_data_file = 3;</code>
     * @param value The outputDataFile to set.
     * @return This builder for chaining.
     */
    public Builder setOutputDataFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputDataFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string output_data_file = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputDataFile() {
      
      outputDataFile_ = getDefaultInstance().getOutputDataFile();
      onChanged();
      return this;
    }
    /**
     * <code>string output_data_file = 3;</code>
     * @param value The bytes for outputDataFile to set.
     * @return This builder for chaining.
     */
    public Builder setOutputDataFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputDataFile_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object outputIndexFile_ = "";
    /**
     * <code>string output_index_file = 4;</code>
     * @return The outputIndexFile.
     */
    public java.lang.String getOutputIndexFile() {
      java.lang.Object ref = outputIndexFile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputIndexFile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string output_index_file = 4;</code>
     * @return The bytes for outputIndexFile.
     */
    public com.google.protobuf.ByteString
        getOutputIndexFileBytes() {
      java.lang.Object ref = outputIndexFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputIndexFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string output_index_file = 4;</code>
     * @param value The outputIndexFile to set.
     * @return This builder for chaining.
     */
    public Builder setOutputIndexFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputIndexFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string output_index_file = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputIndexFile() {
      
      outputIndexFile_ = getDefaultInstance().getOutputIndexFile();
      onChanged();
      return this;
    }
    /**
     * <code>string output_index_file = 4;</code>
     * @param value The bytes for outputIndexFile to set.
     * @return This builder for chaining.
     */
    public Builder setOutputIndexFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputIndexFile_ = value;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.ShuffleWriterExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.ShuffleWriterExecNode)
  private static final org.blaze.protobuf.ShuffleWriterExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.ShuffleWriterExecNode();
  }

  public static org.blaze.protobuf.ShuffleWriterExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShuffleWriterExecNode>
      PARSER = new com.google.protobuf.AbstractParser<ShuffleWriterExecNode>() {
    @java.lang.Override
    public ShuffleWriterExecNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShuffleWriterExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShuffleWriterExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.ShuffleWriterExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

