// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class NotifyInitResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static NotifyInitResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyInitResourceResponse self = new NotifyInitResourceResponse();
        return TeaModel.build(map, self);
    }

}
