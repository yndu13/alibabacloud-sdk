// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateApiAuthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ApiAuth")
    @Validation(required = true)
    public UpdateApiAuthResponseApiAuth apiAuth;

    public static UpdateApiAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiAuthResponse self = new UpdateApiAuthResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateApiAuthResponseApiAuth extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("SignVersion")
        @Validation(required = true)
        public String signVersion;

        @NameInMap("Channel")
        @Validation(required = true)
        public String channel;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ClientVersion")
        @Validation(required = true)
        public String clientVersion;

        public static UpdateApiAuthResponseApiAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiAuthResponseApiAuth self = new UpdateApiAuthResponseApiAuth();
            return TeaModel.build(map, self);
        }

    }

}
