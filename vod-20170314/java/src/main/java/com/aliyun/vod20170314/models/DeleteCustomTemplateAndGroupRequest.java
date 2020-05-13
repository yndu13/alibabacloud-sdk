// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateAndGroupRequest extends TeaModel {
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
    public String userId;

    public static DeleteCustomTemplateAndGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateAndGroupRequest self = new DeleteCustomTemplateAndGroupRequest();
        return TeaModel.build(map, self);
    }

}
