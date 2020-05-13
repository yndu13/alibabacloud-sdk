// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddVideoTagResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaInfoDTO")
    @Validation(required = true)
    public AddVideoTagResponseMediaInfoDTO mediaInfoDTO;

    public static AddVideoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVideoTagResponse self = new AddVideoTagResponse();
        return TeaModel.build(map, self);
    }

    public static class AddVideoTagResponseMediaInfoDTO extends TeaModel {
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

        public static AddVideoTagResponseMediaInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            AddVideoTagResponseMediaInfoDTO self = new AddVideoTagResponseMediaInfoDTO();
            return TeaModel.build(map, self);
        }

    }

}
