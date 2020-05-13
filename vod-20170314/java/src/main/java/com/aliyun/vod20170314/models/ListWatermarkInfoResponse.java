// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListWatermarkInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WatermarkInfos")
    @Validation(required = true)
    public ListWatermarkInfoResponseWatermarkInfos watermarkInfos;

    public static ListWatermarkInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkInfoResponse self = new ListWatermarkInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class ListWatermarkInfoResponseWatermarkInfosWatermarkInfo extends TeaModel {
        @NameInMap("WatermarkConfig")
        @Validation(required = true)
        public String watermarkConfig;

        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("WatermarkType")
        @Validation(required = true)
        public String watermarkType;

        @NameInMap("WatermarkName")
        @Validation(required = true)
        public String watermarkName;

        @NameInMap("WatermarkFileUrl")
        @Validation(required = true)
        public String watermarkFileUrl;

        public static ListWatermarkInfoResponseWatermarkInfosWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarkInfoResponseWatermarkInfosWatermarkInfo self = new ListWatermarkInfoResponseWatermarkInfosWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class ListWatermarkInfoResponseWatermarkInfos extends TeaModel {
        @NameInMap("WatermarkInfo")
        @Validation(required = true)
        public java.util.List<ListWatermarkInfoResponseWatermarkInfosWatermarkInfo> watermarkInfo;

        public static ListWatermarkInfoResponseWatermarkInfos build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarkInfoResponseWatermarkInfos self = new ListWatermarkInfoResponseWatermarkInfos();
            return TeaModel.build(map, self);
        }

    }

}
