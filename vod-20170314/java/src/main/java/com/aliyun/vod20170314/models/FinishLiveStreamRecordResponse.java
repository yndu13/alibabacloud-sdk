// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class FinishLiveStreamRecordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static FinishLiveStreamRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishLiveStreamRecordResponse self = new FinishLiveStreamRecordResponse();
        return TeaModel.build(map, self);
    }

}
