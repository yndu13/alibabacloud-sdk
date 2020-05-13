// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMTSStatisResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("MTSStatisBySpecList")]
        [Validation(Required=true)]
        public GetMTSStatisResponseMTSStatisBySpecList MTSStatisBySpecList { get; set; }
        public class GetMTSStatisResponseMTSStatisBySpecList : TeaModel {
            [NameInMap("MTSStatisBySpec")]
            [Validation(Required=true)]
            public List<GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec> MTSStatisBySpec { get; set; }
            public class GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpec : TeaModel {
                    public string Specification { get; set; }
                    public GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList MTSStatisDOList { get; set; }
                    public class GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList : TeaModel {
                        [NameInMap("MTSStatisDO")]
                        [Validation(Required=true)]
                        public List<GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO> MTSStatisDO { get; set; }
                        public class GetMTSStatisResponseMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO : TeaModel {
                            [NameInMap("UserId")]
                            [Validation(Required=true)]
                            public string UserId { get; set; }

                            [NameInMap("Specification")]
                            [Validation(Required=true)]
                            public string Specification { get; set; }

                            [NameInMap("Duration")]
                            [Validation(Required=true)]
                            public long Duration { get; set; }

                            [NameInMap("StatTime")]
                            [Validation(Required=true)]
                            public string StatTime { get; set; }

                            [NameInMap("StatTimeUTC")]
                            [Validation(Required=true)]
                            public string StatTimeUTC { get; set; }

                        }

                    }
            }
        };

    }

}
