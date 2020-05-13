// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("Match")
    public String match;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScrollToken")
    public String scrollToken;

    @NameInMap("ResultTypes")
    public String resultTypes;

    @NameInMap("SessionId")
    public String sessionId;

    public static SearchMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaRequest self = new SearchMediaRequest();
        return TeaModel.build(map, self);
    }

}
