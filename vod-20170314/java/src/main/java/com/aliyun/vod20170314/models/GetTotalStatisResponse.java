// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetTotalStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeDuration")
    @Validation(required = true)
    public Long transcodeDuration;

    @NameInMap("StorageUtilization")
    @Validation(required = true)
    public Long storageUtilization;

    @NameInMap("NetworkOut")
    @Validation(required = true)
    public Long networkOut;

    public static GetTotalStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTotalStatisResponse self = new GetTotalStatisResponse();
        return TeaModel.build(map, self);
    }

}
