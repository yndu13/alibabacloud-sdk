// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMidYKVidResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MidYKVidDO")
    @Validation(required = true)
    public GetMidYKVidResponseMidYKVidDO midYKVidDO;

    public static GetMidYKVidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMidYKVidResponse self = new GetMidYKVidResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMidYKVidResponseMidYKVidDO extends TeaModel {
        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("YkVid")
        @Validation(required = true)
        public String ykVid;

        public static GetMidYKVidResponseMidYKVidDO build(java.util.Map<String, ?> map) throws Exception {
            GetMidYKVidResponseMidYKVidDO self = new GetMidYKVidResponseMidYKVidDO();
            return TeaModel.build(map, self);
        }

    }

}
