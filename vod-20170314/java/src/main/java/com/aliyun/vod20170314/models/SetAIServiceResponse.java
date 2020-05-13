// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetAIServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessTypes")
    @Validation(required = true)
    public String successTypes;

    @NameInMap("FailedTypes")
    @Validation(required = true)
    public String failedTypes;

    public static SetAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAIServiceResponse self = new SetAIServiceResponse();
        return TeaModel.build(map, self);
    }

}
