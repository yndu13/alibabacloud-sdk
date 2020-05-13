// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetVideoPlayInfoForCloudResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("PlayInfo")]
        [Validation(Required=true)]
        public GetVideoPlayInfoForCloudResponsePlayInfo PlayInfo { get; set; }
        public class GetVideoPlayInfoForCloudResponsePlayInfo : TeaModel {
            [NameInMap("AccessKeyId")]
            [Validation(Required=true)]
            public string AccessKeyId { get; set; }
            [NameInMap("AccessKeySecret")]
            [Validation(Required=true)]
            public string AccessKeySecret { get; set; }
            [NameInMap("AuthInfo")]
            [Validation(Required=true)]
            public string AuthInfo { get; set; }
            [NameInMap("SecurityToken")]
            [Validation(Required=true)]
            public string SecurityToken { get; set; }
            [NameInMap("Region")]
            [Validation(Required=true)]
            public string Region { get; set; }
            [NameInMap("PlayDomain")]
            [Validation(Required=true)]
            public string PlayDomain { get; set; }
        };

        [NameInMap("VideoInfo")]
        [Validation(Required=true)]
        public GetVideoPlayInfoForCloudResponseVideoInfo VideoInfo { get; set; }
        public class GetVideoPlayInfoForCloudResponseVideoInfo : TeaModel {
            [NameInMap("CoverURL")]
            [Validation(Required=true)]
            public string CoverURL { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public long CustomerId { get; set; }
            [NameInMap("Duration")]
            [Validation(Required=true)]
            public float? Duration { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("Title")]
            [Validation(Required=true)]
            public string Title { get; set; }
            [NameInMap("VideoId")]
            [Validation(Required=true)]
            public string VideoId { get; set; }
        };

    }

}
