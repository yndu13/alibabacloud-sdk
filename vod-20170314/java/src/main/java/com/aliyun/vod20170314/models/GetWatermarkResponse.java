// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Watermark")
    @Validation(required = true)
    public GetWatermarkResponseWatermark watermark;

    @NameInMap("WatermarkInfo")
    @Validation(required = true)
    public GetWatermarkResponseWatermarkInfo watermarkInfo;

    public static GetWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponse self = new GetWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class GetWatermarkResponseWatermark extends TeaModel {
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

        @NameInMap("Active")
        @Validation(required = true)
        public String active;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("VideoHeight")
        @Validation(required = true)
        public Integer videoHeight;

        @NameInMap("VideoWidth")
        @Validation(required = true)
        public Integer videoWidth;

        @NameInMap("ScreenMode")
        @Validation(required = true)
        public String screenMode;

        public static GetWatermarkResponseWatermark build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseWatermark self = new GetWatermarkResponseWatermark();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWatermarkResponseWatermarkInfo extends TeaModel {
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

        public static GetWatermarkResponseWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkResponseWatermarkInfo self = new GetWatermarkResponseWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

}
