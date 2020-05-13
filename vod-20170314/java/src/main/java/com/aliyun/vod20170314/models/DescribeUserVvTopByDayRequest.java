// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVvTopByDayRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("VideoType")
    @Validation(required = true)
    public String videoType;

    @NameInMap("Bizdate")
    @Validation(required = true)
    public String bizdate;

    public static DescribeUserVvTopByDayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVvTopByDayRequest self = new DescribeUserVvTopByDayRequest();
        return TeaModel.build(map, self);
    }

}
