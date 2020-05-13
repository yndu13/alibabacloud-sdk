// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetPlayChannelListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PlayKeyList")
    @Validation(required = true)
    public GetPlayChannelListResponsePlayKeyList playKeyList;

    public static GetPlayChannelListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayChannelListResponse self = new GetPlayChannelListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetPlayChannelListResponsePlayKeyListPlayKey extends TeaModel {
        @NameInMap("Channel")
        @Validation(required = true)
        public String channel;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("SignVersion")
        @Validation(required = true)
        public String signVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ClientVersion")
        @Validation(required = true)
        public String clientVersion;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        public static GetPlayChannelListResponsePlayKeyListPlayKey build(java.util.Map<String, ?> map) throws Exception {
            GetPlayChannelListResponsePlayKeyListPlayKey self = new GetPlayChannelListResponsePlayKeyListPlayKey();
            return TeaModel.build(map, self);
        }

    }

    public static class GetPlayChannelListResponsePlayKeyList extends TeaModel {
        @NameInMap("PlayKey")
        @Validation(required = true)
        public java.util.List<GetPlayChannelListResponsePlayKeyListPlayKey> playKey;

        public static GetPlayChannelListResponsePlayKeyList build(java.util.Map<String, ?> map) throws Exception {
            GetPlayChannelListResponsePlayKeyList self = new GetPlayChannelListResponsePlayKeyList();
            return TeaModel.build(map, self);
        }

    }

}
