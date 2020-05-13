// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Watermark")
    @Validation(required = true)
    public AddWatermarkResponseWatermark watermark;

    @NameInMap("WatermarkInfo")
    @Validation(required = true)
    public AddWatermarkResponseWatermarkInfo watermarkInfo;

    public static AddWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkResponse self = new AddWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class AddWatermarkResponseWatermark extends TeaModel {
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

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

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

        public static AddWatermarkResponseWatermark build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkResponseWatermark self = new AddWatermarkResponseWatermark();
            return TeaModel.build(map, self);
        }

    }

    public static class AddWatermarkResponseWatermarkInfo extends TeaModel {
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

        public static AddWatermarkResponseWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            AddWatermarkResponseWatermarkInfo self = new AddWatermarkResponseWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

}
