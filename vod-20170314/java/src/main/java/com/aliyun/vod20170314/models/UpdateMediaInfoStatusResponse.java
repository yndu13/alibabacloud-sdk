// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateMediaInfoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoStatusResponse self = new UpdateMediaInfoStatusResponse();
        return TeaModel.build(map, self);
    }

}