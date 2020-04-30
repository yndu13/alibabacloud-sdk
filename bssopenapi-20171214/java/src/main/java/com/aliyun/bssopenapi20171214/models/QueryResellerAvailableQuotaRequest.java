// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerAvailableQuotaRequest extends TeaModel {
    @NameInMap("OwnerId")
    @Validation(required = true)
    public Long ownerId;

    @NameInMap("ItemCodes")
    public String itemCodes;

    public static QueryResellerAvailableQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerAvailableQuotaRequest self = new QueryResellerAvailableQuotaRequest();
        return TeaModel.build(map, self);
    }

}
