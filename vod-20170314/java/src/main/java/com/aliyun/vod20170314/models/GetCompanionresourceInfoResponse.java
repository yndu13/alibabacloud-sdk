// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCompanionresourceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CompanionResourceInfo")
    @Validation(required = true)
    public GetCompanionresourceInfoResponseCompanionResourceInfo companionResourceInfo;

    public static GetCompanionresourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanionresourceInfoResponse self = new GetCompanionresourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCompanionresourceInfoResponseCompanionResourceInfo extends TeaModel {
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

        public static GetCompanionresourceInfoResponseCompanionResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCompanionresourceInfoResponseCompanionResourceInfo self = new GetCompanionresourceInfoResponseCompanionResourceInfo();
            return TeaModel.build(map, self);
        }

    }

}
