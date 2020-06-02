// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestHttpApiRequest extends TeaModel {
    @NameInMap("StringValue")
    public java.util.Map<String, Object> stringValue;

    @NameInMap("DefaultValue")
    public java.util.Map<String, Object> defaultValue;

    @NameInMap("OtherParam")
    public java.util.Map<String, Object> otherParam;

    @NameInMap("BooleanParam")
    public Boolean booleanParam;

    public static TestHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        TestHttpApiRequest self = new TestHttpApiRequest();
        return TeaModel.build(map, self);
    }

}
