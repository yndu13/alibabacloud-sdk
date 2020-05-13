// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetCustomerConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DownloadSwitch")
    public String downloadSwitch;

    @NameInMap("MetricConfig")
    public String metricConfig;

    @NameInMap("AIConfig")
    public String AIConfig;

    public static SetCustomerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCustomerConfigRequest self = new SetCustomerConfigRequest();
        return TeaModel.build(map, self);
    }

}
