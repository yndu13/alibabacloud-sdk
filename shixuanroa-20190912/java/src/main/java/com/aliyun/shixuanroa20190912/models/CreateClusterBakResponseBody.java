// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.shixuanroa20190912.models;

import com.aliyun.tea.*;

public class CreateClusterBakResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("task_id")
    public String taskId;

    public static CreateClusterBakResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBakResponseBody self = new CreateClusterBakResponseBody();
        return TeaModel.build(map, self);
    }

}
