// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPlayChannelKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PlayKey")
    @Validation(required = true)
    public String playKey;

    public static GetPlayChannelKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayChannelKeyResponse self = new GetPlayChannelKeyResponse();
        return TeaModel.build(map, self);
    }

}
