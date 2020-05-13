// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SPILogicalDeleteResourceActionRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Pk")
    @Validation(required = true)
    public String pk;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("Hid")
    @Validation(required = true)
    public Long hid;

    @NameInMap("Country")
    @Validation(required = true)
    public String country;

    @NameInMap("TaskIdentifier")
    @Validation(required = true)
    public String taskIdentifier;

    @NameInMap("TaskExtraData")
    @Validation(required = true)
    public String taskExtraData;

    @NameInMap("GmtWakeup")
    @Validation(required = true)
    public String gmtWakeup;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Url")
    public String url;

    @NameInMap("Prompt")
    public String prompt;

    public static SPILogicalDeleteResourceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        SPILogicalDeleteResourceActionRequest self = new SPILogicalDeleteResourceActionRequest();
        return TeaModel.build(map, self);
    }

}
