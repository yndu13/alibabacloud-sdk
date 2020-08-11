// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListIncrementResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public ListIncrementResponseData data;

    public static ListIncrementResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncrementResponse self = new ListIncrementResponse();
        return TeaModel.build(map, self);
    }

    public static class ListIncrementResponseDataIncrementsInstance extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public Long utcModified;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("BucketName")
        @Validation(required = true)
        public String bucketName;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("ErrorUrl")
        @Validation(required = true)
        public String errorUrl;

        public static ListIncrementResponseDataIncrementsInstance build(java.util.Map<String, ?> map) throws Exception {
            ListIncrementResponseDataIncrementsInstance self = new ListIncrementResponseDataIncrementsInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class ListIncrementResponseDataIncrements extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<ListIncrementResponseDataIncrementsInstance> instance;

        public static ListIncrementResponseDataIncrements build(java.util.Map<String, ?> map) throws Exception {
            ListIncrementResponseDataIncrements self = new ListIncrementResponseDataIncrements();
            return TeaModel.build(map, self);
        }

    }

    public static class ListIncrementResponseData extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("Increments")
        @Validation(required = true)
        public ListIncrementResponseDataIncrements increments;

        public static ListIncrementResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListIncrementResponseData self = new ListIncrementResponseData();
            return TeaModel.build(map, self);
        }

    }

}
