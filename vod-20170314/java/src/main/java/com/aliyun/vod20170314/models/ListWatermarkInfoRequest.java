// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListWatermarkInfoRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WatermarkType")
    @Validation(required = true)
    public String watermarkType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListWatermarkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkInfoRequest self = new ListWatermarkInfoRequest();
        return TeaModel.build(map, self);
    }

}
