// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddThirdPartPlayPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("PolicyInfoList")
    @Validation(required = true)
    public String policyInfoList;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("AuthTimestamp")
    @Validation(required = true)
    public Long authTimestamp;

    @NameInMap("AuthInfo")
    @Validation(required = true)
    public String authInfo;

    public static AddThirdPartPlayPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddThirdPartPlayPolicyRequest self = new AddThirdPartPlayPolicyRequest();
        return TeaModel.build(map, self);
    }

}
