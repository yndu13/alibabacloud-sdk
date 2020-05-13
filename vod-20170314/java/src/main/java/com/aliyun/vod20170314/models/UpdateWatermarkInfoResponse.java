// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateWatermarkInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static UpdateWatermarkInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkInfoResponse self = new UpdateWatermarkInfoResponse();
        return TeaModel.build(map, self);
    }

}
