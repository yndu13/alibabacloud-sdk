// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetTemplateGroupPropertyRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("PropertyName")
    @Validation(required = true)
    public String propertyName;

    @NameInMap("PropertyValue")
    @Validation(required = true)
    public String propertyValue;

    public static SetTemplateGroupPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTemplateGroupPropertyRequest self = new SetTemplateGroupPropertyRequest();
        return TeaModel.build(map, self);
    }

}
