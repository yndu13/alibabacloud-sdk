// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteWatermarkRelationRequest extends TeaModel {
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

    @NameInMap("WatermarkGroupId")
    @Validation(required = true)
    public String watermarkGroupId;

    @NameInMap("WatermarkIds")
    @Validation(required = true)
    public String watermarkIds;

    public static DeleteWatermarkRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkRelationRequest self = new DeleteWatermarkRelationRequest();
        return TeaModel.build(map, self);
    }

}
