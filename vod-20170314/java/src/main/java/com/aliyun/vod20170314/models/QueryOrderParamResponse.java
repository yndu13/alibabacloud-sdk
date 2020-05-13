// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class QueryOrderParamResponse extends TeaModel {
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

    public static QueryOrderParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderParamResponse self = new QueryOrderParamResponse();
        return TeaModel.build(map, self);
    }

}
