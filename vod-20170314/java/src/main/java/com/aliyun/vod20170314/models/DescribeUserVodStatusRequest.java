// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVodStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeUserVodStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVodStatusRequest self = new DescribeUserVodStatusRequest();
        return TeaModel.build(map, self);
    }

}
