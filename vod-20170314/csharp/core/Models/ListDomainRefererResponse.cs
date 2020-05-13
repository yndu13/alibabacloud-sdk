// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class ListDomainRefererResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public int? Total { get; set; }

        [NameInMap("AllowEmpty")]
        [Validation(Required=true)]
        public string AllowEmpty { get; set; }

        [NameInMap("RefererList")]
        [Validation(Required=true)]
        public ListDomainRefererResponseRefererList RefererList { get; set; }
        public class ListDomainRefererResponseRefererList : TeaModel {
            [NameInMap("RefererItem")]
            [Validation(Required=true)]
            public List<ListDomainRefererResponseRefererListRefererItem> RefererItem { get; set; }
            public class ListDomainRefererResponseRefererListRefererItem : TeaModel {
                    public long RefererId { get; set; }
                    public string Referer { get; set; }
                    public string CreateTime { get; set; }
            }
        };

    }

}
