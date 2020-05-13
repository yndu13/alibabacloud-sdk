// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPlayChannelListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("State")
    public Integer state;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    public static GetPlayChannelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayChannelListRequest self = new GetPlayChannelListRequest();
        return TeaModel.build(map, self);
    }

}
