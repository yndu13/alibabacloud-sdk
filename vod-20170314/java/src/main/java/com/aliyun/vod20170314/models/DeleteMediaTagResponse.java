// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteMediaTagResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaInfoDTO")
    @Validation(required = true)
    public DeleteMediaTagResponseMediaInfoDTO mediaInfoDTO;

    public static DeleteMediaTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaTagResponse self = new DeleteMediaTagResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMediaTagResponseMediaInfoDTO extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public Long userId;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        public static DeleteMediaTagResponseMediaInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            DeleteMediaTagResponseMediaInfoDTO self = new DeleteMediaTagResponseMediaInfoDTO();
            return TeaModel.build(map, self);
        }

    }

}
