// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTerrorismRecogJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoTerrorismRecogJob")
    @Validation(required = true)
    public SubmitAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJob AIVideoTerrorismRecogJob;

    public static SubmitAIVideoTerrorismRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTerrorismRecogJobResponse self = new SubmitAIVideoTerrorismRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJob extends TeaModel {
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

        public static SubmitAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJob self = new SubmitAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJob();
            return TeaModel.build(map, self);
        }

    }

}
