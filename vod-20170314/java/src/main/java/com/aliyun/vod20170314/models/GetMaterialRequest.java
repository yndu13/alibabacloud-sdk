// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMaterialRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MaterialId")
    @Validation(required = true)
    public String materialId;

    public static GetMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialRequest self = new GetMaterialRequest();
        return TeaModel.build(map, self);
    }

}
