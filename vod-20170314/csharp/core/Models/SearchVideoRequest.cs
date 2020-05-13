// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SearchVideoRequest : TeaModel {
        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("CateId")]
        [Validation(Required=false)]
        public int? CateId { get; set; }

        [NameInMap("Title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        [NameInMap("KeyWord")]
        [Validation(Required=false)]
        public string KeyWord { get; set; }

        [NameInMap("StartTime")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        [NameInMap("EndTime")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        [NameInMap("PageNo")]
        [Validation(Required=false)]
        public int? PageNo { get; set; }

        [NameInMap("PageSize")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        [NameInMap("SortBy")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        [NameInMap("Status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        [NameInMap("MediaType")]
        [Validation(Required=false)]
        public string MediaType { get; set; }

        [NameInMap("ResultTypes")]
        [Validation(Required=false)]
        public string ResultTypes { get; set; }

        [NameInMap("PlayRand")]
        [Validation(Required=false)]
        public string PlayRand { get; set; }

        [NameInMap("Source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        [NameInMap("ApiVersion")]
        [Validation(Required=false)]
        public string ApiVersion { get; set; }

        [NameInMap("ScrollToken")]
        [Validation(Required=false)]
        public string ScrollToken { get; set; }

        [NameInMap("PreprocessStatus")]
        [Validation(Required=false)]
        public string PreprocessStatus { get; set; }

        [NameInMap("StorageLocation")]
        [Validation(Required=false)]
        public string StorageLocation { get; set; }

        [NameInMap("VideoId")]
        [Validation(Required=false)]
        public string VideoId { get; set; }

    }

}
