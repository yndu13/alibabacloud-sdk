// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAIServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIList")
    @Validation(required = true)
    public java.util.List<GetAIServiceResponseAIList> AIList;

    public static GetAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIServiceResponse self = new GetAIServiceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAIServiceResponseAIList extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static GetAIServiceResponseAIList build(java.util.Map<String, ?> map) throws Exception {
            GetAIServiceResponseAIList self = new GetAIServiceResponseAIList();
            return TeaModel.build(map, self);
        }

    }

}
