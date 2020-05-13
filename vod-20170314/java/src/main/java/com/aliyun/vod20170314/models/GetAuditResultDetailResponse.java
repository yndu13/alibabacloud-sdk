// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAuditResultDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIAuditResultDetail")
    @Validation(required = true)
    public GetAuditResultDetailResponseAIAuditResultDetail AIAuditResultDetail;

    public static GetAuditResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultDetailResponse self = new GetAuditResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAuditResultDetailResponseAIAuditResultDetailList extends TeaModel {
        @NameInMap("PornLabel")
        @Validation(required = true)
        public String pornLabel;

        @NameInMap("PornScore")
        @Validation(required = true)
        public String pornScore;

        @NameInMap("TerrorismLabel")
        @Validation(required = true)
        public String terrorismLabel;

        @NameInMap("TerrorismScore")
        @Validation(required = true)
        public String terrorismScore;

        @NameInMap("Index")
        @Validation(required = true)
        public String index;

        @NameInMap("Object")
        @Validation(required = true)
        public String object;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        public static GetAuditResultDetailResponseAIAuditResultDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetAuditResultDetailResponseAIAuditResultDetailList self = new GetAuditResultDetailResponseAIAuditResultDetailList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAuditResultDetailResponseAIAuditResultDetail extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<GetAuditResultDetailResponseAIAuditResultDetailList> list;

        public static GetAuditResultDetailResponseAIAuditResultDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAuditResultDetailResponseAIAuditResultDetail self = new GetAuditResultDetailResponseAIAuditResultDetail();
            return TeaModel.build(map, self);
        }

    }

}
