// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AssumeExperienceRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static AssumeExperienceRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeExperienceRoleResponse self = new AssumeExperienceRoleResponse();
        return TeaModel.build(map, self);
    }

}
