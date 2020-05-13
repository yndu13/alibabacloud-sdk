// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAuditResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIAuditResult")
    @Validation(required = true)
    public GetAuditResultResponseAIAuditResult AIAuditResult;

    public static GetAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultResponse self = new GetAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAuditResultResponseAIAuditResult extends TeaModel {
        @NameInMap("AbnormalModules")
        @Validation(required = true)
        public String abnormalModules;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("PornResult")
        @Validation(required = true)
        public String pornResult;

        @NameInMap("TerrorismResult")
        @Validation(required = true)
        public String terrorismResult;

        @NameInMap("TitleResult")
        @Validation(required = true)
        public String titleResult;

        @NameInMap("CoverResult")
        @Validation(required = true)
        public String coverResult;

        public static GetAuditResultResponseAIAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetAuditResultResponseAIAuditResult self = new GetAuditResultResponseAIAuditResult();
            return TeaModel.build(map, self);
        }

    }

}
