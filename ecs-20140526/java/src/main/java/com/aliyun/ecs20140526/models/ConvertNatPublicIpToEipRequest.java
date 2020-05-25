// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConvertNatPublicIpToEipRequest extends TeaModel {
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

    public static ConvertNatPublicIpToEipRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertNatPublicIpToEipRequest self = new ConvertNatPublicIpToEipRequest();
        return TeaModel.build(map, self);
    }

}
