// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMediaStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PlayURL")
    public String playURL;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static GetMediaStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaStreamRequest self = new GetMediaStreamRequest();
        return TeaModel.build(map, self);
    }

}
