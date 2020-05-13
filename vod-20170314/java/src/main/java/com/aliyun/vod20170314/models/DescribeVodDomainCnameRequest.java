// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCnameRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeVodDomainCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCnameRequest self = new DescribeVodDomainCnameRequest();
        return TeaModel.build(map, self);
    }

}
