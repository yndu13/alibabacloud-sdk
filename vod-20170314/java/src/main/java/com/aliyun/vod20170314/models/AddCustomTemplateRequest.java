// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddCustomTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Video")
    @Validation(required = true)
    public String video;

    @NameInMap("Audio")
    @Validation(required = true)
    public String audio;

    @NameInMap("TransConfig")
    public String transConfig;

    @NameInMap("MuxConfig")
    public String muxConfig;

    @NameInMap("Container")
    @Validation(required = true)
    public String container;

    @NameInMap("Definition")
    @Validation(required = true)
    public String definition;

    @NameInMap("UseWaterMark")
    public String useWaterMark;

    @NameInMap("Encrypt")
    public String encrypt;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("NarrowBand")
    public String narrowBand;

    public static AddCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomTemplateRequest self = new AddCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

}
