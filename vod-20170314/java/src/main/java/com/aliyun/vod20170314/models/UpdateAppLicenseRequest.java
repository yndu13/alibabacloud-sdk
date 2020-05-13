// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateAppLicenseRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("LicenseId")
    @Validation(required = true)
    public Long licenseId;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("LicenseSignature")
    public String licenseSignature;

    @NameInMap("Type")
    public String type;

    @NameInMap("Feature")
    public String feature;

    @NameInMap("Status")
    public String status;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    @NameInMap("SdkIds")
    public String sdkIds;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("AccountId")
    public Long accountId;

    public static UpdateAppLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppLicenseRequest self = new UpdateAppLicenseRequest();
        return TeaModel.build(map, self);
    }

}
