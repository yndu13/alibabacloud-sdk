// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateTranscodeConfResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ret")
    @Validation(required = true)
    public Boolean ret;

    public static UpdateTranscodeConfResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeConfResponse self = new UpdateTranscodeConfResponse();
        return TeaModel.build(map, self);
    }

}
