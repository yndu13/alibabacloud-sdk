// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodUserQuotaRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVodUserQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserQuotaRequest self = new DescribeVodUserQuotaRequest();
        return TeaModel.build(map, self);
    }

}
