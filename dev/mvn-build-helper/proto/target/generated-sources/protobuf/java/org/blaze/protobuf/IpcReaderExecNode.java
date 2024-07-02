// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.IpcReaderExecNode}
 */
public final class IpcReaderExecNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.IpcReaderExecNode)
    IpcReaderExecNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IpcReaderExecNode.newBuilder() to construct.
  private IpcReaderExecNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IpcReaderExecNode() {
    ipcProviderResourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IpcReaderExecNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_IpcReaderExecNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_IpcReaderExecNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.IpcReaderExecNode.class, org.blaze.protobuf.IpcReaderExecNode.Builder.class);
  }

  public static final int NUM_PARTITIONS_FIELD_NUMBER = 1;
  private int numPartitions_;
  /**
   * <code>uint32 num_partitions = 1;</code>
   * @return The numPartitions.
   */
  @java.lang.Override
  public int getNumPartitions() {
    return numPartitions_;
  }

  public static final int SCHEMA_FIELD_NUMBER = 2;
  private org.blaze.protobuf.Schema schema_;
  /**
   * <code>.plan.protobuf.Schema schema = 2;</code>
   * @return Whether the schema field is set.
   */
  @java.lang.Override
  public boolean hasSchema() {
    return schema_ != null;
  }
  /**
   * <code>.plan.protobuf.Schema schema = 2;</code>
   * @return The schema.
   */
  @java.lang.Override
  public org.blaze.protobuf.Schema getSchema() {
    return schema_ == null ? org.blaze.protobuf.Schema.getDefaultInstance() : schema_;
  }
  /**
   * <code>.plan.protobuf.Schema schema = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.SchemaOrBuilder getSchemaOrBuilder() {
    return getSchema();
  }

  public static final int IPC_PROVIDER_RESOURCE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object ipcProviderResourceId_;
  /**
   * <code>string ipc_provider_resource_id = 3;</code>
   * @return The ipcProviderResourceId.
   */
  @java.lang.Override
  public java.lang.String getIpcProviderResourceId() {
    java.lang.Object ref = ipcProviderResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipcProviderResourceId_ = s;
      return s;
    }
  }
  /**
   * <code>string ipc_provider_resource_id = 3;</code>
   * @return The bytes for ipcProviderResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpcProviderResourceIdBytes() {
    java.lang.Object ref = ipcProviderResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipcProviderResourceId_ = b;
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
    if (numPartitions_ != 0) {
      output.writeUInt32(1, numPartitions_);
    }
    if (schema_ != null) {
      output.writeMessage(2, getSchema());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipcProviderResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipcProviderResourceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numPartitions_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, numPartitions_);
    }
    if (schema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSchema());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipcProviderResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipcProviderResourceId_);
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
    if (!(obj instanceof org.blaze.protobuf.IpcReaderExecNode)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.IpcReaderExecNode other = (org.blaze.protobuf.IpcReaderExecNode) obj;

    if (getNumPartitions()
        != other.getNumPartitions()) return false;
    if (hasSchema() != other.hasSchema()) return false;
    if (hasSchema()) {
      if (!getSchema()
          .equals(other.getSchema())) return false;
    }
    if (!getIpcProviderResourceId()
        .equals(other.getIpcProviderResourceId())) return false;
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
    hash = (37 * hash) + NUM_PARTITIONS_FIELD_NUMBER;
    hash = (53 * hash) + getNumPartitions();
    if (hasSchema()) {
      hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSchema().hashCode();
    }
    hash = (37 * hash) + IPC_PROVIDER_RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getIpcProviderResourceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.IpcReaderExecNode parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.IpcReaderExecNode prototype) {
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
   * Protobuf type {@code plan.protobuf.IpcReaderExecNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.IpcReaderExecNode)
      org.blaze.protobuf.IpcReaderExecNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_IpcReaderExecNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_IpcReaderExecNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.IpcReaderExecNode.class, org.blaze.protobuf.IpcReaderExecNode.Builder.class);
    }

    // Construct using org.blaze.protobuf.IpcReaderExecNode.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      numPartitions_ = 0;

      if (schemaBuilder_ == null) {
        schema_ = null;
      } else {
        schema_ = null;
        schemaBuilder_ = null;
      }
      ipcProviderResourceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_IpcReaderExecNode_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.IpcReaderExecNode getDefaultInstanceForType() {
      return org.blaze.protobuf.IpcReaderExecNode.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.IpcReaderExecNode build() {
      org.blaze.protobuf.IpcReaderExecNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.IpcReaderExecNode buildPartial() {
      org.blaze.protobuf.IpcReaderExecNode result = new org.blaze.protobuf.IpcReaderExecNode(this);
      result.numPartitions_ = numPartitions_;
      if (schemaBuilder_ == null) {
        result.schema_ = schema_;
      } else {
        result.schema_ = schemaBuilder_.build();
      }
      result.ipcProviderResourceId_ = ipcProviderResourceId_;
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
      if (other instanceof org.blaze.protobuf.IpcReaderExecNode) {
        return mergeFrom((org.blaze.protobuf.IpcReaderExecNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.IpcReaderExecNode other) {
      if (other == org.blaze.protobuf.IpcReaderExecNode.getDefaultInstance()) return this;
      if (other.getNumPartitions() != 0) {
        setNumPartitions(other.getNumPartitions());
      }
      if (other.hasSchema()) {
        mergeSchema(other.getSchema());
      }
      if (!other.getIpcProviderResourceId().isEmpty()) {
        ipcProviderResourceId_ = other.ipcProviderResourceId_;
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
            case 8: {
              numPartitions_ = input.readUInt32();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getSchemaFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              ipcProviderResourceId_ = input.readStringRequireUtf8();

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

    private int numPartitions_ ;
    /**
     * <code>uint32 num_partitions = 1;</code>
     * @return The numPartitions.
     */
    @java.lang.Override
    public int getNumPartitions() {
      return numPartitions_;
    }
    /**
     * <code>uint32 num_partitions = 1;</code>
     * @param value The numPartitions to set.
     * @return This builder for chaining.
     */
    public Builder setNumPartitions(int value) {
      
      numPartitions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 num_partitions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumPartitions() {
      
      numPartitions_ = 0;
      onChanged();
      return this;
    }

    private org.blaze.protobuf.Schema schema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Schema, org.blaze.protobuf.Schema.Builder, org.blaze.protobuf.SchemaOrBuilder> schemaBuilder_;
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     * @return Whether the schema field is set.
     */
    public boolean hasSchema() {
      return schemaBuilder_ != null || schema_ != null;
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     * @return The schema.
     */
    public org.blaze.protobuf.Schema getSchema() {
      if (schemaBuilder_ == null) {
        return schema_ == null ? org.blaze.protobuf.Schema.getDefaultInstance() : schema_;
      } else {
        return schemaBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    public Builder setSchema(org.blaze.protobuf.Schema value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schema_ = value;
        onChanged();
      } else {
        schemaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    public Builder setSchema(
        org.blaze.protobuf.Schema.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        schema_ = builderForValue.build();
        onChanged();
      } else {
        schemaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    public Builder mergeSchema(org.blaze.protobuf.Schema value) {
      if (schemaBuilder_ == null) {
        if (schema_ != null) {
          schema_ =
            org.blaze.protobuf.Schema.newBuilder(schema_).mergeFrom(value).buildPartial();
        } else {
          schema_ = value;
        }
        onChanged();
      } else {
        schemaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    public Builder clearSchema() {
      if (schemaBuilder_ == null) {
        schema_ = null;
        onChanged();
      } else {
        schema_ = null;
        schemaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    public org.blaze.protobuf.Schema.Builder getSchemaBuilder() {
      
      onChanged();
      return getSchemaFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    public org.blaze.protobuf.SchemaOrBuilder getSchemaOrBuilder() {
      if (schemaBuilder_ != null) {
        return schemaBuilder_.getMessageOrBuilder();
      } else {
        return schema_ == null ?
            org.blaze.protobuf.Schema.getDefaultInstance() : schema_;
      }
    }
    /**
     * <code>.plan.protobuf.Schema schema = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Schema, org.blaze.protobuf.Schema.Builder, org.blaze.protobuf.SchemaOrBuilder> 
        getSchemaFieldBuilder() {
      if (schemaBuilder_ == null) {
        schemaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.Schema, org.blaze.protobuf.Schema.Builder, org.blaze.protobuf.SchemaOrBuilder>(
                getSchema(),
                getParentForChildren(),
                isClean());
        schema_ = null;
      }
      return schemaBuilder_;
    }

    private java.lang.Object ipcProviderResourceId_ = "";
    /**
     * <code>string ipc_provider_resource_id = 3;</code>
     * @return The ipcProviderResourceId.
     */
    public java.lang.String getIpcProviderResourceId() {
      java.lang.Object ref = ipcProviderResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipcProviderResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipc_provider_resource_id = 3;</code>
     * @return The bytes for ipcProviderResourceId.
     */
    public com.google.protobuf.ByteString
        getIpcProviderResourceIdBytes() {
      java.lang.Object ref = ipcProviderResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipcProviderResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipc_provider_resource_id = 3;</code>
     * @param value The ipcProviderResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setIpcProviderResourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipcProviderResourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipc_provider_resource_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpcProviderResourceId() {
      
      ipcProviderResourceId_ = getDefaultInstance().getIpcProviderResourceId();
      onChanged();
      return this;
    }
    /**
     * <code>string ipc_provider_resource_id = 3;</code>
     * @param value The bytes for ipcProviderResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setIpcProviderResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipcProviderResourceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.IpcReaderExecNode)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.IpcReaderExecNode)
  private static final org.blaze.protobuf.IpcReaderExecNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.IpcReaderExecNode();
  }

  public static org.blaze.protobuf.IpcReaderExecNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IpcReaderExecNode>
      PARSER = new com.google.protobuf.AbstractParser<IpcReaderExecNode>() {
    @java.lang.Override
    public IpcReaderExecNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<IpcReaderExecNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IpcReaderExecNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.IpcReaderExecNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
