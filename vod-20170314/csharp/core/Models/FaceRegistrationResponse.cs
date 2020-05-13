// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class FaceRegistrationResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("RegisteredPerson")]
        [Validation(Required=true)]
        public FaceRegistrationResponseRegisteredPerson RegisteredPerson { get; set; }
        public class FaceRegistrationResponseRegisteredPerson : TeaModel {
            [NameInMap("PersonId")]
            [Validation(Required=true)]
            public string PersonId { get; set; }
            [NameInMap("PersonName")]
            [Validation(Required=true)]
            public string PersonName { get; set; }
            [NameInMap("Faces")]
            [Validation(Required=true)]
            public FaceRegistrationResponseRegisteredPersonFaces Faces { get; set; }
            public class FaceRegistrationResponseRegisteredPersonFaces : TeaModel {
                [NameInMap("Face")]
                [Validation(Required=true)]
                public List<FaceRegistrationResponseRegisteredPersonFacesFace> Face { get; set; }
                public class FaceRegistrationResponseRegisteredPersonFacesFace : TeaModel {
                    [NameInMap("ImageId")]
                    [Validation(Required=true)]
                    public string ImageId { get; set; }

                    [NameInMap("Quality")]
                    [Validation(Required=true)]
                    public string Quality { get; set; }

                    [NameInMap("Target")]
                    [Validation(Required=true)]
                    public string Target { get; set; }

                }

            }
        };

        [NameInMap("NonExistImageIds")]
        [Validation(Required=true)]
        public FaceRegistrationResponseNonExistImageIds NonExistImageIds { get; set; }
        public class FaceRegistrationResponseNonExistImageIds : TeaModel {
            [NameInMap("String")]
            [Validation(Required=true)]
            public List<string> String { get; set; }
        };

    }

}
