// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetWatermarkGroupRequest extends TeaModel {
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

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    public static GetWatermarkGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkGroupRequest self = new GetWatermarkGroupRequest();
        return TeaModel.build(map, self);
    }

}
