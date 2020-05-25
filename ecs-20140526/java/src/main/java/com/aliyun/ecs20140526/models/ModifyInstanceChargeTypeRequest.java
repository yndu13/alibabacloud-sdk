// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("IncludeDataDisks")
    public Boolean includeDataDisks;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("IsDetailFee")
    public Boolean isDetailFee;

    public static ModifyInstanceChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeRequest self = new ModifyInstanceChargeTypeRequest();
        return TeaModel.build(map, self);
    }

}
