// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateWatermarkInfoRequest extends TeaModel {
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

    @NameInMap("WatermarkId")
    @Validation(required = true)
    public String watermarkId;

    @NameInMap("MediaFileId")
    public String mediaFileId;

    @NameInMap("WatermarkName")
    public String watermarkName;

    public static UpdateWatermarkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkInfoRequest self = new UpdateWatermarkInfoRequest();
        return TeaModel.build(map, self);
    }

}
