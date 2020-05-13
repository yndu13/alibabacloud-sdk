// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIASRJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIASRJobList")
    @Validation(required = true)
    public ListAIASRJobResponseAIASRJobList AIASRJobList;

    @NameInMap("NonExistAIASRJobIds")
    @Validation(required = true)
    public ListAIASRJobResponseNonExistAIASRJobIds nonExistAIASRJobIds;

    public static ListAIASRJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIASRJobResponse self = new ListAIASRJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIASRJobResponseAIASRJobListAIASRJob extends TeaModel {
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

        public static ListAIASRJobResponseAIASRJobListAIASRJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIASRJobResponseAIASRJobListAIASRJob self = new ListAIASRJobResponseAIASRJobListAIASRJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIASRJobResponseAIASRJobList extends TeaModel {
        @NameInMap("AIASRJob")
        @Validation(required = true)
        public java.util.List<ListAIASRJobResponseAIASRJobListAIASRJob> AIASRJob;

        public static ListAIASRJobResponseAIASRJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIASRJobResponseAIASRJobList self = new ListAIASRJobResponseAIASRJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIASRJobResponseNonExistAIASRJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIASRJobResponseNonExistAIASRJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIASRJobResponseNonExistAIASRJobIds self = new ListAIASRJobResponseNonExistAIASRJobIds();
            return TeaModel.build(map, self);
        }

    }

}
