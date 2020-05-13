// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddMidYKVidResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MidYKVidDO")
    @Validation(required = true)
    public AddMidYKVidResponseMidYKVidDO midYKVidDO;

    public static AddMidYKVidResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMidYKVidResponse self = new AddMidYKVidResponse();
        return TeaModel.build(map, self);
    }

    public static class AddMidYKVidResponseMidYKVidDO extends TeaModel {
        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("YKCloudVid")
        @Validation(required = true)
        public String YKCloudVid;

        @NameInMap("YKVideoId")
        @Validation(required = true)
        public String YKVideoId;

        public static AddMidYKVidResponseMidYKVidDO build(java.util.Map<String, ?> map) throws Exception {
            AddMidYKVidResponseMidYKVidDO self = new AddMidYKVidResponseMidYKVidDO();
            return TeaModel.build(map, self);
        }

    }

}
