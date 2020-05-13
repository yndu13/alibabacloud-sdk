// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddMediaInfoRequest extends TeaModel {
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

    @NameInMap("Title")
    @Validation(required = true)
    public String title;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Privilege")
    public Integer privilege;

    @NameInMap("IP")
    public String IP;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("FileMd5")
    public String fileMd5;

    @NameInMap("Description")
    public String description;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    @NameInMap("MediaWorkflowUserData")
    public String mediaWorkflowUserData;

    @NameInMap("MediaWorkflowRunId")
    public String mediaWorkflowRunId;

    public static AddMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMediaInfoRequest self = new AddMediaInfoRequest();
        return TeaModel.build(map, self);
    }

}
