// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetUploadProgressRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Source")
    public String source;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("TerminalType")
    public String terminalType;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AuthTimestamp")
    @Validation(required = true)
    public Long authTimestamp;

    @NameInMap("AuthInfo")
    @Validation(required = true)
    public String authInfo;

    @NameInMap("UploadInfoList")
    @Validation(required = true)
    public String uploadInfoList;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UploadAddress")
    public String uploadAddress;

    public static GetUploadProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadProgressRequest self = new GetUploadProgressRequest();
        return TeaModel.build(map, self);
    }

}
