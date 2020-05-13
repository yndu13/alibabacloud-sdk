// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteAudioConfigRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteAudioConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAudioConfigRequest self = new DeleteAudioConfigRequest();
        return TeaModel.build(map, self);
    }

}
