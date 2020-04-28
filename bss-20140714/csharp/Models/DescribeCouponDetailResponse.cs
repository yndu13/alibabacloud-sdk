// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Bss20140714.Models
{
    public class DescribeCouponDetailResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("CouponTemplateId")]
        [Validation(Required=true)]
        public long CouponTemplateId { get; set; }

        [NameInMap("TotalAmount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        [NameInMap("BalanceAmount")]
        [Validation(Required=true)]
        public string BalanceAmount { get; set; }

        [NameInMap("FrozenAmount")]
        [Validation(Required=true)]
        public string FrozenAmount { get; set; }

        [NameInMap("ExpiredAmount")]
        [Validation(Required=true)]
        public string ExpiredAmount { get; set; }

        [NameInMap("DeliveryTime")]
        [Validation(Required=true)]
        public string DeliveryTime { get; set; }

        [NameInMap("ExpiredTime")]
        [Validation(Required=true)]
        public string ExpiredTime { get; set; }

        [NameInMap("CouponNumber")]
        [Validation(Required=true)]
        public string CouponNumber { get; set; }

        [NameInMap("Status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        [NameInMap("Description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        [NameInMap("CreationTime")]
        [Validation(Required=true)]
        public string CreationTime { get; set; }

        [NameInMap("ModificationTime")]
        [Validation(Required=true)]
        public string ModificationTime { get; set; }

        [NameInMap("PriceLimit")]
        [Validation(Required=true)]
        public string PriceLimit { get; set; }

        [NameInMap("Application")]
        [Validation(Required=true)]
        public string Application { get; set; }

        [NameInMap("ProductCodes")]
        [Validation(Required=true)]
        public DescribeCouponDetailResponseProductCodes ProductCodes { get; set; }
        public class DescribeCouponDetailResponseProductCodes : TeaModel {
            [NameInMap("ProductCode")]
            [Validation(Required=true)]
            public List<string> ProductCode { get; set; }
        };

        [NameInMap("TradeTypes")]
        [Validation(Required=true)]
        public DescribeCouponDetailResponseTradeTypes TradeTypes { get; set; }
        public class DescribeCouponDetailResponseTradeTypes : TeaModel {
            [NameInMap("TradeType")]
            [Validation(Required=true)]
            public List<string> TradeType { get; set; }
        };

    }

}
