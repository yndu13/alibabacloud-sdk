// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddWatermarkInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WatermarkType")
    @Validation(required = true)
    public String watermarkType;

    @NameInMap("WatermarkConfig")
    @Validation(required = true)
    public String watermarkConfig;

    @NameInMap("WatermarkName")
    public String watermarkName;

    @NameInMap("MediaFileId")
    public String mediaFileId;

    public static AddWatermarkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkInfoRequest self = new AddWatermarkInfoRequest();
        return TeaModel.build(map, self);
    }

}
