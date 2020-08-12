// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180319.models;

import com.aliyun.tea.*;

public class DeleteItemRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DeleteItemQuery query;

    public static DeleteItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemRequest self = new DeleteItemRequest();
        return TeaModel.build(map, self);
    }

}
