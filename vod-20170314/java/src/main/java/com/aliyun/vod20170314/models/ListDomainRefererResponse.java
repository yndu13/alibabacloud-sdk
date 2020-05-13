// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170314.models;

import com.aliyun.tea.*;

public class ListDomainRefererResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("AllowEmpty")
    @Validation(required = true)
    public String allowEmpty;

    @NameInMap("RefererList")
    @Validation(required = true)
    public ListDomainRefererResponseRefererList refererList;

    public static ListDomainRefererResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainRefererResponse self = new ListDomainRefererResponse();
        return TeaModel.build(map, self);
    }

    public static class ListDomainRefererResponseRefererListRefererItem extends TeaModel {
        @NameInMap("RefererId")
        @Validation(required = true)
        public Long refererId;

        @NameInMap("Referer")
        @Validation(required = true)
        public String referer;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static ListDomainRefererResponseRefererListRefererItem build(java.util.Map<String, ?> map) throws Exception {
            ListDomainRefererResponseRefererListRefererItem self = new ListDomainRefererResponseRefererListRefererItem();
            return TeaModel.build(map, self);
        }

    }

    public static class ListDomainRefererResponseRefererList extends TeaModel {
        @NameInMap("RefererItem")
        @Validation(required = true)
        public java.util.List<ListDomainRefererResponseRefererListRefererItem> refererItem;

        public static ListDomainRefererResponseRefererList build(java.util.Map<String, ?> map) throws Exception {
            ListDomainRefererResponseRefererList self = new ListDomainRefererResponseRefererList();
            return TeaModel.build(map, self);
        }

    }

}
