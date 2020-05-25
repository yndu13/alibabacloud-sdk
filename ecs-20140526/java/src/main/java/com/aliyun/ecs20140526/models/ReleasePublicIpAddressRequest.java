// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleasePublicIpAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PublicIpAddress")
    @Validation(required = true)
    public String publicIpAddress;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ReleasePublicIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicIpAddressRequest self = new ReleasePublicIpAddressRequest();
        return TeaModel.build(map, self);
    }

}
