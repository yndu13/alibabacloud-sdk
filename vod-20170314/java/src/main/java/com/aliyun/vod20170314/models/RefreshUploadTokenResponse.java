// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class RefreshUploadTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UploadKey")
    @Validation(required = true)
    public String uploadKey;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public RefreshUploadTokenResponseUploadAddress uploadAddress;

    public static RefreshUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadTokenResponse self = new RefreshUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public static class RefreshUploadTokenResponseUploadAddress extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("Expiration")
        @Validation(required = true)
        public String expiration;

        @NameInMap("SecurityToken")
        @Validation(required = true)
        public String securityToken;

        public static RefreshUploadTokenResponseUploadAddress build(java.util.Map<String, ?> map) throws Exception {
            RefreshUploadTokenResponseUploadAddress self = new RefreshUploadTokenResponseUploadAddress();
            return TeaModel.build(map, self);
        }

    }

}
