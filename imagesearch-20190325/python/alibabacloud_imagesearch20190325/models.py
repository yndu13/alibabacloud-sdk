# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class AddImageBody(TeaModel):
    def __init__(self, instance_name=None, category_id=None, product_id=None, pic_name=None, pic_content=None,
                 crop=None, region=None, custom_content=None, int_attr=None, str_attr=None):
        self.instance_name = instance_name
        self.category_id = category_id
        self.product_id = product_id
        self.pic_name = pic_name
        self.pic_content = pic_content
        self.crop = crop
        self.region = region
        self.custom_content = custom_content
        self.int_attr = int_attr
        self.str_attr = str_attr

    def validate(self):
        self.validate_required(self.instance_name, 'instance_name')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.pic_name, 'pic_name')
        self.validate_required(self.pic_content, 'pic_content')

    def to_map(self):
        result = {}
        result['InstanceName'] = self.instance_name
        result['CategoryId'] = self.category_id
        result['ProductId'] = self.product_id
        result['PicName'] = self.pic_name
        result['PicContent'] = self.pic_content
        result['Crop'] = self.crop
        result['Region'] = self.region
        result['CustomContent'] = self.custom_content
        result['IntAttr'] = self.int_attr
        result['StrAttr'] = self.str_attr
        return result

    def from_map(self, map={}):
        self.instance_name = map.get('InstanceName')
        self.category_id = map.get('CategoryId')
        self.product_id = map.get('ProductId')
        self.pic_name = map.get('PicName')
        self.pic_content = map.get('PicContent')
        self.crop = map.get('Crop')
        self.region = map.get('Region')
        self.custom_content = map.get('CustomContent')
        self.int_attr = map.get('IntAttr')
        self.str_attr = map.get('StrAttr')
        return self


