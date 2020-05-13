// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class QueryUploadInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CustomerId")
    @Validation(required = true)
    public Long customerId;

    @NameInMap("TranscodeGroupId")
    @Validation(required = true)
    public String transcodeGroupId;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("LiveRegionId")
    public String liveRegionId;

    @NameInMap("ComposeTranscodeGroupId")
    public String composeTranscodeGroupId;

    public static QueryUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUploadInfoRequest self = new QueryUploadInfoRequest();
        return TeaModel.build(map, self);
    }

}
