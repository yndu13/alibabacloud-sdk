// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetStorageACLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetStorageACLResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStorageACLResponse self = new SetStorageACLResponse();
        return TeaModel.build(map, self);
    }

}