class AddImageRequest(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = AddImageBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self


class AddImageResponseBody(TeaModel):
    def __init__(self, request_id=None, success=None, message=None, code=None, pic_info=None):
        self.request_id = request_id
        self.success = success
        self.message = message
        self.code = code
        self.pic_info = pic_info

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.message, 'message')
        self.validate_required(self.code, 'code')
        self.validate_required(self.pic_info, 'pic_info')
        if self.pic_info:
            self.pic_info.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Message'] = self.message
        result['Code'] = self.code
        if self.pic_info is not None:
            result['PicInfo'] = self.pic_info.to_map()
        else:
            result['PicInfo'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.message = map.get('Message')
        self.code = map.get('Code')
        if map.get('PicInfo') is not None:
            temp_model = AddImageResponseBodyPicInfo()
            self.pic_info = temp_model.from_map(map['PicInfo'])
        else:
            self.pic_info = None
        return self


class AddImageResponseBodyPicInfo(TeaModel):
    def __init__(self, category_id=None, region=None):
        self.category_id = category_id
        self.region = region

    def validate(self):
        self.validate_required(self.category_id, 'category_id')
        self.validate_required(self.region, 'region')

    def to_map(self):
        result = {}
        result['CategoryId'] = self.category_id
        result['Region'] = self.region
        return result

    def from_map(self, map={}):
        self.category_id = map.get('CategoryId')
        self.region = map.get('Region')
        return self
class AddImageResponse(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.headers, 'headers')
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = AddImageResponseBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self


class DeleteImageBody(TeaModel):
    def __init__(self, instance_name=None, product_id=None, pic_name=None):
        self.instance_name = instance_name
        self.product_id = product_id
        self.pic_name = pic_name

    def validate(self):
        self.validate_required(self.instance_name, 'instance_name')
        self.validate_required(self.product_id, 'product_id')

    def to_map(self):
        result = {}
        result['InstanceName'] = self.instance_name
        result['ProductId'] = self.product_id
        result['PicName'] = self.pic_name
        return result

    def from_map(self, map={}):
        self.instance_name = map.get('InstanceName')
        self.product_id = map.get('ProductId')
        self.pic_name = map.get('PicName')
        return self


class DeleteImageRequest(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = DeleteImageBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self


class DeleteImageResponseBody(TeaModel):
    def __init__(self, request_id=None, success=None, message=None, code=None):
        self.request_id = request_id
        self.success = success
        self.message = message
        self.code = code

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.message, 'message')
        self.validate_required(self.code, 'code')

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Message'] = self.message
        result['Code'] = self.code
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.message = map.get('Message')
        self.code = map.get('Code')
        return self


class DeleteImageResponse(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.headers, 'headers')
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = DeleteImageResponseBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self


class SearchImageBody(TeaModel):
    def __init__(self, category_id=None, instance_name=None, product_id=None, pic_name=None, pic_content=None,
                 crop=None, region=None, num=None, start=None, type=None, filter=None):
        self.category_id = category_id
        self.instance_name = instance_name
        self.product_id = product_id
        self.pic_name = pic_name
        self.pic_content = pic_content
        self.crop = crop
        self.region = region
        self.num = num
        self.start = start
        self.type = type
        self.filter = filter

    def validate(self):
        self.validate_required(self.instance_name, 'instance_name')

    def to_map(self):
        result = {}
        result['CategoryId'] = self.category_id
        result['InstanceName'] = self.instance_name
        result['ProductId'] = self.product_id
        result['PicName'] = self.pic_name
        result['PicContent'] = self.pic_content
        result['Crop'] = self.crop
        result['Region'] = self.region
        result['Num'] = self.num
        result['Start'] = self.start
        result['Type'] = self.type
        result['Filter'] = self.filter
        return result

    def from_map(self, map={}):
        self.category_id = map.get('CategoryId')
        self.instance_name = map.get('InstanceName')
        self.product_id = map.get('ProductId')
        self.pic_name = map.get('PicName')
        self.pic_content = map.get('PicContent')
        self.crop = map.get('Crop')
        self.region = map.get('Region')
        self.num = map.get('Num')
        self.start = map.get('Start')
        self.type = map.get('Type')
        self.filter = map.get('Filter')
        return self


class SearchImageRequest(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = SearchImageBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self


class SearchImageResponseBody(TeaModel):
    def __init__(self, request_id=None, success=None, code=None, msg=None, auctions=None, head=None, pic_info=None):
        self.request_id = request_id
        self.success = success
        self.code = code
        self.msg = msg
        self.auctions = auctions
        self.head = head
        self.pic_info = pic_info

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.auctions, 'auctions')
        if self.auctions:
            for k in self.auctions:
                if k:
                    k.validate()
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.pic_info, 'pic_info')
        if self.pic_info:
            self.pic_info.validate()

    def to_map(self):
        result = {}
        result['RequestId'] = self.request_id
        result['Success'] = self.success
        result['Code'] = self.code
        result['Msg'] = self.msg
        result['Auctions'] = []
        if self.auctions is not None:
            for k in self.auctions:
                result['Auctions'].append(k.to_map() if k else None)
        else:
            result['Auctions'] = None
        if self.head is not None:
            result['Head'] = self.head.to_map()
        else:
            result['Head'] = None
        if self.pic_info is not None:
            result['PicInfo'] = self.pic_info.to_map()
        else:
            result['PicInfo'] = None
        return result

    def from_map(self, map={}):
        self.request_id = map.get('RequestId')
        self.success = map.get('Success')
        self.code = map.get('Code')
        self.msg = map.get('Msg')
        self.auctions = []
        if map.get('Auctions') is not None:
            for k in map.get('Auctions'):
                temp_model = SearchImageResponseBodyAuctions()
                temp_model = temp_model.from_map(k)
                self.auctions.append(temp_model)
        else:
            self.auctions = None
        if map.get('Head') is not None:
            temp_model = SearchImageResponseBodyHead()
            self.head = temp_model.from_map(map['Head'])
        else:
            self.head = None
        if map.get('PicInfo') is not None:
            temp_model = SearchImageResponseBodyPicInfo()
            self.pic_info = temp_model.from_map(map['PicInfo'])
        else:
            self.pic_info = None
        return self


