// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoResponse self = new UpdateMediaInfoResponse();
        return TeaModel.build(map, self);
    }

}
