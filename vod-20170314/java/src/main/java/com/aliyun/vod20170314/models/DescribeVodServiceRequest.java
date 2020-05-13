// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVodServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodServiceRequest self = new DescribeVodServiceRequest();
        return TeaModel.build(map, self);
    }

}
