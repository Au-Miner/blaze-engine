// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf enum {@code plan.protobuf.WindowFunction}
 */
public enum WindowFunction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROW_NUMBER = 0;</code>
   */
  ROW_NUMBER(0),
  /**
   * <code>RANK = 1;</code>
   */
  RANK(1),
  /**
   * <code>DENSE_RANK = 2;</code>
   */
  DENSE_RANK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROW_NUMBER = 0;</code>
   */
  public static final int ROW_NUMBER_VALUE = 0;
  /**
   * <code>RANK = 1;</code>
   */
  public static final int RANK_VALUE = 1;
  /**
   * <code>DENSE_RANK = 2;</code>
   */
  public static final int DENSE_RANK_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static WindowFunction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WindowFunction forNumber(int value) {
    switch (value) {
      case 0: return ROW_NUMBER;
      case 1: return RANK;
      case 2: return DENSE_RANK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WindowFunction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WindowFunction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WindowFunction>() {
          public WindowFunction findValueByNumber(int number) {
            return WindowFunction.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.blaze.protobuf.BlazeProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final WindowFunction[] VALUES = values();

  public static WindowFunction valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WindowFunction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:plan.protobuf.WindowFunction)
}
