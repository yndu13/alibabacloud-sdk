// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesRequest extends TeaModel {
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

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ReservedInstanceId")
    public java.util.List<String> reservedInstanceId;

    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("AllocationType")
    public String allocationType;

    public static DescribeReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesRequest self = new DescribeReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

}
