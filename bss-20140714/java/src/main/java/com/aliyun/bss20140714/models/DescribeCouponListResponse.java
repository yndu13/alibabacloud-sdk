// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCouponListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Coupons")
    @Validation(required = true)
    public java.util.List<DescribeCouponListResponseCoupons> coupons;

    public static DescribeCouponListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponListResponse self = new DescribeCouponListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCouponListResponseCouponsProductCodes extends TeaModel {
        @NameInMap("ProductCode")
        @Validation(required = true)
        public java.util.List<String> productCode;

        public static DescribeCouponListResponseCouponsProductCodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseCouponsProductCodes self = new DescribeCouponListResponseCouponsProductCodes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCouponListResponseCouponsTradeTypes extends TeaModel {
        @NameInMap("TradeType")
        @Validation(required = true)
        public java.util.List<String> tradeType;

        public static DescribeCouponListResponseCouponsTradeTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseCouponsTradeTypes self = new DescribeCouponListResponseCouponsTradeTypes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCouponListResponseCoupons extends TeaModel {
        @NameInMap("CouponTemplateId")
        @Validation(required = true)
        public Long couponTemplateId;

        @NameInMap("TotalAmount")
        @Validation(required = true)
        public String totalAmount;

        @NameInMap("BalanceAmount")
        @Validation(required = true)
        public String balanceAmount;

        @NameInMap("FrozenAmount")
        @Validation(required = true)
        public String frozenAmount;

        @NameInMap("ExpiredAmount")
        @Validation(required = true)
        public String expiredAmount;

        @NameInMap("DeliveryTime")
        @Validation(required = true)
        public String deliveryTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("CouponNumber")
        @Validation(required = true)
        public String couponNumber;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("PriceLimit")
        @Validation(required = true)
        public String priceLimit;

        @NameInMap("Application")
        @Validation(required = true)
        public String application;

        @NameInMap("ProductCodes")
        @Validation(required = true)
        public DescribeCouponListResponseCouponsProductCodes productCodes;

        @NameInMap("TradeTypes")
        @Validation(required = true)
        public DescribeCouponListResponseCouponsTradeTypes tradeTypes;

        public static DescribeCouponListResponseCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponListResponseCoupons self = new DescribeCouponListResponseCoupons();
            return TeaModel.build(map, self);
        }

    }

}
