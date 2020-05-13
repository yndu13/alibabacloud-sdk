// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class StopVodDomainRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static StopVodDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        StopVodDomainRequest self = new StopVodDomainRequest();
        return TeaModel.build(map, self);
    }

}
