// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class UpdateAudioTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Audio")
    @Validation(required = true)
    public UpdateAudioTemplateResponseAudio audio;

    public static UpdateAudioTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAudioTemplateResponse self = new UpdateAudioTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateAudioTemplateResponseAudio extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("Codec")
        @Validation(required = true)
        public String codec;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Channeles")
        @Validation(required = true)
        public String channeles;

        @NameInMap("Remove")
        @Validation(required = true)
        public String remove;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public String isDefault;

        public static UpdateAudioTemplateResponseAudio build(java.util.Map<String, ?> map) throws Exception {
            UpdateAudioTemplateResponseAudio self = new UpdateAudioTemplateResponseAudio();
            return TeaModel.build(map, self);
        }

    }

}
