// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoCensorJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoCensorJobList")
    @Validation(required = true)
    public ListAIVideoCensorJobResponseAIVideoCensorJobList AIVideoCensorJobList;

    @NameInMap("NonExistAIVideoCensorJobIds")
    @Validation(required = true)
    public ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds nonExistAIVideoCensorJobIds;

    public static ListAIVideoCensorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCensorJobResponse self = new ListAIVideoCensorJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob extends TeaModel {
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

        public static ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob self = new ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoCensorJobResponseAIVideoCensorJobList extends TeaModel {
        @NameInMap("AIVideoCensorJob")
        @Validation(required = true)
        public java.util.List<ListAIVideoCensorJobResponseAIVideoCensorJobListAIVideoCensorJob> AIVideoCensorJob;

        public static ListAIVideoCensorJobResponseAIVideoCensorJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCensorJobResponseAIVideoCensorJobList self = new ListAIVideoCensorJobResponseAIVideoCensorJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds self = new ListAIVideoCensorJobResponseNonExistAIVideoCensorJobIds();
            return TeaModel.build(map, self);
        }

    }

}
