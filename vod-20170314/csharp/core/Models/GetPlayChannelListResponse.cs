// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetPlayChannelListResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public int? Total { get; set; }

        [NameInMap("PlayKeyList")]
        [Validation(Required=true)]
        public GetPlayChannelListResponsePlayKeyList PlayKeyList { get; set; }
        public class GetPlayChannelListResponsePlayKeyList : TeaModel {
            [NameInMap("PlayKey")]
            [Validation(Required=true)]
            public List<GetPlayChannelListResponsePlayKeyListPlayKey> PlayKey { get; set; }
            public class GetPlayChannelListResponsePlayKeyListPlayKey : TeaModel {
                    public string Channel { get; set; }
                    public string CreateTime { get; set; }
                    public string ModifyTime { get; set; }
                    public string SignVersion { get; set; }
                    public string Description { get; set; }
                    public string ClientVersion { get; set; }
                    public string Status { get; set; }
                    public string Source { get; set; }
            }
        };

    }

}
