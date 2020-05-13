// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetCDNDomainServerCertificateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("APIProxyName")
    @Validation(required = true)
    public String APIProxyName;

    @NameInMap("APIProxyParam")
    @Validation(required = true)
    public String APIProxyParam;

    public static SetCDNDomainServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCDNDomainServerCertificateRequest self = new SetCDNDomainServerCertificateRequest();
        return TeaModel.build(map, self);
    }

}
