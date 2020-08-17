// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20190325.models;

import com.aliyun.tea.*;

public class DeleteImageBody extends TeaModel {
    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("PicName")
    public String picName;

    public static DeleteImageBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageBody self = new DeleteImageBody();
        return TeaModel.build(map, self);
    }

}
