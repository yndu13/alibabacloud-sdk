// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessBehaviorRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("statusKey")
    @Validation(required = true)
    public String statusKey;

    public static DescribeUserBusinessBehaviorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessBehaviorRequest self = new DescribeUserBusinessBehaviorRequest();
        return TeaModel.build(map, self);
    }

}
