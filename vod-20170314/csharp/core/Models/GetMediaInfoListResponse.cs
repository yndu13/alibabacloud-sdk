// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMediaInfoListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("VideoList")]
        [Validation(Required=true)]
        public GetMediaInfoListResponseVideoList VideoList { get; set; }
        public class GetMediaInfoListResponseVideoList : TeaModel {
            [NameInMap("MediaInfo")]
            [Validation(Required=true)]
            public List<GetMediaInfoListResponseVideoListMediaInfo> MediaInfo { get; set; }
            public class GetMediaInfoListResponseVideoListMediaInfo : TeaModel {
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
                    public GetMediaInfoListResponseVideoListMediaInfoSnapshots Snapshots { get; set; }
                    public class GetMediaInfoListResponseVideoListMediaInfoSnapshots : TeaModel {
                        [NameInMap("Snapshot")]
                        [Validation(Required=true)]
                        public List<string> Snapshot { get; set; }

                    }
            }
        };

    }

}
