// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeJobs")
    @Validation(required = true)
    public SubmitPreprocessJobsResponseTranscodeJobs transcodeJobs;

    public static SubmitPreprocessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsResponse self = new SubmitPreprocessJobsResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob self = new SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob();
            return TeaModel.build(map, self);
        }

    }

    public static class SubmitPreprocessJobsResponseTranscodeJobs extends TeaModel {
        @NameInMap("TranscodeJob")
        @Validation(required = true)
        public java.util.List<SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob> transcodeJob;

        public static SubmitPreprocessJobsResponseTranscodeJobs build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsResponseTranscodeJobs self = new SubmitPreprocessJobsResponseTranscodeJobs();
            return TeaModel.build(map, self);
        }

    }

}
