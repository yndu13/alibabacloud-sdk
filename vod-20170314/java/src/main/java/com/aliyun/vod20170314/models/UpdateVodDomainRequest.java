// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateVodDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Sources")
    public String sources;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static UpdateVodDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodDomainRequest self = new UpdateVodDomainRequest();
        return TeaModel.build(map, self);
    }

}
