// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoPornRecogJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoPornRecogJob")
    @Validation(required = true)
    public SubmitAIVideoPornRecogJobResponseAIVideoPornRecogJob AIVideoPornRecogJob;

    public static SubmitAIVideoPornRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoPornRecogJobResponse self = new SubmitAIVideoPornRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIVideoPornRecogJobResponseAIVideoPornRecogJob extends TeaModel {
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

        public static SubmitAIVideoPornRecogJobResponseAIVideoPornRecogJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoPornRecogJobResponseAIVideoPornRecogJob self = new SubmitAIVideoPornRecogJobResponseAIVideoPornRecogJob();
            return TeaModel.build(map, self);
        }

    }

}
