// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("TimeMerge")
    public String timeMerge;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("IspNameEn")
    public String ispNameEn;

    public static DescribeDomainBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataRequest self = new DescribeDomainBpsDataRequest();
        return TeaModel.build(map, self);
    }

}
