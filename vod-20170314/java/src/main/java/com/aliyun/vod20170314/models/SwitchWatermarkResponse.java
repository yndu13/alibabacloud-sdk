// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SwitchWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SwitchWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchWatermarkResponse self = new SwitchWatermarkResponse();
        return TeaModel.build(map, self);
    }

}
