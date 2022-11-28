// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_MetricsData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_MetricsData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_ResourceMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_ResourceMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_ScopeMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_ScopeMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_Gauge_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_Gauge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_Sum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_Sum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_Histogram_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_Histogram_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogram_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogram_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_Summary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_Summary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_NumberDataPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_NumberDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_HistogramDataPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_HistogramDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_Buckets_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_Buckets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_ValueAtQuantile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_ValueAtQuantile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_metrics_v1_Exemplar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_metrics_v1_Exemplar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,opentelemetry/proto/metrics/v1/metrics" +
      ".proto\022\036opentelemetry.proto.metrics.v1\032*" +
      "opentelemetry/proto/common/v1/common.pro" +
      "to\032.opentelemetry/proto/resource/v1/reso" +
      "urce.proto\"X\n\013MetricsData\022I\n\020resource_me" +
      "trics\030\001 \003(\0132/.opentelemetry.proto.metric" +
      "s.v1.ResourceMetrics\"\257\001\n\017ResourceMetrics" +
      "\022;\n\010resource\030\001 \001(\0132).opentelemetry.proto" +
      ".resource.v1.Resource\022C\n\rscope_metrics\030\002" +
      " \003(\0132,.opentelemetry.proto.metrics.v1.Sc" +
      "opeMetrics\022\022\n\nschema_url\030\003 \001(\tJ\006\010\350\007\020\351\007\"\237" +
      "\001\n\014ScopeMetrics\022B\n\005scope\030\001 \001(\01323.opentel" +
      "emetry.proto.common.v1.InstrumentationSc" +
      "ope\0227\n\007metrics\030\002 \003(\0132&.opentelemetry.pro" +
      "to.metrics.v1.Metric\022\022\n\nschema_url\030\003 \001(\t" +
      "\"\222\003\n\006Metric\022\014\n\004name\030\001 \001(\t\022\023\n\013description" +
      "\030\002 \001(\t\022\014\n\004unit\030\003 \001(\t\0226\n\005gauge\030\005 \001(\0132%.op" +
      "entelemetry.proto.metrics.v1.GaugeH\000\0222\n\003" +
      "sum\030\007 \001(\0132#.opentelemetry.proto.metrics." +
      "v1.SumH\000\022>\n\thistogram\030\t \001(\0132).openteleme" +
      "try.proto.metrics.v1.HistogramH\000\022U\n\025expo" +
      "nential_histogram\030\n \001(\01324.opentelemetry." +
      "proto.metrics.v1.ExponentialHistogramH\000\022" +
      ":\n\007summary\030\013 \001(\0132\'.opentelemetry.proto.m" +
      "etrics.v1.SummaryH\000B\006\n\004dataJ\004\010\004\020\005J\004\010\006\020\007J" +
      "\004\010\010\020\t\"M\n\005Gauge\022D\n\013data_points\030\001 \003(\0132/.op" +
      "entelemetry.proto.metrics.v1.NumberDataP" +
      "oint\"\272\001\n\003Sum\022D\n\013data_points\030\001 \003(\0132/.open" +
      "telemetry.proto.metrics.v1.NumberDataPoi" +
      "nt\022W\n\027aggregation_temporality\030\002 \001(\01626.op" +
      "entelemetry.proto.metrics.v1.Aggregation" +
      "Temporality\022\024\n\014is_monotonic\030\003 \001(\010\"\255\001\n\tHi" +
      "stogram\022G\n\013data_points\030\001 \003(\01322.opentelem" +
      "etry.proto.metrics.v1.HistogramDataPoint" +
      "\022W\n\027aggregation_temporality\030\002 \001(\01626.open" +
      "telemetry.proto.metrics.v1.AggregationTe" +
      "mporality\"\303\001\n\024ExponentialHistogram\022R\n\013da" +
      "ta_points\030\001 \003(\0132=.opentelemetry.proto.me" +
      "trics.v1.ExponentialHistogramDataPoint\022W" +
      "\n\027aggregation_temporality\030\002 \001(\01626.opente" +
      "lemetry.proto.metrics.v1.AggregationTemp" +
      "orality\"P\n\007Summary\022E\n\013data_points\030\001 \003(\0132" +
      "0.opentelemetry.proto.metrics.v1.Summary" +
      "DataPoint\"\206\002\n\017NumberDataPoint\022;\n\nattribu" +
      "tes\030\007 \003(\0132\'.opentelemetry.proto.common.v" +
      "1.KeyValue\022\034\n\024start_time_unix_nano\030\002 \001(\006" +
      "\022\026\n\016time_unix_nano\030\003 \001(\006\022\023\n\tas_double\030\004 " +
      "\001(\001H\000\022\020\n\006as_int\030\006 \001(\020H\000\022;\n\texemplars\030\005 \003" +
      "(\0132(.opentelemetry.proto.metrics.v1.Exem" +
      "plar\022\r\n\005flags\030\010 \001(\rB\007\n\005valueJ\004\010\001\020\002\"\346\002\n\022H" +
      "istogramDataPoint\022;\n\nattributes\030\t \003(\0132\'." +
      "opentelemetry.proto.common.v1.KeyValue\022\034" +
      "\n\024start_time_unix_nano\030\002 \001(\006\022\026\n\016time_uni" +
      "x_nano\030\003 \001(\006\022\r\n\005count\030\004 \001(\006\022\020\n\003sum\030\005 \001(\001" +
      "H\000\210\001\001\022\025\n\rbucket_counts\030\006 \003(\006\022\027\n\017explicit" +
      "_bounds\030\007 \003(\001\022;\n\texemplars\030\010 \003(\0132(.opent" +
      "elemetry.proto.metrics.v1.Exemplar\022\r\n\005fl" +
      "ags\030\n \001(\r\022\020\n\003min\030\013 \001(\001H\001\210\001\001\022\020\n\003max\030\014 \001(\001" +
      "H\002\210\001\001B\006\n\004_sumB\006\n\004_minB\006\n\004_maxJ\004\010\001\020\002\"\302\004\n\035" +
      "ExponentialHistogramDataPoint\022;\n\nattribu" +
      "tes\030\001 \003(\0132\'.opentelemetry.proto.common.v" +
      "1.KeyValue\022\034\n\024start_time_unix_nano\030\002 \001(\006" +
      "\022\026\n\016time_unix_nano\030\003 \001(\006\022\r\n\005count\030\004 \001(\006\022" +
      "\020\n\003sum\030\005 \001(\001H\000\210\001\001\022\r\n\005scale\030\006 \001(\021\022\022\n\nzero" +
      "_count\030\007 \001(\006\022W\n\010positive\030\010 \001(\0132E.opentel" +
      "emetry.proto.metrics.v1.ExponentialHisto" +
      "gramDataPoint.Buckets\022W\n\010negative\030\t \001(\0132" +
      "E.opentelemetry.proto.metrics.v1.Exponen" +
      "tialHistogramDataPoint.Buckets\022\r\n\005flags\030" +
      "\n \001(\r\022;\n\texemplars\030\013 \003(\0132(.opentelemetry" +
      ".proto.metrics.v1.Exemplar\022\020\n\003min\030\014 \001(\001H" +
      "\001\210\001\001\022\020\n\003max\030\r \001(\001H\002\210\001\001\0320\n\007Buckets\022\016\n\006off" +
      "set\030\001 \001(\021\022\025\n\rbucket_counts\030\002 \003(\004B\006\n\004_sum" +
      "B\006\n\004_minB\006\n\004_max\"\305\002\n\020SummaryDataPoint\022;\n" +
      "\nattributes\030\007 \003(\0132\'.opentelemetry.proto." +
      "common.v1.KeyValue\022\034\n\024start_time_unix_na" +
      "no\030\002 \001(\006\022\026\n\016time_unix_nano\030\003 \001(\006\022\r\n\005coun" +
      "t\030\004 \001(\006\022\013\n\003sum\030\005 \001(\001\022Y\n\017quantile_values\030" +
      "\006 \003(\0132@.opentelemetry.proto.metrics.v1.S" +
      "ummaryDataPoint.ValueAtQuantile\022\r\n\005flags" +
      "\030\010 \001(\r\0322\n\017ValueAtQuantile\022\020\n\010quantile\030\001 " +
      "\001(\001\022\r\n\005value\030\002 \001(\001J\004\010\001\020\002\"\301\001\n\010Exemplar\022D\n" +
      "\023filtered_attributes\030\007 \003(\0132\'.opentelemet" +
      "ry.proto.common.v1.KeyValue\022\026\n\016time_unix" +
      "_nano\030\002 \001(\006\022\023\n\tas_double\030\003 \001(\001H\000\022\020\n\006as_i" +
      "nt\030\006 \001(\020H\000\022\017\n\007span_id\030\004 \001(\014\022\020\n\010trace_id\030" +
      "\005 \001(\014B\007\n\005valueJ\004\010\001\020\002*\214\001\n\026AggregationTemp" +
      "orality\022\'\n#AGGREGATION_TEMPORALITY_UNSPE" +
      "CIFIED\020\000\022!\n\035AGGREGATION_TEMPORALITY_DELT" +
      "A\020\001\022&\n\"AGGREGATION_TEMPORALITY_CUMULATIV" +
      "E\020\002*;\n\016DataPointFlags\022\r\n\tFLAG_NONE\020\000\022\032\n\026" +
      "FLAG_NO_RECORDED_VALUE\020\001B\177\n!io.opentelem" +
      "etry.proto.metrics.v1B\014MetricsProtoP\001Z)g" +
      "o.opentelemetry.io/proto/otlp/metrics/v1" +
      "\252\002\036OpenTelemetry.Proto.Metrics.V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opentelemetry.proto.common.v1.CommonProto.getDescriptor(),
          io.opentelemetry.proto.resource.v1.ResourceProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_metrics_v1_MetricsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_metrics_v1_MetricsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_MetricsData_descriptor,
        new java.lang.String[] { "ResourceMetrics", });
    internal_static_opentelemetry_proto_metrics_v1_ResourceMetrics_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_metrics_v1_ResourceMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_ResourceMetrics_descriptor,
        new java.lang.String[] { "Resource", "ScopeMetrics", "SchemaUrl", });
    internal_static_opentelemetry_proto_metrics_v1_ScopeMetrics_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opentelemetry_proto_metrics_v1_ScopeMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_ScopeMetrics_descriptor,
        new java.lang.String[] { "Scope", "Metrics", "SchemaUrl", });
    internal_static_opentelemetry_proto_metrics_v1_Metric_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opentelemetry_proto_metrics_v1_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_Metric_descriptor,
        new java.lang.String[] { "Name", "Description", "Unit", "Gauge", "Sum", "Histogram", "ExponentialHistogram", "Summary", "Data", });
    internal_static_opentelemetry_proto_metrics_v1_Gauge_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opentelemetry_proto_metrics_v1_Gauge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_Gauge_descriptor,
        new java.lang.String[] { "DataPoints", });
    internal_static_opentelemetry_proto_metrics_v1_Sum_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opentelemetry_proto_metrics_v1_Sum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_Sum_descriptor,
        new java.lang.String[] { "DataPoints", "AggregationTemporality", "IsMonotonic", });
    internal_static_opentelemetry_proto_metrics_v1_Histogram_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opentelemetry_proto_metrics_v1_Histogram_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_Histogram_descriptor,
        new java.lang.String[] { "DataPoints", "AggregationTemporality", });
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogram_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogram_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogram_descriptor,
        new java.lang.String[] { "DataPoints", "AggregationTemporality", });
    internal_static_opentelemetry_proto_metrics_v1_Summary_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opentelemetry_proto_metrics_v1_Summary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_Summary_descriptor,
        new java.lang.String[] { "DataPoints", });
    internal_static_opentelemetry_proto_metrics_v1_NumberDataPoint_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opentelemetry_proto_metrics_v1_NumberDataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_NumberDataPoint_descriptor,
        new java.lang.String[] { "Attributes", "StartTimeUnixNano", "TimeUnixNano", "AsDouble", "AsInt", "Exemplars", "Flags", "Value", });
    internal_static_opentelemetry_proto_metrics_v1_HistogramDataPoint_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opentelemetry_proto_metrics_v1_HistogramDataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_HistogramDataPoint_descriptor,
        new java.lang.String[] { "Attributes", "StartTimeUnixNano", "TimeUnixNano", "Count", "Sum", "BucketCounts", "ExplicitBounds", "Exemplars", "Flags", "Min", "Max", "Sum", "Min", "Max", });
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_descriptor,
        new java.lang.String[] { "Attributes", "StartTimeUnixNano", "TimeUnixNano", "Count", "Sum", "Scale", "ZeroCount", "Positive", "Negative", "Flags", "Exemplars", "Min", "Max", "Sum", "Min", "Max", });
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_Buckets_descriptor =
      internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_descriptor.getNestedTypes().get(0);
    internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_Buckets_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_ExponentialHistogramDataPoint_Buckets_descriptor,
        new java.lang.String[] { "Offset", "BucketCounts", });
    internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_descriptor,
        new java.lang.String[] { "Attributes", "StartTimeUnixNano", "TimeUnixNano", "Count", "Sum", "QuantileValues", "Flags", });
    internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_ValueAtQuantile_descriptor =
      internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_descriptor.getNestedTypes().get(0);
    internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_ValueAtQuantile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_SummaryDataPoint_ValueAtQuantile_descriptor,
        new java.lang.String[] { "Quantile", "Value", });
    internal_static_opentelemetry_proto_metrics_v1_Exemplar_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_opentelemetry_proto_metrics_v1_Exemplar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_metrics_v1_Exemplar_descriptor,
        new java.lang.String[] { "FilteredAttributes", "TimeUnixNano", "AsDouble", "AsInt", "SpanId", "TraceId", "Value", });
    io.opentelemetry.proto.common.v1.CommonProto.getDescriptor();
    io.opentelemetry.proto.resource.v1.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
