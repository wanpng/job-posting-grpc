// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/candidateskills.grpc.proto

package com.wanpng.jobposting.grpc.domain;

public interface CandidateSkillsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.domain.CandidateSkills)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated .protos.domain.CandidateSkill skills = 2;</code>
   */
  java.util.List<com.wanpng.jobposting.grpc.domain.CandidateSkill> 
      getSkillsList();
  /**
   * <code>repeated .protos.domain.CandidateSkill skills = 2;</code>
   */
  com.wanpng.jobposting.grpc.domain.CandidateSkill getSkills(int index);
  /**
   * <code>repeated .protos.domain.CandidateSkill skills = 2;</code>
   */
  int getSkillsCount();
  /**
   * <code>repeated .protos.domain.CandidateSkill skills = 2;</code>
   */
  java.util.List<? extends com.wanpng.jobposting.grpc.domain.CandidateSkillOrBuilder> 
      getSkillsOrBuilderList();
  /**
   * <code>repeated .protos.domain.CandidateSkill skills = 2;</code>
   */
  com.wanpng.jobposting.grpc.domain.CandidateSkillOrBuilder getSkillsOrBuilder(
      int index);
}