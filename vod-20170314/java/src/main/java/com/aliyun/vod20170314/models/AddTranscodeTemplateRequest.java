// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Muxer")
    @Validation(required = true)
    public String muxer;

    @NameInMap("Resolution")
    @Validation(required = true)
    public String resolution;

    @NameInMap("Detail")
    @Validation(required = true)
    public String detail;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("VideoBitrate")
    @Validation(required = true)
    public String videoBitrate;

    @NameInMap("VideoCodec")
    @Validation(required = true)
    public String videoCodec;

    @NameInMap("AudioBitrate")
    @Validation(required = true)
    public String audioBitrate;

    @NameInMap("AudioCodec")
    @Validation(required = true)
    public String audioCodec;

    public static AddTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTranscodeTemplateRequest self = new AddTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

}
