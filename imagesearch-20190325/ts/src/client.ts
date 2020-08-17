// This file is auto-generated, don't edit it
import Util, * as $Util from '@alicloud/tea-util';
import ROA, * as $ROA from '@alicloud/roa-client';
import EndpointUtil from '@alicloud/endpoint-util';
import * as $tea from '@alicloud/tea-typescript';

export class AddImageBody extends $tea.Model {
  instanceName: string;
  categoryId?: number;
  productId: string;
  picName: string;
  picContent: string;
  crop?: boolean;
  region?: string;
  customContent?: string;
  intAttr?: number;
  strAttr?: string;
  static names(): { [key: string]: string } {
    return {
      instanceName: 'InstanceName',
      categoryId: 'CategoryId',
      productId: 'ProductId',
      picName: 'PicName',
      picContent: 'PicContent',
      crop: 'Crop',
      region: 'Region',
      customContent: 'CustomContent',
      intAttr: 'IntAttr',
      strAttr: 'StrAttr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceName: 'string',
      categoryId: 'number',
      productId: 'string',
      picName: 'string',
      picContent: 'string',
      crop: 'boolean',
      region: 'string',
      customContent: 'string',
      intAttr: 'number',
      strAttr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddImageRequest extends $tea.Model {
  headers?: { [key: string]: string };
  body: AddImageBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: AddImageBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddImageResponseBody extends $tea.Model {
  requestId: string;
  success: boolean;
  message: string;
  code: number;
  picInfo: AddImageResponseBodyPicInfo;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      success: 'Success',
      message: 'Message',
      code: 'Code',
      picInfo: 'PicInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      success: 'boolean',
      message: 'string',
      code: 'number',
      picInfo: AddImageResponseBodyPicInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddImageResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: AddImageResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: AddImageResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageBody extends $tea.Model {
  instanceName: string;
  productId: string;
  picName?: string;
  static names(): { [key: string]: string } {
    return {
      instanceName: 'InstanceName',
      productId: 'ProductId',
      picName: 'PicName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceName: 'string',
      productId: 'string',
      picName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageRequest extends $tea.Model {
  headers?: { [key: string]: string };
  body: DeleteImageBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: DeleteImageBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageResponseBody extends $tea.Model {
  requestId: string;
  success: boolean;
  message: string;
  code: number;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      success: 'Success',
      message: 'Message',
      code: 'Code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      success: 'boolean',
      message: 'string',
      code: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: DeleteImageResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: DeleteImageResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageBody extends $tea.Model {
  categoryId?: number;
  instanceName: string;
  productId?: string;
  picName?: string;
  picContent?: string;
  crop?: boolean;
  region?: string;
  num?: number;
  start?: number;
  type?: string;
  filter?: string;
  static names(): { [key: string]: string } {
    return {
      categoryId: 'CategoryId',
      instanceName: 'InstanceName',
      productId: 'ProductId',
      picName: 'PicName',
      picContent: 'PicContent',
      crop: 'Crop',
      region: 'Region',
      num: 'Num',
      start: 'Start',
      type: 'Type',
      filter: 'Filter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryId: 'number',
      instanceName: 'string',
      productId: 'string',
      picName: 'string',
      picContent: 'string',
      crop: 'boolean',
      region: 'string',
      num: 'number',
      start: 'number',
      type: 'string',
      filter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageRequest extends $tea.Model {
  headers?: { [key: string]: string };
  body: SearchImageBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: SearchImageBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageResponseBody extends $tea.Model {
  requestId: string;
  success: boolean;
  code: number;
  msg: string;
  auctions: SearchImageResponseBodyAuctions[];
  head: SearchImageResponseBodyHead;
  picInfo: SearchImageResponseBodyPicInfo;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      success: 'Success',
      code: 'Code',
      msg: 'Msg',
      auctions: 'Auctions',
      head: 'Head',
      picInfo: 'PicInfo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      success: 'boolean',
      code: 'number',
      msg: 'string',
      auctions: { 'type': 'array', 'itemType': SearchImageResponseBodyAuctions },
      head: SearchImageResponseBodyHead,
      picInfo: SearchImageResponseBodyPicInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageResponse extends $tea.Model {
  headers: { [key: string]: string };
  body: SearchImageResponseBody;
  static names(): { [key: string]: string } {
    return {
      headers: 'headers',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headers: { 'type': 'map', 'keyType': 'string', 'valueType': 'string' },
      body: SearchImageResponseBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddImageResponseBodyPicInfo extends $tea.Model {
  categoryId: number;
  region: string;
  static names(): { [key: string]: string } {
    return {
      categoryId: 'CategoryId',
      region: 'Region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryId: 'number',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageResponseBodyAuctions extends $tea.Model {
  categoryId: number;
  productId: string;
  picName: string;
  customContent: string;
  sortExprValues: string;
  intAttr: number;
  strAttr: string;
  static names(): { [key: string]: string } {
    return {
      categoryId: 'CategoryId',
      productId: 'ProductId',
      picName: 'PicName',
      customContent: 'CustomContent',
      sortExprValues: 'SortExprValues',
      intAttr: 'IntAttr',
      strAttr: 'StrAttr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryId: 'number',
      productId: 'string',
      picName: 'string',
      customContent: 'string',
      sortExprValues: 'string',
      intAttr: 'number',
      strAttr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageResponseBodyHead extends $tea.Model {
  docsReturn: number;
  docsFound: number;
  searchTime: number;
  static names(): { [key: string]: string } {
    return {
      docsReturn: 'DocsReturn',
      docsFound: 'DocsFound',
      searchTime: 'SearchTime',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docsReturn: 'number',
      docsFound: 'number',
      searchTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageResponseBodyPicInfoAllCategories extends $tea.Model {
  id: number;
  name: string;
  static names(): { [key: string]: string } {
    return {
      id: 'Id',
      name: 'Name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchImageResponseBodyPicInfo extends $tea.Model {
  categoryId: number;
  region: string;
  allCategories: SearchImageResponseBodyPicInfoAllCategories[];
  static names(): { [key: string]: string } {
    return {
      categoryId: 'CategoryId',
      region: 'Region',
      allCategories: 'AllCategories',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryId: 'number',
      region: 'string',
      allCategories: { 'type': 'array', 'itemType': SearchImageResponseBodyPicInfoAllCategories },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client extends ROA {

  constructor(config: $ROA.Config) {
    super(config);
    this._endpointRule = "";
    this.checkConfig(config);
    this._endpointHost = this.getEndpoint("imagesearch", this._regionId, this._endpointRule, this._network, this._suffix, this._endpointMap, this._endpointHost);
  }


  async addImageWithOptions(request: AddImageRequest, runtime: $Util.RuntimeOptions): Promise<AddImageResponse> {
    Util.validateModel(request);
    return $tea.cast<AddImageResponse>(await this.doRequestWithAction("AddImage", "2019-03-25", "HTTPS", "POST", "AK", `/v2/image/add`, null, request.headers, $tea.toMap(request.body), runtime), new AddImageResponse({}));
  }

  async addImage(request: AddImageRequest): Promise<AddImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addImageWithOptions(request, runtime);
  }

  async deleteImageWithOptions(request: DeleteImageRequest, runtime: $Util.RuntimeOptions): Promise<DeleteImageResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteImageResponse>(await this.doRequestWithAction("DeleteImage", "2019-03-25", "HTTPS", "POST", "AK", `/v2/image/delete`, null, request.headers, $tea.toMap(request.body), runtime), new DeleteImageResponse({}));
  }

  async deleteImage(request: DeleteImageRequest): Promise<DeleteImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteImageWithOptions(request, runtime);
  }

  async searchImageWithOptions(request: SearchImageRequest, runtime: $Util.RuntimeOptions): Promise<SearchImageResponse> {
    Util.validateModel(request);
    return $tea.cast<SearchImageResponse>(await this.doRequestWithAction("SearchImage", "2019-03-25", "HTTPS", "POST", "AK", `/v2/image/search`, null, request.headers, $tea.toMap(request.body), runtime), new SearchImageResponse({}));
  }

  async searchImage(request: SearchImageRequest): Promise<SearchImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.searchImageWithOptions(request, runtime);
  }

  getEndpoint(productId: string, regionId: string, endpointRule: string, network: string, suffix: string, endpointMap: {[key: string ]: string}, endpoint: string): string {
    if (!Util.empty(endpoint)) {
      return endpoint;
    }

    if (!Util.isUnset(endpointMap) && !Util.empty(endpointMap[regionId])) {
      return endpointMap[regionId];
    }

    return EndpointUtil.getEndpointRules(productId, regionId, endpointRule, network, suffix);
  }

}
