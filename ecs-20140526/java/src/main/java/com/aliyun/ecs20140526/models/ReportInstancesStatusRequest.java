// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    @NameInMap("Device")
    public java.util.List<String> device;

    @NameInMap("Reason")
    @Validation(required = true)
    public String reason;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static ReportInstancesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportInstancesStatusRequest self = new ReportInstancesStatusRequest();
        return TeaModel.build(map, self);
    }

}
