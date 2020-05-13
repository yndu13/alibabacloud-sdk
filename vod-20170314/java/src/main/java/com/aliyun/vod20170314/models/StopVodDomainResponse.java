// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class StopVodDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopVodDomainResponse self = new StopVodDomainResponse();
        return TeaModel.build(map, self);
    }

}
