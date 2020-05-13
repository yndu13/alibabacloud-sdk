// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetCDNDomainServerCertificateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Response")
    @Validation(required = true)
    public String response;

    public static SetCDNDomainServerCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCDNDomainServerCertificateResponse self = new SetCDNDomainServerCertificateResponse();
        return TeaModel.build(map, self);
    }

}
