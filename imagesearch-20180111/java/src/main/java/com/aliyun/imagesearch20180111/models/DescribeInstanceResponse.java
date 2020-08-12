// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Instance")
    @Validation(required = true)
    public DescribeInstanceResponseInstance instance;

    public static DescribeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponse self = new DescribeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceResponseInstanceMeasure extends TeaModel {
        @NameInMap("BillingCycleStart")
        @Validation(required = true)
        public String billingCycleStart;

        @NameInMap("BillingCycleEnd")
        @Validation(required = true)
        public String billingCycleEnd;

        @NameInMap("PacketCapacity")
        @Validation(required = true)
        public Long packetCapacity;

        @NameInMap("PacketType")
        @Validation(required = true)
        public String packetType;

        @NameInMap("PacketUsed")
        @Validation(required = true)
        public Long packetUsed;

        @NameInMap("ExcessAmount")
        @Validation(required = true)
        public Long excessAmount;

        @NameInMap("LastPostTime")
        @Validation(required = true)
        public String lastPostTime;

        @NameInMap("PacketUsedBySearch")
        @Validation(required = true)
        public Long packetUsedBySearch;

        @NameInMap("PacketUsedByAdd")
        @Validation(required = true)
        public Long packetUsedByAdd;

        @NameInMap("ExcessAmountBySearch")
        @Validation(required = true)
        public Long excessAmountBySearch;

        @NameInMap("ExcessAmountByAdd")
        @Validation(required = true)
        public Long excessAmountByAdd;

        public static DescribeInstanceResponseInstanceMeasure build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseInstanceMeasure self = new DescribeInstanceResponseInstanceMeasure();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceResponseInstance extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OrderStatus")
        @Validation(required = true)
        public String orderStatus;

        @NameInMap("UpdateStatus")
        @Validation(required = true)
        public String updateStatus;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("ServiceType")
        @Validation(required = true)
        public Integer serviceType;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("DataplusInstanceId")
        @Validation(required = true)
        public String dataplusInstanceId;

        @NameInMap("IncrementStatus")
        @Validation(required = true)
        public String incrementStatus;

        @NameInMap("IncrementProgress")
        @Validation(required = true)
        public Float incrementProgress;

        @NameInMap("FullUpdateStatus")
        @Validation(required = true)
        public String fullUpdateStatus;

        @NameInMap("FullUpdatePullProgress")
        @Validation(required = true)
        public Float fullUpdatePullProgress;

        @NameInMap("Version")
        @Validation(required = true)
        public Integer version;

        @NameInMap("UtcExpireTime")
        @Validation(required = true)
        public String utcExpireTime;

        @NameInMap("FreeAddAmount")
        @Validation(required = true)
        public String freeAddAmount;

        @NameInMap("FreeAddUsed")
        @Validation(required = true)
        public String freeAddUsed;

        @NameInMap("Qps")
        @Validation(required = true)
        public Integer qps;

        @NameInMap("Capacity")
        @Validation(required = true)
        public Integer capacity;

        @NameInMap("FreeTrial")
        @Validation(required = true)
        public Boolean freeTrial;

        @NameInMap("Measure")
        @Validation(required = true)
        public DescribeInstanceResponseInstanceMeasure measure;

        public static DescribeInstanceResponseInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseInstance self = new DescribeInstanceResponseInstance();
            return TeaModel.build(map, self);
        }

    }

}
