// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class SearchImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("Auctions")
    @Validation(required = true)
    public java.util.List<SearchImageResponseBodyAuctions> auctions;

    @NameInMap("Head")
    @Validation(required = true)
    public SearchImageResponseBodyHead head;

    @NameInMap("PicInfo")
    @Validation(required = true)
    public SearchImageResponseBodyPicInfo picInfo;

    public static SearchImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponseBody self = new SearchImageResponseBody();
        return TeaModel.build(map, self);
    }

    public static class SearchImageResponseBodyAuctions extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("ProductId")
        @Validation(required = true)
        public String productId;

        @NameInMap("PicName")
        @Validation(required = true)
        public String picName;

        @NameInMap("CustomContent")
        @Validation(required = true)
        public String customContent;

        @NameInMap("SortExprValues")
        @Validation(required = true)
        public String sortExprValues;

        @NameInMap("IntAttr")
        @Validation(required = true)
        public Integer intAttr;

        @NameInMap("StrAttr")
        @Validation(required = true)
        public String strAttr;

        public static SearchImageResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyAuctions self = new SearchImageResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchImageResponseBodyHead extends TeaModel {
        @NameInMap("DocsReturn")
        @Validation(required = true)
        public Integer docsReturn;

        @NameInMap("DocsFound")
        @Validation(required = true)
        public Integer docsFound;

        @NameInMap("SearchTime")
        @Validation(required = true)
        public Integer searchTime;

        public static SearchImageResponseBodyHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyHead self = new SearchImageResponseBodyHead();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchImageResponseBodyPicInfoAllCategories extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static SearchImageResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyPicInfoAllCategories self = new SearchImageResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchImageResponseBodyPicInfo extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AllCategories")
        @Validation(required = true)
        public java.util.List<SearchImageResponseBodyPicInfoAllCategories> allCategories;

        public static SearchImageResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyPicInfo self = new SearchImageResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

    }

}
