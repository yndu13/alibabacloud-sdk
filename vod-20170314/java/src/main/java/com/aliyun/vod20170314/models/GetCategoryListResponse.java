// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCategoryListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CategoryList")
    @Validation(required = true)
    public GetCategoryListResponseCategoryList categoryList;

    public static GetCategoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryListResponse self = new GetCategoryListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCategoryListResponseCategoryListCategory extends TeaModel {
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

        public static GetCategoryListResponseCategoryListCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseCategoryListCategory self = new GetCategoryListResponseCategoryListCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCategoryListResponseCategoryList extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public java.util.List<GetCategoryListResponseCategoryListCategory> category;

        public static GetCategoryListResponseCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetCategoryListResponseCategoryList self = new GetCategoryListResponseCategoryList();
            return TeaModel.build(map, self);
        }

    }

}
