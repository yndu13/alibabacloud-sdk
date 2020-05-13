// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Privilege")
    public Integer privilege;

    @NameInMap("Password")
    public String password;

    @NameInMap("Description")
    public String description;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    @NameInMap("MediaWorkflowUserData")
    public String mediaWorkflowUserData;

    @NameInMap("MediaWorkflowRunId")
    public String mediaWorkflowRunId;

    public static UpdateMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoRequest self = new UpdateMediaInfoRequest();
        return TeaModel.build(map, self);
    }

}
