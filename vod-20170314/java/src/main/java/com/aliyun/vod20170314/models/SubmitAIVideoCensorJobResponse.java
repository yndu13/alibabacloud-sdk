// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCensorJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoCensorJob")
    @Validation(required = true)
    public SubmitAIVideoCensorJobResponseAIVideoCensorJob AIVideoCensorJob;

    public static SubmitAIVideoCensorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCensorJobResponse self = new SubmitAIVideoCensorJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIVideoCensorJobResponseAIVideoCensorJob extends TeaModel {
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

        public static SubmitAIVideoCensorJobResponseAIVideoCensorJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoCensorJobResponseAIVideoCensorJob self = new SubmitAIVideoCensorJobResponseAIVideoCensorJob();
            return TeaModel.build(map, self);
        }

    }

}
