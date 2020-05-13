// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CreateKMSServiceKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateKMSServiceKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKMSServiceKeyResponse self = new CreateKMSServiceKeyResponse();
        return TeaModel.build(map, self);
    }

}
