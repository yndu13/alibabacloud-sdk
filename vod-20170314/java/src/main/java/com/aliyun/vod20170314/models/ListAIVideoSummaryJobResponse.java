// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoSummaryJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoSummaryJobList")
    @Validation(required = true)
    public ListAIVideoSummaryJobResponseAIVideoSummaryJobList AIVideoSummaryJobList;

    @NameInMap("NonExistAIVideoSummaryJobIds")
    @Validation(required = true)
    public ListAIVideoSummaryJobResponseNonExistAIVideoSummaryJobIds nonExistAIVideoSummaryJobIds;

    public static ListAIVideoSummaryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoSummaryJobResponse self = new ListAIVideoSummaryJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIVideoSummaryJobResponseAIVideoSummaryJobListAIVideoSummaryJob extends TeaModel {
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

        public static ListAIVideoSummaryJobResponseAIVideoSummaryJobListAIVideoSummaryJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoSummaryJobResponseAIVideoSummaryJobListAIVideoSummaryJob self = new ListAIVideoSummaryJobResponseAIVideoSummaryJobListAIVideoSummaryJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoSummaryJobResponseAIVideoSummaryJobList extends TeaModel {
        @NameInMap("AIVideoSummaryJob")
        @Validation(required = true)
        public java.util.List<ListAIVideoSummaryJobResponseAIVideoSummaryJobListAIVideoSummaryJob> AIVideoSummaryJob;

        public static ListAIVideoSummaryJobResponseAIVideoSummaryJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoSummaryJobResponseAIVideoSummaryJobList self = new ListAIVideoSummaryJobResponseAIVideoSummaryJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoSummaryJobResponseNonExistAIVideoSummaryJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIVideoSummaryJobResponseNonExistAIVideoSummaryJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoSummaryJobResponseNonExistAIVideoSummaryJobIds self = new ListAIVideoSummaryJobResponseNonExistAIVideoSummaryJobIds();
            return TeaModel.build(map, self);
        }

    }

}
