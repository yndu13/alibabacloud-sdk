// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoTerrorismRecogJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoTerrorismRecogJobList")
    @Validation(required = true)
    public ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList AIVideoTerrorismRecogJobList;

    @NameInMap("NonExistTerrorismRecogJobIds")
    @Validation(required = true)
    public ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds nonExistTerrorismRecogJobIds;

    public static ListAIVideoTerrorismRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTerrorismRecogJobResponse self = new ListAIVideoTerrorismRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob extends TeaModel {
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

        public static ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob self = new ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList extends TeaModel {
        @NameInMap("AIVideoTerrorismRecogJob")
        @Validation(required = true)
        public java.util.List<ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobListAIVideoTerrorismRecogJob> AIVideoTerrorismRecogJob;

        public static ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList self = new ListAIVideoTerrorismRecogJobResponseAIVideoTerrorismRecogJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds self = new ListAIVideoTerrorismRecogJobResponseNonExistTerrorismRecogJobIds();
            return TeaModel.build(map, self);
        }

    }

}
