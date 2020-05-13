// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class TransferMediaDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TransferMediaDataResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferMediaDataResponse self = new TransferMediaDataResponse();
        return TeaModel.build(map, self);
    }

}
