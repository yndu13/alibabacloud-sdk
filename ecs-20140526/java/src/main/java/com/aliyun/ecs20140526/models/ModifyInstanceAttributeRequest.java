// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Recyclable")
    public Boolean recyclable;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

}
