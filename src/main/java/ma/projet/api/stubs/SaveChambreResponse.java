// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package ma.projet.api.stubs;

/**
 * Protobuf type {@code SaveChambreResponse}
 */
public  final class SaveChambreResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SaveChambreResponse)
    SaveChambreResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveChambreResponse.newBuilder() to construct.
  private SaveChambreResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveChambreResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveChambreResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveChambreResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            ma.projet.api.stubs.Chambre.Builder subBuilder = null;
            if (chambre_ != null) {
              subBuilder = chambre_.toBuilder();
            }
            chambre_ = input.readMessage(ma.projet.api.stubs.Chambre.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chambre_);
              chambre_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveChambreResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveChambreResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.api.stubs.SaveChambreResponse.class, ma.projet.api.stubs.SaveChambreResponse.Builder.class);
  }

  public static final int CHAMBRE_FIELD_NUMBER = 1;
  private ma.projet.api.stubs.Chambre chambre_;
  /**
   * <code>.Chambre chambre = 1;</code>
   * @return Whether the chambre field is set.
   */
  public boolean hasChambre() {
    return chambre_ != null;
  }
  /**
   * <code>.Chambre chambre = 1;</code>
   * @return The chambre.
   */
  public ma.projet.api.stubs.Chambre getChambre() {
    return chambre_ == null ? ma.projet.api.stubs.Chambre.getDefaultInstance() : chambre_;
  }
  /**
   * <code>.Chambre chambre = 1;</code>
   */
  public ma.projet.api.stubs.ChambreOrBuilder getChambreOrBuilder() {
    return getChambre();
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
    if (chambre_ != null) {
      output.writeMessage(1, getChambre());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (chambre_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getChambre());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ma.projet.api.stubs.SaveChambreResponse)) {
      return super.equals(obj);
    }
    ma.projet.api.stubs.SaveChambreResponse other = (ma.projet.api.stubs.SaveChambreResponse) obj;

    if (hasChambre() != other.hasChambre()) return false;
    if (hasChambre()) {
      if (!getChambre()
          .equals(other.getChambre())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasChambre()) {
      hash = (37 * hash) + CHAMBRE_FIELD_NUMBER;
      hash = (53 * hash) + getChambre().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.api.stubs.SaveChambreResponse parseFrom(
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
  public static Builder newBuilder(ma.projet.api.stubs.SaveChambreResponse prototype) {
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
   * Protobuf type {@code SaveChambreResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SaveChambreResponse)
      ma.projet.api.stubs.SaveChambreResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveChambreResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveChambreResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.api.stubs.SaveChambreResponse.class, ma.projet.api.stubs.SaveChambreResponse.Builder.class);
    }

    // Construct using ma.projet.api.stubs.SaveChambreResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (chambreBuilder_ == null) {
        chambre_ = null;
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.api.stubs.ReservationServiceOuterClass.internal_static_SaveChambreResponse_descriptor;
    }

    @java.lang.Override
    public ma.projet.api.stubs.SaveChambreResponse getDefaultInstanceForType() {
      return ma.projet.api.stubs.SaveChambreResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.api.stubs.SaveChambreResponse build() {
      ma.projet.api.stubs.SaveChambreResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.api.stubs.SaveChambreResponse buildPartial() {
      ma.projet.api.stubs.SaveChambreResponse result = new ma.projet.api.stubs.SaveChambreResponse(this);
      if (chambreBuilder_ == null) {
        result.chambre_ = chambre_;
      } else {
        result.chambre_ = chambreBuilder_.build();
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
      if (other instanceof ma.projet.api.stubs.SaveChambreResponse) {
        return mergeFrom((ma.projet.api.stubs.SaveChambreResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.api.stubs.SaveChambreResponse other) {
      if (other == ma.projet.api.stubs.SaveChambreResponse.getDefaultInstance()) return this;
      if (other.hasChambre()) {
        mergeChambre(other.getChambre());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ma.projet.api.stubs.SaveChambreResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.api.stubs.SaveChambreResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ma.projet.api.stubs.Chambre chambre_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.projet.api.stubs.Chambre, ma.projet.api.stubs.Chambre.Builder, ma.projet.api.stubs.ChambreOrBuilder> chambreBuilder_;
    /**
     * <code>.Chambre chambre = 1;</code>
     * @return Whether the chambre field is set.
     */
    public boolean hasChambre() {
      return chambreBuilder_ != null || chambre_ != null;
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     * @return The chambre.
     */
    public ma.projet.api.stubs.Chambre getChambre() {
      if (chambreBuilder_ == null) {
        return chambre_ == null ? ma.projet.api.stubs.Chambre.getDefaultInstance() : chambre_;
      } else {
        return chambreBuilder_.getMessage();
      }
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    public Builder setChambre(ma.projet.api.stubs.Chambre value) {
      if (chambreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chambre_ = value;
        onChanged();
      } else {
        chambreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    public Builder setChambre(
        ma.projet.api.stubs.Chambre.Builder builderForValue) {
      if (chambreBuilder_ == null) {
        chambre_ = builderForValue.build();
        onChanged();
      } else {
        chambreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    public Builder mergeChambre(ma.projet.api.stubs.Chambre value) {
      if (chambreBuilder_ == null) {
        if (chambre_ != null) {
          chambre_ =
            ma.projet.api.stubs.Chambre.newBuilder(chambre_).mergeFrom(value).buildPartial();
        } else {
          chambre_ = value;
        }
        onChanged();
      } else {
        chambreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    public Builder clearChambre() {
      if (chambreBuilder_ == null) {
        chambre_ = null;
        onChanged();
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    public ma.projet.api.stubs.Chambre.Builder getChambreBuilder() {
      
      onChanged();
      return getChambreFieldBuilder().getBuilder();
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    public ma.projet.api.stubs.ChambreOrBuilder getChambreOrBuilder() {
      if (chambreBuilder_ != null) {
        return chambreBuilder_.getMessageOrBuilder();
      } else {
        return chambre_ == null ?
            ma.projet.api.stubs.Chambre.getDefaultInstance() : chambre_;
      }
    }
    /**
     * <code>.Chambre chambre = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ma.projet.api.stubs.Chambre, ma.projet.api.stubs.Chambre.Builder, ma.projet.api.stubs.ChambreOrBuilder> 
        getChambreFieldBuilder() {
      if (chambreBuilder_ == null) {
        chambreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ma.projet.api.stubs.Chambre, ma.projet.api.stubs.Chambre.Builder, ma.projet.api.stubs.ChambreOrBuilder>(
                getChambre(),
                getParentForChildren(),
                isClean());
        chambre_ = null;
      }
      return chambreBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SaveChambreResponse)
  }

  // @@protoc_insertion_point(class_scope:SaveChambreResponse)
  private static final ma.projet.api.stubs.SaveChambreResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.api.stubs.SaveChambreResponse();
  }

  public static ma.projet.api.stubs.SaveChambreResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveChambreResponse>
      PARSER = new com.google.protobuf.AbstractParser<SaveChambreResponse>() {
    @java.lang.Override
    public SaveChambreResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveChambreResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveChambreResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveChambreResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.api.stubs.SaveChambreResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
