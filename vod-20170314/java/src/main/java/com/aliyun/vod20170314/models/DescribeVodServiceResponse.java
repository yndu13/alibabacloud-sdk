// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeVodServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InternetChargeType")
    @Validation(required = true)
    public String internetChargeType;

    @NameInMap("OpeningTime")
    @Validation(required = true)
    public String openingTime;

    @NameInMap("ChangingChargeType")
    @Validation(required = true)
    public String changingChargeType;

    @NameInMap("ChangingAffectTime")
    @Validation(required = true)
    public String changingAffectTime;

    @NameInMap("OperationLocks")
    @Validation(required = true)
    public DescribeVodServiceResponseOperationLocks operationLocks;

    public static DescribeVodServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodServiceResponse self = new DescribeVodServiceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodServiceResponseOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeVodServiceResponseOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodServiceResponseOperationLocksLockReason self = new DescribeVodServiceResponseOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodServiceResponseOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeVodServiceResponseOperationLocksLockReason> lockReason;

        public static DescribeVodServiceResponseOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodServiceResponseOperationLocks self = new DescribeVodServiceResponseOperationLocks();
            return TeaModel.build(map, self);
        }

    }

}
