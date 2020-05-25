// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DedicatedHostIds")
    @Validation(required = true)
    public String dedicatedHostIds;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeDedicatedHostAutoRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAutoRenewRequest self = new DescribeDedicatedHostAutoRenewRequest();
        return TeaModel.build(map, self);
    }

}
