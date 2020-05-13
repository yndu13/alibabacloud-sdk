// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddLiveStreamVideoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CustomerId")
    @Validation(required = true)
    public Long customerId;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("TranscodeGroupId")
    public String transcodeGroupId;

    @NameInMap("ResourceInfo")
    public String resourceInfo;

    @NameInMap("FileUrl")
    @Validation(required = true)
    public String fileUrl;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Title")
    public String title;

    @NameInMap("Tags")
    public String tags;

    public static AddLiveStreamVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamVideoRequest self = new AddLiveStreamVideoRequest();
        return TeaModel.build(map, self);
    }

}
