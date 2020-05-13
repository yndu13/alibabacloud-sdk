// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodCertificateDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("CertName")
    @Validation(required = true)
    public String certName;

    public static DescribeVodCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodCertificateDetailRequest self = new DescribeVodCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

}
