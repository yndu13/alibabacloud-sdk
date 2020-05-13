// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DisplayAIAuditSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsDisplay")
    @Validation(required = true)
    public Boolean isDisplay;

    public static DisplayAIAuditSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DisplayAIAuditSwitchResponse self = new DisplayAIAuditSwitchResponse();
        return TeaModel.build(map, self);
    }

}
