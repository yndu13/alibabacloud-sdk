// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CheckVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FailedList")
    @Validation(required = true)
    public CheckVideoResponseFailedList failedList;

    public static CheckVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVideoResponse self = new CheckVideoResponse();
        return TeaModel.build(map, self);
    }

    public static class CheckVideoResponseFailedList extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static CheckVideoResponseFailedList build(java.util.Map<String, ?> map) throws Exception {
            CheckVideoResponseFailedList self = new CheckVideoResponseFailedList();
            return TeaModel.build(map, self);
        }

    }

}
