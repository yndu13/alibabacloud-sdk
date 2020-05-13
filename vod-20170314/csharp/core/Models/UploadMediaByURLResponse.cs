// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UploadMediaByURLResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UploadJobs")]
        [Validation(Required=true)]
        public UploadMediaByURLResponseUploadJobs UploadJobs { get; set; }
        public class UploadMediaByURLResponseUploadJobs : TeaModel {
            [NameInMap("UploadJob")]
            [Validation(Required=true)]
            public List<UploadMediaByURLResponseUploadJobsUploadJob> UploadJob { get; set; }
            public class UploadMediaByURLResponseUploadJobsUploadJob : TeaModel {
                    public string JobId { get; set; }
                    public string SourceURL { get; set; }
            }
        };

    }

}
