// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddCustomTemplateAndGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    @NameInMap("TemplateGroup")
    @Validation(required = true)
    public AddCustomTemplateAndGroupResponseTemplateGroup templateGroup;

    public static AddCustomTemplateAndGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomTemplateAndGroupResponse self = new AddCustomTemplateAndGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class AddCustomTemplateAndGroupResponseTemplateGroup extends TeaModel {
        @NameInMap("TemplateGroupId")
        @Validation(required = true)
        public String templateGroupId;

        public static AddCustomTemplateAndGroupResponseTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            AddCustomTemplateAndGroupResponseTemplateGroup self = new AddCustomTemplateAndGroupResponseTemplateGroup();
            return TeaModel.build(map, self);
        }

    }

}
