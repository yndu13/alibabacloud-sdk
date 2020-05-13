// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteCompanionresourceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static DeleteCompanionresourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompanionresourceInfoResponse self = new DeleteCompanionresourceInfoResponse();
        return TeaModel.build(map, self);
    }

}
