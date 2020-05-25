// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Password")
    public String password;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("AutoStartInstance")
    public Boolean autoStartInstance;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    public static ReInitDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskRequest self = new ReInitDiskRequest();
        return TeaModel.build(map, self);
    }

}
