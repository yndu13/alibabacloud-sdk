// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddPipelineRequest extends TeaModel {
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

    public static AddPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineRequest self = new AddPipelineRequest();
        return TeaModel.build(map, self);
    }

}
