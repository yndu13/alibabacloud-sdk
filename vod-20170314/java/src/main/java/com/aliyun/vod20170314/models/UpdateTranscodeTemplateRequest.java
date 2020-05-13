// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Muxer")
    public String muxer;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("Name")
    public String name;

    @NameInMap("VideoBitrate")
    public String videoBitrate;

    @NameInMap("VideoCodec")
    public String videoCodec;

    @NameInMap("AudioBitrate")
    public String audioBitrate;

    @NameInMap("AudioCodec")
    public String audioCodec;

    public static UpdateTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateRequest self = new UpdateTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

}
