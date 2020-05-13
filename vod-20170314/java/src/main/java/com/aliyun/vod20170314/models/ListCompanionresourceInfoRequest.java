// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListCompanionresourceInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CompanionResourceType")
    @Validation(required = true)
    public String companionResourceType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListCompanionresourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompanionresourceInfoRequest self = new ListCompanionresourceInfoRequest();
        return TeaModel.build(map, self);
    }

}
