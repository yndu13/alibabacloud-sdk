// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIVideoPornRecogJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoPornRecogJobList")
    @Validation(required = true)
    public ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList AIVideoPornRecogJobList;

    @NameInMap("NonExistPornRecogJobIds")
    @Validation(required = true)
    public ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds nonExistPornRecogJobIds;

    public static ListAIVideoPornRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoPornRecogJobResponse self = new ListAIVideoPornRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob extends TeaModel {
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

        public static ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob self = new ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList extends TeaModel {
        @NameInMap("AIVideoPornRecogJob")
        @Validation(required = true)
        public java.util.List<ListAIVideoPornRecogJobResponseAIVideoPornRecogJobListAIVideoPornRecogJob> AIVideoPornRecogJob;

        public static ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList self = new ListAIVideoPornRecogJobResponseAIVideoPornRecogJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds self = new ListAIVideoPornRecogJobResponseNonExistPornRecogJobIds();
            return TeaModel.build(map, self);
        }

    }

}
