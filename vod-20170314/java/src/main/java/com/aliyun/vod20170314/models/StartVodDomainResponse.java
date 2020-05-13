// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class StartVodDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StartVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVodDomainResponse self = new StartVodDomainResponse();
        return TeaModel.build(map, self);
    }

}
