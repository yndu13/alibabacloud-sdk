// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddAudioTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Codec")
    @Validation(required = true)
    public String codec;

    @NameInMap("Bitrate")
    @Validation(required = true)
    public String bitrate;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("Remove")
    public String remove;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Muxer")
    @Validation(required = true)
    public String muxer;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("IsDefault")
    @Validation(required = true)
    public String isDefault;

    public static AddAudioTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAudioTemplateRequest self = new AddAudioTemplateRequest();
        return TeaModel.build(map, self);
    }

}
