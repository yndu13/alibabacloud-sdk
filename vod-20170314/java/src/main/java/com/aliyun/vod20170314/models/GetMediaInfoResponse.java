// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMediaInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Video")
    @Validation(required = true)
    public GetMediaInfoResponseVideo video;

    public static GetMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoResponse self = new GetMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaInfoResponseVideoSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetMediaInfoResponseVideoSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseVideoSnapshots self = new GetMediaInfoResponseVideoSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaInfoResponseVideo extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Privilege")
        @Validation(required = true)
        public Integer privilege;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public Long customerId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Integer cateId;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public GetMediaInfoResponseVideoSnapshots snapshots;

        public static GetMediaInfoResponseVideo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaInfoResponseVideo self = new GetMediaInfoResponseVideo();
            return TeaModel.build(map, self);
        }

    }

}
