// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPersonalStorageListRequest extends TeaModel {
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

    @NameInMap("StorageRegion")
    public String storageRegion;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("MaxKeys")
    public String maxKeys;

    public static GetPersonalStorageListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalStorageListRequest self = new GetPersonalStorageListRequest();
        return TeaModel.build(map, self);
    }

}
