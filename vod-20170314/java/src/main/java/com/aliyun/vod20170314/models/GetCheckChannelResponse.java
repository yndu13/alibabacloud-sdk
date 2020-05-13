// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCheckChannelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Audit")
    @Validation(required = true)
    public GetCheckChannelResponseAudit audit;

    public static GetCheckChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckChannelResponse self = new GetCheckChannelResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCheckChannelResponseAudit extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("Channel")
        @Validation(required = true)
        public String channel;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public String customerId;

        @NameInMap("LegalSwitch")
        @Validation(required = true)
        public String legalSwitch;

        public static GetCheckChannelResponseAudit build(java.util.Map<String, ?> map) throws Exception {
            GetCheckChannelResponseAudit self = new GetCheckChannelResponseAudit();
            return TeaModel.build(map, self);
        }

    }

}
