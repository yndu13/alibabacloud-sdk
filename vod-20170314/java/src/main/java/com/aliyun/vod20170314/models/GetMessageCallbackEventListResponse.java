// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMessageCallbackEventListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EventList")
    @Validation(required = true)
    public String eventList;

    public static GetMessageCallbackEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackEventListResponse self = new GetMessageCallbackEventListResponse();
        return TeaModel.build(map, self);
    }

}
