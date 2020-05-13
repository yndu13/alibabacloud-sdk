// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UploadMediaByURLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UploadJobs")
    @Validation(required = true)
    public UploadMediaByURLResponseUploadJobs uploadJobs;

    public static UploadMediaByURLResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLResponse self = new UploadMediaByURLResponse();
        return TeaModel.build(map, self);
    }

    public static class UploadMediaByURLResponseUploadJobsUploadJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("SourceURL")
        @Validation(required = true)
        public String sourceURL;

        public static UploadMediaByURLResponseUploadJobsUploadJob build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLResponseUploadJobsUploadJob self = new UploadMediaByURLResponseUploadJobsUploadJob();
            return TeaModel.build(map, self);
        }

    }

    public static class UploadMediaByURLResponseUploadJobs extends TeaModel {
        @NameInMap("UploadJob")
        @Validation(required = true)
        public java.util.List<UploadMediaByURLResponseUploadJobsUploadJob> uploadJob;

        public static UploadMediaByURLResponseUploadJobs build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLResponseUploadJobs self = new UploadMediaByURLResponseUploadJobs();
            return TeaModel.build(map, self);
        }

    }

}
