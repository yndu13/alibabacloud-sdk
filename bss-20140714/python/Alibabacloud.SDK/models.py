# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel as Tea_model_TeaModel
from Alibabacloud.SDK import models as Alibabacloud_SDK_models



class OpenCallbackRequest(Tea_model_TeaModel):
    def __init__(self, param_str = ""):
        self.param_str = param_str

    def validate(self):
        self.validate_required(self.param_str, 'param_str')

    def to_map(self):
        result = {}
        result['paramStr'] = self.param_str
        return result

    def from_map(self, map = {}):
        self.param_str = map.get('paramStr')
        return self


class OpenCallbackResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", success = False, code = "", message = "", data = ""):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.message = message
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Message'] = self.message
        result['Data'] = self.data
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.message = map.get('Message')
        self.data = map.get('Data')
        return self


class QueryForCssOrderRequest(Tea_model_TeaModel):
    def __init__(self, param_str = ""):
        self.param_str = param_str

    def validate(self):
        self.validate_required(self.param_str, 'param_str')

    def to_map(self):
        result = {}
        result['paramStr'] = self.param_str
        return result

    def from_map(self, map = {}):
        self.param_str = map.get('paramStr')
        return self


class QueryForCssOrderResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", success = False, code = "", message = "", data = ""):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.message = message
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Message'] = self.message
        result['Data'] = self.data
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.message = map.get('Message')
        self.data = map.get('Data')
        return self


class CreateOrderRequest(Tea_model_TeaModel):
    def __init__(self, param_str = ""):
        self.param_str = param_str

    def validate(self):
        self.validate_required(self.param_str, 'param_str')

    def to_map(self):
        result = {}
        result['paramStr'] = self.param_str
        return result

    def from_map(self, map = {}):
        self.param_str = map.get('paramStr')
        return self


class CreateOrderResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", success = False, code = "", message = "", data = ""):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.message = message
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Message'] = self.message
        result['Data'] = self.data
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.message = map.get('Message')
        self.data = map.get('Data')
        return self


class VnoPayCallBackNotifyRequest(Tea_model_TeaModel):
    def __init__(self, param_str = ""):
        self.param_str = param_str

    def validate(self):
        self.validate_required(self.param_str, 'param_str')

    def to_map(self):
        result = {}
        result['paramStr'] = self.param_str
        return result

    def from_map(self, map = {}):
        self.param_str = map.get('paramStr')
        return self


class VnoPayCallBackNotifyResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", success = False, code = "", message = "", data = ""):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.message = message
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Message'] = self.message
        result['Data'] = self.data
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.message = map.get('Message')
        self.data = map.get('Data')
        return self


class VnoBatchRefundOrderRequest(Tea_model_TeaModel):
    def __init__(self, param_str = ""):
        self.param_str = param_str

    def validate(self):
        self.validate_required(self.param_str, 'param_str')

    def to_map(self):
        result = {}
        result['paramStr'] = self.param_str
        return result

    def from_map(self, map = {}):
        self.param_str = map.get('paramStr')
        return self


class VnoBatchRefundOrderResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", success = False, code = "", message = "", data = ""):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.message = message
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Message'] = self.message
        result['Data'] = self.data
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.message = map.get('Message')
        self.data = map.get('Data')
        return self


class SubscriptionCreateOrderApiRequest(Tea_model_TeaModel):
    def __init__(self, owner_id = "", product_code = ""):
        self.owner_id = owner_id
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.owner_id, 'owner_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = {}
        result['ownerId'] = self.owner_id
        result['productCode'] = self.product_code
        return result

    def from_map(self, map = {}):
        self.owner_id = map.get('ownerId')
        self.product_code = map.get('productCode')
        return self


class SubscriptionCreateOrderApiResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", success = False, code = "", message = "", data = ""):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.message = message
        self.data = data

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.data, 'data')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Message'] = self.message
        result['Data'] = self.data
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.message = map.get('Message')
        self.data = map.get('Data')
        return self


