// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SystemDiskPolicyEnabled")
    public Boolean systemDiskPolicyEnabled;

    @NameInMap("SystemDiskPolicyTimePeriod")
    public Integer systemDiskPolicyTimePeriod;

    @NameInMap("SystemDiskPolicyRetentionDays")
    public Integer systemDiskPolicyRetentionDays;

    @NameInMap("SystemDiskPolicyRetentionLastWeek")
    public Boolean systemDiskPolicyRetentionLastWeek;

    @NameInMap("DataDiskPolicyEnabled")
    public Boolean dataDiskPolicyEnabled;

    @NameInMap("DataDiskPolicyTimePeriod")
    public Integer dataDiskPolicyTimePeriod;

    @NameInMap("DataDiskPolicyRetentionDays")
    public Integer dataDiskPolicyRetentionDays;

    @NameInMap("DataDiskPolicyRetentionLastWeek")
    public Boolean dataDiskPolicyRetentionLastWeek;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyRequest self = new ModifyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

}
