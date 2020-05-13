// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchVideoRequest extends TeaModel {
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

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("ResultTypes")
    public String resultTypes;

    @NameInMap("PlayRand")
    public String playRand;

    @NameInMap("Source")
    public String source;

    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("ScrollToken")
    public String scrollToken;

    @NameInMap("PreprocessStatus")
    public String preprocessStatus;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("VideoId")
    public String videoId;

    public static SearchVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchVideoRequest self = new SearchVideoRequest();
        return TeaModel.build(map, self);
    }

}
