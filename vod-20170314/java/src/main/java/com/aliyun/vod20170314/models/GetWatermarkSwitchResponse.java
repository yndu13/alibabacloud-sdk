// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarkSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WaterMarkSwitch")
    @Validation(required = true)
    public GetWatermarkSwitchResponseWaterMarkSwitch waterMarkSwitch;

    public static GetWatermarkSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkSwitchResponse self = new GetWatermarkSwitchResponse();
        return TeaModel.build(map, self);
    }

    public static class GetWatermarkSwitchResponseWaterMarkSwitch extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public Integer createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Integer updateTime;

        @NameInMap("Active")
        @Validation(required = true)
        public String active;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public String customerId;

        public static GetWatermarkSwitchResponseWaterMarkSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetWatermarkSwitchResponseWaterMarkSwitch self = new GetWatermarkSwitchResponseWaterMarkSwitch();
            return TeaModel.build(map, self);
        }

    }

}
