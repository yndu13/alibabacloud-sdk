// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsRequest extends TeaModel {
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

    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    @NameInMap("EventType")
    @Validation(required = true)
    public String eventType;

    @NameInMap("NotBefore")
    @Validation(required = true)
    public String notBefore;

    public static CreateSimulatedSystemEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulatedSystemEventsRequest self = new CreateSimulatedSystemEventsRequest();
        return TeaModel.build(map, self);
    }

}
