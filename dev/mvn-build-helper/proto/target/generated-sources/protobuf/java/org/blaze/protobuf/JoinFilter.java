// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.JoinFilter}
 */
public final class JoinFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.JoinFilter)
    JoinFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinFilter.newBuilder() to construct.
  private JoinFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinFilter() {
    columnIndices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_JoinFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_JoinFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.JoinFilter.class, org.blaze.protobuf.JoinFilter.Builder.class);
  }

  public static final int EXPRESSION_FIELD_NUMBER = 1;
  private org.blaze.protobuf.PhysicalExprNode expression_;
  /**
   * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
   * @return Whether the expression field is set.
   */
  @java.lang.Override
  public boolean hasExpression() {
    return expression_ != null;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
   * @return The expression.
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNode getExpression() {
    return expression_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : expression_;
  }
  /**
   * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.PhysicalExprNodeOrBuilder getExpressionOrBuilder() {
    return getExpression();
  }

  public static final int COLUMN_INDICES_FIELD_NUMBER = 2;
  private java.util.List<org.blaze.protobuf.ColumnIndex> columnIndices_;
  /**
   * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.ColumnIndex> getColumnIndicesList() {
    return columnIndices_;
  }
  /**
   * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.ColumnIndexOrBuilder> 
      getColumnIndicesOrBuilderList() {
    return columnIndices_;
  }
  /**
   * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
   */
  @java.lang.Override
  public int getColumnIndicesCount() {
    return columnIndices_.size();
  }
  /**
   * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ColumnIndex getColumnIndices(int index) {
    return columnIndices_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ColumnIndexOrBuilder getColumnIndicesOrBuilder(
      int index) {
    return columnIndices_.get(index);
  }

  public static final int SCHEMA_FIELD_NUMBER = 3;
  private org.blaze.protobuf.Schema schema_;
  /**
   * <code>.plan.protobuf.Schema schema = 3;</code>
   * @return Whether the schema field is set.
   */
  @java.lang.Override
  public boolean hasSchema() {
    return schema_ != null;
  }
  /**
   * <code>.plan.protobuf.Schema schema = 3;</code>
   * @return The schema.
   */
  @java.lang.Override
  public org.blaze.protobuf.Schema getSchema() {
    return schema_ == null ? org.blaze.protobuf.Schema.getDefaultInstance() : schema_;
  }
  /**
   * <code>.plan.protobuf.Schema schema = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.SchemaOrBuilder getSchemaOrBuilder() {
    return getSchema();
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
    if (expression_ != null) {
      output.writeMessage(1, getExpression());
    }
    for (int i = 0; i < columnIndices_.size(); i++) {
      output.writeMessage(2, columnIndices_.get(i));
    }
    if (schema_ != null) {
      output.writeMessage(3, getSchema());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (expression_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExpression());
    }
    for (int i = 0; i < columnIndices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, columnIndices_.get(i));
    }
    if (schema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSchema());
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
    if (!(obj instanceof org.blaze.protobuf.JoinFilter)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.JoinFilter other = (org.blaze.protobuf.JoinFilter) obj;

    if (hasExpression() != other.hasExpression()) return false;
    if (hasExpression()) {
      if (!getExpression()
          .equals(other.getExpression())) return false;
    }
    if (!getColumnIndicesList()
        .equals(other.getColumnIndicesList())) return false;
    if (hasSchema() != other.hasSchema()) return false;
    if (hasSchema()) {
      if (!getSchema()
          .equals(other.getSchema())) return false;
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
    if (hasExpression()) {
      hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getExpression().hashCode();
    }
    if (getColumnIndicesCount() > 0) {
      hash = (37 * hash) + COLUMN_INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getColumnIndicesList().hashCode();
    }
    if (hasSchema()) {
      hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSchema().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.JoinFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.JoinFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.JoinFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.JoinFilter parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.JoinFilter prototype) {
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
   * Protobuf type {@code plan.protobuf.JoinFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.JoinFilter)
      org.blaze.protobuf.JoinFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_JoinFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_JoinFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.JoinFilter.class, org.blaze.protobuf.JoinFilter.Builder.class);
    }

    // Construct using org.blaze.protobuf.JoinFilter.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (expressionBuilder_ == null) {
        expression_ = null;
      } else {
        expression_ = null;
        expressionBuilder_ = null;
      }
      if (columnIndicesBuilder_ == null) {
        columnIndices_ = java.util.Collections.emptyList();
      } else {
        columnIndices_ = null;
        columnIndicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (schemaBuilder_ == null) {
        schema_ = null;
      } else {
        schema_ = null;
        schemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_JoinFilter_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.JoinFilter getDefaultInstanceForType() {
      return org.blaze.protobuf.JoinFilter.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.JoinFilter build() {
      org.blaze.protobuf.JoinFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.JoinFilter buildPartial() {
      org.blaze.protobuf.JoinFilter result = new org.blaze.protobuf.JoinFilter(this);
      int from_bitField0_ = bitField0_;
      if (expressionBuilder_ == null) {
        result.expression_ = expression_;
      } else {
        result.expression_ = expressionBuilder_.build();
      }
      if (columnIndicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          columnIndices_ = java.util.Collections.unmodifiableList(columnIndices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columnIndices_ = columnIndices_;
      } else {
        result.columnIndices_ = columnIndicesBuilder_.build();
      }
      if (schemaBuilder_ == null) {
        result.schema_ = schema_;
      } else {
        result.schema_ = schemaBuilder_.build();
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
      if (other instanceof org.blaze.protobuf.JoinFilter) {
        return mergeFrom((org.blaze.protobuf.JoinFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.JoinFilter other) {
      if (other == org.blaze.protobuf.JoinFilter.getDefaultInstance()) return this;
      if (other.hasExpression()) {
        mergeExpression(other.getExpression());
      }
      if (columnIndicesBuilder_ == null) {
        if (!other.columnIndices_.isEmpty()) {
          if (columnIndices_.isEmpty()) {
            columnIndices_ = other.columnIndices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnIndicesIsMutable();
            columnIndices_.addAll(other.columnIndices_);
          }
          onChanged();
        }
      } else {
        if (!other.columnIndices_.isEmpty()) {
          if (columnIndicesBuilder_.isEmpty()) {
            columnIndicesBuilder_.dispose();
            columnIndicesBuilder_ = null;
            columnIndices_ = other.columnIndices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnIndicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnIndicesFieldBuilder() : null;
          } else {
            columnIndicesBuilder_.addAllMessages(other.columnIndices_);
          }
        }
      }
      if (other.hasSchema()) {
        mergeSchema(other.getSchema());
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
                  getExpressionFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              org.blaze.protobuf.ColumnIndex m =
                  input.readMessage(
                      org.blaze.protobuf.ColumnIndex.parser(),
                      extensionRegistry);
              if (columnIndicesBuilder_ == null) {
                ensureColumnIndicesIsMutable();
                columnIndices_.add(m);
              } else {
                columnIndicesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSchemaFieldBuilder().getBuilder(),
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

    private org.blaze.protobuf.PhysicalExprNode expression_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> expressionBuilder_;
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     * @return Whether the expression field is set.
     */
    public boolean hasExpression() {
      return expressionBuilder_ != null || expression_ != null;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     * @return The expression.
     */
    public org.blaze.protobuf.PhysicalExprNode getExpression() {
      if (expressionBuilder_ == null) {
        return expression_ == null ? org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : expression_;
      } else {
        return expressionBuilder_.getMessage();
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    public Builder setExpression(org.blaze.protobuf.PhysicalExprNode value) {
      if (expressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expression_ = value;
        onChanged();
      } else {
        expressionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    public Builder setExpression(
        org.blaze.protobuf.PhysicalExprNode.Builder builderForValue) {
      if (expressionBuilder_ == null) {
        expression_ = builderForValue.build();
        onChanged();
      } else {
        expressionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    public Builder mergeExpression(org.blaze.protobuf.PhysicalExprNode value) {
      if (expressionBuilder_ == null) {
        if (expression_ != null) {
          expression_ =
            org.blaze.protobuf.PhysicalExprNode.newBuilder(expression_).mergeFrom(value).buildPartial();
        } else {
          expression_ = value;
        }
        onChanged();
      } else {
        expressionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    public Builder clearExpression() {
      if (expressionBuilder_ == null) {
        expression_ = null;
        onChanged();
      } else {
        expression_ = null;
        expressionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNode.Builder getExpressionBuilder() {
      
      onChanged();
      return getExpressionFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    public org.blaze.protobuf.PhysicalExprNodeOrBuilder getExpressionOrBuilder() {
      if (expressionBuilder_ != null) {
        return expressionBuilder_.getMessageOrBuilder();
      } else {
        return expression_ == null ?
            org.blaze.protobuf.PhysicalExprNode.getDefaultInstance() : expression_;
      }
    }
    /**
     * <code>.plan.protobuf.PhysicalExprNode expression = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder> 
        getExpressionFieldBuilder() {
      if (expressionBuilder_ == null) {
        expressionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.blaze.protobuf.PhysicalExprNode, org.blaze.protobuf.PhysicalExprNode.Builder, org.blaze.protobuf.PhysicalExprNodeOrBuilder>(
                getExpression(),
                getParentForChildren(),
                isClean());
        expression_ = null;
      }
      return expressionBuilder_;
    }

    private java.util.List<org.blaze.protobuf.ColumnIndex> columnIndices_ =
      java.util.Collections.emptyList();
    private void ensureColumnIndicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        columnIndices_ = new java.util.ArrayList<org.blaze.protobuf.ColumnIndex>(columnIndices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.ColumnIndex, org.blaze.protobuf.ColumnIndex.Builder, org.blaze.protobuf.ColumnIndexOrBuilder> columnIndicesBuilder_;

    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.ColumnIndex> getColumnIndicesList() {
      if (columnIndicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columnIndices_);
      } else {
        return columnIndicesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public int getColumnIndicesCount() {
      if (columnIndicesBuilder_ == null) {
        return columnIndices_.size();
      } else {
        return columnIndicesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public org.blaze.protobuf.ColumnIndex getColumnIndices(int index) {
      if (columnIndicesBuilder_ == null) {
        return columnIndices_.get(index);
      } else {
        return columnIndicesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder setColumnIndices(
        int index, org.blaze.protobuf.ColumnIndex value) {
      if (columnIndicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnIndicesIsMutable();
        columnIndices_.set(index, value);
        onChanged();
      } else {
        columnIndicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder setColumnIndices(
        int index, org.blaze.protobuf.ColumnIndex.Builder builderForValue) {
      if (columnIndicesBuilder_ == null) {
        ensureColumnIndicesIsMutable();
        columnIndices_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnIndicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder addColumnIndices(org.blaze.protobuf.ColumnIndex value) {
      if (columnIndicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnIndicesIsMutable();
        columnIndices_.add(value);
        onChanged();
      } else {
        columnIndicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder addColumnIndices(
        int index, org.blaze.protobuf.ColumnIndex value) {
      if (columnIndicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnIndicesIsMutable();
        columnIndices_.add(index, value);
        onChanged();
      } else {
        columnIndicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder addColumnIndices(
        org.blaze.protobuf.ColumnIndex.Builder builderForValue) {
      if (columnIndicesBuilder_ == null) {
        ensureColumnIndicesIsMutable();
        columnIndices_.add(builderForValue.build());
        onChanged();
      } else {
        columnIndicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder addColumnIndices(
        int index, org.blaze.protobuf.ColumnIndex.Builder builderForValue) {
      if (columnIndicesBuilder_ == null) {
        ensureColumnIndicesIsMutable();
        columnIndices_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnIndicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder addAllColumnIndices(
        java.lang.Iterable<? extends org.blaze.protobuf.ColumnIndex> values) {
      if (columnIndicesBuilder_ == null) {
        ensureColumnIndicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columnIndices_);
        onChanged();
      } else {
        columnIndicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder clearColumnIndices() {
      if (columnIndicesBuilder_ == null) {
        columnIndices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnIndicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public Builder removeColumnIndices(int index) {
      if (columnIndicesBuilder_ == null) {
        ensureColumnIndicesIsMutable();
        columnIndices_.remove(index);
        onChanged();
      } else {
        columnIndicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public org.blaze.protobuf.ColumnIndex.Builder getColumnIndicesBuilder(
        int index) {
      return getColumnIndicesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public org.blaze.protobuf.ColumnIndexOrBuilder getColumnIndicesOrBuilder(
        int index) {
      if (columnIndicesBuilder_ == null) {
        return columnIndices_.get(index);  } else {
        return columnIndicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.ColumnIndexOrBuilder> 
         getColumnIndicesOrBuilderList() {
      if (columnIndicesBuilder_ != null) {
        return columnIndicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columnIndices_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public org.blaze.protobuf.ColumnIndex.Builder addColumnIndicesBuilder() {
      return getColumnIndicesFieldBuilder().addBuilder(
          org.blaze.protobuf.ColumnIndex.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public org.blaze.protobuf.ColumnIndex.Builder addColumnIndicesBuilder(
        int index) {
      return getColumnIndicesFieldBuilder().addBuilder(
          index, org.blaze.protobuf.ColumnIndex.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.ColumnIndex column_indices = 2;</code>
     */
    public java.util.List<org.blaze.protobuf.ColumnIndex.Builder> 
         getColumnIndicesBuilderList() {
      return getColumnIndicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.ColumnIndex, org.blaze.protobuf.ColumnIndex.Builder, org.blaze.protobuf.ColumnIndexOrBuilder> 
        getColumnIndicesFieldBuilder() {
      if (columnIndicesBuilder_ == null) {
        columnIndicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.ColumnIndex, org.blaze.protobuf.ColumnIndex.Builder, org.blaze.protobuf.ColumnIndexOrBuilder>(
                columnIndices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        columnIndices_ = null;
      }
      return columnIndicesBuilder_;
    }

    private org.blaze.protobuf.Schema schema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.blaze.protobuf.Schema, org.blaze.protobuf.Schema.Builder, org.blaze.protobuf.SchemaOrBuilder> schemaBuilder_;
    /**
     * <code>.plan.protobuf.Schema schema = 3;</code>
     * @return Whether the schema field is set.
     */
    public boolean hasSchema() {
      return schemaBuilder_ != null || schema_ != null;
    }
    /**
     * <code>.plan.protobuf.Schema schema = 3;</code>
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
     * <code>.plan.protobuf.Schema schema = 3;</code>
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
     * <code>.plan.protobuf.Schema schema = 3;</code>
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
     * <code>.plan.protobuf.Schema schema = 3;</code>
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
     * <code>.plan.protobuf.Schema schema = 3;</code>
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
     * <code>.plan.protobuf.Schema schema = 3;</code>
     */
    public org.blaze.protobuf.Schema.Builder getSchemaBuilder() {
      
      onChanged();
      return getSchemaFieldBuilder().getBuilder();
    }
    /**
     * <code>.plan.protobuf.Schema schema = 3;</code>
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
     * <code>.plan.protobuf.Schema schema = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.JoinFilter)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.JoinFilter)
  private static final org.blaze.protobuf.JoinFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.JoinFilter();
  }

  public static org.blaze.protobuf.JoinFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinFilter>
      PARSER = new com.google.protobuf.AbstractParser<JoinFilter>() {
    @java.lang.Override
    public JoinFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<JoinFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.JoinFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

