// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class FaceRegistrationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegisteredPerson")
    @Validation(required = true)
    public FaceRegistrationResponseRegisteredPerson registeredPerson;

    @NameInMap("NonExistImageIds")
    @Validation(required = true)
    public FaceRegistrationResponseNonExistImageIds nonExistImageIds;

    public static FaceRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceRegistrationResponse self = new FaceRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public static class FaceRegistrationResponseRegisteredPersonFacesFace extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("Quality")
        @Validation(required = true)
        public String quality;

        @NameInMap("Target")
        @Validation(required = true)
        public String target;

        public static FaceRegistrationResponseRegisteredPersonFacesFace build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseRegisteredPersonFacesFace self = new FaceRegistrationResponseRegisteredPersonFacesFace();
            return TeaModel.build(map, self);
        }

    }

    public static class FaceRegistrationResponseRegisteredPersonFaces extends TeaModel {
        @NameInMap("Face")
        @Validation(required = true)
        public java.util.List<FaceRegistrationResponseRegisteredPersonFacesFace> face;

        public static FaceRegistrationResponseRegisteredPersonFaces build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseRegisteredPersonFaces self = new FaceRegistrationResponseRegisteredPersonFaces();
            return TeaModel.build(map, self);
        }

    }

    public static class FaceRegistrationResponseRegisteredPerson extends TeaModel {
        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("PersonName")
        @Validation(required = true)
        public String personName;

        @NameInMap("Faces")
        @Validation(required = true)
        public FaceRegistrationResponseRegisteredPersonFaces faces;

        public static FaceRegistrationResponseRegisteredPerson build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseRegisteredPerson self = new FaceRegistrationResponseRegisteredPerson();
            return TeaModel.build(map, self);
        }

    }

    public static class FaceRegistrationResponseNonExistImageIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static FaceRegistrationResponseNonExistImageIds build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseNonExistImageIds self = new FaceRegistrationResponseNonExistImageIds();
            return TeaModel.build(map, self);
        }

    }

}
