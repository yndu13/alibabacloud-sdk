// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployDedicatedHostRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    public static RedeployDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeployDedicatedHostRequest self = new RedeployDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

}
