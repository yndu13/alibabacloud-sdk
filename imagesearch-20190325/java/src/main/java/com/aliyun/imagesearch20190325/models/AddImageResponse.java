// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class AddImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddImageResponseBody body;

    public static AddImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponse self = new AddImageResponse();
        return TeaModel.build(map, self);
    }

}
