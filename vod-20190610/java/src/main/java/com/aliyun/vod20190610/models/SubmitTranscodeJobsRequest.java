// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20190610.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("TemplateGroupId")
    @Validation(required = true)
    public String templateGroupId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("EncryptConfig")
    public String encryptConfig;

    @NameInMap("OverrideParams")
    public String overrideParams;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("UserData")
    public String userData;

    public static SubmitTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsRequest self = new SubmitTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

}
