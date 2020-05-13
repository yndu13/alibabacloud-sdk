// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddVideoTagRequest extends TeaModel {
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

    @NameInMap("Tag")
    @Validation(required = true)
    public String tag;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    public static AddVideoTagRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVideoTagRequest self = new AddVideoTagRequest();
        return TeaModel.build(map, self);
    }

}
