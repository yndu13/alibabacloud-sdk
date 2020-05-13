// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class GetCustomerTranscodeConfResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Templates")
    @Validation(required = true)
    public GetCustomerTranscodeConfResponseTemplates templates;

    public static GetCustomerTranscodeConfResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerTranscodeConfResponse self = new GetCustomerTranscodeConfResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCustomerTranscodeConfResponseTemplatesTemplate extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("CustomerId")
        @Validation(required = true)
        public String customerId;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("MtstemplateId")
        @Validation(required = true)
        public String mtstemplateId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Encrypt")
        @Validation(required = true)
        public String encrypt;

        public static GetCustomerTranscodeConfResponseTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerTranscodeConfResponseTemplatesTemplate self = new GetCustomerTranscodeConfResponseTemplatesTemplate();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCustomerTranscodeConfResponseTemplates extends TeaModel {
        @NameInMap("Template")
        @Validation(required = true)
        public java.util.List<GetCustomerTranscodeConfResponseTemplatesTemplate> template;

        public static GetCustomerTranscodeConfResponseTemplates build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerTranscodeConfResponseTemplates self = new GetCustomerTranscodeConfResponseTemplates();
            return TeaModel.build(map, self);
        }

    }

}
