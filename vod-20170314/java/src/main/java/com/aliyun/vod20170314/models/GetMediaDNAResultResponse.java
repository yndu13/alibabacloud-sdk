// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMediaDNAResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DNAResult")
    @Validation(required = true)
    public GetMediaDNAResultResponseDNAResult DNAResult;

    public static GetMediaDNAResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaDNAResultResponse self = new GetMediaDNAResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesInput extends TeaModel {
        @NameInMap("Start")
        @Validation(required = true)
        public String start;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesInput build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesInput self = new GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesInput();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesDuplication extends TeaModel {
        @NameInMap("Start")
        @Validation(required = true)
        public String start;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesDuplication build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesDuplication self = new GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesDuplication();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlices extends TeaModel {
        @NameInMap("Input")
        @Validation(required = true)
        public GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesInput input;

        @NameInMap("Duplication")
        @Validation(required = true)
        public GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlicesDuplication duplication;

        public static GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlices build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlices self = new GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlices();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResultVideoDNA extends TeaModel {
        @NameInMap("PrimaryKey")
        @Validation(required = true)
        public String primaryKey;

        @NameInMap("Similarity")
        @Validation(required = true)
        public String similarity;

        @NameInMap("FpShotSlices")
        @Validation(required = true)
        public java.util.List<GetMediaDNAResultResponseDNAResultVideoDNAFpShotSlices> fpShotSlices;

        public static GetMediaDNAResultResponseDNAResultVideoDNA build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResultVideoDNA self = new GetMediaDNAResultResponseDNAResultVideoDNA();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaDNAResultResponseDNAResult extends TeaModel {
        @NameInMap("VideoDNA")
        @Validation(required = true)
        public java.util.List<GetMediaDNAResultResponseDNAResultVideoDNA> videoDNA;

        public static GetMediaDNAResultResponseDNAResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseDNAResult self = new GetMediaDNAResultResponseDNAResult();
            return TeaModel.build(map, self);
        }

    }

}
