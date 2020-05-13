// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddMediaTagResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaInfoDTO")
    @Validation(required = true)
    public AddMediaTagResponseMediaInfoDTO mediaInfoDTO;

    public static AddMediaTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaTagResponse self = new AddMediaTagResponse();
        return TeaModel.build(map, self);
    }

    public static class AddMediaTagResponseMediaInfoDTO extends TeaModel {
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

        public static AddMediaTagResponseMediaInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            AddMediaTagResponseMediaInfoDTO self = new AddMediaTagResponseMediaInfoDTO();
            return TeaModel.build(map, self);
        }

    }

}
