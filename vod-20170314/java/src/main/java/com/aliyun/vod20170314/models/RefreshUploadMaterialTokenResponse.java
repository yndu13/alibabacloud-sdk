// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class RefreshUploadMaterialTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UploadAuth")
    @Validation(required = true)
    public String uploadAuth;

    public static RefreshUploadMaterialTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadMaterialTokenResponse self = new RefreshUploadMaterialTokenResponse();
        return TeaModel.build(map, self);
    }

}
