// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAppLicenseListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("Type")
    public String type;

    @NameInMap("SdkIds")
    public String sdkIds;

    @NameInMap("Feature")
    public String feature;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartCreationTime")
    public String startCreationTime;

    @NameInMap("EndCreationTime")
    public String endCreationTime;

    @NameInMap("StartExpiredTime")
    public String startExpiredTime;

    @NameInMap("EndExpiredTime")
    public String endExpiredTime;

    @NameInMap("SortBy")
    public String sortBy;

    public static GetAppLicenseListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppLicenseListRequest self = new GetAppLicenseListRequest();
        return TeaModel.build(map, self);
    }

}
