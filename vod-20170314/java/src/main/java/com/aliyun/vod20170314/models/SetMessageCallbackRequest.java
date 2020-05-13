// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetMessageCallbackRequest extends TeaModel {
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

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("CallbackSwitch")
    public String callbackSwitch;

    @NameInMap("CallbackType")
    public String callbackType;

    @NameInMap("CallbackURL")
    @Validation(required = true)
    public String callbackURL;

    @NameInMap("EventTypeList")
    public String eventTypeList;

    @NameInMap("AuthSwitch")
    public String authSwitch;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("MnsEndpoint")
    public String mnsEndpoint;

    @NameInMap("MnsQueueName")
    public String mnsQueueName;

    @NameInMap("AppId")
    public String appId;

    public static SetMessageCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCallbackRequest self = new SetMessageCallbackRequest();
        return TeaModel.build(map, self);
    }

}
