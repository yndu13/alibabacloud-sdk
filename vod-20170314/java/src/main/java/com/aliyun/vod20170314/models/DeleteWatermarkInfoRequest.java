// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteWatermarkInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WatermarkIds")
    @Validation(required = true)
    public String watermarkIds;

    @NameInMap("DelEmptyGroup")
    public String delEmptyGroup;

    public static DeleteWatermarkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkInfoRequest self = new DeleteWatermarkInfoRequest();
        return TeaModel.build(map, self);
    }

}
