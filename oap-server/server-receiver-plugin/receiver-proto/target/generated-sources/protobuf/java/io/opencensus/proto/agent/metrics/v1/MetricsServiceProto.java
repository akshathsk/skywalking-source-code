// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/agent/metrics/v1/metrics_service.proto

package io.opencensus.proto.agent.metrics.v1;

public final class MetricsServiceProto {
  private MetricsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7opencensus/proto/agent/metrics/v1/metr" +
      "ics_service.proto\022!opencensus.proto.agen" +
      "t.metrics.v1\032-opencensus/proto/agent/com" +
      "mon/v1/common.proto\032)opencensus/proto/me" +
      "trics/v1/metrics.proto\032+opencensus/proto" +
      "/resource/v1/resource.proto\"\303\001\n\033ExportMe" +
      "tricsServiceRequest\0224\n\004node\030\001 \001(\0132&.open" +
      "census.proto.agent.common.v1.Node\0224\n\007met" +
      "rics\030\002 \003(\0132#.opencensus.proto.metrics.v1" +
      ".Metric\0228\n\010resource\030\003 \001(\0132&.opencensus.p" +
      "roto.resource.v1.Resource\"\036\n\034ExportMetri" +
      "csServiceResponse2\242\001\n\016MetricsService\022\217\001\n" +
      "\006Export\022>.opencensus.proto.agent.metrics" +
      ".v1.ExportMetricsServiceRequest\032?.opence" +
      "nsus.proto.agent.metrics.v1.ExportMetric" +
      "sServiceResponse\"\000(\0010\001B\211\001\n$io.opencensus" +
      ".proto.agent.metrics.v1B\023MetricsServiceP" +
      "rotoP\001ZJgithub.com/census-instrumentatio" +
      "n/opencensus-proto/gen-go/agent/metrics/" +
      "v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opencensus.proto.agent.common.v1.CommonProto.getDescriptor(),
          io.opencensus.proto.metrics.v1.MetricsProto.getDescriptor(),
          io.opencensus.proto.resource.v1.ResourceProto.getDescriptor(),
        });
    internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceRequest_descriptor,
        new java.lang.String[] { "Node", "Metrics", "Resource", });
    internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_agent_metrics_v1_ExportMetricsServiceResponse_descriptor,
        new java.lang.String[] { });
    io.opencensus.proto.agent.common.v1.CommonProto.getDescriptor();
    io.opencensus.proto.metrics.v1.MetricsProto.getDescriptor();
    io.opencensus.proto.resource.v1.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
