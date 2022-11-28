// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/trace/v1/trace_config.proto

package io.opencensus.proto.trace.v1;

/**
 * <pre>
 * Sampler that always makes a constant decision on span sampling.
 * </pre>
 *
 * Protobuf type {@code opencensus.proto.trace.v1.ConstantSampler}
 */
public final class ConstantSampler extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencensus.proto.trace.v1.ConstantSampler)
    ConstantSamplerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConstantSampler.newBuilder() to construct.
  private ConstantSampler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConstantSampler() {
    decision_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConstantSampler();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConstantSampler(
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
          case 8: {
            int rawValue = input.readEnum();

            decision_ = rawValue;
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
    return io.opencensus.proto.trace.v1.TraceConfigProto.internal_static_opencensus_proto_trace_v1_ConstantSampler_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencensus.proto.trace.v1.TraceConfigProto.internal_static_opencensus_proto_trace_v1_ConstantSampler_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencensus.proto.trace.v1.ConstantSampler.class, io.opencensus.proto.trace.v1.ConstantSampler.Builder.class);
  }

  /**
   * <pre>
   * How spans should be sampled:
   * - Always off
   * - Always on
   * - Always follow the parent Span's decision (off if no parent).
   * </pre>
   *
   * Protobuf enum {@code opencensus.proto.trace.v1.ConstantSampler.ConstantDecision}
   */
  public enum ConstantDecision
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ALWAYS_OFF = 0;</code>
     */
    ALWAYS_OFF(0),
    /**
     * <code>ALWAYS_ON = 1;</code>
     */
    ALWAYS_ON(1),
    /**
     * <code>ALWAYS_PARENT = 2;</code>
     */
    ALWAYS_PARENT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ALWAYS_OFF = 0;</code>
     */
    public static final int ALWAYS_OFF_VALUE = 0;
    /**
     * <code>ALWAYS_ON = 1;</code>
     */
    public static final int ALWAYS_ON_VALUE = 1;
    /**
     * <code>ALWAYS_PARENT = 2;</code>
     */
    public static final int ALWAYS_PARENT_VALUE = 2;


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
    public static ConstantDecision valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConstantDecision forNumber(int value) {
      switch (value) {
        case 0: return ALWAYS_OFF;
        case 1: return ALWAYS_ON;
        case 2: return ALWAYS_PARENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConstantDecision>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConstantDecision> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConstantDecision>() {
            public ConstantDecision findValueByNumber(int number) {
              return ConstantDecision.forNumber(number);
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
      return io.opencensus.proto.trace.v1.ConstantSampler.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConstantDecision[] VALUES = values();

    public static ConstantDecision valueOf(
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

    private ConstantDecision(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencensus.proto.trace.v1.ConstantSampler.ConstantDecision)
  }

  public static final int DECISION_FIELD_NUMBER = 1;
  private int decision_;
  /**
   * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
   * @return The enum numeric value on the wire for decision.
   */
  @java.lang.Override public int getDecisionValue() {
    return decision_;
  }
  /**
   * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
   * @return The decision.
   */
  @java.lang.Override public io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision getDecision() {
    @SuppressWarnings("deprecation")
    io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision result = io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision.valueOf(decision_);
    return result == null ? io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision.UNRECOGNIZED : result;
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
    if (decision_ != io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision.ALWAYS_OFF.getNumber()) {
      output.writeEnum(1, decision_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (decision_ != io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision.ALWAYS_OFF.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, decision_);
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
    if (!(obj instanceof io.opencensus.proto.trace.v1.ConstantSampler)) {
      return super.equals(obj);
    }
    io.opencensus.proto.trace.v1.ConstantSampler other = (io.opencensus.proto.trace.v1.ConstantSampler) obj;

    if (decision_ != other.decision_) return false;
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
    hash = (37 * hash) + DECISION_FIELD_NUMBER;
    hash = (53 * hash) + decision_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencensus.proto.trace.v1.ConstantSampler parseFrom(
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
  public static Builder newBuilder(io.opencensus.proto.trace.v1.ConstantSampler prototype) {
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
   * <pre>
   * Sampler that always makes a constant decision on span sampling.
   * </pre>
   *
   * Protobuf type {@code opencensus.proto.trace.v1.ConstantSampler}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencensus.proto.trace.v1.ConstantSampler)
      io.opencensus.proto.trace.v1.ConstantSamplerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencensus.proto.trace.v1.TraceConfigProto.internal_static_opencensus_proto_trace_v1_ConstantSampler_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencensus.proto.trace.v1.TraceConfigProto.internal_static_opencensus_proto_trace_v1_ConstantSampler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencensus.proto.trace.v1.ConstantSampler.class, io.opencensus.proto.trace.v1.ConstantSampler.Builder.class);
    }

    // Construct using io.opencensus.proto.trace.v1.ConstantSampler.newBuilder()
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
      decision_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencensus.proto.trace.v1.TraceConfigProto.internal_static_opencensus_proto_trace_v1_ConstantSampler_descriptor;
    }

    @java.lang.Override
    public io.opencensus.proto.trace.v1.ConstantSampler getDefaultInstanceForType() {
      return io.opencensus.proto.trace.v1.ConstantSampler.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencensus.proto.trace.v1.ConstantSampler build() {
      io.opencensus.proto.trace.v1.ConstantSampler result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencensus.proto.trace.v1.ConstantSampler buildPartial() {
      io.opencensus.proto.trace.v1.ConstantSampler result = new io.opencensus.proto.trace.v1.ConstantSampler(this);
      result.decision_ = decision_;
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
      if (other instanceof io.opencensus.proto.trace.v1.ConstantSampler) {
        return mergeFrom((io.opencensus.proto.trace.v1.ConstantSampler)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencensus.proto.trace.v1.ConstantSampler other) {
      if (other == io.opencensus.proto.trace.v1.ConstantSampler.getDefaultInstance()) return this;
      if (other.decision_ != 0) {
        setDecisionValue(other.getDecisionValue());
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
      io.opencensus.proto.trace.v1.ConstantSampler parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencensus.proto.trace.v1.ConstantSampler) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int decision_ = 0;
    /**
     * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
     * @return The enum numeric value on the wire for decision.
     */
    @java.lang.Override public int getDecisionValue() {
      return decision_;
    }
    /**
     * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
     * @param value The enum numeric value on the wire for decision to set.
     * @return This builder for chaining.
     */
    public Builder setDecisionValue(int value) {
      
      decision_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
     * @return The decision.
     */
    @java.lang.Override
    public io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision getDecision() {
      @SuppressWarnings("deprecation")
      io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision result = io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision.valueOf(decision_);
      return result == null ? io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision.UNRECOGNIZED : result;
    }
    /**
     * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
     * @param value The decision to set.
     * @return This builder for chaining.
     */
    public Builder setDecision(io.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      decision_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.opencensus.proto.trace.v1.ConstantSampler.ConstantDecision decision = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecision() {
      
      decision_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opencensus.proto.trace.v1.ConstantSampler)
  }

  // @@protoc_insertion_point(class_scope:opencensus.proto.trace.v1.ConstantSampler)
  private static final io.opencensus.proto.trace.v1.ConstantSampler DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencensus.proto.trace.v1.ConstantSampler();
  }

  public static io.opencensus.proto.trace.v1.ConstantSampler getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConstantSampler>
      PARSER = new com.google.protobuf.AbstractParser<ConstantSampler>() {
    @java.lang.Override
    public ConstantSampler parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConstantSampler(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConstantSampler> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConstantSampler> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencensus.proto.trace.v1.ConstantSampler getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

