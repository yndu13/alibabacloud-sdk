// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListAudioTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Audios")
    @Validation(required = true)
    public ListAudioTemplateResponseAudios audios;

    public static ListAudioTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAudioTemplateResponse self = new ListAudioTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAudioTemplateResponseAudiosAudio extends TeaModel {
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

        public static ListAudioTemplateResponseAudiosAudio build(java.util.Map<String, ?> map) throws Exception {
            ListAudioTemplateResponseAudiosAudio self = new ListAudioTemplateResponseAudiosAudio();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAudioTemplateResponseAudios extends TeaModel {
        @NameInMap("Audio")
        @Validation(required = true)
        public java.util.List<ListAudioTemplateResponseAudiosAudio> audio;

        public static ListAudioTemplateResponseAudios build(java.util.Map<String, ?> map) throws Exception {
            ListAudioTemplateResponseAudios self = new ListAudioTemplateResponseAudios();
            return TeaModel.build(map, self);
        }

    }

}
