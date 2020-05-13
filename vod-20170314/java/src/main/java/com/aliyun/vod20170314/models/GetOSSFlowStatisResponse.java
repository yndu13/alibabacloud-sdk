// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetOSSFlowStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OSSFlowStatisList")
    @Validation(required = true)
    public java.util.List<GetOSSFlowStatisResponseOSSFlowStatisList> OSSFlowStatisList;

    public static GetOSSFlowStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSFlowStatisResponse self = new GetOSSFlowStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class GetOSSFlowStatisResponseOSSFlowStatisList extends TeaModel {
        @NameInMap("StatTime")
        @Validation(required = true)
        public String statTime;

        @NameInMap("StatTimeUTC")
        @Validation(required = true)
        public String statTimeUTC;

        @NameInMap("NetworkOut")
        @Validation(required = true)
        public Long networkOut;

        public static GetOSSFlowStatisResponseOSSFlowStatisList build(java.util.Map<String, ?> map) throws Exception {
            GetOSSFlowStatisResponseOSSFlowStatisList self = new GetOSSFlowStatisResponseOSSFlowStatisList();
            return TeaModel.build(map, self);
        }

    }

}
