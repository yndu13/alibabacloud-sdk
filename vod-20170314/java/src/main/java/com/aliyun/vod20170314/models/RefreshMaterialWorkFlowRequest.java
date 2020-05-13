// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class RefreshMaterialWorkFlowRequest extends TeaModel {
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

    public static RefreshMaterialWorkFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshMaterialWorkFlowRequest self = new RefreshMaterialWorkFlowRequest();
        return TeaModel.build(map, self);
    }

}
