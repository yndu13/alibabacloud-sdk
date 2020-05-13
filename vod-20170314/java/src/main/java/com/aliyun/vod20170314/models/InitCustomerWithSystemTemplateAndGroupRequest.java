// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class InitCustomerWithSystemTemplateAndGroupRequest extends TeaModel {
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

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("WorkFlowId")
    public String workFlowId;

    public static InitCustomerWithSystemTemplateAndGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCustomerWithSystemTemplateAndGroupRequest self = new InitCustomerWithSystemTemplateAndGroupRequest();
        return TeaModel.build(map, self);
    }

}
