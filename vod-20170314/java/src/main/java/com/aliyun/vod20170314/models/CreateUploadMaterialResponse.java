// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CreateUploadMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaterialId")
    @Validation(required = true)
    public String materialId;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public String uploadAddress;

    @NameInMap("UploadAuth")
    @Validation(required = true)
    public String uploadAuth;

    public static CreateUploadMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMaterialResponse self = new CreateUploadMaterialResponse();
        return TeaModel.build(map, self);
    }

}
