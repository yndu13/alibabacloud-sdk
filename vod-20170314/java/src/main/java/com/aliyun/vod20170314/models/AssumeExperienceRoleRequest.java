// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AssumeExperienceRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Cookie")
    public String cookie;

    public static AssumeExperienceRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeExperienceRoleRequest self = new AssumeExperienceRoleRequest();
        return TeaModel.build(map, self);
    }

}
