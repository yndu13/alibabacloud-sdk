// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodUserResourcePackageRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeVodUserResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserResourcePackageRequest self = new DescribeVodUserResourcePackageRequest();
        return TeaModel.build(map, self);
    }

}
