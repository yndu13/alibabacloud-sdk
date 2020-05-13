// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppEncryptKey")
    @Validation(required = true)
    public String appEncryptKey;

    public static GenerateDownloadSecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadSecretKeyResponse self = new GenerateDownloadSecretKeyResponse();
        return TeaModel.build(map, self);
    }

}
