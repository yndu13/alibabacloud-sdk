// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListCompanionresourceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CompanionResourceInfos")
    @Validation(required = true)
    public ListCompanionresourceInfoResponseCompanionResourceInfos companionResourceInfos;

    public static ListCompanionresourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompanionresourceInfoResponse self = new ListCompanionresourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo extends TeaModel {
        @NameInMap("CompanionResourceId")
        @Validation(required = true)
        public String companionResourceId;

        @NameInMap("CompanionResourceType")
        @Validation(required = true)
        public String companionResourceType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("MediaFileUrl")
        @Validation(required = true)
        public String mediaFileUrl;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("ResourceTags")
        @Validation(required = true)
        public String resourceTags;

        @NameInMap("CompanionResourceConfig")
        @Validation(required = true)
        public String companionResourceConfig;

        public static ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo self = new ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class ListCompanionresourceInfoResponseCompanionResourceInfos extends TeaModel {
        @NameInMap("CompanionResourceInfo")
        @Validation(required = true)
        public java.util.List<ListCompanionresourceInfoResponseCompanionResourceInfosCompanionResourceInfo> companionResourceInfo;

        public static ListCompanionresourceInfoResponseCompanionResourceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCompanionresourceInfoResponseCompanionResourceInfos self = new ListCompanionresourceInfoResponseCompanionResourceInfos();
            return TeaModel.build(map, self);
        }

    }

}
