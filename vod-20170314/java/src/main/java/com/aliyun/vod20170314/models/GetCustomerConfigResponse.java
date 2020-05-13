// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCustomerConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DownloadSwitch")
    @Validation(required = true)
    public String downloadSwitch;

    @NameInMap("MetricConfig")
    @Validation(required = true)
    public String metricConfig;

    public static GetCustomerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerConfigResponse self = new GetCustomerConfigResponse();
        return TeaModel.build(map, self);
    }

}
