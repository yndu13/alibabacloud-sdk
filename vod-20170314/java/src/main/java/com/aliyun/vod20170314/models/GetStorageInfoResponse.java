// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetStorageInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StorageACL")
    @Validation(required = true)
    public String storageACL;

    @NameInMap("DomainInfoList")
    @Validation(required = true)
    public GetStorageInfoResponseDomainInfoList domainInfoList;

    @NameInMap("Storage")
    @Validation(required = true)
    public GetStorageInfoResponseStorage storage;

    public static GetStorageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageInfoResponse self = new GetStorageInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStorageInfoResponseDomainInfoListDomainInfo extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("DomainStatus")
        @Validation(required = true)
        public String domainStatus;

        @NameInMap("DomainCname")
        @Validation(required = true)
        public String domainCname;

        @NameInMap("DefaultPlay")
        @Validation(required = true)
        public Boolean defaultPlay;

        public static GetStorageInfoResponseDomainInfoListDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStorageInfoResponseDomainInfoListDomainInfo self = new GetStorageInfoResponseDomainInfoListDomainInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStorageInfoResponseDomainInfoList extends TeaModel {
        @NameInMap("DomainInfo")
        @Validation(required = true)
        public java.util.List<GetStorageInfoResponseDomainInfoListDomainInfo> domainInfo;

        public static GetStorageInfoResponseDomainInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageInfoResponseDomainInfoList self = new GetStorageInfoResponseDomainInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStorageInfoResponseStorage extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("StorageUsage")
        @Validation(required = true)
        public Integer storageUsage;

        @NameInMap("DefaultUpload")
        @Validation(required = true)
        public Boolean defaultUpload;

        public static GetStorageInfoResponseStorage build(java.util.Map<String, ?> map) throws Exception {
            GetStorageInfoResponseStorage self = new GetStorageInfoResponseStorage();
            return TeaModel.build(map, self);
        }

    }

}
