// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InvokeCommandRequest extends TeaModel {
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

    @NameInMap("CommandId")
    @Validation(required = true)
    public String commandId;

    @NameInMap("Timed")
    public Boolean timed;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    public static InvokeCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandRequest self = new InvokeCommandRequest();
        return TeaModel.build(map, self);
    }

}
