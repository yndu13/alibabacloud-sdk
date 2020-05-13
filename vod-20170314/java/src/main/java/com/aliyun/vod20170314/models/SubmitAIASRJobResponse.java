// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIASRJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIASRJob")
    @Validation(required = true)
    public SubmitAIASRJobResponseAIASRJob AIASRJob;

    public static SubmitAIASRJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIASRJobResponse self = new SubmitAIASRJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIASRJobResponseAIASRJob extends TeaModel {
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

        public static SubmitAIASRJobResponseAIASRJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIASRJobResponseAIASRJob self = new SubmitAIASRJobResponseAIASRJob();
            return TeaModel.build(map, self);
        }

    }

}
