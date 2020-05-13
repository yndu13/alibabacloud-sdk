// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetVideoConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DownloadSwitch")
    @Validation(required = true)
    public String downloadSwitch;

    public static GetVideoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoConfigResponse self = new GetVideoConfigResponse();
        return TeaModel.build(map, self);
    }

}
