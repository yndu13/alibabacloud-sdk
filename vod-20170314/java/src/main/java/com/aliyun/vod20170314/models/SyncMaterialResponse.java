// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class SyncMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessVideoIds")
    @Validation(required = true)
    public SyncMaterialResponseSuccessVideoIds successVideoIds;

    @NameInMap("FailedVideoIds")
    @Validation(required = true)
    public SyncMaterialResponseFailedVideoIds failedVideoIds;

    public static SyncMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMaterialResponse self = new SyncMaterialResponse();
        return TeaModel.build(map, self);
    }

    public static class SyncMaterialResponseSuccessVideoIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static SyncMaterialResponseSuccessVideoIds build(java.util.Map<String, ?> map) throws Exception {
            SyncMaterialResponseSuccessVideoIds self = new SyncMaterialResponseSuccessVideoIds();
            return TeaModel.build(map, self);
        }

    }

    public static class SyncMaterialResponseFailedVideoIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static SyncMaterialResponseFailedVideoIds build(java.util.Map<String, ?> map) throws Exception {
            SyncMaterialResponseFailedVideoIds self = new SyncMaterialResponseFailedVideoIds();
            return TeaModel.build(map, self);
        }

    }

}
