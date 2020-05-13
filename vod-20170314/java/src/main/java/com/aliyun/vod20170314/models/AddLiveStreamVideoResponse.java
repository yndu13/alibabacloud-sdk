// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddLiveStreamVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("PlaylistId")
    @Validation(required = true)
    public String playlistId;

    public static AddLiveStreamVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamVideoResponse self = new AddLiveStreamVideoResponse();
        return TeaModel.build(map, self);
    }

}
