// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskChargeTypeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DiskIds")
    @Validation(required = true)
    public String diskIds;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DiskChargeType")
    public String diskChargeType;

    public static ModifyDiskChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskChargeTypeRequest self = new ModifyDiskChargeTypeRequest();
        return TeaModel.build(map, self);
    }

}
