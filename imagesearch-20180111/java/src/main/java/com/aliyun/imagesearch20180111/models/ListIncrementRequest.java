// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListIncrementRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TaskType")
    @Validation(required = true)
    public Integer taskType;

    public static ListIncrementRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncrementRequest self = new ListIncrementRequest();
        return TeaModel.build(map, self);
    }

}
