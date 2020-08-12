// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.ImageSearch20180319.Models
{
    public class SearchItemResponseBody : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        [NameInMap("Message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        [NameInMap("Code")]
        [Validation(Required=true)]
        public int? Code { get; set; }

        [NameInMap("Auctions")]
        [Validation(Required=true)]
        public SearchItemResponseBodyAuctions Auctions { get; set; }
        public class SearchItemResponseBodyAuctions : TeaModel {
            [NameInMap("Auction")]
            [Validation(Required=true)]
            public List<SearchItemResponseBodyAuctionsAuction> Auction { get; set; }
            public class SearchItemResponseBodyAuctionsAuction : TeaModel {
                    public string CustContent { get; set; }
                    public string ItemId { get; set; }
                    public string SortExprValues { get; set; }
                    public string CatId { get; set; }
                    public string PicName { get; set; }
            }
        };

        [NameInMap("Head")]
        [Validation(Required=true)]
        public SearchItemResponseBodyHead Head { get; set; }
        public class SearchItemResponseBodyHead : TeaModel {
            [NameInMap("SearchTime")]
            [Validation(Required=true)]
            public int? SearchTime { get; set; }
            [NameInMap("DocsFound")]
            [Validation(Required=true)]
            public int? DocsFound { get; set; }
            [NameInMap("DocsReturn")]
            [Validation(Required=true)]
            public int? DocsReturn { get; set; }
        };

        [NameInMap("PicInfo")]
        [Validation(Required=true)]
        public SearchItemResponseBodyPicInfo PicInfo { get; set; }
        public class SearchItemResponseBodyPicInfo : TeaModel {
            [NameInMap("Category")]
            [Validation(Required=true)]
            public string Category { get; set; }
            [NameInMap("Region")]
            [Validation(Required=true)]
            public string Region { get; set; }
            [NameInMap("AllCategory")]
            [Validation(Required=true)]
            public SearchItemResponseBodyPicInfoAllCategory AllCategory { get; set; }
            public class SearchItemResponseBodyPicInfoAllCategory : TeaModel {
                [NameInMap("Category")]
                [Validation(Required=true)]
                public List<SearchItemResponseBodyPicInfoAllCategoryCategory> Category { get; set; }
                public class SearchItemResponseBodyPicInfoAllCategoryCategory : TeaModel {
                    [NameInMap("Name")]
                    [Validation(Required=true)]
                    public string Name { get; set; }

                    [NameInMap("Id")]
                    [Validation(Required=true)]
                    public string Id { get; set; }

                }

            }
        };

    }

}
