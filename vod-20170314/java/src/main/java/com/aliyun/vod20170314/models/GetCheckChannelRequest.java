// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCheckChannelRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetCheckChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckChannelRequest self = new GetCheckChannelRequest();
        return TeaModel.build(map, self);
    }

}
