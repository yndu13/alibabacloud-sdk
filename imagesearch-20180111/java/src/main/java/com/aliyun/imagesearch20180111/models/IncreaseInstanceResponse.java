// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class IncreaseInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public IncreaseInstanceResponseData data;

    public static IncreaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        IncreaseInstanceResponse self = new IncreaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class IncreaseInstanceResponseData extends TeaModel {
        @NameInMap("InstacneId")
        @Validation(required = true)
        public Long instacneId;

        @NameInMap("IncrementStatus")
        @Validation(required = true)
        public String incrementStatus;

        public static IncreaseInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            IncreaseInstanceResponseData self = new IncreaseInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
