// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("DemandName")
    public String demandName;

    @NameInMap("DemandDescription")
    public String demandDescription;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("Amount")
    @Validation(required = true)
    public Integer amount;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    @Validation(required = true)
    public Integer period;

    @NameInMap("PeriodUnit")
    @Validation(required = true)
    public String periodUnit;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static CreateDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandRequest self = new CreateDemandRequest();
        return TeaModel.build(map, self);
    }

}
