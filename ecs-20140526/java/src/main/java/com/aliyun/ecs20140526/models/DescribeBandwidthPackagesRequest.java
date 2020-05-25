// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesRequest extends TeaModel {
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

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagesRequest self = new DescribeBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

}
