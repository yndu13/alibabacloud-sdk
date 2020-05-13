// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetDefaultPlayDomainRequest extends TeaModel {
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

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static SetDefaultPlayDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPlayDomainRequest self = new SetDefaultPlayDomainRequest();
        return TeaModel.build(map, self);
    }

}
