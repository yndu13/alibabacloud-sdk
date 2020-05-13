// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarkInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WatermarkId")
    @Validation(required = true)
    public String watermarkId;

    public static GetWatermarkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkInfoRequest self = new GetWatermarkInfoRequest();
        return TeaModel.build(map, self);
    }

}
