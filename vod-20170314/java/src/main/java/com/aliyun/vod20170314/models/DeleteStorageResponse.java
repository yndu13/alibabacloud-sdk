// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteStorageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageResponse self = new DeleteStorageResponse();
        return TeaModel.build(map, self);
    }

}
