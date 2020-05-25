// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VRouterId")
    public String VRouterId;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("RouterType")
    public String routerType;

    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DescribeRouteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesRequest self = new DescribeRouteTablesRequest();
        return TeaModel.build(map, self);
    }

}
