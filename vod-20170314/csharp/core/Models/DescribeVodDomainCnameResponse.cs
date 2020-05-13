// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodDomainCnameResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("CnameDatas")]
        [Validation(Required=true)]
        public DescribeVodDomainCnameResponseCnameDatas CnameDatas { get; set; }
        public class DescribeVodDomainCnameResponseCnameDatas : TeaModel {
            [NameInMap("Data")]
            [Validation(Required=true)]
            public List<DescribeVodDomainCnameResponseCnameDatasData> Data { get; set; }
            public class DescribeVodDomainCnameResponseCnameDatasData : TeaModel {
                    public string Domain { get; set; }
                    public string Cname { get; set; }
                    public int? Status { get; set; }
            }
        };

    }

}
