// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIStatisTypeRequest extends TeaModel {
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

    public static ListAIStatisTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIStatisTypeRequest self = new ListAIStatisTypeRequest();
        return TeaModel.build(map, self);
    }

}
