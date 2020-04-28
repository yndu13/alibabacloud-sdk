// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class OpenCallbackRequest extends TeaModel {
    @NameInMap("paramStr")
    @Validation(required = true)
    public String paramStr;

    public static OpenCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCallbackRequest self = new OpenCallbackRequest();
        return TeaModel.build(map, self);
    }

}
