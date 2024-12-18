// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

public interface ScalarValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:plan.protobuf.ScalarValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool bool_value = 1;</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <code>bool bool_value = 1;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   * <code>string utf8_value = 2;</code>
   * @return Whether the utf8Value field is set.
   */
  boolean hasUtf8Value();
  /**
   * <code>string utf8_value = 2;</code>
   * @return The utf8Value.
   */
  java.lang.String getUtf8Value();
  /**
   * <code>string utf8_value = 2;</code>
   * @return The bytes for utf8Value.
   */
  com.google.protobuf.ByteString
      getUtf8ValueBytes();

  /**
   * <code>string large_utf8_value = 3;</code>
   * @return Whether the largeUtf8Value field is set.
   */
  boolean hasLargeUtf8Value();
  /**
   * <code>string large_utf8_value = 3;</code>
   * @return The largeUtf8Value.
   */
  java.lang.String getLargeUtf8Value();
  /**
   * <code>string large_utf8_value = 3;</code>
   * @return The bytes for largeUtf8Value.
   */
  com.google.protobuf.ByteString
      getLargeUtf8ValueBytes();

  /**
   * <code>int32 int8_value = 4;</code>
   * @return Whether the int8Value field is set.
   */
  boolean hasInt8Value();
  /**
   * <code>int32 int8_value = 4;</code>
   * @return The int8Value.
   */
  int getInt8Value();

  /**
   * <code>int32 int16_value = 5;</code>
   * @return Whether the int16Value field is set.
   */
  boolean hasInt16Value();
  /**
   * <code>int32 int16_value = 5;</code>
   * @return The int16Value.
   */
  int getInt16Value();

  /**
   * <code>int32 int32_value = 6;</code>
   * @return Whether the int32Value field is set.
   */
  boolean hasInt32Value();
  /**
   * <code>int32 int32_value = 6;</code>
   * @return The int32Value.
   */
  int getInt32Value();

  /**
   * <code>int64 int64_value = 7;</code>
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   * <code>int64 int64_value = 7;</code>
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   * <code>uint32 uint8_value = 8;</code>
   * @return Whether the uint8Value field is set.
   */
  boolean hasUint8Value();
  /**
   * <code>uint32 uint8_value = 8;</code>
   * @return The uint8Value.
   */
  int getUint8Value();

  /**
   * <code>uint32 uint16_value = 9;</code>
   * @return Whether the uint16Value field is set.
   */
  boolean hasUint16Value();
  /**
   * <code>uint32 uint16_value = 9;</code>
   * @return The uint16Value.
   */
  int getUint16Value();

  /**
   * <code>uint32 uint32_value = 10;</code>
   * @return Whether the uint32Value field is set.
   */
  boolean hasUint32Value();
  /**
   * <code>uint32 uint32_value = 10;</code>
   * @return The uint32Value.
   */
  int getUint32Value();

  /**
   * <code>uint64 uint64_value = 11;</code>
   * @return Whether the uint64Value field is set.
   */
  boolean hasUint64Value();
  /**
   * <code>uint64 uint64_value = 11;</code>
   * @return The uint64Value.
   */
  long getUint64Value();

  /**
   * <code>float float32_value = 12;</code>
   * @return Whether the float32Value field is set.
   */
  boolean hasFloat32Value();
  /**
   * <code>float float32_value = 12;</code>
   * @return The float32Value.
   */
  float getFloat32Value();

  /**
   * <code>double float64_value = 13;</code>
   * @return Whether the float64Value field is set.
   */
  boolean hasFloat64Value();
  /**
   * <code>double float64_value = 13;</code>
   * @return The float64Value.
   */
  double getFloat64Value();

  /**
   * <code>int32 date32_value = 14;</code>
   * @return Whether the date32Value field is set.
   */
  boolean hasDate32Value();
  /**
   * <code>int32 date32_value = 14;</code>
   * @return The date32Value.
   */
  int getDate32Value();

  /**
   * <code>int64 timestamp_second_value = 15;</code>
   * @return Whether the timestampSecondValue field is set.
   */
  boolean hasTimestampSecondValue();
  /**
   * <code>int64 timestamp_second_value = 15;</code>
   * @return The timestampSecondValue.
   */
  long getTimestampSecondValue();

  /**
   * <code>int64 timestamp_millisecond_value = 16;</code>
   * @return Whether the timestampMillisecondValue field is set.
   */
  boolean hasTimestampMillisecondValue();
  /**
   * <code>int64 timestamp_millisecond_value = 16;</code>
   * @return The timestampMillisecondValue.
   */
  long getTimestampMillisecondValue();

  /**
   * <code>int64 timestamp_microsecond_value = 17;</code>
   * @return Whether the timestampMicrosecondValue field is set.
   */
  boolean hasTimestampMicrosecondValue();
  /**
   * <code>int64 timestamp_microsecond_value = 17;</code>
   * @return The timestampMicrosecondValue.
   */
  long getTimestampMicrosecondValue();

  /**
   * <code>int64 timestamp_nanosecond_value = 18;</code>
   * @return Whether the timestampNanosecondValue field is set.
   */
  boolean hasTimestampNanosecondValue();
  /**
   * <code>int64 timestamp_nanosecond_value = 18;</code>
   * @return The timestampNanosecondValue.
   */
  long getTimestampNanosecondValue();

  /**
   * <code>.plan.protobuf.ScalarListValue list_value = 19;</code>
   * @return Whether the listValue field is set.
   */
  boolean hasListValue();
  /**
   * <code>.plan.protobuf.ScalarListValue list_value = 19;</code>
   * @return The listValue.
   */
  org.blaze.protobuf.ScalarListValue getListValue();
  /**
   * <code>.plan.protobuf.ScalarListValue list_value = 19;</code>
   */
  org.blaze.protobuf.ScalarListValueOrBuilder getListValueOrBuilder();

  /**
   * <code>.plan.protobuf.ScalarDecimalValue decimal_value = 20;</code>
   * @return Whether the decimalValue field is set.
   */
  boolean hasDecimalValue();
  /**
   * <code>.plan.protobuf.ScalarDecimalValue decimal_value = 20;</code>
   * @return The decimalValue.
   */
  org.blaze.protobuf.ScalarDecimalValue getDecimalValue();
  /**
   * <code>.plan.protobuf.ScalarDecimalValue decimal_value = 20;</code>
   */
  org.blaze.protobuf.ScalarDecimalValueOrBuilder getDecimalValueOrBuilder();

  /**
   * <code>.plan.protobuf.ScalarType null_value = 1000;</code>
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();
  /**
   * <code>.plan.protobuf.ScalarType null_value = 1000;</code>
   * @return The nullValue.
   */
  org.blaze.protobuf.ScalarType getNullValue();
  /**
   * <code>.plan.protobuf.ScalarType null_value = 1000;</code>
   */
  org.blaze.protobuf.ScalarTypeOrBuilder getNullValueOrBuilder();

  public org.blaze.protobuf.ScalarValue.ValueCase getValueCase();
}
