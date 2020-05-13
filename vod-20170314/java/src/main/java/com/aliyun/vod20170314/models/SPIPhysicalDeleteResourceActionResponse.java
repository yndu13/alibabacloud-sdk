// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SPIPhysicalDeleteResourceActionResponse extends TeaModel {
    @NameInMap("Interrupt")
    @Validation(required = true)
    public Boolean interrupt;

    @NameInMap("Invoker")
    @Validation(required = true)
    public String invoker;

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
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Level")
    @Validation(required = true)
    public Long level;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    @NameInMap("Prompt")
    @Validation(required = true)
    public String prompt;

    public static SPIPhysicalDeleteResourceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        SPIPhysicalDeleteResourceActionResponse self = new SPIPhysicalDeleteResourceActionResponse();
        return TeaModel.build(map, self);
    }

}
