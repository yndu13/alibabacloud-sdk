// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateSpecifyCustomerTemplateConfigRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TranscodeIds")
    @Validation(required = true)
    public String transcodeIds;

    @NameInMap("EncryptTemplateIds")
    public String encryptTemplateIds;

    @NameInMap("CustomerId")
    @Validation(required = true)
    public String customerId;

    public static UpdateSpecifyCustomerTemplateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpecifyCustomerTemplateConfigRequest self = new UpdateSpecifyCustomerTemplateConfigRequest();
        return TeaModel.build(map, self);
    }

}
