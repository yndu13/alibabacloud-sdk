// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetAudioTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Audio")
    @Validation(required = true)
    public GetAudioTemplateResponseAudio audio;

    public static GetAudioTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioTemplateResponse self = new GetAudioTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAudioTemplateResponseAudio extends TeaModel {
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

        public static GetAudioTemplateResponseAudio build(java.util.Map<String, ?> map) throws Exception {
            GetAudioTemplateResponseAudio self = new GetAudioTemplateResponseAudio();
            return TeaModel.build(map, self);
        }

    }

}
