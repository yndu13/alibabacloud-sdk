// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180319.models;

import com.aliyun.tea.*;

public class AddItemRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public AddItemQuery query;

    public static AddItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddItemRequest self = new AddItemRequest();
        return TeaModel.build(map, self);
    }

}
