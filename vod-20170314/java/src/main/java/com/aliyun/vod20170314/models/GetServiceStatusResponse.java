// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("serviceState")
    @Validation(required = true)
    public Integer serviceState;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ChargeType")
    @Validation(required = true)
    public Integer chargeType;

    @NameInMap("ChangingChargeType")
    @Validation(required = true)
    public String changingChargeType;

    @NameInMap("ChangingAfterTime")
    @Validation(required = true)
    public String changingAfterTime;

    public static GetServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceStatusResponse self = new GetServiceStatusResponse();
        return TeaModel.build(map, self);
    }

}
