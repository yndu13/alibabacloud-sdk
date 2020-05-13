// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaAuditJob")
    @Validation(required = true)
    public GetAIMediaAuditJobResponseMediaAuditJob mediaAuditJob;

    public static GetAIMediaAuditJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIMediaAuditJobResponse self = new GetAIMediaAuditJobResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataImageResultResult extends TeaModel {
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

        public static GetAIMediaAuditJobResponseMediaAuditJobDataImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataImageResultResult self = new GetAIMediaAuditJobResponseMediaAuditJobDataImageResultResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataImageResult extends TeaModel {
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
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataImageResultResult> result;

        public static GetAIMediaAuditJobResponseMediaAuditJobDataImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataImageResult self = new GetAIMediaAuditJobResponseMediaAuditJobDataImageResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataTextResult extends TeaModel {
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

        public static GetAIMediaAuditJobResponseMediaAuditJobDataTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataTextResult self = new GetAIMediaAuditJobResponseMediaAuditJobDataTextResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultCounterList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultCounterList self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultTopList extends TeaModel {
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

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultTopList self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResult extends TeaModel {
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
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResultTopList> topList;

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResult self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultCounterList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultCounterList self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultTopList extends TeaModel {
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

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultTopList self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResult extends TeaModel {
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
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResultTopList> topList;

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResult self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobDataVideoResult extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("TerrorismResult")
        @Validation(required = true)
        public GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultTerrorismResult terrorismResult;

        @NameInMap("PornResult")
        @Validation(required = true)
        public GetAIMediaAuditJobResponseMediaAuditJobDataVideoResultPornResult pornResult;

        public static GetAIMediaAuditJobResponseMediaAuditJobDataVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobDataVideoResult self = new GetAIMediaAuditJobResponseMediaAuditJobDataVideoResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJobData extends TeaModel {
        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("AbnormalModules")
        @Validation(required = true)
        public String abnormalModules;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("ImageResult")
        @Validation(required = true)
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataImageResult> imageResult;

        @NameInMap("TextResult")
        @Validation(required = true)
        public java.util.List<GetAIMediaAuditJobResponseMediaAuditJobDataTextResult> textResult;

        @NameInMap("VideoResult")
        @Validation(required = true)
        public GetAIMediaAuditJobResponseMediaAuditJobDataVideoResult videoResult;

        public static GetAIMediaAuditJobResponseMediaAuditJobData build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJobData self = new GetAIMediaAuditJobResponseMediaAuditJobData();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIMediaAuditJobResponseMediaAuditJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CompleteTime")
        @Validation(required = true)
        public String completeTime;

        @NameInMap("Data")
        @Validation(required = true)
        public GetAIMediaAuditJobResponseMediaAuditJobData data;

        public static GetAIMediaAuditJobResponseMediaAuditJob build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseMediaAuditJob self = new GetAIMediaAuditJobResponseMediaAuditJob();
            return TeaModel.build(map, self);
        }

    }

}
