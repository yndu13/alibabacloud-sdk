// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListTemplateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateGroups")
    @Validation(required = true)
    public ListTemplateGroupResponseTemplateGroups templateGroups;

    public static ListTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupResponse self = new ListTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTemplateGroupResponseTemplateGroupsTemplateGroup extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("DefaultGroup")
        @Validation(required = true)
        public String defaultGroup;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("GroupSymbol")
        @Validation(required = true)
        public String groupSymbol;

        @NameInMap("GroupType")
        @Validation(required = true)
        public String groupType;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TranscodeMode")
        @Validation(required = true)
        public String transcodeMode;

        @NameInMap("IsLocked")
        @Validation(required = true)
        public String isLocked;

        public static ListTemplateGroupResponseTemplateGroupsTemplateGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateGroupResponseTemplateGroupsTemplateGroup self = new ListTemplateGroupResponseTemplateGroupsTemplateGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class ListTemplateGroupResponseTemplateGroups extends TeaModel {
        @NameInMap("TemplateGroup")
        @Validation(required = true)
        public java.util.List<ListTemplateGroupResponseTemplateGroupsTemplateGroup> templateGroup;

        public static ListTemplateGroupResponseTemplateGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateGroupResponseTemplateGroups self = new ListTemplateGroupResponseTemplateGroups();
            return TeaModel.build(map, self);
        }

    }

}
