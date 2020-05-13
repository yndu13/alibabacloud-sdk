// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class CreateUploadMediaFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaFileInfo")
    @Validation(required = true)
    public CreateUploadMediaFileResponseMediaFileInfo mediaFileInfo;

    public static CreateUploadMediaFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaFileResponse self = new CreateUploadMediaFileResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateUploadMediaFileResponseMediaFileInfo extends TeaModel {
        @NameInMap("MediaFileId")
        @Validation(required = true)
        public String mediaFileId;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("UserData")
        @Validation(required = true)
        public String userData;

        @NameInMap("MediaFilePath")
        @Validation(required = true)
        public String mediaFilePath;

        @NameInMap("MediaFileAuth")
        @Validation(required = true)
        public String mediaFileAuth;

        @NameInMap("MediaFileURL")
        @Validation(required = true)
        public String mediaFileURL;

        public static CreateUploadMediaFileResponseMediaFileInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadMediaFileResponseMediaFileInfo self = new CreateUploadMediaFileResponseMediaFileInfo();
            return TeaModel.build(map, self);
        }

    }

}
