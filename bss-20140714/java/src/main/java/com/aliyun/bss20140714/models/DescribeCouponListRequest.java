// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCouponListRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("StartDeliveryTime")
    public String startDeliveryTime;

    @NameInMap("EndDeliveryTime")
    public String endDeliveryTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    public static DescribeCouponListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponListRequest self = new DescribeCouponListRequest();
        return TeaModel.build(map, self);
    }

}
