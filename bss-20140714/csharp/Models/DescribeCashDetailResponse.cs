// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Bss20140714.Models
{
    public class DescribeCashDetailResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("BalanceAmount")]
        [Validation(Required=true)]
        public string BalanceAmount { get; set; }

        [NameInMap("AmountOwed")]
        [Validation(Required=true)]
        public string AmountOwed { get; set; }

        [NameInMap("EnableThresholdAlert")]
        [Validation(Required=true)]
        public string EnableThresholdAlert { get; set; }

        [NameInMap("MiniAlertThreshold")]
        [Validation(Required=true)]
        public long MiniAlertThreshold { get; set; }

        [NameInMap("FrozenAmount")]
        [Validation(Required=true)]
        public string FrozenAmount { get; set; }

        [NameInMap("CreditCardAmount")]
        [Validation(Required=true)]
        public string CreditCardAmount { get; set; }

        [NameInMap("RemmitanceAmount")]
        [Validation(Required=true)]
        public string RemmitanceAmount { get; set; }

        [NameInMap("CreditLimit")]
        [Validation(Required=true)]
        public string CreditLimit { get; set; }

        [NameInMap("AvailableCredit")]
        [Validation(Required=true)]
        public string AvailableCredit { get; set; }

    }

}
