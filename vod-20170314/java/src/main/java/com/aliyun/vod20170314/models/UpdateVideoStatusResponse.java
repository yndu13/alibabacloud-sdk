// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateVideoStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateVideoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoStatusResponse self = new UpdateVideoStatusResponse();
        return TeaModel.build(map, self);
    }

}
