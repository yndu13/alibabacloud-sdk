// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoSummaryJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoSummaryJob")
    @Validation(required = true)
    public SubmitAIVideoSummaryJobResponseAIVideoSummaryJob AIVideoSummaryJob;

    public static SubmitAIVideoSummaryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoSummaryJobResponse self = new SubmitAIVideoSummaryJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIVideoSummaryJobResponseAIVideoSummaryJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        public static SubmitAIVideoSummaryJobResponseAIVideoSummaryJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoSummaryJobResponseAIVideoSummaryJob self = new SubmitAIVideoSummaryJobResponseAIVideoSummaryJob();
            return TeaModel.build(map, self);
        }

    }

}
