// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Cert")
    @Validation(required = true)
    public String cert;

    @NameInMap("Key")
    @Validation(required = true)
    public String key;

    @NameInMap("CertId")
    @Validation(required = true)
    public Long certId;

    @NameInMap("CertName")
    @Validation(required = true)
    public String certName;

    public static DescribeVodCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateDetailResponse self = new DescribeVodCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

}
