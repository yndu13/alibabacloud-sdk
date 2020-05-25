// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitsRequest extends TeaModel {
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

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Name")
    public String name;

    @NameInMap("Capacity")
    public Integer capacity;

    @NameInMap("StorageCapacityUnitId")
    public java.util.List<String> storageCapacityUnitId;

    @NameInMap("Status")
    public java.util.List<String> status;

    public static DescribeStorageCapacityUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitsRequest self = new DescribeStorageCapacityUnitsRequest();
        return TeaModel.build(map, self);
    }

}
