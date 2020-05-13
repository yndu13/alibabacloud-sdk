// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateSpecifyCustomerTemplateConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ret")
    @Validation(required = true)
    public Boolean ret;

    public static UpdateSpecifyCustomerTemplateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpecifyCustomerTemplateConfigResponse self = new UpdateSpecifyCustomerTemplateConfigResponse();
        return TeaModel.build(map, self);
    }

}
