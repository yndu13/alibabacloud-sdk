// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchMediaInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("Title")
    public String title;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Status")
    public String status;

    public static SearchMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaInfoRequest self = new SearchMediaInfoRequest();
        return TeaModel.build(map, self);
    }

}
