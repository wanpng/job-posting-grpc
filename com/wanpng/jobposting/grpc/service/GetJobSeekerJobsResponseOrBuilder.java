// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/job_posting_service.grpc.proto

package com.wanpng.jobposting.grpc.service;

public interface GetJobSeekerJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.service.GetJobSeekerJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  java.util.List<com.wanpng.jobposting.grpc.service.Job> 
      getHiddenJobsList();
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  com.wanpng.jobposting.grpc.service.Job getHiddenJobs(int index);
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  int getHiddenJobsCount();
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  java.util.List<? extends com.wanpng.jobposting.grpc.service.JobOrBuilder> 
      getHiddenJobsOrBuilderList();
  /**
   * <code>repeated .protos.service.Job hiddenJobs = 1;</code>
   */
  com.wanpng.jobposting.grpc.service.JobOrBuilder getHiddenJobsOrBuilder(
      int index);

  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  java.util.List<com.wanpng.jobposting.grpc.service.Job> 
      getSavedJobsList();
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  com.wanpng.jobposting.grpc.service.Job getSavedJobs(int index);
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  int getSavedJobsCount();
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  java.util.List<? extends com.wanpng.jobposting.grpc.service.JobOrBuilder> 
      getSavedJobsOrBuilderList();
  /**
   * <code>repeated .protos.service.Job savedJobs = 2;</code>
   */
  com.wanpng.jobposting.grpc.service.JobOrBuilder getSavedJobsOrBuilder(
      int index);
}