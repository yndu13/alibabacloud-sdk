// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.shixuanroa20190912.models;

import com.aliyun.tea.*;

public class CreateClusterBakRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    public CreateClusterBakBody body;

    public static CreateClusterBakRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBakRequest self = new CreateClusterBakRequest();
        return TeaModel.build(map, self);
    }

}
