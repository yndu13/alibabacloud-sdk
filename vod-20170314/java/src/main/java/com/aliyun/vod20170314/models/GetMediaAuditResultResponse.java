// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaAuditResult")
    @Validation(required = true)
    public GetMediaAuditResultResponseMediaAuditResult mediaAuditResult;

    public static GetMediaAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultResponse self = new GetMediaAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaAuditResultResponseMediaAuditResultImageResultResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        public static GetMediaAuditResultResponseMediaAuditResultImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultImageResultResult self = new GetMediaAuditResultResponseMediaAuditResultImageResultResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultImageResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultImageResultResult> result;

        public static GetMediaAuditResultResponseMediaAuditResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultImageResult self = new GetMediaAuditResultResponseMediaAuditResultImageResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultTextResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static GetMediaAuditResultResponseMediaAuditResultTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultTextResult self = new GetMediaAuditResultResponseMediaAuditResultTextResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("TerrorismResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult terrorismResult;

        @NameInMap("PornResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult pornResult;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResult extends TeaModel {
        @NameInMap("AbnormalModules")
        @Validation(required = true)
        public String abnormalModules;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("ImageResult")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultImageResult> imageResult;

        @NameInMap("TextResult")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultTextResult> textResult;

        @NameInMap("VideoResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResult videoResult;

        public static GetMediaAuditResultResponseMediaAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResult self = new GetMediaAuditResultResponseMediaAuditResult();
            return TeaModel.build(map, self);
        }

    }

}
