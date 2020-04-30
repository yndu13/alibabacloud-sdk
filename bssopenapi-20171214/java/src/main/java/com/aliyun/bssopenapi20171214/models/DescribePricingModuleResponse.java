// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribePricingModuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribePricingModuleResponseData data;

    public static DescribePricingModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePricingModuleResponse self = new DescribePricingModuleResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePricingModuleResponseDataModuleListModuleConfigList extends TeaModel {
        @NameInMap("ConfigList")
        @Validation(required = true)
        public java.util.List<String> configList;

        public static DescribePricingModuleResponseDataModuleListModuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataModuleListModuleConfigList self = new DescribePricingModuleResponseDataModuleListModuleConfigList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseDataModuleListModule extends TeaModel {
        @NameInMap("ModuleCode")
        @Validation(required = true)
        public String moduleCode;

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        @NameInMap("PriceType")
        @Validation(required = true)
        public String priceType;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("ConfigList")
        @Validation(required = true)
        public DescribePricingModuleResponseDataModuleListModuleConfigList configList;

        public static DescribePricingModuleResponseDataModuleListModule build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataModuleListModule self = new DescribePricingModuleResponseDataModuleListModule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseDataModuleList extends TeaModel {
        @NameInMap("Module")
        @Validation(required = true)
        public java.util.List<DescribePricingModuleResponseDataModuleListModule> module;

        public static DescribePricingModuleResponseDataModuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataModuleList self = new DescribePricingModuleResponseDataModuleList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        public static DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue self = new DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseDataAttributeListAttributeValues extends TeaModel {
        @NameInMap("AttributeValue")
        @Validation(required = true)
        public java.util.List<DescribePricingModuleResponseDataAttributeListAttributeValuesAttributeValue> attributeValue;

        public static DescribePricingModuleResponseDataAttributeListAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeListAttributeValues self = new DescribePricingModuleResponseDataAttributeListAttributeValues();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseDataAttributeListAttribute extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("Values")
        @Validation(required = true)
        public DescribePricingModuleResponseDataAttributeListAttributeValues values;

        public static DescribePricingModuleResponseDataAttributeListAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeListAttribute self = new DescribePricingModuleResponseDataAttributeListAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseDataAttributeList extends TeaModel {
        @NameInMap("Attribute")
        @Validation(required = true)
        public java.util.List<DescribePricingModuleResponseDataAttributeListAttribute> attribute;

        public static DescribePricingModuleResponseDataAttributeList build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseDataAttributeList self = new DescribePricingModuleResponseDataAttributeList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePricingModuleResponseData extends TeaModel {
        @NameInMap("ModuleList")
        @Validation(required = true)
        public DescribePricingModuleResponseDataModuleList moduleList;

        @NameInMap("AttributeList")
        @Validation(required = true)
        public DescribePricingModuleResponseDataAttributeList attributeList;

        public static DescribePricingModuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribePricingModuleResponseData self = new DescribePricingModuleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
