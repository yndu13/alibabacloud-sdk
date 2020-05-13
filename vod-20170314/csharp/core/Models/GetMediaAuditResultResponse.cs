// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMediaAuditResultResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MediaAuditResult")]
        [Validation(Required=true)]
        public GetMediaAuditResultResponseMediaAuditResult MediaAuditResult { get; set; }
        public class GetMediaAuditResultResponseMediaAuditResult : TeaModel {
            [NameInMap("AbnormalModules")]
            [Validation(Required=true)]
            public string AbnormalModules { get; set; }
            [NameInMap("Label")]
            [Validation(Required=true)]
            public string Label { get; set; }
            [NameInMap("Suggestion")]
            [Validation(Required=true)]
            public string Suggestion { get; set; }
            [NameInMap("ImageResult")]
            [Validation(Required=true)]
            public List<GetMediaAuditResultResponseMediaAuditResultImageResult> ImageResult { get; set; }
            public class GetMediaAuditResultResponseMediaAuditResultImageResult : TeaModel {
                    public string Suggestion { get; set; }
                    public string Label { get; set; }
                    public string Type { get; set; }
                    public string Url { get; set; }
                    public List<GetMediaAuditResultResponseMediaAuditResultImageResultResult> Result { get; set; }
                    public class GetMediaAuditResultResponseMediaAuditResultImageResultResult : TeaModel {
                            public string Suggestion { get; set; }
                            public string Label { get; set; }
                            public string Score { get; set; }
                            public string Scene { get; set; }
                    }
            }
            [NameInMap("TextResult")]
            [Validation(Required=true)]
            public List<GetMediaAuditResultResponseMediaAuditResultTextResult> TextResult { get; set; }
            public class GetMediaAuditResultResponseMediaAuditResultTextResult : TeaModel {
                    public string Suggestion { get; set; }
                    public string Label { get; set; }
                    public string Score { get; set; }
                    public string Scene { get; set; }
                    public string Type { get; set; }
                    public string Content { get; set; }
            }
            [NameInMap("VideoResult")]
            [Validation(Required=true)]
            public GetMediaAuditResultResponseMediaAuditResultVideoResult VideoResult { get; set; }
            public class GetMediaAuditResultResponseMediaAuditResultVideoResult : TeaModel {
                [NameInMap("Suggestion")]
                [Validation(Required=true)]
                public string Suggestion { get; set; }

                [NameInMap("Label")]
                [Validation(Required=true)]
                public string Label { get; set; }

                [NameInMap("TerrorismResult")]
                [Validation(Required=true)]
                public GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult TerrorismResult { get; set; }
                public class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult : TeaModel {
                    [NameInMap("Suggestion")]
                    [Validation(Required=true)]
                    public string Suggestion { get; set; }
                    [NameInMap("Label")]
                    [Validation(Required=true)]
                    public string Label { get; set; }
                    [NameInMap("MaxScore")]
                    [Validation(Required=true)]
                    public string MaxScore { get; set; }
                    [NameInMap("AverageScore")]
                    [Validation(Required=true)]
                    public string AverageScore { get; set; }
                    [NameInMap("CounterList")]
                    [Validation(Required=true)]
                    public List<GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList> CounterList { get; set; }
                    public class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList : TeaModel {
                            public string Label { get; set; }
                            public int? Count { get; set; }
                    }
                    [NameInMap("TopList")]
                    [Validation(Required=true)]
                    public List<GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList> TopList { get; set; }
                    public class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList : TeaModel {
                            public string Label { get; set; }
                            public string Score { get; set; }
                            public string Timestamp { get; set; }
                            public string Url { get; set; }
                    }
                };

                [NameInMap("PornResult")]
                [Validation(Required=true)]
                public GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult PornResult { get; set; }
                public class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult : TeaModel {
                    [NameInMap("Suggestion")]
                    [Validation(Required=true)]
                    public string Suggestion { get; set; }
                    [NameInMap("Label")]
                    [Validation(Required=true)]
                    public string Label { get; set; }
                    [NameInMap("MaxScore")]
                    [Validation(Required=true)]
                    public string MaxScore { get; set; }
                    [NameInMap("AverageScore")]
                    [Validation(Required=true)]
                    public string AverageScore { get; set; }
                    [NameInMap("CounterList")]
                    [Validation(Required=true)]
                    public List<GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList> CounterList { get; set; }
                    public class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList : TeaModel {
                            public string Label { get; set; }
                            public int? Count { get; set; }
                    }
                    [NameInMap("TopList")]
                    [Validation(Required=true)]
                    public List<GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList> TopList { get; set; }
                    public class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList : TeaModel {
                            public string Label { get; set; }
                            public string Score { get; set; }
                            public string Timestamp { get; set; }
                            public string Url { get; set; }
                    }
                };

            }
        };

    }

}
