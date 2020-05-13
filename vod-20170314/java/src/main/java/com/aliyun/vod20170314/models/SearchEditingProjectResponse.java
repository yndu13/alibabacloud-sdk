// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("ProjectList")
    @Validation(required = true)
    public SearchEditingProjectResponseProjectList projectList;

    public static SearchEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponse self = new SearchEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchEditingProjectResponseProjectListProject extends TeaModel {
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

        public static SearchEditingProjectResponseProjectListProject build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseProjectListProject self = new SearchEditingProjectResponseProjectListProject();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchEditingProjectResponseProjectList extends TeaModel {
        @NameInMap("Project")
        @Validation(required = true)
        public java.util.List<SearchEditingProjectResponseProjectListProject> project;

        public static SearchEditingProjectResponseProjectList build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseProjectList self = new SearchEditingProjectResponseProjectList();
            return TeaModel.build(map, self);
        }

    }

}
