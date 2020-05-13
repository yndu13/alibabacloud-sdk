// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class QueryUploadInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Bucket")
    @Validation(required = true)
    public String bucket;

    @NameInMap("Endpoint")
    @Validation(required = true)
    public String endpoint;

    @NameInMap("FileDir")
    @Validation(required = true)
    public String fileDir;

    @NameInMap("ResourceOwnerId")
    @Validation(required = true)
    public Long resourceOwnerId;

    public static QueryUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUploadInfoResponse self = new QueryUploadInfoResponse();
        return TeaModel.build(map, self);
    }

}
