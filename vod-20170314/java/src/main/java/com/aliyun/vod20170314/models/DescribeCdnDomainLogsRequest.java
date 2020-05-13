// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainLogsRequest extends TeaModel {
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
    @Validation(required = true)
    public String domainName;

    @NameInMap("LogDay")
    public String logDay;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNo")
    public Long pageNo;

    public static DescribeCdnDomainLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainLogsRequest self = new DescribeCdnDomainLogsRequest();
        return TeaModel.build(map, self);
    }

}
