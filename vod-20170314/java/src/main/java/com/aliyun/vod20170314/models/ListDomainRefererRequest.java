// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListDomainRefererRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("RefererType")
    @Validation(required = true)
    public String refererType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDomainRefererRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainRefererRequest self = new ListDomainRefererRequest();
        return TeaModel.build(map, self);
    }

}
