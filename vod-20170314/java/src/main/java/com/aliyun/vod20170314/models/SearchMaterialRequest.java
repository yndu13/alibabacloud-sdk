// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchMaterialRequest extends TeaModel {
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

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Type")
    public String type;

    @NameInMap("Source")
    public String source;

    @NameInMap("Title")
    public String title;

    public static SearchMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMaterialRequest self = new SearchMaterialRequest();
        return TeaModel.build(map, self);
    }

}
