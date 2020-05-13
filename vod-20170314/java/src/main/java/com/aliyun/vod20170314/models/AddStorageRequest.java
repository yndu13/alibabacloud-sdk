// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddStorageRequest extends TeaModel {
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

    @NameInMap("StorageType")
    @Validation(required = true)
    public String storageType;

    @NameInMap("StorageRegion")
    @Validation(required = true)
    public String storageRegion;

    @NameInMap("StorageLocation")
    public String storageLocation;

    public static AddStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStorageRequest self = new AddStorageRequest();
        return TeaModel.build(map, self);
    }

}
