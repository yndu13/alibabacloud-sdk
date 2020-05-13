// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateAudioConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Configs")
    @Validation(required = true)
    public UpdateAudioConfigResponseConfigs configs;

    public static UpdateAudioConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAudioConfigResponse self = new UpdateAudioConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateAudioConfigResponseConfigsConfig extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static UpdateAudioConfigResponseConfigsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAudioConfigResponseConfigsConfig self = new UpdateAudioConfigResponseConfigsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateAudioConfigResponseConfigs extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        public java.util.List<UpdateAudioConfigResponseConfigsConfig> config;

        public static UpdateAudioConfigResponseConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateAudioConfigResponseConfigs self = new UpdateAudioConfigResponseConfigs();
            return TeaModel.build(map, self);
        }

    }

}