class SetResourceBusinessStatusRequest(Tea_model_TeaModel):
    def __init__(self, access_key_id = "", owner_id = 0, resource_owner_account = "", resource_owner_id = 0, resource_type = "", resource_id = "", business_status = "", owner_account = ""):
        self.access_key_id = access_key_id
        self.owner_id = owner_id
        self.resource_owner_account = resource_owner_account
        self.resource_owner_id = resource_owner_id
        self.resource_type = resource_type
        self.resource_id = resource_id
        self.business_status = business_status
        self.owner_account = owner_account

    def validate(self):
        self.validate_required(self.resource_type, 'resource_type')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.business_status, 'business_status')

    def to_map(self):
        result = {}
        result['AccessKeyId'] = self.access_key_id
        result['OwnerId'] = self.owner_id
        result['ResourceOwnerAccount'] = self.resource_owner_account
        result['ResourceOwnerId'] = self.resource_owner_id
        result['ResourceType'] = self.resource_type
        result['ResourceId'] = self.resource_id
        result['BusinessStatus'] = self.business_status
        result['OwnerAccount'] = self.owner_account
        return result

    def from_map(self, map = {}):
        self.access_key_id = map.get('AccessKeyId')
        self.owner_id = map.get('OwnerId')
        self.resource_owner_account = map.get('ResourceOwnerAccount')
        self.resource_owner_id = map.get('ResourceOwnerId')
        self.resource_type = map.get('ResourceType')
        self.resource_id = map.get('ResourceId')
        self.business_status = map.get('BusinessStatus')
        self.owner_account = map.get('OwnerAccount')
        return self


class SetResourceBusinessStatusResponse(Tea_model_TeaModel):
    def __init__(self, request_id = ""):
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        return self


class DescribeCouponListRequest(Tea_model_TeaModel):
    def __init__(self, status = "", start_delivery_time = "", end_delivery_time = "", page_size = 0, page_num = 0):
        self.status = status
        self.start_delivery_time = start_delivery_time
        self.end_delivery_time = end_delivery_time
        self.page_size = page_size
        self.page_num = page_num

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['Status'] = self.status
        result['StartDeliveryTime'] = self.start_delivery_time
        result['EndDeliveryTime'] = self.end_delivery_time
        result['PageSize'] = self.page_size
        result['PageNum'] = self.page_num
        return result

    def from_map(self, map = {}):
        self.status = map.get('Status')
        self.start_delivery_time = map.get('StartDeliveryTime')
        self.end_delivery_time = map.get('EndDeliveryTime')
        self.page_size = map.get('PageSize')
        self.page_num = map.get('PageNum')
        return self


class DescribeCouponListResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", coupons = None):
        self.request_id = request_id
        self.coupons = []

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.coupons, 'coupons')
        if self.coupons:
            for k in self.coupons:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Coupons'] = []
        if self.coupons is not None:
            for k in self.coupons:
                result['Coupons'].append(k.to_map() if k else None)
        else:
            result['Coupons'] = None
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.coupons = []
        if map.get('Coupons') is not None:
            for k in map.get('Coupons'):
                temp_model = DescribeCouponListResponseCoupons()
                temp_model = temp_model.from_map(k)
                self.coupons.append(temp_model)
        else:
            self.coupons = None
        return self


class DescribeCouponListResponseCouponsProductCodes(Tea_model_TeaModel):
    def __init__(self, product_code = None):
        self.product_code = []

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = {}
        result['ProductCode'] = []
        if self.product_code is not None:
            for k in self.product_code:
                result['ProductCode'].append(k)
        else:
            result['ProductCode'] = None
        return result

    def from_map(self, map = {}):
        self.product_code = []
        if map.get('ProductCode') is not None:
            for k in map.get('ProductCode'):
                self.product_code.append(k)
        else:
            self.product_code = None
        return self


class DescribeCouponListResponseCouponsTradeTypes(Tea_model_TeaModel):
    def __init__(self, trade_type = None):
        self.trade_type = []

    def validate(self):
        self.validate_required(self.trade_type, 'trade_type')

    def to_map(self):
        result = {}
        result['TradeType'] = []
        if self.trade_type is not None:
            for k in self.trade_type:
                result['TradeType'].append(k)
        else:
            result['TradeType'] = None
        return result

    def from_map(self, map = {}):
        self.trade_type = []
        if map.get('TradeType') is not None:
            for k in map.get('TradeType'):
                self.trade_type.append(k)
        else:
            self.trade_type = None
        return self