class SearchImageResponseBodyAuctions(TeaModel):
    def __init__(self, category_id=None, product_id=None, pic_name=None, custom_content=None, sort_expr_values=None,
                 int_attr=None, str_attr=None):
        self.category_id = category_id
        self.product_id = product_id
        self.pic_name = pic_name
        self.custom_content = custom_content
        self.sort_expr_values = sort_expr_values
        self.int_attr = int_attr
        self.str_attr = str_attr

    def validate(self):
        self.validate_required(self.category_id, 'category_id')
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.pic_name, 'pic_name')
        self.validate_required(self.custom_content, 'custom_content')
        self.validate_required(self.sort_expr_values, 'sort_expr_values')
        self.validate_required(self.int_attr, 'int_attr')
        self.validate_required(self.str_attr, 'str_attr')

    def to_map(self):
        result = {}
        result['CategoryId'] = self.category_id
        result['ProductId'] = self.product_id
        result['PicName'] = self.pic_name
        result['CustomContent'] = self.custom_content
        result['SortExprValues'] = self.sort_expr_values
        result['IntAttr'] = self.int_attr
        result['StrAttr'] = self.str_attr
        return result

    def from_map(self, map={}):
        self.category_id = map.get('CategoryId')
        self.product_id = map.get('ProductId')
        self.pic_name = map.get('PicName')
        self.custom_content = map.get('CustomContent')
        self.sort_expr_values = map.get('SortExprValues')
        self.int_attr = map.get('IntAttr')
        self.str_attr = map.get('StrAttr')
        return self


class SearchImageResponseBodyHead(TeaModel):
    def __init__(self, docs_return=None, docs_found=None, search_time=None):
        self.docs_return = docs_return
        self.docs_found = docs_found
        self.search_time = search_time

    def validate(self):
        self.validate_required(self.docs_return, 'docs_return')
        self.validate_required(self.docs_found, 'docs_found')
        self.validate_required(self.search_time, 'search_time')

    def to_map(self):
        result = {}
        result['DocsReturn'] = self.docs_return
        result['DocsFound'] = self.docs_found
        result['SearchTime'] = self.search_time
        return result

    def from_map(self, map={}):
        self.docs_return = map.get('DocsReturn')
        self.docs_found = map.get('DocsFound')
        self.search_time = map.get('SearchTime')
        return self


class SearchImageResponseBodyPicInfoAllCategories(TeaModel):
    def __init__(self, id=None, name=None):
        self.id = id
        self.name = name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = {}
        result['Id'] = self.id
        result['Name'] = self.name
        return result

    def from_map(self, map={}):
        self.id = map.get('Id')
        self.name = map.get('Name')
        return self


class SearchImageResponseBodyPicInfo(TeaModel):
    def __init__(self, category_id=None, region=None, all_categories=None):
        self.category_id = category_id
        self.region = region
        self.all_categories = all_categories

    def validate(self):
        self.validate_required(self.category_id, 'category_id')
        self.validate_required(self.region, 'region')
        self.validate_required(self.all_categories, 'all_categories')
        if self.all_categories:
            for k in self.all_categories:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['CategoryId'] = self.category_id
        result['Region'] = self.region
        result['AllCategories'] = []
        if self.all_categories is not None:
            for k in self.all_categories:
                result['AllCategories'].append(k.to_map() if k else None)
        else:
            result['AllCategories'] = None
        return result

    def from_map(self, map={}):
        self.category_id = map.get('CategoryId')
        self.region = map.get('Region')
        self.all_categories = []
        if map.get('AllCategories') is not None:
            for k in map.get('AllCategories'):
                temp_model = SearchImageResponseBodyPicInfoAllCategories()
                temp_model = temp_model.from_map(k)
                self.all_categories.append(temp_model)
        else:
            self.all_categories = None
        return self
class SearchImageResponse(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = headers
        self.body = body

    def validate(self):
        self.validate_required(self.headers, 'headers')
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = SearchImageResponseBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self
