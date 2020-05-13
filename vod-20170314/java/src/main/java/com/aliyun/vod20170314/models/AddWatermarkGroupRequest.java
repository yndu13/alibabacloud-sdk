// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddWatermarkGroupRequest extends TeaModel {
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

    @NameInMap("WatermarkGroupName")
    @Validation(required = true)
    public String watermarkGroupName;

    public static AddWatermarkGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkGroupRequest self = new AddWatermarkGroupRequest();
        return TeaModel.build(map, self);
    }

}
