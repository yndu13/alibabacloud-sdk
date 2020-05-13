// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class InitSystemTemplateGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    public static InitSystemTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSystemTemplateGroupRequest self = new InitSystemTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
