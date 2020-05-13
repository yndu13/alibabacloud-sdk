// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCategoriesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Type")
    public String type;

    public static GetCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesRequest self = new GetCategoriesRequest();
        return TeaModel.build(map, self);
    }

}
