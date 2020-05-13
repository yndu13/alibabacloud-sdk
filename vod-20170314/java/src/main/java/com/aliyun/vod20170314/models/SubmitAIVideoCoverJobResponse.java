// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCoverJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoCoverJob")
    @Validation(required = true)
    public SubmitAIVideoCoverJobResponseAIVideoCoverJob AIVideoCoverJob;

    public static SubmitAIVideoCoverJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCoverJobResponse self = new SubmitAIVideoCoverJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIVideoCoverJobResponseAIVideoCoverJob extends TeaModel {
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

        public static SubmitAIVideoCoverJobResponseAIVideoCoverJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoCoverJobResponseAIVideoCoverJob self = new SubmitAIVideoCoverJobResponseAIVideoCoverJob();
            return TeaModel.build(map, self);
        }

    }

}
