// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("CidrBlock")
    @Validation(required = true)
    public String cidrBlock;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchName")
    public String VSwitchName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CreateVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchRequest self = new CreateVSwitchRequest();
        return TeaModel.build(map, self);
    }

}
