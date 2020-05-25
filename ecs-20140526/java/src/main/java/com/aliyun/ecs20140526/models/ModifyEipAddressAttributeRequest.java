// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyEipAddressAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AllocationId")
    @Validation(required = true)
    public String allocationId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyEipAddressAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipAddressAttributeRequest self = new ModifyEipAddressAttributeRequest();
        return TeaModel.build(map, self);
    }

}
