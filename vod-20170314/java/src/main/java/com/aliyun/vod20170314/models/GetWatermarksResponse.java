// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Watermarks")
    @Validation(required = true)
    public GetWatermarksResponseWatermarks watermarks;

    @NameInMap("WatermarkInfos")
    @Validation(required = true)
    public GetWatermarksResponseWatermarkInfos watermarkInfos;

    public static GetWatermarksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarksResponse self = new GetWatermarksResponse();
        return TeaModel.build(map, self);
    }

    public static class GetWatermarksResponseWatermarksWatermark extends TeaModel {
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

        public static GetWatermarksResponseWatermarksWatermark build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksResponseWatermarksWatermark self = new GetWatermarksResponseWatermarksWatermark();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWatermarksResponseWatermarks extends TeaModel {
        @NameInMap("Watermark")
        @Validation(required = true)
        public java.util.List<GetWatermarksResponseWatermarksWatermark> watermark;

        public static GetWatermarksResponseWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksResponseWatermarks self = new GetWatermarksResponseWatermarks();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWatermarksResponseWatermarkInfosWatermarkInfo extends TeaModel {
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

        public static GetWatermarksResponseWatermarkInfosWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksResponseWatermarkInfosWatermarkInfo self = new GetWatermarksResponseWatermarkInfosWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWatermarksResponseWatermarkInfos extends TeaModel {
        @NameInMap("WatermarkInfo")
        @Validation(required = true)
        public java.util.List<GetWatermarksResponseWatermarkInfosWatermarkInfo> watermarkInfo;

        public static GetWatermarksResponseWatermarkInfos build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarksResponseWatermarkInfos self = new GetWatermarksResponseWatermarkInfos();
            return TeaModel.build(map, self);
        }

    }

}
