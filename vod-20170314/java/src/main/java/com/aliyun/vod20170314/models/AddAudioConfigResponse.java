// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class AddAudioConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Configs")
    @Validation(required = true)
    public AddAudioConfigResponseConfigs configs;

    public static AddAudioConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAudioConfigResponse self = new AddAudioConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class AddAudioConfigResponseConfigsConfig extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static AddAudioConfigResponseConfigsConfig build(java.util.Map<String, ?> map) throws Exception {
            AddAudioConfigResponseConfigsConfig self = new AddAudioConfigResponseConfigsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class AddAudioConfigResponseConfigs extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        public java.util.List<AddAudioConfigResponseConfigsConfig> config;

        public static AddAudioConfigResponseConfigs build(java.util.Map<String, ?> map) throws Exception {
            AddAudioConfigResponseConfigs self = new AddAudioConfigResponseConfigs();
            return TeaModel.build(map, self);
        }

    }

}
