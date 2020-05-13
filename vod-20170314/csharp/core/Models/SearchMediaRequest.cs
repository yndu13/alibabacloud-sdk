// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SearchMediaRequest : TeaModel {
        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("ResourceRealOwnerId")]
        [Validation(Required=false)]
        public long ResourceRealOwnerId { get; set; }

        [NameInMap("SearchType")]
        [Validation(Required=false)]
        public string SearchType { get; set; }

        [NameInMap("Fields")]
        [Validation(Required=false)]
        public string Fields { get; set; }

        [NameInMap("Match")]
        [Validation(Required=false)]
        public string Match { get; set; }

        [NameInMap("SortBy")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        [NameInMap("PageNo")]
        [Validation(Required=false)]
        public int? PageNo { get; set; }

        [NameInMap("PageSize")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        [NameInMap("ScrollToken")]
        [Validation(Required=false)]
        public string ScrollToken { get; set; }

        [NameInMap("ResultTypes")]
        [Validation(Required=false)]
        public string ResultTypes { get; set; }

        [NameInMap("SessionId")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

    }

}
