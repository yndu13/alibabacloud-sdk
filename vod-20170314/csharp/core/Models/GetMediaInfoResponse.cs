// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMediaInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Video")]
        [Validation(Required=true)]
        public GetMediaInfoResponseVideo Video { get; set; }
        public class GetMediaInfoResponseVideo : TeaModel {
            [NameInMap("VideoId")]
            [Validation(Required=true)]
            public string VideoId { get; set; }
            [NameInMap("Title")]
            [Validation(Required=true)]
            public string Title { get; set; }
            [NameInMap("Tags")]
            [Validation(Required=true)]
            public string Tags { get; set; }
            [NameInMap("Status")]
            [Validation(Required=true)]
            public string Status { get; set; }
            [NameInMap("Size")]
            [Validation(Required=true)]
            public long Size { get; set; }
            [NameInMap("Privilege")]
            [Validation(Required=true)]
            public int? Privilege { get; set; }
            [NameInMap("Duration")]
            [Validation(Required=true)]
            public long Duration { get; set; }
            [NameInMap("Description")]
            [Validation(Required=true)]
            public string Description { get; set; }
            [NameInMap("CustomerId")]
            [Validation(Required=true)]
            public long CustomerId { get; set; }
            [NameInMap("CreateTime")]
            [Validation(Required=true)]
            public string CreateTime { get; set; }
            [NameInMap("ModifyTime")]
            [Validation(Required=true)]
            public string ModifyTime { get; set; }
            [NameInMap("CoverURL")]
            [Validation(Required=true)]
            public string CoverURL { get; set; }
            [NameInMap("CateId")]
            [Validation(Required=true)]
            public int? CateId { get; set; }
            [NameInMap("Snapshots")]
            [Validation(Required=true)]
            public GetMediaInfoResponseVideoSnapshots Snapshots { get; set; }
            public class GetMediaInfoResponseVideoSnapshots : TeaModel {
                [NameInMap("Snapshot")]
                [Validation(Required=true)]
                public List<string> Snapshot { get; set; }

            }
        };

    }

}
