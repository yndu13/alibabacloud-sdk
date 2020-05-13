// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialResponse self = new DeleteMaterialResponse();
        return TeaModel.build(map, self);
    }

}
