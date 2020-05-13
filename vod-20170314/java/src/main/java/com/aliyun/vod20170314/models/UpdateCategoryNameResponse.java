// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateCategoryNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Category")
    @Validation(required = true)
    public UpdateCategoryNameResponseCategory category;

    public static UpdateCategoryNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryNameResponse self = new UpdateCategoryNameResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateCategoryNameResponseCategory extends TeaModel {
        @NameInMap("CateId")
        @Validation(required = true)
        public String cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("ParentId")
        @Validation(required = true)
        public String parentId;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        public static UpdateCategoryNameResponseCategory build(java.util.Map<String, ?> map) throws Exception {
            UpdateCategoryNameResponseCategory self = new UpdateCategoryNameResponseCategory();
            return TeaModel.build(map, self);
        }

    }

}
