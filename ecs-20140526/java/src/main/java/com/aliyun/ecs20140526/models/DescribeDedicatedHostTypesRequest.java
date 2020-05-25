// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesRequest extends TeaModel {
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

    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    @NameInMap("SupportedInstanceTypeFamily")
    public String supportedInstanceTypeFamily;

    public static DescribeDedicatedHostTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesRequest self = new DescribeDedicatedHostTypesRequest();
        return TeaModel.build(map, self);
    }

}
