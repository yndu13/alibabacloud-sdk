// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class RefreshWorkFlowRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CustomerId")
    @Validation(required = true)
    public String customerId;

    public static RefreshWorkFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshWorkFlowRequest self = new RefreshWorkFlowRequest();
        return TeaModel.build(map, self);
    }

}
