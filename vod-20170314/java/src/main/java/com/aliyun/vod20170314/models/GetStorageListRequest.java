// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetStorageListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("StorageRegion")
    public String storageRegion;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("StorageStatus")
    public String storageStatus;

    @NameInMap("Division")
    public String division;

    public static GetStorageListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageListRequest self = new GetStorageListRequest();
        return TeaModel.build(map, self);
    }

}