class DescribeCouponListResponseCoupons(Tea_model_TeaModel):
    def __init__(self, coupon_template_id = 0, total_amount = "", balance_amount = "", frozen_amount = "", expired_amount = "", delivery_time = "", expired_time = "", coupon_number = "", status = "", description = "", creation_time = "", modification_time = "", price_limit = "", application = "", product_codes = None, trade_types = None):
        self.coupon_template_id = coupon_template_id
        self.total_amount = total_amount
        self.balance_amount = balance_amount
        self.frozen_amount = frozen_amount
        self.expired_amount = expired_amount
        self.delivery_time = delivery_time
        self.expired_time = expired_time
        self.coupon_number = coupon_number
        self.status = status
        self.description = description
        self.creation_time = creation_time
        self.modification_time = modification_time
        self.price_limit = price_limit
        self.application = application
        self.product_codes = product_codes
        self.trade_types = trade_types

    def validate(self):
        self.validate_required(self.coupon_template_id, 'coupon_template_id')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.balance_amount, 'balance_amount')
        self.validate_required(self.frozen_amount, 'frozen_amount')
        self.validate_required(self.expired_amount, 'expired_amount')
        self.validate_required(self.delivery_time, 'delivery_time')
        self.validate_required(self.expired_time, 'expired_time')
        self.validate_required(self.coupon_number, 'coupon_number')
        self.validate_required(self.status, 'status')
        self.validate_required(self.description, 'description')
        self.validate_required(self.creation_time, 'creation_time')
        self.validate_required(self.modification_time, 'modification_time')
        self.validate_required(self.price_limit, 'price_limit')
        self.validate_required(self.application, 'application')
        self.validate_required(self.product_codes, 'product_codes')
        if self.product_codes:
            self.product_codes.validate()
        self.validate_required(self.trade_types, 'trade_types')
        if self.trade_types:
            self.trade_types.validate()

    def to_map(self):
        result = {}
        result['CouponTemplateId'] = self.coupon_template_id
        result['TotalAmount'] = self.total_amount
        result['BalanceAmount'] = self.balance_amount
        result['FrozenAmount'] = self.frozen_amount
        result['ExpiredAmount'] = self.expired_amount
        result['DeliveryTime'] = self.delivery_time
        result['ExpiredTime'] = self.expired_time
        result['CouponNumber'] = self.coupon_number
        result['Status'] = self.status
        result['Description'] = self.description
        result['CreationTime'] = self.creation_time
        result['ModificationTime'] = self.modification_time
        result['PriceLimit'] = self.price_limit
        result['Application'] = self.application
        if self.product_codes is not None:
            result['ProductCodes'] = self.product_codes.to_map()
        else:
            result['ProductCodes'] = None
        if self.trade_types is not None:
            result['TradeTypes'] = self.trade_types.to_map()
        else:
            result['TradeTypes'] = None
        return result

    def from_map(self, map = {}):
        self.coupon_template_id = map.get('CouponTemplateId')
        self.total_amount = map.get('TotalAmount')
        self.balance_amount = map.get('BalanceAmount')
        self.frozen_amount = map.get('FrozenAmount')
        self.expired_amount = map.get('ExpiredAmount')
        self.delivery_time = map.get('DeliveryTime')
        self.expired_time = map.get('ExpiredTime')
        self.coupon_number = map.get('CouponNumber')
        self.status = map.get('Status')
        self.description = map.get('Description')
        self.creation_time = map.get('CreationTime')
        self.modification_time = map.get('ModificationTime')
        self.price_limit = map.get('PriceLimit')
        self.application = map.get('Application')
        if map.get('ProductCodes') is not None:
            temp_model = CouponsProductCodes()
            self.product_codes = temp_model.from_map(map['ProductCodes'])
        else:
            self.product_codes = None
        if map.get('TradeTypes') is not None:
            temp_model = CouponsTradeTypes()
            self.trade_types = temp_model.from_map(map['TradeTypes'])
        else:
            self.trade_types = None
        return self


