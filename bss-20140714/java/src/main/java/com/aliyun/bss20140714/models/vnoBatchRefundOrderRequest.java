// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class vnoBatchRefundOrderRequest extends TeaModel {
    @NameInMap("paramStr")
    @Validation(required = true)
    public String paramStr;

    public static vnoBatchRefundOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        vnoBatchRefundOrderRequest self = new vnoBatchRefundOrderRequest();
        return TeaModel.build(map, self);
    }

}
