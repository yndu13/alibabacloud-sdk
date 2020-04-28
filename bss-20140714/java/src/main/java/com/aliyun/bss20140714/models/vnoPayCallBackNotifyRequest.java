// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class vnoPayCallBackNotifyRequest extends TeaModel {
    @NameInMap("paramStr")
    @Validation(required = true)
    public String paramStr;

    public static vnoPayCallBackNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        vnoPayCallBackNotifyRequest self = new vnoPayCallBackNotifyRequest();
        return TeaModel.build(map, self);
    }

}
