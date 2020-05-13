// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddCustomTemplateAndGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("Configs")
    public String configs;

    public static AddCustomTemplateAndGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomTemplateAndGroupRequest self = new AddCustomTemplateAndGroupRequest();
        return TeaModel.build(map, self);
    }

}
