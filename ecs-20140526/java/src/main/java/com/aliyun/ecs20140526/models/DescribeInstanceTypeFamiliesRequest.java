// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesRequest extends TeaModel {
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

    @NameInMap("Generation")
    public String generation;

    public static DescribeInstanceTypeFamiliesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesRequest self = new DescribeInstanceTypeFamiliesRequest();
        return TeaModel.build(map, self);
    }

}
