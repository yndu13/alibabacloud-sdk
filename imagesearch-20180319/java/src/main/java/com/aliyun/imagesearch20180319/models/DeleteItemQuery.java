// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180319.models;

import com.aliyun.tea.*;

public class DeleteItemQuery extends TeaModel {
    @NameInMap("instanceName")
    @Validation(required = true)
    public String instanceName;

    public static DeleteItemQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteItemQuery self = new DeleteItemQuery();
        return TeaModel.build(map, self);
    }

}
