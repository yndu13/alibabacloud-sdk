// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarkGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("WatermarkGroupList")
    @Validation(required = true)
    public GetWatermarkGroupResponseWatermarkGroupList watermarkGroupList;

    public static GetWatermarkGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkGroupResponse self = new GetWatermarkGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup extends TeaModel {
        @NameInMap("WatermarkId")
        @Validation(required = true)
        public String watermarkId;

        @NameInMap("WatermarkGroupId")
        @Validation(required = true)
        public String watermarkGroupId;

        @NameInMap("WatermarkFileURL")
        @Validation(required = true)
        public String watermarkFileURL;

        @NameInMap("WatermarkType")
        @Validation(required = true)
        public String watermarkType;

        @NameInMap("WatermarkConfig")
        @Validation(required = true)
        public String watermarkConfig;

        public static GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup self = new GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWatermarkGroupResponseWatermarkGroupList extends TeaModel {
        @NameInMap("WatermarkGroup")
        @Validation(required = true)
        public java.util.List<GetWatermarkGroupResponseWatermarkGroupListWatermarkGroup> watermarkGroup;

        public static GetWatermarkGroupResponseWatermarkGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkGroupResponseWatermarkGroupList self = new GetWatermarkGroupResponseWatermarkGroupList();
            return TeaModel.build(map, self);
        }

    }

}
