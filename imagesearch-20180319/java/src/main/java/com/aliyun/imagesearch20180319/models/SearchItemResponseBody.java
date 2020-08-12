// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180319.models;

import com.aliyun.tea.*;

public class SearchItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Auctions")
    @Validation(required = true)
    public SearchItemResponseBodyAuctions auctions;

    @NameInMap("Head")
    @Validation(required = true)
    public SearchItemResponseBodyHead head;

    @NameInMap("PicInfo")
    @Validation(required = true)
    public SearchItemResponseBodyPicInfo picInfo;

    public static SearchItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchItemResponseBody self = new SearchItemResponseBody();
        return TeaModel.build(map, self);
    }

    public static class SearchItemResponseBodyAuctionsAuction extends TeaModel {
        @NameInMap("CustContent")
        @Validation(required = true)
        public String custContent;

        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("SortExprValues")
        @Validation(required = true)
        public String sortExprValues;

        @NameInMap("CatId")
        @Validation(required = true)
        public String catId;

        @NameInMap("PicName")
        @Validation(required = true)
        public String picName;

        public static SearchItemResponseBodyAuctionsAuction build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyAuctionsAuction self = new SearchItemResponseBodyAuctionsAuction();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchItemResponseBodyAuctions extends TeaModel {
        @NameInMap("Auction")
        @Validation(required = true)
        public java.util.List<SearchItemResponseBodyAuctionsAuction> auction;

        public static SearchItemResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyAuctions self = new SearchItemResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchItemResponseBodyHead extends TeaModel {
        @NameInMap("SearchTime")
        @Validation(required = true)
        public Integer searchTime;

        @NameInMap("DocsFound")
        @Validation(required = true)
        public Integer docsFound;

        @NameInMap("DocsReturn")
        @Validation(required = true)
        public Integer docsReturn;

        public static SearchItemResponseBodyHead build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyHead self = new SearchItemResponseBodyHead();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchItemResponseBodyPicInfoAllCategoryCategory extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static SearchItemResponseBodyPicInfoAllCategoryCategory build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyPicInfoAllCategoryCategory self = new SearchItemResponseBodyPicInfoAllCategoryCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchItemResponseBodyPicInfoAllCategory extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public java.util.List<SearchItemResponseBodyPicInfoAllCategoryCategory> category;

        public static SearchItemResponseBodyPicInfoAllCategory build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyPicInfoAllCategory self = new SearchItemResponseBodyPicInfoAllCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchItemResponseBodyPicInfo extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AllCategory")
        @Validation(required = true)
        public SearchItemResponseBodyPicInfoAllCategory allCategory;

        public static SearchItemResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchItemResponseBodyPicInfo self = new SearchItemResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

    }

}
