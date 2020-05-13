// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetVideoDNAResultResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("AIVideoDNAResult")]
        [Validation(Required=true)]
        public GetVideoDNAResultResponseAIVideoDNAResult AIVideoDNAResult { get; set; }
        public class GetVideoDNAResultResponseAIVideoDNAResult : TeaModel {
            [NameInMap("FpShots")]
            [Validation(Required=true)]
            public List<GetVideoDNAResultResponseAIVideoDNAResultFpShots> FpShots { get; set; }
            public class GetVideoDNAResultResponseAIVideoDNAResultFpShots : TeaModel {
                    public string PrimaryKey { get; set; }
                    public string Similarity { get; set; }
                    public List<GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices> FpShotSlices { get; set; }
                    public class GetVideoDNAResultResponseAIVideoDNAResultFpShotsFpShotSlices : TeaModel {
                        [NameInMap("Start")]
                        [Validation(Required=true)]
                        public string Start { get; set; }

                        [NameInMap("Duration")]
                        [Validation(Required=true)]
                        public string Duration { get; set; }

                    }
            }
        };

    }

}
