// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Description")
    public String description;

    @NameInMap("CoverURL")
    public String coverURL;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("DownloadSwitch")
    public String downloadSwitch;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("Status")
    public String status;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("Source")
    public String source;

    public static UpdateVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoRequest self = new UpdateVideoInfoRequest();
        return TeaModel.build(map, self);
    }

}
