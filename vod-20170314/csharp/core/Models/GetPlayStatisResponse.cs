// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetPlayStatisResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("PlayStatisByPlatformDOs")]
        [Validation(Required=true)]
        public GetPlayStatisResponsePlayStatisByPlatformDOs PlayStatisByPlatformDOs { get; set; }
        public class GetPlayStatisResponsePlayStatisByPlatformDOs : TeaModel {
            [NameInMap("PlayStatisByPlatform")]
            [Validation(Required=true)]
            public List<GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform> PlayStatisByPlatform { get; set; }
            public class GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatform : TeaModel {
                    public string Platform { get; set; }
                    public GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs PlayStatisDOs { get; set; }
                    public class GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOs : TeaModel {
                        [NameInMap("PlayStatisDO")]
                        [Validation(Required=true)]
                        public List<GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO> PlayStatisDO { get; set; }
                        public class GetPlayStatisResponsePlayStatisByPlatformDOsPlayStatisByPlatformPlayStatisDOsPlayStatisDO : TeaModel {
                            [NameInMap("UserId")]
                            [Validation(Required=true)]
                            public string UserId { get; set; }

                            [NameInMap("Platform")]
                            [Validation(Required=true)]
                            public string Platform { get; set; }

                            [NameInMap("VisitView")]
                            [Validation(Required=true)]
                            public long VisitView { get; set; }

                            [NameInMap("ViewTime")]
                            [Validation(Required=true)]
                            public long ViewTime { get; set; }

                            [NameInMap("StatTime")]
                            [Validation(Required=true)]
                            public string StatTime { get; set; }

                        }

                    }
            }
        };

    }

}
