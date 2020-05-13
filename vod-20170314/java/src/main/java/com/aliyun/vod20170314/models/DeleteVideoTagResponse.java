// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class DeleteVideoTagResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaInfoDTO")
    @Validation(required = true)
    public DeleteVideoTagResponseMediaInfoDTO mediaInfoDTO;

    public static DeleteVideoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoTagResponse self = new DeleteVideoTagResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteVideoTagResponseMediaInfoDTO extends TeaModel {
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

        public static DeleteVideoTagResponseMediaInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            DeleteVideoTagResponseMediaInfoDTO self = new DeleteVideoTagResponseMediaInfoDTO();
            return TeaModel.build(map, self);
        }

    }

}
