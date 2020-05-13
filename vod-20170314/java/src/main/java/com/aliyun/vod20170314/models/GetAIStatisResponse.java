// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAIStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIStatisList")
    @Validation(required = true)
    public java.util.List<GetAIStatisResponseAIStatisList> AIStatisList;

    public static GetAIStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIStatisResponse self = new GetAIStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAIStatisResponseAIStatisList extends TeaModel {
        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

        @NameInMap("StatTimeUTC")
        @Validation(required = true)
        public String statTimeUTC;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        public static GetAIStatisResponseAIStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetAIStatisResponseAIStatisList self = new GetAIStatisResponseAIStatisList();
            return TeaModel.build(map, self);
        }

    }

}
