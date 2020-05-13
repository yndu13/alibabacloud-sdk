// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AssumeOssRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("ClientId")
    @Validation(required = true)
    public String clientId;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("TerminalType")
    @Validation(required = true)
    public String terminalType;

    @NameInMap("DeviceModel")
    @Validation(required = true)
    public String deviceModel;

    @NameInMap("AppVersion")
    @Validation(required = true)
    public String appVersion;

    @NameInMap("AuthTimestamp")
    @Validation(required = true)
    public Long authTimestamp;

    @NameInMap("AuthInfo")
    @Validation(required = true)
    public String authInfo;

    @NameInMap("Prefix")
    public String prefix;

    public static AssumeOssRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeOssRoleRequest self = new AssumeOssRoleRequest();
        return TeaModel.build(map, self);
    }

}
