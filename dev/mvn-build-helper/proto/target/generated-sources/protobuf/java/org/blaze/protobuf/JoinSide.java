// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blaze.proto

package org.blaze.protobuf;

/**
 * Protobuf enum {@code plan.protobuf.JoinSide}
 */
public enum JoinSide
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEFT_SIDE = 0;</code>
   */
  LEFT_SIDE(0),
  /**
   * <code>RIGHT_SIDE = 1;</code>
   */
  RIGHT_SIDE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LEFT_SIDE = 0;</code>
   */
  public static final int LEFT_SIDE_VALUE = 0;
  /**
   * <code>RIGHT_SIDE = 1;</code>
   */
  public static final int RIGHT_SIDE_VALUE = 1;


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
  public static JoinSide valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JoinSide forNumber(int value) {
    switch (value) {
      case 0: return LEFT_SIDE;
      case 1: return RIGHT_SIDE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JoinSide>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JoinSide> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JoinSide>() {
          public JoinSide findValueByNumber(int number) {
            return JoinSide.forNumber(number);
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
    return org.blaze.protobuf.BlazeProto.getDescriptor().getEnumTypes().get(8);
  }

  private static final JoinSide[] VALUES = values();

  public static JoinSide valueOf(
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

  private JoinSide(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:plan.protobuf.JoinSide)
}

