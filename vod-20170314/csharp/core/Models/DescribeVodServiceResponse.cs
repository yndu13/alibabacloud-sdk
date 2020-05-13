// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class DescribeVodServiceResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("InstanceId")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        [NameInMap("InternetChargeType")]
        [Validation(Required=true)]
        public string InternetChargeType { get; set; }

        [NameInMap("OpeningTime")]
        [Validation(Required=true)]
        public string OpeningTime { get; set; }

        [NameInMap("ChangingChargeType")]
        [Validation(Required=true)]
        public string ChangingChargeType { get; set; }

        [NameInMap("ChangingAffectTime")]
        [Validation(Required=true)]
        public string ChangingAffectTime { get; set; }

        [NameInMap("OperationLocks")]
        [Validation(Required=true)]
        public DescribeVodServiceResponseOperationLocks OperationLocks { get; set; }
        public class DescribeVodServiceResponseOperationLocks : TeaModel {
            [NameInMap("LockReason")]
            [Validation(Required=true)]
            public List<DescribeVodServiceResponseOperationLocksLockReason> LockReason { get; set; }
            public class DescribeVodServiceResponseOperationLocksLockReason : TeaModel {
                    public string LockReason { get; set; }
            }
        };

    }

}
