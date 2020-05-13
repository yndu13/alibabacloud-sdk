// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddSnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSnapshotResponse self = new AddSnapshotResponse();
        return TeaModel.build(map, self);
    }

}
