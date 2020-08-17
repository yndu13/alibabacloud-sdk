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

    public DeleteItemRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteItemRequest setQuery(DeleteItemQuery query) {
        this.query = query;
        return this;
    }
    public DeleteItemQuery getQuery() {
        return this.query;
    }

}
