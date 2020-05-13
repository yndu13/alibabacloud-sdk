// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeUserVodStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Enabled")
    @Validation(required = true)
    public Boolean enabled;

    @NameInMap("OnService")
    @Validation(required = true)
    public Boolean onService;

    @NameInMap("InDebt")
    @Validation(required = true)
    public Boolean inDebt;

    @NameInMap("InDebtOverdue")
    @Validation(required = true)
    public Boolean inDebtOverdue;

    public static DescribeUserVodStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVodStatusResponse self = new DescribeUserVodStatusResponse();
        return TeaModel.build(map, self);
    }

}
