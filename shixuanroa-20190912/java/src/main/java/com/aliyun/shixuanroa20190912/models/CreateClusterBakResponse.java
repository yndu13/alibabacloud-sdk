// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.shixuanroa20190912.models;

import com.aliyun.tea.*;

public class CreateClusterBakResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterBakResponseBody body;

    public static CreateClusterBakResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBakResponse self = new CreateClusterBakResponse();
        return TeaModel.build(map, self);
    }

}
