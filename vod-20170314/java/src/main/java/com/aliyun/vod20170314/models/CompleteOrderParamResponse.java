// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CompleteOrderParamResponse extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static CompleteOrderParamResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteOrderParamResponse self = new CompleteOrderParamResponse();
        return TeaModel.build(map, self);
    }

}
