// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AuthorizeAppLicenseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ExpireDate")
    @Validation(required = true)
    public String expireDate;

    @NameInMap("Sign")
    @Validation(required = true)
    public String sign;

    @NameInMap("Feature")
    @Validation(required = true)
    public String feature;

    public static AuthorizeAppLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppLicenseResponse self = new AuthorizeAppLicenseResponse();
        return TeaModel.build(map, self);
    }

}
