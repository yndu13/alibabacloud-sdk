// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetCustomerTranscodeConfResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("Templates")]
        [Validation(Required=true)]
        public GetCustomerTranscodeConfResponseTemplates Templates { get; set; }
        public class GetCustomerTranscodeConfResponseTemplates : TeaModel {
            [NameInMap("Template")]
            [Validation(Required=true)]
            public List<GetCustomerTranscodeConfResponseTemplatesTemplate> Template { get; set; }
            public class GetCustomerTranscodeConfResponseTemplatesTemplate : TeaModel {
                    public string Id { get; set; }
                    public string CustomerId { get; set; }
                    public string TemplateId { get; set; }
                    public string MtstemplateId { get; set; }
                    public string Status { get; set; }
                    public string Name { get; set; }
                    public string Encrypt { get; set; }
            }
        };

    }

}
