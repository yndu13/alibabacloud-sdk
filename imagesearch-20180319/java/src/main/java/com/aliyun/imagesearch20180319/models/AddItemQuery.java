// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180319.models;

import com.aliyun.tea.*;

public class AddItemQuery extends TeaModel {
    @NameInMap("instanceName")
    @Validation(required = true)
    public String instanceName;

    public static AddItemQuery build(java.util.Map<String, ?> map) throws Exception {
        AddItemQuery self = new AddItemQuery();
        return TeaModel.build(map, self);
    }

    public AddItemQuery setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
