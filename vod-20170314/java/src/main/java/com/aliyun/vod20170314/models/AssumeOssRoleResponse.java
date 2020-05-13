// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AssumeOssRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OssAuthResult")
    @Validation(required = true)
    public String ossAuthResult;

    public static AssumeOssRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeOssRoleResponse self = new AssumeOssRoleResponse();
        return TeaModel.build(map, self);
    }

}
