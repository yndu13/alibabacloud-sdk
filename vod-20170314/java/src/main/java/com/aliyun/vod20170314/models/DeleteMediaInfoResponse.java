// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteMediaInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfoResponse self = new DeleteMediaInfoResponse();
        return TeaModel.build(map, self);
    }

}
