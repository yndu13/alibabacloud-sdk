// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMaterialStatusRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("MaterialIds")
    @Validation(required = true)
    public String materialIds;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static UpdateMaterialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialStatusRequest self = new UpdateMaterialStatusRequest();
        return TeaModel.build(map, self);
    }

}
