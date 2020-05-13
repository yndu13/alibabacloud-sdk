// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddMidYKVidRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("YKCloudVid")
    @Validation(required = true)
    public String YKCloudVid;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("YKVideoId")
    public String YKVideoId;

    public static AddMidYKVidRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMidYKVidRequest self = new AddMidYKVidRequest();
        return TeaModel.build(map, self);
    }

}