class DescribeCouponDetailRequest(Tea_model_TeaModel):
    def __init__(self, coupon_number = ""):
        self.coupon_number = coupon_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['CouponNumber'] = self.coupon_number
        return result

    def from_map(self, map = {}):
        self.coupon_number = map.get('CouponNumber')
        return self


class DescribeCouponDetailResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", coupon_template_id = 0, total_amount = "", balance_amount = "", frozen_amount = "", expired_amount = "", delivery_time = "", expired_time = "", coupon_number = "", status = "", description = "", creation_time = "", modification_time = "", price_limit = "", application = "", product_codes = None, trade_types = None):
        self.request_id = request_id
        self.coupon_template_id = coupon_template_id
        self.total_amount = total_amount
        self.balance_amount = balance_amount
        self.frozen_amount = frozen_amount
        self.expired_amount = expired_amount
        self.delivery_time = delivery_time
        self.expired_time = expired_time
        self.coupon_number = coupon_number
        self.status = status
        self.description = description
        self.creation_time = creation_time
        self.modification_time = modification_time
        self.price_limit = price_limit
        self.application = application
        self.product_codes = product_codes
        self.trade_types = trade_types

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.coupon_template_id, 'coupon_template_id')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.balance_amount, 'balance_amount')
        self.validate_required(self.frozen_amount, 'frozen_amount')
        self.validate_required(self.expired_amount, 'expired_amount')
        self.validate_required(self.delivery_time, 'delivery_time')
        self.validate_required(self.expired_time, 'expired_time')
        self.validate_required(self.coupon_number, 'coupon_number')
        self.validate_required(self.status, 'status')
        self.validate_required(self.description, 'description')
        self.validate_required(self.creation_time, 'creation_time')
        self.validate_required(self.modification_time, 'modification_time')
        self.validate_required(self.price_limit, 'price_limit')
        self.validate_required(self.application, 'application')
        self.validate_required(self.product_codes, 'product_codes')
        if self.product_codes:
            self.product_codes.validate()
        self.validate_required(self.trade_types, 'trade_types')
        if self.trade_types:
            self.trade_types.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['CouponTemplateId'] = self.coupon_template_id
        result['TotalAmount'] = self.total_amount
        result['BalanceAmount'] = self.balance_amount
        result['FrozenAmount'] = self.frozen_amount
        result['ExpiredAmount'] = self.expired_amount
        result['DeliveryTime'] = self.delivery_time
        result['ExpiredTime'] = self.expired_time
        result['CouponNumber'] = self.coupon_number
        result['Status'] = self.status
        result['Description'] = self.description
        result['CreationTime'] = self.creation_time
        result['ModificationTime'] = self.modification_time
        result['PriceLimit'] = self.price_limit
        result['Application'] = self.application
        if self.product_codes is not None:
            result['ProductCodes'] = self.product_codes.to_map()
        else:
            result['ProductCodes'] = None
        if self.trade_types is not None:
            result['TradeTypes'] = self.trade_types.to_map()
        else:
            result['TradeTypes'] = None
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.coupon_template_id = map.get('CouponTemplateId')
        self.total_amount = map.get('TotalAmount')
        self.balance_amount = map.get('BalanceAmount')
        self.frozen_amount = map.get('FrozenAmount')
        self.expired_amount = map.get('ExpiredAmount')
        self.delivery_time = map.get('DeliveryTime')
        self.expired_time = map.get('ExpiredTime')
        self.coupon_number = map.get('CouponNumber')
        self.status = map.get('Status')
        self.description = map.get('Description')
        self.creation_time = map.get('CreationTime')
        self.modification_time = map.get('ModificationTime')
        self.price_limit = map.get('PriceLimit')
        self.application = map.get('Application')
        if map.get('ProductCodes') is not None:
            temp_model = DescribeCouponDetailResponseProductCodes()
            self.product_codes = temp_model.from_map(map['ProductCodes'])
        else:
            self.product_codes = None
        if map.get('TradeTypes') is not None:
            temp_model = DescribeCouponDetailResponseTradeTypes()
            self.trade_types = temp_model.from_map(map['TradeTypes'])
        else:
            self.trade_types = None
        return self


