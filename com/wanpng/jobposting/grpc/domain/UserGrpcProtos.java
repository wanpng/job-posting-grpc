// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/user.grpc.proto

package com.wanpng.jobposting.grpc.domain;

public final class UserGrpcProtos {
  private UserGrpcProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_UserGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_UserGrpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035protos/domain/user.grpc.proto\022\rprotos." +
      "domain\"=\n\010UserGrpc\022\n\n\002id\030\001 \001(\t\022\022\n\nfirst_" +
      "name\030\002 \001(\t\022\021\n\tlast_name\030\003 \001(\tBe\n!com.wan" +
      "png.jobposting.grpc.domainB\016UserGrpcProt" +
      "osP\001Z.github.com/wanpng/job-posting-grpc" +
      "/grpc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_domain_UserGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_UserGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_UserGrpc_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
