// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodUserQuotaResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("DomainQuota")]
        [Validation(Required=true)]
        public int? DomainQuota { get; set; }

        [NameInMap("RefreshUrlQuota")]
        [Validation(Required=true)]
        public int? RefreshUrlQuota { get; set; }

        [NameInMap("RefreshDirQuota")]
        [Validation(Required=true)]
        public int? RefreshDirQuota { get; set; }

        [NameInMap("RefreshUrlRemain")]
        [Validation(Required=true)]
        public int? RefreshUrlRemain { get; set; }

        [NameInMap("RefreshDirRemain")]
        [Validation(Required=true)]
        public int? RefreshDirRemain { get; set; }

        [NameInMap("PreloadQuota")]
        [Validation(Required=true)]
        public int? PreloadQuota { get; set; }

        [NameInMap("PreloadRemain")]
        [Validation(Required=true)]
        public int? PreloadRemain { get; set; }

        [NameInMap("BlockQuota")]
        [Validation(Required=true)]
        public int? BlockQuota { get; set; }

        [NameInMap("BlockRemain")]
        [Validation(Required=true)]
        public int? BlockRemain { get; set; }

    }

}
