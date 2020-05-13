// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarkInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WatermarkInfo")
    @Validation(required = true)
    public GetWatermarkInfoResponseWatermarkInfo watermarkInfo;

    public static GetWatermarkInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkInfoResponse self = new GetWatermarkInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetWatermarkInfoResponseWatermarkInfo extends TeaModel {
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

        public static GetWatermarkInfoResponseWatermarkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkInfoResponseWatermarkInfo self = new GetWatermarkInfoResponseWatermarkInfo();
            return TeaModel.build(map, self);
        }

    }

}
