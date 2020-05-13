// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddCompanionresourceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    @NameInMap("CompanionresourceId")
    @Validation(required = true)
    public String companionresourceId;

    public static AddCompanionresourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCompanionresourceInfoResponse self = new AddCompanionresourceInfoResponse();
        return TeaModel.build(map, self);
    }

}
