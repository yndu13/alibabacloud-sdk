// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddWatermarkInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    @NameInMap("WatermarkId")
    @Validation(required = true)
    public String watermarkId;

    public static AddWatermarkInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkInfoResponse self = new AddWatermarkInfoResponse();
        return TeaModel.build(map, self);
    }

}
