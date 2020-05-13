// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class InitCustomerWorkFlowRequest extends TeaModel {
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

    @NameInMap("FlushConfig")
    public Boolean flushConfig;

    public static InitCustomerWorkFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCustomerWorkFlowRequest self = new InitCustomerWorkFlowRequest();
        return TeaModel.build(map, self);
    }

}
