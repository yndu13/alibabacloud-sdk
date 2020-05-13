// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SubmitPreprocessJobsResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("TranscodeJobs")]
        [Validation(Required=true)]
        public SubmitPreprocessJobsResponseTranscodeJobs TranscodeJobs { get; set; }
        public class SubmitPreprocessJobsResponseTranscodeJobs : TeaModel {
            [NameInMap("TranscodeJob")]
            [Validation(Required=true)]
            public List<SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob> TranscodeJob { get; set; }
            public class SubmitPreprocessJobsResponseTranscodeJobsTranscodeJob : TeaModel {
                    public string JobId { get; set; }
            }
        };

    }

}
