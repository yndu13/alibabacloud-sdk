// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody.models;

import com.aliyun.tea.*;

public class RecognizeFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ImageType")
    public Integer imageType;

    public static RecognizeFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceAdvanceRequest self = new RecognizeFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

}