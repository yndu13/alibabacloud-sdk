// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetEditingProjectListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProjectList")
    @Validation(required = true)
    public GetEditingProjectListResponseProjectList projectList;

    public static GetEditingProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectListResponse self = new GetEditingProjectListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetEditingProjectListResponseProjectListProject extends TeaModel {
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

        @NameInMap("ProducedMediaId")
        @Validation(required = true)
        public String producedMediaId;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("CoverUrl")
        @Validation(required = true)
        public String coverUrl;

        public static GetEditingProjectListResponseProjectListProject build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectListResponseProjectListProject self = new GetEditingProjectListResponseProjectListProject();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectListResponseProjectList extends TeaModel {
        @NameInMap("Project")
        @Validation(required = true)
        public java.util.List<GetEditingProjectListResponseProjectListProject> project;

        public static GetEditingProjectListResponseProjectList build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectListResponseProjectList self = new GetEditingProjectListResponseProjectList();
            return TeaModel.build(map, self);
        }

    }

}
