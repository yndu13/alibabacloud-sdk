// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteTemplateGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    public static DeleteTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateGroupRequest self = new DeleteTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

}
