// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SubmitAIVideoCategoryJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoCategoryJob")
    @Validation(required = true)
    public SubmitAIVideoCategoryJobResponseAIVideoCategoryJob AIVideoCategoryJob;

    public static SubmitAIVideoCategoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoCategoryJobResponse self = new SubmitAIVideoCategoryJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIVideoCategoryJobResponseAIVideoCategoryJob extends TeaModel {
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

        public static SubmitAIVideoCategoryJobResponseAIVideoCategoryJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIVideoCategoryJobResponseAIVideoCategoryJob self = new SubmitAIVideoCategoryJobResponseAIVideoCategoryJob();
            return TeaModel.build(map, self);
        }

    }

}
