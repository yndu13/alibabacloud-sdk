// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCategoryTreeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CategoryTree")
    @Validation(required = true)
    public String categoryTree;

    public static GetCategoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryTreeResponse self = new GetCategoryTreeResponse();
        return TeaModel.build(map, self);
    }

}
