// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180111.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    @NameInMap("ServiceType")
    @Validation(required = true)
    public Integer serviceType;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Tag")
    public java.util.List<ListInstanceRequestTag> tag;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public static class ListInstanceRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRequestTag self = new ListInstanceRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
