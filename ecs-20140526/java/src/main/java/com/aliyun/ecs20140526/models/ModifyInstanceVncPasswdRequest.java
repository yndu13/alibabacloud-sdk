// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswdRequest extends TeaModel {
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

    @NameInMap("VncPassword")
    @Validation(required = true)
    public String vncPassword;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyInstanceVncPasswdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswdRequest self = new ModifyInstanceVncPasswdRequest();
        return TeaModel.build(map, self);
    }

}
