// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Watermark")
    @Validation(required = true)
    public UpdateWatermarkResponseWatermark watermark;

    @NameInMap("WatermarkInfo")
    @Validation(required = true)
    public UpdateWatermarkResponseWatermarkInfo watermarkInfo;

    public static UpdateWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkResponse self = new UpdateWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateWatermarkResponseWatermark extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public Integer createTime;

        @NameInMap("HorizontalOffset")
        @Validation(required = true)
        public String horizontalOffset;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        @NameInMap("Position")
        @Validation(required = true)
        public String position;

        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("VerticalOffset")
        @Validation(required = true)
        public String verticalOffset;

        @NameInMap("Width")
        @Validation(required = true)
        public String width;

        @NameInMap("Height")
        @Validation(required = true)
        public String height;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("VideoHeight")
        @Validation(required = true)
        public Integer videoHeight;

        @NameInMap("VideoWidth")
        @Validation(required = true)
        public Integer videoWidth;

        @NameInMap("ScreenMode")
        @Validation(required = true)
        public String screenMode;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static UpdateWatermarkResponseWatermark build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkResponseWatermark self = new UpdateWatermarkResponseWatermark();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateWatermarkResponseWatermarkInfo extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("ScreenWidth")
        @Validation(required = true)
        public Integer screenWidth;

        @NameInMap("ScreenHeight")
        @Validation(required = true)
        public Integer screenHeight;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("WatermarkConfig")
        @Validation(required = true)
        public String watermarkConfig;

        public static UpdateWatermarkResponseWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateWatermarkResponseWatermarkInfo self = new UpdateWatermarkResponseWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

}
