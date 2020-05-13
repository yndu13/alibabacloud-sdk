// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeUserVvTopByDayRequest : TeaModel {
        [NameInMap("SecurityToken")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("VideoType")]
        [Validation(Required=true)]
        public string VideoType { get; set; }

        [NameInMap("Bizdate")]
        [Validation(Required=true)]
        public string Bizdate { get; set; }

    }

}
