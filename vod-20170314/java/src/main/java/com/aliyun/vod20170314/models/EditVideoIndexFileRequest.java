// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class EditVideoIndexFileRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("EditType")
    @Validation(required = true)
    public String editType;

    @NameInMap("EditConfig")
    @Validation(required = true)
    public String editConfig;

    public static EditVideoIndexFileRequest build(java.util.Map<String, ?> map) throws Exception {
        EditVideoIndexFileRequest self = new EditVideoIndexFileRequest();
        return TeaModel.build(map, self);
    }

}
