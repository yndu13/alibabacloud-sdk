// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddEditingProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Project")
    @Validation(required = true)
    public AddEditingProjectResponseProject project;

    public static AddEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectResponse self = new AddEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public static class AddEditingProjectResponseProject extends TeaModel {
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

        public static AddEditingProjectResponseProject build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectResponseProject self = new AddEditingProjectResponseProject();
            return TeaModel.build(map, self);
        }

    }

}
