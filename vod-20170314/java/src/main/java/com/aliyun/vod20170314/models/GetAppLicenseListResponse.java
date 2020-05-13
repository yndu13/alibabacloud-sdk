// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAppLicenseListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("AppLicenseList")
    @Validation(required = true)
    public GetAppLicenseListResponseAppLicenseList appLicenseList;

    public static GetAppLicenseListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppLicenseListResponse self = new GetAppLicenseListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAppLicenseListResponseAppLicenseListAppLicense extends TeaModel {
        @NameInMap("LicenseId")
        @Validation(required = true)
        public Long licenseId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ContractNo")
        @Validation(required = true)
        public String contractNo;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        @NameInMap("LicenseSignature")
        @Validation(required = true)
        public String licenseSignature;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        @NameInMap("ExpiredOn")
        @Validation(required = true)
        public String expiredOn;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SdkIds")
        @Validation(required = true)
        public String sdkIds;

        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public Long customerId;

        public static GetAppLicenseListResponseAppLicenseListAppLicense build(java.util.Map<String, ?> map) throws Exception {
            GetAppLicenseListResponseAppLicenseListAppLicense self = new GetAppLicenseListResponseAppLicenseListAppLicense();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAppLicenseListResponseAppLicenseList extends TeaModel {
        @NameInMap("AppLicense")
        @Validation(required = true)
        public java.util.List<GetAppLicenseListResponseAppLicenseListAppLicense> appLicense;

        public static GetAppLicenseListResponseAppLicenseList build(java.util.Map<String, ?> map) throws Exception {
            GetAppLicenseListResponseAppLicenseList self = new GetAppLicenseListResponseAppLicenseList();
            return TeaModel.build(map, self);
        }

    }

}
