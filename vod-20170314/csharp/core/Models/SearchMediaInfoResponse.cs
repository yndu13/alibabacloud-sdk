// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SearchMediaInfoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public int? Total { get; set; }

        [NameInMap("VideoList")]
        [Validation(Required=true)]
        public SearchMediaInfoResponseVideoList VideoList { get; set; }
        public class SearchMediaInfoResponseVideoList : TeaModel {
            [NameInMap("MediaInfo")]
            [Validation(Required=true)]
            public List<SearchMediaInfoResponseVideoListMediaInfo> MediaInfo { get; set; }
            public class SearchMediaInfoResponseVideoListMediaInfo : TeaModel {
                    public string VideoId { get; set; }
                    public string Title { get; set; }
                    public string Tags { get; set; }
                    public string Status { get; set; }
                    public long Size { get; set; }
                    public int? Privilege { get; set; }
                    public long Duration { get; set; }
                    public string Description { get; set; }
                    public long CustomerId { get; set; }
                    public string CreateTime { get; set; }
                    public string ModifyTime { get; set; }
                    public string CoverURL { get; set; }
                    public int? CateId { get; set; }
                    public SearchMediaInfoResponseVideoListMediaInfoSnapshots Snapshots { get; set; }
                    public class SearchMediaInfoResponseVideoListMediaInfoSnapshots : TeaModel {
                        [NameInMap("Snapshot")]
                        [Validation(Required=true)]
                        public List<string> Snapshot { get; set; }

                    }
            }
        };

    }

}
