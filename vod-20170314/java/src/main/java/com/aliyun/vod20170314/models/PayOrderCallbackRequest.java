// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class PayOrderCallbackRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("product")
    public String product;

    @NameInMap("version")
    public String version;

    @NameInMap("action")
    public String action;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("domain")
    public String domain;

    @NameInMap("data")
    public String data;

    public static PayOrderCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackRequest self = new PayOrderCallbackRequest();
        return TeaModel.build(map, self);
    }

}
