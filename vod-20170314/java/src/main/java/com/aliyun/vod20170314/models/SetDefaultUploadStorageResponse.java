// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetDefaultUploadStorageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetDefaultUploadStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultUploadStorageResponse self = new SetDefaultUploadStorageResponse();
        return TeaModel.build(map, self);
    }

}
