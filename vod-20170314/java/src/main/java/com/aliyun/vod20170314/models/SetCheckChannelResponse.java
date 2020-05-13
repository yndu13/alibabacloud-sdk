// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SetCheckChannelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Audit")
    @Validation(required = true)
    public SetCheckChannelResponseAudit audit;

    public static SetCheckChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCheckChannelResponse self = new SetCheckChannelResponse();
        return TeaModel.build(map, self);
    }

    public static class SetCheckChannelResponseAudit extends TeaModel {
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

        public static SetCheckChannelResponseAudit build(java.util.Map<String, ?> map) throws Exception {
            SetCheckChannelResponseAudit self = new SetCheckChannelResponseAudit();
            return TeaModel.build(map, self);
        }

    }

}
