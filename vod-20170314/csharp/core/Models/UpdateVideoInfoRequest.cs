// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class UpdateVideoInfoRequest : TeaModel {
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

        [NameInMap("VideoId")]
        [Validation(Required=true)]
        public string VideoId { get; set; }

        [NameInMap("Title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        [NameInMap("Tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

        [NameInMap("Description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        [NameInMap("CoverURL")]
        [Validation(Required=false)]
        public string CoverURL { get; set; }

        [NameInMap("CateId")]
        [Validation(Required=false)]
        public long CateId { get; set; }

        [NameInMap("DownloadSwitch")]
        [Validation(Required=false)]
        public string DownloadSwitch { get; set; }

        [NameInMap("FileSize")]
        [Validation(Required=false)]
        public long FileSize { get; set; }

        [NameInMap("Duration")]
        [Validation(Required=false)]
        public string Duration { get; set; }

        [NameInMap("Status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        [NameInMap("MediaType")]
        [Validation(Required=false)]
        public string MediaType { get; set; }

        [NameInMap("Source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
