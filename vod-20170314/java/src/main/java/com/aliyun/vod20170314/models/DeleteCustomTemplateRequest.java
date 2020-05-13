// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("TemplateIds")
    @Validation(required = true)
    public String templateIds;

    public static DeleteCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateRequest self = new DeleteCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

}
