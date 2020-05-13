// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SwitchWatermarkRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static SwitchWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchWatermarkRequest self = new SwitchWatermarkRequest();
        return TeaModel.build(map, self);
    }

}
