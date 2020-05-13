// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAudioConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Configs")
    @Validation(required = true)
    public ListAudioConfigResponseConfigs configs;

    public static ListAudioConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAudioConfigResponse self = new ListAudioConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAudioConfigResponseConfigsConfig extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListAudioConfigResponseConfigsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAudioConfigResponseConfigsConfig self = new ListAudioConfigResponseConfigsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAudioConfigResponseConfigs extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        public java.util.List<ListAudioConfigResponseConfigsConfig> config;

        public static ListAudioConfigResponseConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListAudioConfigResponseConfigs self = new ListAudioConfigResponseConfigs();
            return TeaModel.build(map, self);
        }

    }

}
