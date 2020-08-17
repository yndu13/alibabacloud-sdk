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

    public SearchItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchItemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchItemResponseBody setAuctions(SearchItemResponseBodyAuctions auctions) {
        this.auctions = auctions;
        return this;
    }
    public SearchItemResponseBodyAuctions getAuctions() {
        return this.auctions;
    }

    public SearchItemResponseBody setHead(SearchItemResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchItemResponseBodyHead getHead() {
        return this.head;
    }

    public SearchItemResponseBody setPicInfo(SearchItemResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchItemResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
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

        public SearchItemResponseBodyAuctionsAuction setCustContent(String custContent) {
            this.custContent = custContent;
            return this;
        }
        public String getCustContent() {
            return this.custContent;
        }

        public SearchItemResponseBodyAuctionsAuction setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SearchItemResponseBodyAuctionsAuction setSortExprValues(String sortExprValues) {
            this.sortExprValues = sortExprValues;
            return this;
        }
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        public SearchItemResponseBodyAuctionsAuction setCatId(String catId) {
            this.catId = catId;
            return this;
        }
        public String getCatId() {
            return this.catId;
        }

        public SearchItemResponseBodyAuctionsAuction setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
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

        public SearchItemResponseBodyAuctions setAuction(java.util.List<SearchItemResponseBodyAuctionsAuction> auction) {
            this.auction = auction;
            return this;
        }
        public java.util.List<SearchItemResponseBodyAuctionsAuction> getAuction() {
            return this.auction;
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

        public SearchItemResponseBodyHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

        public SearchItemResponseBodyHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchItemResponseBodyHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
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

        public SearchItemResponseBodyPicInfoAllCategoryCategory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchItemResponseBodyPicInfoAllCategoryCategory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

        public SearchItemResponseBodyPicInfoAllCategory setCategory(java.util.List<SearchItemResponseBodyPicInfoAllCategoryCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<SearchItemResponseBodyPicInfoAllCategoryCategory> getCategory() {
            return this.category;
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

        public SearchItemResponseBodyPicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchItemResponseBodyPicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchItemResponseBodyPicInfo setAllCategory(SearchItemResponseBodyPicInfoAllCategory allCategory) {
            this.allCategory = allCategory;
            return this;
        }
        public SearchItemResponseBodyPicInfoAllCategory getAllCategory() {
            return this.allCategory;
        }

    }

}
