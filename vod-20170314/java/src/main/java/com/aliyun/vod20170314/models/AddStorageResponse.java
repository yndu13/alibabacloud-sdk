// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddStorageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStorageResponse self = new AddStorageResponse();
        return TeaModel.build(map, self);
    }

}
