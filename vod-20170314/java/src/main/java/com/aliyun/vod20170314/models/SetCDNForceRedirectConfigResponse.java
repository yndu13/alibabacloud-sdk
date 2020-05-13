// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetCDNForceRedirectConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Response")
    @Validation(required = true)
    public String response;

    public static SetCDNForceRedirectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCDNForceRedirectConfigResponse self = new SetCDNForceRedirectConfigResponse();
        return TeaModel.build(map, self);
    }

}
