// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UserExistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("userState")
    @Validation(required = true)
    public Integer userState;

    public static UserExistResponse build(java.util.Map<String, ?> map) throws Exception {
        UserExistResponse self = new UserExistResponse();
        return TeaModel.build(map, self);
    }

}
