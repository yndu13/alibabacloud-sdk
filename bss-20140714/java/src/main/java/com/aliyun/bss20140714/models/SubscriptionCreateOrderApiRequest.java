// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class SubscriptionCreateOrderApiRequest extends TeaModel {
    @NameInMap("ownerId")
    @Validation(required = true)
    public String ownerId;

    @NameInMap("productCode")
    @Validation(required = true)
    public String productCode;

    public static SubscriptionCreateOrderApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionCreateOrderApiRequest self = new SubscriptionCreateOrderApiRequest();
        return TeaModel.build(map, self);
    }

}
