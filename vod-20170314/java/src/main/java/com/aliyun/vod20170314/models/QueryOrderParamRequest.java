// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class QueryOrderParamRequest extends TeaModel {
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

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static QueryOrderParamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderParamRequest self = new QueryOrderParamRequest();
        return TeaModel.build(map, self);
    }

}
