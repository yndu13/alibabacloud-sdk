// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CategoryTreeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CategoryTree")
    @Validation(required = true)
    public String categoryTree;

    public static CategoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        CategoryTreeResponse self = new CategoryTreeResponse();
        return TeaModel.build(map, self);
    }

}
