// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class TransferMediaDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("VideoInfo")
    public String videoInfo;

    @NameInMap("MezzanineInfo")
    public String mezzanineInfo;

    @NameInMap("StreamInfos")
    public String streamInfos;

    public static TransferMediaDataRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferMediaDataRequest self = new TransferMediaDataRequest();
        return TeaModel.build(map, self);
    }

}
