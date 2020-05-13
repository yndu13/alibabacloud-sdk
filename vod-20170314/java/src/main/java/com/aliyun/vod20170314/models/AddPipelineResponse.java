// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddPipelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PipelineId")
    @Validation(required = true)
    public String pipelineId;

    public static AddPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineResponse self = new AddPipelineResponse();
        return TeaModel.build(map, self);
    }

}
