// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetVodDomainCertificateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetVodDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainCertificateResponse self = new SetVodDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

}
