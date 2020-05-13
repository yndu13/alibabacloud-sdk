// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddMediaInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VideoId")
    @Validation(required = true)
    public String videoId;

    @NameInMap("UploadKey")
    @Validation(required = true)
    public String uploadKey;

    @NameInMap("UploadAddress")
    @Validation(required = true)
    public AddMediaInfoResponseUploadAddress uploadAddress;

    public static AddMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaInfoResponse self = new AddMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class AddMediaInfoResponseUploadAddress extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("Bucket")
        @Validation(required = true)
        public String bucket;

        @NameInMap("EndPoint")
        @Validation(required = true)
        public String endPoint;

        @NameInMap("Expiration")
        @Validation(required = true)
        public String expiration;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("SecurityToken")
        @Validation(required = true)
        public String securityToken;

        public static AddMediaInfoResponseUploadAddress build(java.util.Map<String, ?> map) throws Exception {
            AddMediaInfoResponseUploadAddress self = new AddMediaInfoResponseUploadAddress();
            return TeaModel.build(map, self);
        }

    }

}
