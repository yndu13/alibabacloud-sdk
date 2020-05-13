// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAppLicenseRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("LicenseId")
    @Validation(required = true)
    public Long licenseId;

    public static GetAppLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppLicenseRequest self = new GetAppLicenseRequest();
        return TeaModel.build(map, self);
    }

}
