// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

/**
 * <pre>
 *enumeration pour le role d'utilisateur
 * </pre>
 *
 * Protobuf enum {@code Role}
 */
public enum Role
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UTILISATEUR = 0;</code>
   */
  UTILISATEUR(0),
  /**
   * <code>ADMINISTRATEUR = 1;</code>
   */
  ADMINISTRATEUR(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UTILISATEUR = 0;</code>
   */
  public static final int UTILISATEUR_VALUE = 0;
  /**
   * <code>ADMINISTRATEUR = 1;</code>
   */
  public static final int ADMINISTRATEUR_VALUE = 1;


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
  public static Role valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Role forNumber(int value) {
    switch (value) {
      case 0: return UTILISATEUR;
      case 1: return ADMINISTRATEUR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Role>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Role> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Role>() {
          public Role findValueByNumber(int number) {
            return Role.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final Role[] VALUES = values();

  public static Role valueOf(
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

  private Role(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Role)
}
