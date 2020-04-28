// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class SubscriptionCreateOrderApiResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static SubscriptionCreateOrderApiResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionCreateOrderApiResponse self = new SubscriptionCreateOrderApiResponse();
        return TeaModel.build(map, self);
    }

}
