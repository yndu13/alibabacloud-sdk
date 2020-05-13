// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AssumeSlsRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlsAuthResult")
    @Validation(required = true)
    public String slsAuthResult;

    public static AssumeSlsRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeSlsRoleResponse self = new AssumeSlsRoleResponse();
        return TeaModel.build(map, self);
    }

}
