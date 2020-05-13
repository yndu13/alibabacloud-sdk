// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddAppLicenseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LicenseId")
    @Validation(required = true)
    public Long licenseId;

    public static AddAppLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAppLicenseResponse self = new AddAppLicenseResponse();
        return TeaModel.build(map, self);
    }

}
