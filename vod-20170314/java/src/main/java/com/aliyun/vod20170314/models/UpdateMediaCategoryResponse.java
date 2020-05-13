// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateMediaCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Media")
    @Validation(required = true)
    public UpdateMediaCategoryResponseMedia media;

    public static UpdateMediaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCategoryResponse self = new UpdateMediaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateMediaCategoryResponseMediaSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static UpdateMediaCategoryResponseMediaSnapshots build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaCategoryResponseMediaSnapshots self = new UpdateMediaCategoryResponseMediaSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateMediaCategoryResponseMedia extends TeaModel {
        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CoverUrl")
        @Validation(required = true)
        public String coverUrl;

        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("FileSize")
        @Validation(required = true)
        public String fileSize;

        @NameInMap("State")
        @Validation(required = true)
        public Integer state;

        @NameInMap("MediaWorkflowRunId")
        @Validation(required = true)
        public String mediaWorkflowRunId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateIp")
        @Validation(required = true)
        public String createIp;

        @NameInMap("MediaWorkflowId")
        @Validation(required = true)
        public String mediaWorkflowId;

        @NameInMap("PublicType")
        @Validation(required = true)
        public Integer publicType;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public UpdateMediaCategoryResponseMediaSnapshots snapshots;

        public static UpdateMediaCategoryResponseMedia build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaCategoryResponseMedia self = new UpdateMediaCategoryResponseMedia();
            return TeaModel.build(map, self);
        }

    }

}
