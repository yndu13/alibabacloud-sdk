// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Project")
    @Validation(required = true)
    public GetEditingProjectResponseProject project;

    public static GetEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectResponse self = new GetEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public static class GetEditingProjectResponseProject extends TeaModel {
        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public String customerId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Timeline")
        @Validation(required = true)
        public String timeline;

        @NameInMap("ProducedMediaId")
        @Validation(required = true)
        public String producedMediaId;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("CoverUrl")
        @Validation(required = true)
        public String coverUrl;

        public static GetEditingProjectResponseProject build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectResponseProject self = new GetEditingProjectResponseProject();
            return TeaModel.build(map, self);
        }

    }

}
