// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetVideoPlayInfoForCloudResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PlayInfo")
    @Validation(required = true)
    public GetVideoPlayInfoForCloudResponsePlayInfo playInfo;

    @NameInMap("VideoInfo")
    @Validation(required = true)
    public GetVideoPlayInfoForCloudResponseVideoInfo videoInfo;

    public static GetVideoPlayInfoForCloudResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayInfoForCloudResponse self = new GetVideoPlayInfoForCloudResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVideoPlayInfoForCloudResponsePlayInfo extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("AuthInfo")
        @Validation(required = true)
        public String authInfo;

        @NameInMap("SecurityToken")
        @Validation(required = true)
        public String securityToken;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("PlayDomain")
        @Validation(required = true)
        public String playDomain;

        public static GetVideoPlayInfoForCloudResponsePlayInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayInfoForCloudResponsePlayInfo self = new GetVideoPlayInfoForCloudResponsePlayInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoPlayInfoForCloudResponseVideoInfo extends TeaModel {
        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public Long customerId;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        public static GetVideoPlayInfoForCloudResponseVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlayInfoForCloudResponseVideoInfo self = new GetVideoPlayInfoForCloudResponseVideoInfo();
            return TeaModel.build(map, self);
        }

    }

}
