// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAllCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CategoryList")
    @Validation(required = true)
    public ListAllCategoryResponseCategoryList categoryList;

    public static ListAllCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllCategoryResponse self = new ListAllCategoryResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAllCategoryResponseCategoryListCategory extends TeaModel {
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

        public static ListAllCategoryResponseCategoryListCategory build(java.util.Map<String, ?> map) throws Exception {
            ListAllCategoryResponseCategoryListCategory self = new ListAllCategoryResponseCategoryListCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAllCategoryResponseCategoryList extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public java.util.List<ListAllCategoryResponseCategoryListCategory> category;

        public static ListAllCategoryResponseCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListAllCategoryResponseCategoryList self = new ListAllCategoryResponseCategoryList();
            return TeaModel.build(map, self);
        }

    }

}
