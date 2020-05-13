// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetStorageACLRequest extends TeaModel {
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

    @NameInMap("StorageLocation")
    @Validation(required = true)
    public String storageLocation;

    @NameInMap("StorageACL")
    @Validation(required = true)
    public String storageACL;

    public static SetStorageACLRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStorageACLRequest self = new SetStorageACLRequest();
        return TeaModel.build(map, self);
    }

}
