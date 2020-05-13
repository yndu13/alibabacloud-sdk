// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetThirdPartPlayPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("ContentId")
    @Validation(required = true)
    public String contentId;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("AuthTimestamp")
    @Validation(required = true)
    public Long authTimestamp;

    @NameInMap("AuthInfo")
    @Validation(required = true)
    public String authInfo;

    public static GetThirdPartPlayPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThirdPartPlayPolicyRequest self = new GetThirdPartPlayPolicyRequest();
        return TeaModel.build(map, self);
    }

}
