// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetBatchPlayInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("BatchPlayInfoList")]
        [Validation(Required=true)]
        public List<GetBatchPlayInfoResponseBatchPlayInfoList> BatchPlayInfoList { get; set; }
        public class GetBatchPlayInfoResponseBatchPlayInfoList : TeaModel {
            [NameInMap("VideoId")]
            [Validation(Required=true)]
            public string VideoId { get; set; }

            [NameInMap("ErrorCode")]
            [Validation(Required=true)]
            public string ErrorCode { get; set; }

            [NameInMap("ErrorMessage")]
            [Validation(Required=true)]
            public string ErrorMessage { get; set; }

            [NameInMap("HttpStatusCode")]
            [Validation(Required=true)]
            public long HttpStatusCode { get; set; }

            [NameInMap("PlayInfoList")]
            [Validation(Required=true)]
            public List<GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList> PlayInfoList { get; set; }
            public class GetBatchPlayInfoResponseBatchPlayInfoListPlayInfoList : TeaModel {
                [NameInMap("Width")]
                [Validation(Required=true)]
                public long Width { get; set; }

                [NameInMap("Height")]
                [Validation(Required=true)]
                public long Height { get; set; }

                [NameInMap("Size")]
                [Validation(Required=true)]
                public long Size { get; set; }

                [NameInMap("PlayURL")]
                [Validation(Required=true)]
                public string PlayURL { get; set; }

                [NameInMap("Bitrate")]
                [Validation(Required=true)]
                public string Bitrate { get; set; }

                [NameInMap("Definition")]
                [Validation(Required=true)]
                public string Definition { get; set; }

                [NameInMap("Duration")]
                [Validation(Required=true)]
                public string Duration { get; set; }

                [NameInMap("Format")]
                [Validation(Required=true)]
                public string Format { get; set; }

                [NameInMap("Fps")]
                [Validation(Required=true)]
                public string Fps { get; set; }

                [NameInMap("Encrypt")]
                [Validation(Required=true)]
                public long Encrypt { get; set; }

                [NameInMap("Plaintext")]
                [Validation(Required=true)]
                public string Plaintext { get; set; }

                [NameInMap("Complexity")]
                [Validation(Required=true)]
                public string Complexity { get; set; }

                [NameInMap("StreamType")]
                [Validation(Required=true)]
                public string StreamType { get; set; }

                [NameInMap("Rand")]
                [Validation(Required=true)]
                public string Rand { get; set; }

                [NameInMap("JobId")]
                [Validation(Required=true)]
                public string JobId { get; set; }

            }

        }

    }

}
