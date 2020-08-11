// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ClearInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public ClearInstanceResponseData data;

    public static ClearInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceResponse self = new ClearInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class ClearInstanceResponseData extends TeaModel {
        @NameInMap("InstacneId")
        @Validation(required = true)
        public Long instacneId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ClearInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ClearInstanceResponseData self = new ClearInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
