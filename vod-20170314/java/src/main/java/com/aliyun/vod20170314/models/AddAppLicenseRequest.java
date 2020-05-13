// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddAppLicenseRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("LicenseSignature")
    public String licenseSignature;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Feature")
    public String feature;

    @NameInMap("ExpiredOn")
    @Validation(required = true)
    public String expiredOn;

    @NameInMap("SdkIds")
    public String sdkIds;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("LicenseId")
    public Long licenseId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Status")
    public String status;

    public static AddAppLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAppLicenseRequest self = new AddAppLicenseRequest();
        return TeaModel.build(map, self);
    }

}
