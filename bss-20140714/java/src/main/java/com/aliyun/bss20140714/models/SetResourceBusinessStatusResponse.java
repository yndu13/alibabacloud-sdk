// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class SetResourceBusinessStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetResourceBusinessStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResourceBusinessStatusResponse self = new SetResourceBusinessStatusResponse();
        return TeaModel.build(map, self);
    }

}
