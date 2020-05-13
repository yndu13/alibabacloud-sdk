// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetBatchPlayInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BatchPlayInfoList")
    @Validation(required = true)
    public java.util.List<GetBatchPlayInfoResponseBatchPlayInfoList> batchPlayInfoList;

    public static GetBatchPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchPlayInfoResponse self = new GetBatchPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Long width;

        @NameInMap("Height")
        @Validation(required = true)
        public Long height;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("PlayURL")
        @Validation(required = true)
        public String playURL;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("Encrypt")
        @Validation(required = true)
        public Long encrypt;

        @NameInMap("Plaintext")
        @Validation(required = true)
        public String plaintext;

        @NameInMap("Complexity")
        @Validation(required = true)
        public String complexity;

        @NameInMap("StreamType")
        @Validation(required = true)
        public String streamType;

        @NameInMap("Rand")
        @Validation(required = true)
        public String rand;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList self = new GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetBatchPlayInfoResponseBatchPlayInfoList extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("HttpStatusCode")
        @Validation(required = true)
        public Long httpStatusCode;

        @NameInMap("PlayInfoList")
        @Validation(required = true)
        public java.util.List<GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList> playInfoList;

        public static GetBatchPlayInfoResponseBatchPlayInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchPlayInfoResponseBatchPlayInfoList self = new GetBatchPlayInfoResponseBatchPlayInfoList();
            return TeaModel.build(map, self);
        }

    }

}
