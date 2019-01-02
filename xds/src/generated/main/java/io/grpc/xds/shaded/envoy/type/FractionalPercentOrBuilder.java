// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/percent.proto

package io.grpc.xds.shaded.envoy.type;

public interface FractionalPercentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.type.FractionalPercent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the numerator. Defaults to 0.
   * </pre>
   *
   * <code>uint32 numerator = 1;</code>
   */
  int getNumerator();

  /**
   * <pre>
   * Specifies the denominator. If the denominator specified is less than the numerator, the final
   * fractional percentage is capped at 1 (100%).
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
   */
  int getDenominatorValue();
  /**
   * <pre>
   * Specifies the denominator. If the denominator specified is less than the numerator, the final
   * fractional percentage is capped at 1 (100%).
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
   */
  io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType getDenominator();
}