class DescribeCouponDetailResponseProductCodes(Tea_model_TeaModel):
    def __init__(self, product_code = None):
        self.product_code = []

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        result = {}
        result['ProductCode'] = []
        if self.product_code is not None:
            for k in self.product_code:
                result['ProductCode'].append(k)
        else:
            result['ProductCode'] = None
        return result

    def from_map(self, map = {}):
        self.product_code = []
        if map.get('ProductCode') is not None:
            for k in map.get('ProductCode'):
                self.product_code.append(k)
        else:
            self.product_code = None
        return self


class DescribeCouponDetailResponseTradeTypes(Tea_model_TeaModel):
    def __init__(self, trade_type = None):
        self.trade_type = []

    def validate(self):
        self.validate_required(self.trade_type, 'trade_type')

    def to_map(self):
        result = {}
        result['TradeType'] = []
        if self.trade_type is not None:
            for k in self.trade_type:
                result['TradeType'].append(k)
        else:
            result['TradeType'] = None
        return result

    def from_map(self, map = {}):
        self.trade_type = []
        if map.get('TradeType') is not None:
            for k in map.get('TradeType'):
                self.trade_type.append(k)
        else:
            self.trade_type = None
        return self


class DescribeCashDetailRequest(Tea_model_TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map = {}):
        return self


class DescribeCashDetailResponse(Tea_model_TeaModel):
    def __init__(self, request_id = "", balance_amount = "", amount_owed = "", enable_threshold_alert = "", mini_alert_threshold = 0, frozen_amount = "", credit_card_amount = "", remmitance_amount = "", credit_limit = "", available_credit = ""):
        self.request_id = request_id
        self.balance_amount = balance_amount
        self.amount_owed = amount_owed
        self.enable_threshold_alert = enable_threshold_alert
        self.mini_alert_threshold = mini_alert_threshold
        self.frozen_amount = frozen_amount
        self.credit_card_amount = credit_card_amount
        self.remmitance_amount = remmitance_amount
        self.credit_limit = credit_limit
        self.available_credit = available_credit

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.balance_amount, 'balance_amount')
        self.validate_required(self.amount_owed, 'amount_owed')
        self.validate_required(self.enable_threshold_alert, 'enable_threshold_alert')
        self.validate_required(self.mini_alert_threshold, 'mini_alert_threshold')
        self.validate_required(self.frozen_amount, 'frozen_amount')
        self.validate_required(self.credit_card_amount, 'credit_card_amount')
        self.validate_required(self.remmitance_amount, 'remmitance_amount')
        self.validate_required(self.credit_limit, 'credit_limit')
        self.validate_required(self.available_credit, 'available_credit')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['BalanceAmount'] = self.balance_amount
        result['AmountOwed'] = self.amount_owed
        result['EnableThresholdAlert'] = self.enable_threshold_alert
        result['MiniAlertThreshold'] = self.mini_alert_threshold
        result['FrozenAmount'] = self.frozen_amount
        result['CreditCardAmount'] = self.credit_card_amount
        result['RemmitanceAmount'] = self.remmitance_amount
        result['CreditLimit'] = self.credit_limit
        result['AvailableCredit'] = self.available_credit
        return result

    def from_map(self, map = {}):
        self.request_id = map.get('RequestId')
        self.balance_amount = map.get('BalanceAmount')
        self.amount_owed = map.get('AmountOwed')
        self.enable_threshold_alert = map.get('EnableThresholdAlert')
        self.mini_alert_threshold = map.get('MiniAlertThreshold')
        self.frozen_amount = map.get('FrozenAmount')
        self.credit_card_amount = map.get('CreditCardAmount')
        self.remmitance_amount = map.get('RemmitanceAmount')
        self.credit_limit = map.get('CreditLimit')
        self.available_credit = map.get('AvailableCredit')
        return self

