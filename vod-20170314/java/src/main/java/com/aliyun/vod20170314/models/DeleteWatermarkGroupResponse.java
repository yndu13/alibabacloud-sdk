// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteWatermarkGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteWatermarkGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkGroupResponse self = new DeleteWatermarkGroupResponse();
        return TeaModel.build(map, self);
    }

}