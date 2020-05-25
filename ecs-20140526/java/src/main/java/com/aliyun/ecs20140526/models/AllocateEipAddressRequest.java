// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressRequest self = new AllocateEipAddressRequest();
        return TeaModel.build(map, self);
    }

}
