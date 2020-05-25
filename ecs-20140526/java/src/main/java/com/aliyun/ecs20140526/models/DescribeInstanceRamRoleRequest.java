// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceRamRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    public static DescribeInstanceRamRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRamRoleRequest self = new DescribeInstanceRamRoleRequest();
        return TeaModel.build(map, self);
    }

}
