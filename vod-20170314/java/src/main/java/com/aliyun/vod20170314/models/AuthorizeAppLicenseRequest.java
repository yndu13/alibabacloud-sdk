// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AuthorizeAppLicenseRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SdkCode")
    public Long sdkCode;

    @NameInMap("LicenseVersion")
    @Validation(required = true)
    public Long licenseVersion;

    @NameInMap("Platform")
    @Validation(required = true)
    public Long platform;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("LicenseSignature")
    public String licenseSignature;

    @NameInMap("Nonce")
    @Validation(required = true)
    public String nonce;

    @NameInMap("Time")
    @Validation(required = true)
    public Long time;

    @NameInMap("Sign")
    @Validation(required = true)
    public String sign;

    @NameInMap("SdkVersion")
    public String sdkVersion;

    @NameInMap("SdkVersionCode")
    public Long sdkVersionCode;

    public static AuthorizeAppLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppLicenseRequest self = new AuthorizeAppLicenseRequest();
        return TeaModel.build(map, self);
    }

}
