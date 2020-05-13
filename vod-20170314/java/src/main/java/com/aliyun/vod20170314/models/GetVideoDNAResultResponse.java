// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetVideoDNAResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIVideoDNAResult")
    @Validation(required = true)
    public GetVideoDNAResultResponseAIVideoDNAResult AIVideoDNAResult;

    public static GetVideoDNAResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDNAResultResponse self = new GetVideoDNAResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesInput extends TeaModel {
        @NameInMap("Start")
        @Validation(required = true)
        public String start;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesInput build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesInput self = new GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesInput();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesDuplication extends TeaModel {
        @NameInMap("Start")
        @Validation(required = true)
        public String start;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        public static GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesDuplication build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesDuplication self = new GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesDuplication();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices extends TeaModel {
        @NameInMap("Input")
        @Validation(required = true)
        public GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesInput input;

        @NameInMap("Duplication")
        @Validation(required = true)
        public GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlicesDuplication duplication;

        public static GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices self = new GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoDNAResultResponseAIVideoDNAResultFpShots extends TeaModel {
        @NameInMap("PrimaryKey")
        @Validation(required = true)
        public String primaryKey;

        @NameInMap("Similarity")
        @Validation(required = true)
        public String similarity;

        @NameInMap("FpShotSlices")
        @Validation(required = true)
        public java.util.List<GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices> fpShotSlices;

        public static GetVideoDNAResultResponseAIVideoDNAResultFpShots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseAIVideoDNAResultFpShots self = new GetVideoDNAResultResponseAIVideoDNAResultFpShots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetVideoDNAResultResponseAIVideoDNAResult extends TeaModel {
        @NameInMap("FpShots")
        @Validation(required = true)
        public java.util.List<GetVideoDNAResultResponseAIVideoDNAResultFpShots> fpShots;

        public static GetVideoDNAResultResponseAIVideoDNAResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseAIVideoDNAResult self = new GetVideoDNAResultResponseAIVideoDNAResult();
            return TeaModel.build(map, self);
        }

    }

}
