// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPersonalStorageListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StorageInfoList")
    @Validation(required = true)
    public GetPersonalStorageListResponseStorageInfoList storageInfoList;

    public static GetPersonalStorageListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalStorageListResponse self = new GetPersonalStorageListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetPersonalStorageListResponseStorageInfoListStorageInfo extends TeaModel {
        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public Long ownerId;

        @NameInMap("StorageClass")
        @Validation(required = true)
        public String storageClass;

        @NameInMap("ExtranetEndpoint")
        @Validation(required = true)
        public String extranetEndpoint;

        @NameInMap("IntranetEndpoint")
        @Validation(required = true)
        public String intranetEndpoint;

        @NameInMap("StorageACL")
        @Validation(required = true)
        public String storageACL;

        public static GetPersonalStorageListResponseStorageInfoListStorageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPersonalStorageListResponseStorageInfoListStorageInfo self = new GetPersonalStorageListResponseStorageInfoListStorageInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPersonalStorageListResponseStorageInfoList extends TeaModel {
        @NameInMap("StorageInfo")
        @Validation(required = true)
        public java.util.List<GetPersonalStorageListResponseStorageInfoListStorageInfo> storageInfo;

        public static GetPersonalStorageListResponseStorageInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonalStorageListResponseStorageInfoList self = new GetPersonalStorageListResponseStorageInfoList();
            return TeaModel.build(map, self);
        }

    }

}
