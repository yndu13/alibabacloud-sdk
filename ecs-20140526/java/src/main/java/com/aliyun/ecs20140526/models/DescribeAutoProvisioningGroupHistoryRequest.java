// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryRequest extends TeaModel {
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

    @NameInMap("AutoProvisioningGroupId")
    @Validation(required = true)
    public String autoProvisioningGroupId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeAutoProvisioningGroupHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupHistoryRequest self = new DescribeAutoProvisioningGroupHistoryRequest();
        return TeaModel.build(map, self);
    }

}
