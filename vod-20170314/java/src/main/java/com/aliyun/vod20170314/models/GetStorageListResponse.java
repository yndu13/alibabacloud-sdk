// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetStorageListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("StorageList")
    @Validation(required = true)
    public GetStorageListResponseStorageList storageList;

    public static GetStorageListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageListResponse self = new GetStorageListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStorageListResponseStorageListStorage extends TeaModel {
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

        public static GetStorageListResponseStorageListStorage build(java.util.Map<String, ?> map) throws Exception {
            GetStorageListResponseStorageListStorage self = new GetStorageListResponseStorageListStorage();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStorageListResponseStorageList extends TeaModel {
        @NameInMap("Storage")
        @Validation(required = true)
        public java.util.List<GetStorageListResponseStorageListStorage> storage;

        public static GetStorageListResponseStorageList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageListResponseStorageList self = new GetStorageListResponseStorageList();
            return TeaModel.build(map, self);
        }

    }

}
