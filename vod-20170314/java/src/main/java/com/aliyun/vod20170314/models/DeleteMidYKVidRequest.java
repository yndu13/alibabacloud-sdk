// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteMidYKVidRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("YkVid")
    @Validation(required = true)
    public String ykVid;

    public static DeleteMidYKVidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMidYKVidRequest self = new DeleteMidYKVidRequest();
        return TeaModel.build(map, self);
    }

}
