// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoCoverJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoCoverJobList")
    @Validation(required = true)
    public ListAIVideoCoverJobResponseAIVideoCoverJobList AIVideoCoverJobList;

    @NameInMap("NonExistAIVideoCoverJobIds")
    @Validation(required = true)
    public ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds nonExistAIVideoCoverJobIds;

    public static ListAIVideoCoverJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoCoverJobResponse self = new ListAIVideoCoverJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob extends TeaModel {
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

        public static ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob self = new ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoCoverJobResponseAIVideoCoverJobList extends TeaModel {
        @NameInMap("AIVideoCoverJob")
        @Validation(required = true)
        public java.util.List<ListAIVideoCoverJobResponseAIVideoCoverJobListAIVideoCoverJob> AIVideoCoverJob;

        public static ListAIVideoCoverJobResponseAIVideoCoverJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCoverJobResponseAIVideoCoverJobList self = new ListAIVideoCoverJobResponseAIVideoCoverJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds self = new ListAIVideoCoverJobResponseNonExistAIVideoCoverJobIds();
            return TeaModel.build(map, self);
        }

    }

}
