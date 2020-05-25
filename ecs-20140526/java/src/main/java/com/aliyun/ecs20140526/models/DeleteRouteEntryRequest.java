// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryRequest extends TeaModel {
    @NameInMap("NextHopList")
    public java.util.List<DeleteRouteEntryRequestNextHopList> nextHopList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    public String destinationCidrBlock;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryRequest self = new DeleteRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public static class DeleteRouteEntryRequestNextHopList extends TeaModel {
        @NameInMap("NextHopType")
        @Validation(required = true)
        public String nextHopType;

        @NameInMap("NextHopId")
        @Validation(required = true)
        public String nextHopId;

        public static DeleteRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteEntryRequestNextHopList self = new DeleteRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

    }

}
