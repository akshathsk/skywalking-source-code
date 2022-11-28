// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.data.accesslog.v3;

public interface TCPAccessLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.data.accesslog.v3.TCPAccessLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Common properties shared by all Envoy access logs.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.AccessLogCommon common_properties = 1;</code>
   * @return Whether the commonProperties field is set.
   */
  boolean hasCommonProperties();
  /**
   * <pre>
   * Common properties shared by all Envoy access logs.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.AccessLogCommon common_properties = 1;</code>
   * @return The commonProperties.
   */
  io.envoyproxy.envoy.data.accesslog.v3.AccessLogCommon getCommonProperties();
  /**
   * <pre>
   * Common properties shared by all Envoy access logs.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.AccessLogCommon common_properties = 1;</code>
   */
  io.envoyproxy.envoy.data.accesslog.v3.AccessLogCommonOrBuilder getCommonPropertiesOrBuilder();

  /**
   * <pre>
   * Properties of the TCP connection.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.ConnectionProperties connection_properties = 2;</code>
   * @return Whether the connectionProperties field is set.
   */
  boolean hasConnectionProperties();
  /**
   * <pre>
   * Properties of the TCP connection.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.ConnectionProperties connection_properties = 2;</code>
   * @return The connectionProperties.
   */
  io.envoyproxy.envoy.data.accesslog.v3.ConnectionProperties getConnectionProperties();
  /**
   * <pre>
   * Properties of the TCP connection.
   * </pre>
   *
   * <code>.envoy.data.accesslog.v3.ConnectionProperties connection_properties = 2;</code>
   */
  io.envoyproxy.envoy.data.accesslog.v3.ConnectionPropertiesOrBuilder getConnectionPropertiesOrBuilder();
}
