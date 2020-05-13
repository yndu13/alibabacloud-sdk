// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoCategoryJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoCategoryJobList")
    @Validation(required = true)
    public ListAIVideoCategoryJobResponseAIVideoCategoryJobList AIVideoCategoryJobList;

    @NameInMap("NonExistAIVideoCategoryJobIds")
    @Validation(required = true)
    public ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds nonExistAIVideoCategoryJobIds;

    public static ListAIVideoCategoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCategoryJobResponse self = new ListAIVideoCategoryJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob extends TeaModel {
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

        public static ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob self = new ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoCategoryJobResponseAIVideoCategoryJobList extends TeaModel {
        @NameInMap("AIVideoCategoryJob")
        @Validation(required = true)
        public java.util.List<ListAIVideoCategoryJobResponseAIVideoCategoryJobListAIVideoCategoryJob> AIVideoCategoryJob;

        public static ListAIVideoCategoryJobResponseAIVideoCategoryJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCategoryJobResponseAIVideoCategoryJobList self = new ListAIVideoCategoryJobResponseAIVideoCategoryJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds self = new ListAIVideoCategoryJobResponseNonExistAIVideoCategoryJobIds();
            return TeaModel.build(map, self);
        }

    }

}
