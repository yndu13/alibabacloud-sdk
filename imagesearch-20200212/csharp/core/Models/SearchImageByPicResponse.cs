// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.ImageSearch20200212.Models
{
    public class SearchImageByPicResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        [NameInMap("Code")]
        [Validation(Required=true)]
        public int? Code { get; set; }

        [NameInMap("Msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        [NameInMap("Auctions")]
        [Validation(Required=true)]
        public List<SearchImageByPicResponseAuctions> Auctions { get; set; }
        public class SearchImageByPicResponseAuctions : TeaModel {
            [NameInMap("CategoryId")]
            [Validation(Required=true)]
            public int? CategoryId { get; set; }

            [NameInMap("ProductId")]
            [Validation(Required=true)]
            public string ProductId { get; set; }

            [NameInMap("PicName")]
            [Validation(Required=true)]
            public string PicName { get; set; }

            [NameInMap("CustomContent")]
            [Validation(Required=true)]
            public string CustomContent { get; set; }

            [NameInMap("SortExprValues")]
            [Validation(Required=true)]
            public string SortExprValues { get; set; }

            [NameInMap("IntAttr")]
            [Validation(Required=true)]
            public int? IntAttr { get; set; }

            [NameInMap("StrAttr")]
            [Validation(Required=true)]
            public string StrAttr { get; set; }

        }

        [NameInMap("Head")]
        [Validation(Required=true)]
        public SearchImageByPicResponseHead Head { get; set; }
        public class SearchImageByPicResponseHead : TeaModel {
            [NameInMap("DocsReturn")]
            [Validation(Required=true)]
            public int? DocsReturn { get; set; }
            [NameInMap("DocsFound")]
            [Validation(Required=true)]
            public int? DocsFound { get; set; }
            [NameInMap("SearchTime")]
            [Validation(Required=true)]
            public int? SearchTime { get; set; }
        };

        [NameInMap("PicInfo")]
        [Validation(Required=true)]
        public SearchImageByPicResponsePicInfo PicInfo { get; set; }
        public class SearchImageByPicResponsePicInfo : TeaModel {
            [NameInMap("CategoryId")]
            [Validation(Required=true)]
            public int? CategoryId { get; set; }
            [NameInMap("Region")]
            [Validation(Required=true)]
            public string Region { get; set; }
            [NameInMap("AllCategories")]
            [Validation(Required=true)]
            public List<SearchImageByPicResponsePicInfoAllCategories> AllCategories { get; set; }
            public class SearchImageByPicResponsePicInfoAllCategories : TeaModel {
                public int? Id { get; set; }
                public string Name { get; set; }
            }
        };

    }

}
