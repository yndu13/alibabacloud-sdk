// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetDefaultVodTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VodTemplateId")
    @Validation(required = true)
    public String vodTemplateId;

    public static SetDefaultVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultVodTemplateResponse self = new SetDefaultVodTemplateResponse();
        return TeaModel.build(map, self);
    }

}
