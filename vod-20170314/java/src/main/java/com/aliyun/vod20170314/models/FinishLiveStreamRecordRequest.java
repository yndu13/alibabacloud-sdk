// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class FinishLiveStreamRecordRequest extends TeaModel {
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

    @NameInMap("AutoCompose")
    public String autoCompose;

    @NameInMap("TranscodeGroupId")
    public String transcodeGroupId;

    public static FinishLiveStreamRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishLiveStreamRecordRequest self = new FinishLiveStreamRecordRequest();
        return TeaModel.build(map, self);
    }

}
