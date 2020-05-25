// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
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

    @NameInMap("ForwardTableId")
    @Validation(required = true)
    public String forwardTableId;

    @NameInMap("ExternalIp")
    @Validation(required = true)
    public String externalIp;

    @NameInMap("ExternalPort")
    @Validation(required = true)
    public String externalPort;

    @NameInMap("InternalIp")
    @Validation(required = true)
    public String internalIp;

    @NameInMap("InternalPort")
    @Validation(required = true)
    public String internalPort;

    @NameInMap("IpProtocol")
    @Validation(required = true)
    public String ipProtocol;

    public static CreateForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryRequest self = new CreateForwardEntryRequest();
        return TeaModel.build(map, self);
    }

}
