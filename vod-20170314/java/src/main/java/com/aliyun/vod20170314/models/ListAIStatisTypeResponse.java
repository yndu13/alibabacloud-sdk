// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAIStatisTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Types")
    @Validation(required = true)
    public String types;

    public static ListAIStatisTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIStatisTypeResponse self = new ListAIStatisTypeResponse();
        return TeaModel.build(map, self);
    }

}
