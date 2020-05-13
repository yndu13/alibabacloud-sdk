// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateWatermarkRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("HorizontalOffet")
    public String horizontalOffet;

    @NameInMap("HorizontalOffset")
    public String horizontalOffset;

    @NameInMap("VerticalOffset")
    public String verticalOffset;

    @NameInMap("Position")
    public String position;

    @NameInMap("Type")
    public String type;

    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Object")
    public String object;

    @NameInMap("Name")
    public String name;

    @NameInMap("Width")
    public String width;

    @NameInMap("Height")
    public String height;

    @NameInMap("WatermarkId")
    public String watermarkId;

    @NameInMap("ScreenMode")
    public String screenMode;

    @NameInMap("VideoWidth")
    public Integer videoWidth;

    @NameInMap("VideoHeight")
    public Integer videoHeight;

    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ScreenWidth")
    public Integer screenWidth;

    @NameInMap("ScreenHeight")
    public Integer screenHeight;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static UpdateWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkRequest self = new UpdateWatermarkRequest();
        return TeaModel.build(map, self);
    }

}
