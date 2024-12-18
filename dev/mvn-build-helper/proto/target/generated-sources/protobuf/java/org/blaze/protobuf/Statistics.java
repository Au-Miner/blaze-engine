// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf type {@code plan.protobuf.Statistics}
 */
public final class Statistics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:plan.protobuf.Statistics)
    StatisticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Statistics.newBuilder() to construct.
  private Statistics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Statistics() {
    columnStats_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Statistics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Statistics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Statistics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.blaze.protobuf.Statistics.class, org.blaze.protobuf.Statistics.Builder.class);
  }

  public static final int NUM_ROWS_FIELD_NUMBER = 1;
  private long numRows_;
  /**
   * <code>int64 num_rows = 1;</code>
   * @return The numRows.
   */
  @java.lang.Override
  public long getNumRows() {
    return numRows_;
  }

  public static final int TOTAL_BYTE_SIZE_FIELD_NUMBER = 2;
  private long totalByteSize_;
  /**
   * <code>int64 total_byte_size = 2;</code>
   * @return The totalByteSize.
   */
  @java.lang.Override
  public long getTotalByteSize() {
    return totalByteSize_;
  }

  public static final int COLUMN_STATS_FIELD_NUMBER = 3;
  private java.util.List<org.blaze.protobuf.ColumnStats> columnStats_;
  /**
   * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.blaze.protobuf.ColumnStats> getColumnStatsList() {
    return columnStats_;
  }
  /**
   * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.blaze.protobuf.ColumnStatsOrBuilder> 
      getColumnStatsOrBuilderList() {
    return columnStats_;
  }
  /**
   * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
   */
  @java.lang.Override
  public int getColumnStatsCount() {
    return columnStats_.size();
  }
  /**
   * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ColumnStats getColumnStats(int index) {
    return columnStats_.get(index);
  }
  /**
   * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
   */
  @java.lang.Override
  public org.blaze.protobuf.ColumnStatsOrBuilder getColumnStatsOrBuilder(
      int index) {
    return columnStats_.get(index);
  }

  public static final int IS_EXACT_FIELD_NUMBER = 4;
  private boolean isExact_;
  /**
   * <code>bool is_exact = 4;</code>
   * @return The isExact.
   */
  @java.lang.Override
  public boolean getIsExact() {
    return isExact_;
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
    if (numRows_ != 0L) {
      output.writeInt64(1, numRows_);
    }
    if (totalByteSize_ != 0L) {
      output.writeInt64(2, totalByteSize_);
    }
    for (int i = 0; i < columnStats_.size(); i++) {
      output.writeMessage(3, columnStats_.get(i));
    }
    if (isExact_ != false) {
      output.writeBool(4, isExact_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numRows_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, numRows_);
    }
    if (totalByteSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalByteSize_);
    }
    for (int i = 0; i < columnStats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, columnStats_.get(i));
    }
    if (isExact_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isExact_);
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
    if (!(obj instanceof org.blaze.protobuf.Statistics)) {
      return super.equals(obj);
    }
    org.blaze.protobuf.Statistics other = (org.blaze.protobuf.Statistics) obj;

    if (getNumRows()
        != other.getNumRows()) return false;
    if (getTotalByteSize()
        != other.getTotalByteSize()) return false;
    if (!getColumnStatsList()
        .equals(other.getColumnStatsList())) return false;
    if (getIsExact()
        != other.getIsExact()) return false;
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
    hash = (37 * hash) + NUM_ROWS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumRows());
    hash = (37 * hash) + TOTAL_BYTE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalByteSize());
    if (getColumnStatsCount() > 0) {
      hash = (37 * hash) + COLUMN_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnStatsList().hashCode();
    }
    hash = (37 * hash) + IS_EXACT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsExact());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.blaze.protobuf.Statistics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Statistics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.blaze.protobuf.Statistics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Statistics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Statistics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.blaze.protobuf.Statistics parseFrom(
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
  public static Builder newBuilder(org.blaze.protobuf.Statistics prototype) {
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
   * Protobuf type {@code plan.protobuf.Statistics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:plan.protobuf.Statistics)
      org.blaze.protobuf.StatisticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Statistics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Statistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.blaze.protobuf.Statistics.class, org.blaze.protobuf.Statistics.Builder.class);
    }

    // Construct using org.blaze.protobuf.Statistics.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      numRows_ = 0L;

      totalByteSize_ = 0L;

      if (columnStatsBuilder_ == null) {
        columnStats_ = java.util.Collections.emptyList();
      } else {
        columnStats_ = null;
        columnStatsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      isExact_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.blaze.protobuf.BlazeProto.internal_static_plan_protobuf_Statistics_descriptor;
    }

    @java.lang.Override
    public org.blaze.protobuf.Statistics getDefaultInstanceForType() {
      return org.blaze.protobuf.Statistics.getDefaultInstance();
    }

    @java.lang.Override
    public org.blaze.protobuf.Statistics build() {
      org.blaze.protobuf.Statistics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.blaze.protobuf.Statistics buildPartial() {
      org.blaze.protobuf.Statistics result = new org.blaze.protobuf.Statistics(this);
      int from_bitField0_ = bitField0_;
      result.numRows_ = numRows_;
      result.totalByteSize_ = totalByteSize_;
      if (columnStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          columnStats_ = java.util.Collections.unmodifiableList(columnStats_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columnStats_ = columnStats_;
      } else {
        result.columnStats_ = columnStatsBuilder_.build();
      }
      result.isExact_ = isExact_;
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
      if (other instanceof org.blaze.protobuf.Statistics) {
        return mergeFrom((org.blaze.protobuf.Statistics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.blaze.protobuf.Statistics other) {
      if (other == org.blaze.protobuf.Statistics.getDefaultInstance()) return this;
      if (other.getNumRows() != 0L) {
        setNumRows(other.getNumRows());
      }
      if (other.getTotalByteSize() != 0L) {
        setTotalByteSize(other.getTotalByteSize());
      }
      if (columnStatsBuilder_ == null) {
        if (!other.columnStats_.isEmpty()) {
          if (columnStats_.isEmpty()) {
            columnStats_ = other.columnStats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnStatsIsMutable();
            columnStats_.addAll(other.columnStats_);
          }
          onChanged();
        }
      } else {
        if (!other.columnStats_.isEmpty()) {
          if (columnStatsBuilder_.isEmpty()) {
            columnStatsBuilder_.dispose();
            columnStatsBuilder_ = null;
            columnStats_ = other.columnStats_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnStatsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnStatsFieldBuilder() : null;
          } else {
            columnStatsBuilder_.addAllMessages(other.columnStats_);
          }
        }
      }
      if (other.getIsExact() != false) {
        setIsExact(other.getIsExact());
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
              numRows_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              totalByteSize_ = input.readInt64();

              break;
            } // case 16
            case 26: {
              org.blaze.protobuf.ColumnStats m =
                  input.readMessage(
                      org.blaze.protobuf.ColumnStats.parser(),
                      extensionRegistry);
              if (columnStatsBuilder_ == null) {
                ensureColumnStatsIsMutable();
                columnStats_.add(m);
              } else {
                columnStatsBuilder_.addMessage(m);
              }
              break;
            } // case 26
            case 32: {
              isExact_ = input.readBool();

              break;
            } // case 32
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

    private long numRows_ ;
    /**
     * <code>int64 num_rows = 1;</code>
     * @return The numRows.
     */
    @java.lang.Override
    public long getNumRows() {
      return numRows_;
    }
    /**
     * <code>int64 num_rows = 1;</code>
     * @param value The numRows to set.
     * @return This builder for chaining.
     */
    public Builder setNumRows(long value) {
      
      numRows_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_rows = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumRows() {
      
      numRows_ = 0L;
      onChanged();
      return this;
    }

    private long totalByteSize_ ;
    /**
     * <code>int64 total_byte_size = 2;</code>
     * @return The totalByteSize.
     */
    @java.lang.Override
    public long getTotalByteSize() {
      return totalByteSize_;
    }
    /**
     * <code>int64 total_byte_size = 2;</code>
     * @param value The totalByteSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalByteSize(long value) {
      
      totalByteSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_byte_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalByteSize() {
      
      totalByteSize_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.blaze.protobuf.ColumnStats> columnStats_ =
      java.util.Collections.emptyList();
    private void ensureColumnStatsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        columnStats_ = new java.util.ArrayList<org.blaze.protobuf.ColumnStats>(columnStats_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.ColumnStats, org.blaze.protobuf.ColumnStats.Builder, org.blaze.protobuf.ColumnStatsOrBuilder> columnStatsBuilder_;

    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public java.util.List<org.blaze.protobuf.ColumnStats> getColumnStatsList() {
      if (columnStatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columnStats_);
      } else {
        return columnStatsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public int getColumnStatsCount() {
      if (columnStatsBuilder_ == null) {
        return columnStats_.size();
      } else {
        return columnStatsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public org.blaze.protobuf.ColumnStats getColumnStats(int index) {
      if (columnStatsBuilder_ == null) {
        return columnStats_.get(index);
      } else {
        return columnStatsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder setColumnStats(
        int index, org.blaze.protobuf.ColumnStats value) {
      if (columnStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnStatsIsMutable();
        columnStats_.set(index, value);
        onChanged();
      } else {
        columnStatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder setColumnStats(
        int index, org.blaze.protobuf.ColumnStats.Builder builderForValue) {
      if (columnStatsBuilder_ == null) {
        ensureColumnStatsIsMutable();
        columnStats_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnStatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder addColumnStats(org.blaze.protobuf.ColumnStats value) {
      if (columnStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnStatsIsMutable();
        columnStats_.add(value);
        onChanged();
      } else {
        columnStatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder addColumnStats(
        int index, org.blaze.protobuf.ColumnStats value) {
      if (columnStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnStatsIsMutable();
        columnStats_.add(index, value);
        onChanged();
      } else {
        columnStatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder addColumnStats(
        org.blaze.protobuf.ColumnStats.Builder builderForValue) {
      if (columnStatsBuilder_ == null) {
        ensureColumnStatsIsMutable();
        columnStats_.add(builderForValue.build());
        onChanged();
      } else {
        columnStatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder addColumnStats(
        int index, org.blaze.protobuf.ColumnStats.Builder builderForValue) {
      if (columnStatsBuilder_ == null) {
        ensureColumnStatsIsMutable();
        columnStats_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnStatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder addAllColumnStats(
        java.lang.Iterable<? extends org.blaze.protobuf.ColumnStats> values) {
      if (columnStatsBuilder_ == null) {
        ensureColumnStatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columnStats_);
        onChanged();
      } else {
        columnStatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder clearColumnStats() {
      if (columnStatsBuilder_ == null) {
        columnStats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnStatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public Builder removeColumnStats(int index) {
      if (columnStatsBuilder_ == null) {
        ensureColumnStatsIsMutable();
        columnStats_.remove(index);
        onChanged();
      } else {
        columnStatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public org.blaze.protobuf.ColumnStats.Builder getColumnStatsBuilder(
        int index) {
      return getColumnStatsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public org.blaze.protobuf.ColumnStatsOrBuilder getColumnStatsOrBuilder(
        int index) {
      if (columnStatsBuilder_ == null) {
        return columnStats_.get(index);  } else {
        return columnStatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public java.util.List<? extends org.blaze.protobuf.ColumnStatsOrBuilder> 
         getColumnStatsOrBuilderList() {
      if (columnStatsBuilder_ != null) {
        return columnStatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columnStats_);
      }
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public org.blaze.protobuf.ColumnStats.Builder addColumnStatsBuilder() {
      return getColumnStatsFieldBuilder().addBuilder(
          org.blaze.protobuf.ColumnStats.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public org.blaze.protobuf.ColumnStats.Builder addColumnStatsBuilder(
        int index) {
      return getColumnStatsFieldBuilder().addBuilder(
          index, org.blaze.protobuf.ColumnStats.getDefaultInstance());
    }
    /**
     * <code>repeated .plan.protobuf.ColumnStats column_stats = 3;</code>
     */
    public java.util.List<org.blaze.protobuf.ColumnStats.Builder> 
         getColumnStatsBuilderList() {
      return getColumnStatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.blaze.protobuf.ColumnStats, org.blaze.protobuf.ColumnStats.Builder, org.blaze.protobuf.ColumnStatsOrBuilder> 
        getColumnStatsFieldBuilder() {
      if (columnStatsBuilder_ == null) {
        columnStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.blaze.protobuf.ColumnStats, org.blaze.protobuf.ColumnStats.Builder, org.blaze.protobuf.ColumnStatsOrBuilder>(
                columnStats_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        columnStats_ = null;
      }
      return columnStatsBuilder_;
    }

    private boolean isExact_ ;
    /**
     * <code>bool is_exact = 4;</code>
     * @return The isExact.
     */
    @java.lang.Override
    public boolean getIsExact() {
      return isExact_;
    }
    /**
     * <code>bool is_exact = 4;</code>
     * @param value The isExact to set.
     * @return This builder for chaining.
     */
    public Builder setIsExact(boolean value) {
      
      isExact_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_exact = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsExact() {
      
      isExact_ = false;
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


    // @@protoc_insertion_point(builder_scope:plan.protobuf.Statistics)
  }

  // @@protoc_insertion_point(class_scope:plan.protobuf.Statistics)
  private static final org.blaze.protobuf.Statistics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.blaze.protobuf.Statistics();
  }

  public static org.blaze.protobuf.Statistics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Statistics>
      PARSER = new com.google.protobuf.AbstractParser<Statistics>() {
    @java.lang.Override
    public Statistics parsePartialFrom(
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

  public static com.google.protobuf.Parser<Statistics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Statistics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.blaze.protobuf.Statistics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

