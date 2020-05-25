// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNewProjectEipMonitorDataRequest extends TeaModel {
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

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeNewProjectEipMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewProjectEipMonitorDataRequest self = new DescribeNewProjectEipMonitorDataRequest();
        return TeaModel.build(map, self);
    }

}
