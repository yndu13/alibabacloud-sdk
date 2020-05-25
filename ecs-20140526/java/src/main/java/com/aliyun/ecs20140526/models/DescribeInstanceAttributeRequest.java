// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeRequest self = new DescribeInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
