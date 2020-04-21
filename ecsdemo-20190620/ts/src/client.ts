// This file is auto-generated, don't edit it
import Util, * as $Util from '@alicloud/tea-util';
import RPC, * as $RPC from '@alicloud/rpc-client';
import EndpointUtil from '@alicloud/endpoint-util';
import * as $tea from '@alicloud/tea-typescript';

export class AsdwqwRequest extends $tea.Model {
  groupTest?: string;
  groupTestA?: string;
  static names(): { [key: string]: string } {
    return {
      groupTest: 'GroupTest',
      groupTestA: 'GroupTestA',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupTest: 'string',
      groupTestA: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsdwqwResponse extends $tea.Model {
  add: string;
  dda: number;
  ABC: AsdwqwResponseABC[];
  dds: { [key: string]: any }[];
  ko: string[];
  static names(): { [key: string]: string } {
    return {
      add: 'Add',
      dda: 'Dda',
      ABC: 'ABC',
      dds: 'Dds',
      ko: 'Ko',
    };
  }

  static types(): { [key: string]: any } {
    return {
      add: 'string',
      dda: 'number',
      ABC: { 'type': 'array', 'itemType': AsdwqwResponseABC },
      dds: { 'type': 'array', 'itemType': { 'type': 'map', 'keyType': 'string', 'valueType': 'any' } },
      ko: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HsfMockRequest extends $tea.Model {
  request?: string;
  response?: string;
  RT?: number;
  responseSize?: number;
  static names(): { [key: string]: string } {
    return {
      request: 'Request',
      response: 'Response',
      RT: 'RT',
      responseSize: 'ResponseSize',
    };
  }

  static types(): { [key: string]: any } {
    return {
      request: 'string',
      response: 'string',
      RT: 'number',
      responseSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HsfMockResponse extends $tea.Model {
  requestId: string;
  value: string;
  size: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      value: 'Value',
      size: 'Size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      value: 'string',
      size: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteEcsDemoIncRequest extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteEcsDemoIncResponse extends $tea.Model {
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesRequest extends $tea.Model {
  ownerId?: number;
  resourceOwnerAccount?: string;
  resourceOwnerId?: number;
  regionId: string;
  vpcId?: string;
  VSwitchId?: string;
  zoneId?: string;
  instanceNetworkType?: string;
  securityGroupId?: string;
  instanceIds?: string;
  pageNumber?: number;
  pageSize?: number;
  innerIpAddresses?: string;
  privateIpAddresses?: string;
  publicIpAddresses?: string;
  eipAddresses?: string;
  ownerAccount?: string;
  instanceChargeType?: string;
  internetChargeType?: string;
  instanceName?: string;
  imageId?: string;
  status?: string;
  lockReason?: string;
  filter: DescribeInstancesRequestFilter[];
  deviceAvailable?: boolean;
  ioOptimized?: boolean;
  needSaleCycle?: boolean;
  tag?: DescribeInstancesRequestTag[];
  instanceType?: string;
  instanceTypeFamily?: string;
  keyPairName?: string;
  resourceGroupId?: string;
  hpcClusterId?: string;
  rdmaIpAddresses?: string;
  dryRun?: boolean;
  static names(): { [key: string]: string } {
    return {
      ownerId: 'OwnerId',
      resourceOwnerAccount: 'ResourceOwnerAccount',
      resourceOwnerId: 'ResourceOwnerId',
      regionId: 'RegionId',
      vpcId: 'VpcId',
      VSwitchId: 'VSwitchId',
      zoneId: 'ZoneId',
      instanceNetworkType: 'InstanceNetworkType',
      securityGroupId: 'SecurityGroupId',
      instanceIds: 'InstanceIds',
      pageNumber: 'PageNumber',
      pageSize: 'PageSize',
      innerIpAddresses: 'InnerIpAddresses',
      privateIpAddresses: 'PrivateIpAddresses',
      publicIpAddresses: 'PublicIpAddresses',
      eipAddresses: 'EipAddresses',
      ownerAccount: 'OwnerAccount',
      instanceChargeType: 'InstanceChargeType',
      internetChargeType: 'InternetChargeType',
      instanceName: 'InstanceName',
      imageId: 'ImageId',
      status: 'Status',
      lockReason: 'LockReason',
      filter: 'Filter',
      deviceAvailable: 'DeviceAvailable',
      ioOptimized: 'IoOptimized',
      needSaleCycle: 'NeedSaleCycle',
      tag: 'Tag',
      instanceType: 'InstanceType',
      instanceTypeFamily: 'InstanceTypeFamily',
      keyPairName: 'KeyPairName',
      resourceGroupId: 'ResourceGroupId',
      hpcClusterId: 'HpcClusterId',
      rdmaIpAddresses: 'RdmaIpAddresses',
      dryRun: 'DryRun',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ownerId: 'number',
      resourceOwnerAccount: 'string',
      resourceOwnerId: 'number',
      regionId: 'string',
      vpcId: 'string',
      VSwitchId: 'string',
      zoneId: 'string',
      instanceNetworkType: 'string',
      securityGroupId: 'string',
      instanceIds: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      innerIpAddresses: 'string',
      privateIpAddresses: 'string',
      publicIpAddresses: 'string',
      eipAddresses: 'string',
      ownerAccount: 'string',
      instanceChargeType: 'string',
      internetChargeType: 'string',
      instanceName: 'string',
      imageId: 'string',
      status: 'string',
      lockReason: 'string',
      filter: { 'type': 'array', 'itemType': DescribeInstancesRequestFilter },
      deviceAvailable: 'boolean',
      ioOptimized: 'boolean',
      needSaleCycle: 'boolean',
      tag: { 'type': 'array', 'itemType': DescribeInstancesRequestTag },
      instanceType: 'string',
      instanceTypeFamily: 'string',
      keyPairName: 'string',
      resourceGroupId: 'string',
      hpcClusterId: 'string',
      rdmaIpAddresses: 'string',
      dryRun: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponse extends $tea.Model {
  pageNumber: number;
  pageSize: number;
  requestId: string;
  totalCount: number;
  instances: DescribeInstancesResponseInstances;
  static names(): { [key: string]: string } {
    return {
      pageNumber: 'PageNumber',
      pageSize: 'PageSize',
      requestId: 'RequestId',
      totalCount: 'TotalCount',
      instances: 'Instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageNumber: 'number',
      pageSize: 'number',
      requestId: 'string',
      totalCount: 'number',
      instances: DescribeInstancesResponseInstances,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEcsDemoIncRequest extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEcsDemoIncResponse extends $tea.Model {
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks001Request extends $tea.Model {
  authKey: string;
  requestId: string;
  clientIp: string;
  identityDTO: { [key: string]: any };
  extraParams: { [key: string]: any };
  serverClientIp: string;
  nextToken?: number;
  static names(): { [key: string]: string } {
    return {
      authKey: 'AuthKey',
      requestId: 'RequestId',
      clientIp: 'ClientIp',
      identityDTO: 'IdentityDTO',
      extraParams: 'ExtraParams',
      serverClientIp: 'ServerClientIp',
      nextToken: 'NextToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authKey: 'string',
      requestId: 'string',
      clientIp: 'string',
      identityDTO: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      extraParams: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      serverClientIp: 'string',
      nextToken: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks001Response extends $tea.Model {
  traceId: string;
  errorDetailMessage: string;
  success: boolean;
  errorMessage: string;
  errorCode: string;
  totalCount: number;
  result: ListDisks001ResponseResult;
  static names(): { [key: string]: string } {
    return {
      traceId: 'TraceId',
      errorDetailMessage: 'ErrorDetailMessage',
      success: 'Success',
      errorMessage: 'ErrorMessage',
      errorCode: 'ErrorCode',
      totalCount: 'TotalCount',
      result: 'Result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      traceId: 'string',
      errorDetailMessage: 'string',
      success: 'boolean',
      errorMessage: 'string',
      errorCode: 'string',
      totalCount: 'number',
      result: ListDisks001ResponseResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks1233Request extends $tea.Model {
  authKey: string;
  requestId: string;
  clientIp: string;
  identityDTO: { [key: string]: any };
  extraParams: { [key: string]: any };
  serverClientIp: string;
  static names(): { [key: string]: string } {
    return {
      authKey: 'AuthKey',
      requestId: 'RequestId',
      clientIp: 'ClientIp',
      identityDTO: 'IdentityDTO',
      extraParams: 'ExtraParams',
      serverClientIp: 'ServerClientIp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authKey: 'string',
      requestId: 'string',
      clientIp: 'string',
      identityDTO: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      extraParams: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      serverClientIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks1233Response extends $tea.Model {
  traceId: string;
  errorDetailMessage: string;
  success: boolean;
  errorMessage: string;
  errorCode: string;
  static names(): { [key: string]: string } {
    return {
      traceId: 'TraceId',
      errorDetailMessage: 'ErrorDetailMessage',
      success: 'Success',
      errorMessage: 'ErrorMessage',
      errorCode: 'ErrorCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      traceId: 'string',
      errorDetailMessage: 'string',
      success: 'boolean',
      errorMessage: 'string',
      errorCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ModifyInstanceRequest extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ModifyInstanceResponse extends $tea.Model {
  requestId: string;
  answerList: ModifyInstanceResponseAnswerList[];
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      answerList: 'AnswerList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      answerList: { 'type': 'array', 'itemType': ModifyInstanceResponseAnswerList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4Request extends $tea.Model {
  env: string;
  acceptLanguage?: string;
  product: string;
  pageNumber?: number;
  pageSize?: number;
  filters?: string[];
  resourceTypeCodes?: string[];
  siteType?: string;
  fromCache?: boolean;
  repeatLista?: string[];
  static names(): { [key: string]: string } {
    return {
      env: 'Env',
      acceptLanguage: 'AcceptLanguage',
      product: 'Product',
      pageNumber: 'PageNumber',
      pageSize: 'PageSize',
      filters: 'Filters',
      resourceTypeCodes: 'ResourceTypeCodes',
      siteType: 'SiteType',
      fromCache: 'FromCache',
      repeatLista: 'RepeatLista',
    };
  }

  static types(): { [key: string]: any } {
    return {
      env: 'string',
      acceptLanguage: 'string',
      product: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      filters: { 'type': 'array', 'itemType': 'string' },
      resourceTypeCodes: { 'type': 'array', 'itemType': 'string' },
      siteType: 'string',
      fromCache: 'boolean',
      repeatLista: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4Response extends $tea.Model {
  requestId: string;
  pageNumber: boolean;
  pageSize: boolean;
  totalCount: number;
  resourceTypes: HiFucker4ResponseResourceTypes[];
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      pageNumber: 'PageNumber',
      pageSize: 'PageSize',
      totalCount: 'TotalCount',
      resourceTypes: 'ResourceTypes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      pageNumber: 'boolean',
      pageSize: 'boolean',
      totalCount: 'number',
      resourceTypes: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypes },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTestEcsRequest extends $tea.Model {
  authKey: string;
  requestId: string;
  clientIp: string;
  identityDTO: { [key: string]: any };
  extraParams: { [key: string]: any };
  serverClientIp: string;
  gmtModified: string;
  marketStr: string;
  projectStatusStr: string;
  changeFreeStatus: string;
  dailyTime: string;
  relationPeople: string;
  closeTime: string;
  onlineTime: string;
  createPeopleName: string;
  id: number;
  namespaceName: string;
  planStartTime: string;
  changeFreeOrderId: string;
  preTime: string;
  createPeopleBucId: string;
  gmtCreate: string;
  market: number;
  projectStatus: number;
  namespaceId: number;
  projectDesc: string;
  planEndTime: string;
  createPeopleId: string;
  projectName: string;
  properties: string;
  static names(): { [key: string]: string } {
    return {
      authKey: 'AuthKey',
      requestId: 'RequestId',
      clientIp: 'ClientIp',
      identityDTO: 'IdentityDTO',
      extraParams: 'ExtraParams',
      serverClientIp: 'ServerClientIp',
      gmtModified: 'GmtModified',
      marketStr: 'MarketStr',
      projectStatusStr: 'ProjectStatusStr',
      changeFreeStatus: 'ChangeFreeStatus',
      dailyTime: 'DailyTime',
      relationPeople: 'RelationPeople',
      closeTime: 'CloseTime',
      onlineTime: 'OnlineTime',
      createPeopleName: 'CreatePeopleName',
      id: 'Id',
      namespaceName: 'NamespaceName',
      planStartTime: 'PlanStartTime',
      changeFreeOrderId: 'ChangeFreeOrderId',
      preTime: 'PreTime',
      createPeopleBucId: 'CreatePeopleBucId',
      gmtCreate: 'GmtCreate',
      market: 'Market',
      projectStatus: 'ProjectStatus',
      namespaceId: 'NamespaceId',
      projectDesc: 'ProjectDesc',
      planEndTime: 'PlanEndTime',
      createPeopleId: 'CreatePeopleId',
      projectName: 'ProjectName',
      properties: 'Properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authKey: 'string',
      requestId: 'string',
      clientIp: 'string',
      identityDTO: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      extraParams: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      serverClientIp: 'string',
      gmtModified: 'string',
      marketStr: 'string',
      projectStatusStr: 'string',
      changeFreeStatus: 'string',
      dailyTime: 'string',
      relationPeople: 'string',
      closeTime: 'string',
      onlineTime: 'string',
      createPeopleName: 'string',
      id: 'number',
      namespaceName: 'string',
      planStartTime: 'string',
      changeFreeOrderId: 'string',
      preTime: 'string',
      createPeopleBucId: 'string',
      gmtCreate: 'string',
      market: 'number',
      projectStatus: 'number',
      namespaceId: 'number',
      projectDesc: 'string',
      planEndTime: 'string',
      createPeopleId: 'string',
      projectName: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTestEcsResponse extends $tea.Model {
  traceId: string;
  errorDetailMessage: string;
  success: boolean;
  errorMessage: string;
  errorCode: string;
  static names(): { [key: string]: string } {
    return {
      traceId: 'TraceId',
      errorDetailMessage: 'ErrorDetailMessage',
      success: 'Success',
      errorMessage: 'ErrorMessage',
      errorCode: 'ErrorCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      traceId: 'string',
      errorDetailMessage: 'string',
      success: 'boolean',
      errorMessage: 'string',
      errorCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks00Request extends $tea.Model {
  authKey: string;
  requestId: string;
  clientIp: string;
  identityDTO: { [key: string]: any };
  extraParams: { [key: string]: any };
  serverClientIp: string;
  static names(): { [key: string]: string } {
    return {
      authKey: 'AuthKey',
      requestId: 'RequestId',
      clientIp: 'ClientIp',
      identityDTO: 'IdentityDTO',
      extraParams: 'ExtraParams',
      serverClientIp: 'ServerClientIp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authKey: 'string',
      requestId: 'string',
      clientIp: 'string',
      identityDTO: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      extraParams: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      serverClientIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks00Response extends $tea.Model {
  traceId: string;
  errorDetailMessage: string;
  success: boolean;
  errorMessage: string;
  errorCode: string;
  static names(): { [key: string]: string } {
    return {
      traceId: 'TraceId',
      errorDetailMessage: 'ErrorDetailMessage',
      success: 'Success',
      errorMessage: 'ErrorMessage',
      errorCode: 'ErrorCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      traceId: 'string',
      errorDetailMessage: 'string',
      success: 'boolean',
      errorMessage: 'string',
      errorCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInstance01Request extends $tea.Model {
  authKey: string;
  requestId: string;
  clientIp: string;
  identityDTO: { [key: string]: any };
  extraParams: { [key: string]: any };
  serverClientIp: string;
  static names(): { [key: string]: string } {
    return {
      authKey: 'AuthKey',
      requestId: 'RequestId',
      clientIp: 'ClientIp',
      identityDTO: 'IdentityDTO',
      extraParams: 'ExtraParams',
      serverClientIp: 'ServerClientIp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authKey: 'string',
      requestId: 'string',
      clientIp: 'string',
      identityDTO: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      extraParams: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      serverClientIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInstance01Response extends $tea.Model {
  traceId: string;
  errorDetailMessage: string;
  success: boolean;
  errorMessage: string;
  errorCode: string;
  result: GetInstance01ResponseResult;
  static names(): { [key: string]: string } {
    return {
      traceId: 'TraceId',
      errorDetailMessage: 'ErrorDetailMessage',
      success: 'Success',
      errorMessage: 'ErrorMessage',
      errorCode: 'ErrorCode',
      result: 'Result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      traceId: 'string',
      errorDetailMessage: 'string',
      success: 'boolean',
      errorMessage: 'string',
      errorCode: 'string',
      result: GetInstance01ResponseResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableDiskRequest extends $tea.Model {
  typeCode: string;
  static names(): { [key: string]: string } {
    return {
      typeCode: 'TypeCode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      typeCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableDiskResponse extends $tea.Model {
  success: boolean;
  data: DisableDiskResponseData;
  static names(): { [key: string]: string } {
    return {
      success: 'Success',
      data: 'Data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      data: DisableDiskResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FsRequest extends $tea.Model {
  regionId: string;
  imageId: string;
  internetChargeType?: string;
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      regionId: 'RegionId',
      imageId: 'ImageId',
      internetChargeType: 'InternetChargeType',
      clientToken: 'ClientToken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      regionId: 'string',
      imageId: 'string',
      internetChargeType: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FsResponse extends $tea.Model {
  instanceId: string;
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
      requestId: 'RequestId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AttachDiskRequest extends $tea.Model {
  aid?: string;
  bid?: string;
  static names(): { [key: string]: string } {
    return {
      aid: 'Aid',
      bid: 'Bid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aid: 'string',
      bid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AttachDiskResponse extends $tea.Model {
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteInstanceRequest extends $tea.Model {
  ownerId?: number;
  resourceOwnerAccount?: string;
  resourceOwnerId?: number;
  instanceId: string;
  ownerAccount?: string;
  force?: boolean;
  terminateSubscription?: boolean;
  static names(): { [key: string]: string } {
    return {
      ownerId: 'OwnerId',
      resourceOwnerAccount: 'ResourceOwnerAccount',
      resourceOwnerId: 'ResourceOwnerId',
      instanceId: 'InstanceId',
      ownerAccount: 'OwnerAccount',
      force: 'Force',
      terminateSubscription: 'TerminateSubscription',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ownerId: 'number',
      resourceOwnerAccount: 'string',
      resourceOwnerId: 'number',
      instanceId: 'string',
      ownerAccount: 'string',
      force: 'boolean',
      terminateSubscription: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteInstanceResponse extends $tea.Model {
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInstanceRequest extends $tea.Model {
  ownerId?: number;
  resourceOwnerAccount?: string;
  resourceOwnerId?: number;
  regionId: string;
  imageId?: string;
  imageFamily?: string;
  instanceType: string;
  securityGroupId?: string;
  instanceName?: string;
  internetChargeType?: string;
  autoRenew?: boolean;
  autoRenewPeriod?: number;
  internetMaxBandwidthIn?: number;
  internetMaxBandwidthOut?: number;
  hostName?: string;
  password?: string;
  passwordInherit?: boolean;
  deploymentSetId?: string;
  zoneId?: string;
  clusterId?: string;
  clientToken?: string;
  vlanId?: string;
  innerIpAddress?: string;
  systemDisk: CreateInstanceRequestSystemDisk;
  dataDisk?: CreateInstanceRequestDataDisk[];
  arn?: CreateInstanceRequestArn[];
  nodeControllerId?: string;
  description?: string;
  VSwitchId?: string;
  privateIpAddress?: string;
  ioOptimized?: string;
  ownerAccount?: string;
  useAdditionalService?: boolean;
  instanceChargeType?: string;
  period?: number;
  periodUnit?: string;
  tag?: CreateInstanceRequestTag[];
  userData?: string;
  spotStrategy?: string;
  keyPairName?: string;
  spotPriceLimit?: number;
  spotDuration?: number;
  spotInterruptionBehavior?: string;
  ramRoleName?: string;
  securityEnhancementStrategy?: string;
  resourceGroupId?: string;
  hpcClusterId?: string;
  dryRun?: boolean;
  dedicatedHostId?: string;
  creditSpecification?: string;
  deletionProtection?: boolean;
  affinity?: string;
  tenancy?: string;
  storageSetId?: string;
  storageSetPartitionNumber?: number;
  static names(): { [key: string]: string } {
    return {
      ownerId: 'OwnerId',
      resourceOwnerAccount: 'ResourceOwnerAccount',
      resourceOwnerId: 'ResourceOwnerId',
      regionId: 'RegionId',
      imageId: 'ImageId',
      imageFamily: 'ImageFamily',
      instanceType: 'InstanceType',
      securityGroupId: 'SecurityGroupId',
      instanceName: 'InstanceName',
      internetChargeType: 'InternetChargeType',
      autoRenew: 'AutoRenew',
      autoRenewPeriod: 'AutoRenewPeriod',
      internetMaxBandwidthIn: 'InternetMaxBandwidthIn',
      internetMaxBandwidthOut: 'InternetMaxBandwidthOut',
      hostName: 'HostName',
      password: 'Password',
      passwordInherit: 'PasswordInherit',
      deploymentSetId: 'DeploymentSetId',
      zoneId: 'ZoneId',
      clusterId: 'ClusterId',
      clientToken: 'ClientToken',
      vlanId: 'VlanId',
      innerIpAddress: 'InnerIpAddress',
      systemDisk: 'SystemDisk',
      dataDisk: 'DataDisk',
      arn: 'Arn',
      nodeControllerId: 'NodeControllerId',
      description: 'Description',
      VSwitchId: 'VSwitchId',
      privateIpAddress: 'PrivateIpAddress',
      ioOptimized: 'IoOptimized',
      ownerAccount: 'OwnerAccount',
      useAdditionalService: 'UseAdditionalService',
      instanceChargeType: 'InstanceChargeType',
      period: 'Period',
      periodUnit: 'PeriodUnit',
      tag: 'Tag',
      userData: 'UserData',
      spotStrategy: 'SpotStrategy',
      keyPairName: 'KeyPairName',
      spotPriceLimit: 'SpotPriceLimit',
      spotDuration: 'SpotDuration',
      spotInterruptionBehavior: 'SpotInterruptionBehavior',
      ramRoleName: 'RamRoleName',
      securityEnhancementStrategy: 'SecurityEnhancementStrategy',
      resourceGroupId: 'ResourceGroupId',
      hpcClusterId: 'HpcClusterId',
      dryRun: 'DryRun',
      dedicatedHostId: 'DedicatedHostId',
      creditSpecification: 'CreditSpecification',
      deletionProtection: 'DeletionProtection',
      affinity: 'Affinity',
      tenancy: 'Tenancy',
      storageSetId: 'StorageSetId',
      storageSetPartitionNumber: 'StorageSetPartitionNumber',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ownerId: 'number',
      resourceOwnerAccount: 'string',
      resourceOwnerId: 'number',
      regionId: 'string',
      imageId: 'string',
      imageFamily: 'string',
      instanceType: 'string',
      securityGroupId: 'string',
      instanceName: 'string',
      internetChargeType: 'string',
      autoRenew: 'boolean',
      autoRenewPeriod: 'number',
      internetMaxBandwidthIn: 'number',
      internetMaxBandwidthOut: 'number',
      hostName: 'string',
      password: 'string',
      passwordInherit: 'boolean',
      deploymentSetId: 'string',
      zoneId: 'string',
      clusterId: 'string',
      clientToken: 'string',
      vlanId: 'string',
      innerIpAddress: 'string',
      systemDisk: CreateInstanceRequestSystemDisk,
      dataDisk: { 'type': 'array', 'itemType': CreateInstanceRequestDataDisk },
      arn: { 'type': 'array', 'itemType': CreateInstanceRequestArn },
      nodeControllerId: 'string',
      description: 'string',
      VSwitchId: 'string',
      privateIpAddress: 'string',
      ioOptimized: 'string',
      ownerAccount: 'string',
      useAdditionalService: 'boolean',
      instanceChargeType: 'string',
      period: 'number',
      periodUnit: 'string',
      tag: { 'type': 'array', 'itemType': CreateInstanceRequestTag },
      userData: 'string',
      spotStrategy: 'string',
      keyPairName: 'string',
      spotPriceLimit: 'number',
      spotDuration: 'number',
      spotInterruptionBehavior: 'string',
      ramRoleName: 'string',
      securityEnhancementStrategy: 'string',
      resourceGroupId: 'string',
      hpcClusterId: 'string',
      dryRun: 'boolean',
      dedicatedHostId: 'string',
      creditSpecification: 'string',
      deletionProtection: 'boolean',
      affinity: 'string',
      tenancy: 'string',
      storageSetId: 'string',
      storageSetPartitionNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInstanceResponse extends $tea.Model {
  requestId: string;
  instanceId: string;
  tradePrice: number;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      instanceId: 'InstanceId',
      tradePrice: 'TradePrice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      instanceId: 'string',
      tradePrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsdwqwResponseABCAasdsdfs11 extends $tea.Model {
  ADasdafsgs: { [key: string]: any };
  KKasdasd: boolean;
  static names(): { [key: string]: string } {
    return {
      ADasdafsgs: 'ADasdafsgs',
      KKasdasd: 'KKasdasd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ADasdafsgs: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      KKasdasd: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsdwqwResponseABCAsdqd extends $tea.Model {
  ssdas: boolean;
  static names(): { [key: string]: string } {
    return {
      ssdas: 'Ssdas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ssdas: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsdwqwResponseABC extends $tea.Model {
  DDsssfcao: number;
  aasdsdfs11: AsdwqwResponseABCAasdsdfs11[];
  asdqd: AsdwqwResponseABCAsdqd;
  SDfsdw: string[];
  static names(): { [key: string]: string } {
    return {
      DDsssfcao: 'DDsssfcao',
      aasdsdfs11: 'Aasdsdfs11',
      asdqd: 'Asdqd',
      SDfsdw: 'SDfsdw',
    };
  }

  static types(): { [key: string]: any } {
    return {
      DDsssfcao: 'number',
      aasdsdfs11: { 'type': 'array', 'itemType': AsdwqwResponseABCAasdsdfs11 },
      asdqd: AsdwqwResponseABCAsdqd,
      SDfsdw: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesRequestFilter extends $tea.Model {
  key?: string;
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'Key',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesRequestTag extends $tea.Model {
  key?: string;
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'Key',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface extends $tea.Model {
  macAddress: string;
  networkInterfaceId: string;
  primaryIpAddress: string;
  static names(): { [key: string]: string } {
    return {
      macAddress: 'MacAddress',
      networkInterfaceId: 'NetworkInterfaceId',
      primaryIpAddress: 'PrimaryIpAddress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      macAddress: 'string',
      networkInterfaceId: 'string',
      primaryIpAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceNetworkInterfaces extends $tea.Model {
  networkInterface: DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface[];
  static names(): { [key: string]: string } {
    return {
      networkInterface: 'NetworkInterface',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkInterface: { 'type': 'array', 'itemType': DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceOperationLocksLockReason extends $tea.Model {
  lockMsg: string;
  lockReason: string;
  static names(): { [key: string]: string } {
    return {
      lockMsg: 'LockMsg',
      lockReason: 'LockReason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lockMsg: 'string',
      lockReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceOperationLocks extends $tea.Model {
  lockReason: DescribeInstancesResponseInstancesInstanceOperationLocksLockReason[];
  static names(): { [key: string]: string } {
    return {
      lockReason: 'LockReason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lockReason: { 'type': 'array', 'itemType': DescribeInstancesResponseInstancesInstanceOperationLocksLockReason },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceTagsTag extends $tea.Model {
  tagKey: string;
  tagValue: string;
  static names(): { [key: string]: string } {
    return {
      tagKey: 'TagKey',
      tagValue: 'TagValue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagKey: 'string',
      tagValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceTags extends $tea.Model {
  tag: DescribeInstancesResponseInstancesInstanceTagsTag[];
  static names(): { [key: string]: string } {
    return {
      tag: 'Tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tag: { 'type': 'array', 'itemType': DescribeInstancesResponseInstancesInstanceTagsTag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceCpuOptions extends $tea.Model {
  coreCount: number;
  numa: string;
  threadsPerCore: number;
  static names(): { [key: string]: string } {
    return {
      coreCount: 'CoreCount',
      numa: 'Numa',
      threadsPerCore: 'ThreadsPerCore',
    };
  }

  static types(): { [key: string]: any } {
    return {
      coreCount: 'number',
      numa: 'string',
      threadsPerCore: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute extends $tea.Model {
  dedicatedHostId: string;
  dedicatedHostName: string;
  static names(): { [key: string]: string } {
    return {
      dedicatedHostId: 'DedicatedHostId',
      dedicatedHostName: 'DedicatedHostName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dedicatedHostId: 'string',
      dedicatedHostName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute extends $tea.Model {
  affinity: string;
  tenancy: string;
  static names(): { [key: string]: string } {
    return {
      affinity: 'Affinity',
      tenancy: 'Tenancy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      affinity: 'string',
      tenancy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr extends $tea.Model {
  capacityReservationId: string;
  capacityReservationPreference: string;
  static names(): { [key: string]: string } {
    return {
      capacityReservationId: 'CapacityReservationId',
      capacityReservationPreference: 'CapacityReservationPreference',
    };
  }

  static types(): { [key: string]: any } {
    return {
      capacityReservationId: 'string',
      capacityReservationPreference: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceEipAddress extends $tea.Model {
  allocationId: string;
  bandwidth: number;
  internetChargeType: string;
  ipAddress: string;
  isSupportUnassociate: boolean;
  static names(): { [key: string]: string } {
    return {
      allocationId: 'AllocationId',
      bandwidth: 'Bandwidth',
      internetChargeType: 'InternetChargeType',
      ipAddress: 'IpAddress',
      isSupportUnassociate: 'IsSupportUnassociate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      allocationId: 'string',
      bandwidth: 'number',
      internetChargeType: 'string',
      ipAddress: 'string',
      isSupportUnassociate: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress extends $tea.Model {
  ipAddress: string[];
  static names(): { [key: string]: string } {
    return {
      ipAddress: 'IpAddress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipAddress: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceVpcAttributes extends $tea.Model {
  natIpAddress: string;
  VSwitchId: string;
  vpcId: string;
  privateIpAddress: DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress;
  static names(): { [key: string]: string } {
    return {
      natIpAddress: 'NatIpAddress',
      VSwitchId: 'VSwitchId',
      vpcId: 'VpcId',
      privateIpAddress: 'PrivateIpAddress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      natIpAddress: 'string',
      VSwitchId: 'string',
      vpcId: 'string',
      privateIpAddress: DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceInnerIpAddress extends $tea.Model {
  ipAddress: string[];
  static names(): { [key: string]: string } {
    return {
      ipAddress: 'IpAddress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipAddress: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstancePublicIpAddress extends $tea.Model {
  ipAddress: string[];
  static names(): { [key: string]: string } {
    return {
      ipAddress: 'IpAddress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipAddress: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceRdmaIpAddress extends $tea.Model {
  ipAddress: string[];
  static names(): { [key: string]: string } {
    return {
      ipAddress: 'IpAddress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipAddress: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstanceSecurityGroupIds extends $tea.Model {
  securityGroupId: string[];
  static names(): { [key: string]: string } {
    return {
      securityGroupId: 'SecurityGroupId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      securityGroupId: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstancesInstance extends $tea.Model {
  autoReleaseTime: string;
  clusterId: string;
  cpu: number;
  creationTime: string;
  creditSpecification: string;
  deletionProtection: boolean;
  deploymentSetId: string;
  description: string;
  deviceAvailable: boolean;
  expiredTime: string;
  GPUAmount: number;
  GPUSpec: string;
  hostName: string;
  hpcClusterId: string;
  imageId: string;
  instanceChargeType: string;
  instanceId: string;
  instanceName: string;
  instanceNetworkType: string;
  instanceType: string;
  instanceTypeFamily: string;
  internetChargeType: string;
  internetMaxBandwidthIn: number;
  internetMaxBandwidthOut: number;
  ioOptimized: boolean;
  keyPairName: string;
  localStorageAmount: number;
  localStorageCapacity: number;
  memory: number;
  OSName: string;
  OSNameEn: string;
  OSType: string;
  recyclable: boolean;
  regionId: string;
  resourceGroupId: string;
  saleCycle: string;
  serialNumber: string;
  spotPriceLimit: number;
  spotStrategy: string;
  startTime: string;
  status: string;
  stoppedMode: string;
  vlanId: string;
  zoneId: string;
  networkInterfaces: DescribeInstancesResponseInstancesInstanceNetworkInterfaces;
  operationLocks: DescribeInstancesResponseInstancesInstanceOperationLocks;
  tags: DescribeInstancesResponseInstancesInstanceTags;
  cpuOptions: DescribeInstancesResponseInstancesInstanceCpuOptions;
  dedicatedHostAttribute: DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute;
  dedicatedInstanceAttribute: DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute;
  ecsCapacityReservationAttr: DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr;
  eipAddress: DescribeInstancesResponseInstancesInstanceEipAddress;
  vpcAttributes: DescribeInstancesResponseInstancesInstanceVpcAttributes;
  innerIpAddress: DescribeInstancesResponseInstancesInstanceInnerIpAddress;
  publicIpAddress: DescribeInstancesResponseInstancesInstancePublicIpAddress;
  rdmaIpAddress: DescribeInstancesResponseInstancesInstanceRdmaIpAddress;
  securityGroupIds: DescribeInstancesResponseInstancesInstanceSecurityGroupIds;
  static names(): { [key: string]: string } {
    return {
      autoReleaseTime: 'AutoReleaseTime',
      clusterId: 'ClusterId',
      cpu: 'Cpu',
      creationTime: 'CreationTime',
      creditSpecification: 'CreditSpecification',
      deletionProtection: 'DeletionProtection',
      deploymentSetId: 'DeploymentSetId',
      description: 'Description',
      deviceAvailable: 'DeviceAvailable',
      expiredTime: 'ExpiredTime',
      GPUAmount: 'GPUAmount',
      GPUSpec: 'GPUSpec',
      hostName: 'HostName',
      hpcClusterId: 'HpcClusterId',
      imageId: 'ImageId',
      instanceChargeType: 'InstanceChargeType',
      instanceId: 'InstanceId',
      instanceName: 'InstanceName',
      instanceNetworkType: 'InstanceNetworkType',
      instanceType: 'InstanceType',
      instanceTypeFamily: 'InstanceTypeFamily',
      internetChargeType: 'InternetChargeType',
      internetMaxBandwidthIn: 'InternetMaxBandwidthIn',
      internetMaxBandwidthOut: 'InternetMaxBandwidthOut',
      ioOptimized: 'IoOptimized',
      keyPairName: 'KeyPairName',
      localStorageAmount: 'LocalStorageAmount',
      localStorageCapacity: 'LocalStorageCapacity',
      memory: 'Memory',
      OSName: 'OSName',
      OSNameEn: 'OSNameEn',
      OSType: 'OSType',
      recyclable: 'Recyclable',
      regionId: 'RegionId',
      resourceGroupId: 'ResourceGroupId',
      saleCycle: 'SaleCycle',
      serialNumber: 'SerialNumber',
      spotPriceLimit: 'SpotPriceLimit',
      spotStrategy: 'SpotStrategy',
      startTime: 'StartTime',
      status: 'Status',
      stoppedMode: 'StoppedMode',
      vlanId: 'VlanId',
      zoneId: 'ZoneId',
      networkInterfaces: 'NetworkInterfaces',
      operationLocks: 'OperationLocks',
      tags: 'Tags',
      cpuOptions: 'CpuOptions',
      dedicatedHostAttribute: 'DedicatedHostAttribute',
      dedicatedInstanceAttribute: 'DedicatedInstanceAttribute',
      ecsCapacityReservationAttr: 'EcsCapacityReservationAttr',
      eipAddress: 'EipAddress',
      vpcAttributes: 'VpcAttributes',
      innerIpAddress: 'InnerIpAddress',
      publicIpAddress: 'PublicIpAddress',
      rdmaIpAddress: 'RdmaIpAddress',
      securityGroupIds: 'SecurityGroupIds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      autoReleaseTime: 'string',
      clusterId: 'string',
      cpu: 'number',
      creationTime: 'string',
      creditSpecification: 'string',
      deletionProtection: 'boolean',
      deploymentSetId: 'string',
      description: 'string',
      deviceAvailable: 'boolean',
      expiredTime: 'string',
      GPUAmount: 'number',
      GPUSpec: 'string',
      hostName: 'string',
      hpcClusterId: 'string',
      imageId: 'string',
      instanceChargeType: 'string',
      instanceId: 'string',
      instanceName: 'string',
      instanceNetworkType: 'string',
      instanceType: 'string',
      instanceTypeFamily: 'string',
      internetChargeType: 'string',
      internetMaxBandwidthIn: 'number',
      internetMaxBandwidthOut: 'number',
      ioOptimized: 'boolean',
      keyPairName: 'string',
      localStorageAmount: 'number',
      localStorageCapacity: 'number',
      memory: 'number',
      OSName: 'string',
      OSNameEn: 'string',
      OSType: 'string',
      recyclable: 'boolean',
      regionId: 'string',
      resourceGroupId: 'string',
      saleCycle: 'string',
      serialNumber: 'string',
      spotPriceLimit: 'number',
      spotStrategy: 'string',
      startTime: 'string',
      status: 'string',
      stoppedMode: 'string',
      vlanId: 'string',
      zoneId: 'string',
      networkInterfaces: DescribeInstancesResponseInstancesInstanceNetworkInterfaces,
      operationLocks: DescribeInstancesResponseInstancesInstanceOperationLocks,
      tags: DescribeInstancesResponseInstancesInstanceTags,
      cpuOptions: DescribeInstancesResponseInstancesInstanceCpuOptions,
      dedicatedHostAttribute: DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute,
      dedicatedInstanceAttribute: DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute,
      ecsCapacityReservationAttr: DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr,
      eipAddress: DescribeInstancesResponseInstancesInstanceEipAddress,
      vpcAttributes: DescribeInstancesResponseInstancesInstanceVpcAttributes,
      innerIpAddress: DescribeInstancesResponseInstancesInstanceInnerIpAddress,
      publicIpAddress: DescribeInstancesResponseInstancesInstancePublicIpAddress,
      rdmaIpAddress: DescribeInstancesResponseInstancesInstanceRdmaIpAddress,
      securityGroupIds: DescribeInstancesResponseInstancesInstanceSecurityGroupIds,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstancesResponseInstances extends $tea.Model {
  instance: DescribeInstancesResponseInstancesInstance[];
  static names(): { [key: string]: string } {
    return {
      instance: 'Instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instance: { 'type': 'array', 'itemType': DescribeInstancesResponseInstancesInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDisks001ResponseResult extends $tea.Model {
  nextToken: number;
  maxResults: number;
  static names(): { [key: string]: string } {
    return {
      nextToken: 'NextToken',
      maxResults: 'MaxResults',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextToken: 'number',
      maxResults: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ModifyInstanceResponseAnswerList extends $tea.Model {
  answer: string;
  static names(): { [key: string]: string } {
    return {
      answer: 'Answer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      answer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesStates extends $tea.Model {
  stateCode: string;
  description: string;
  static names(): { [key: string]: string } {
    return {
      stateCode: 'StateCode',
      description: 'Description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stateCode: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPICreateAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPIGetAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPIListAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs extends $tea.Model {
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesOperationAPI extends $tea.Model {
  createAPIs: HiFucker4ResponseResourceTypesOperationAPICreateAPIs[];
  getAPIs: HiFucker4ResponseResourceTypesOperationAPIGetAPIs[];
  listAPIs: HiFucker4ResponseResourceTypesOperationAPIListAPIs[];
  updateAPIs: HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs[];
  deleteAPIs: HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs[];
  establishRelationAPIs: HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs[];
  destroyRelationAPIs: HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs[];
  static names(): { [key: string]: string } {
    return {
      createAPIs: 'CreateAPIs',
      getAPIs: 'GetAPIs',
      listAPIs: 'ListAPIs',
      updateAPIs: 'UpdateAPIs',
      deleteAPIs: 'DeleteAPIs',
      establishRelationAPIs: 'EstablishRelationAPIs',
      destroyRelationAPIs: 'DestroyRelationAPIs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPICreateAPIs },
      getAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPIGetAPIs },
      listAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPIListAPIs },
      updateAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPIUpdateAPIs },
      deleteAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPIDeleteAPIs },
      establishRelationAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPIEstablishRelationAPIs },
      destroyRelationAPIs: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesOperationAPIDestroyRelationAPIs },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig extends $tea.Model {
  prePaidValue: string;
  static names(): { [key: string]: string } {
    return {
      prePaidValue: 'PrePaidValue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      prePaidValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters extends $tea.Model {
  mappingType: string;
  position: string;
  in: string;
  path: string;
  value: string;
  static names(): { [key: string]: string } {
    return {
      mappingType: 'MappingType',
      position: 'Position',
      in: 'In',
      path: 'Path',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mappingType: 'string',
      position: 'string',
      in: 'string',
      path: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging extends $tea.Model {
  type: string;
  nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig;
  pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig;
  static names(): { [key: string]: string } {
    return {
      type: 'Type',
      nextTokenConfig: 'NextTokenConfig',
      pageNumberConfig: 'PageNumberConfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingNextTokenConfig,
      pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPagingPageNumberConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings extends $tea.Model {
  idMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      idMappings: 'IdMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos extends $tea.Model {
  gatewaySource: string;
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  supplementParameters: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters[];
  paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging;
  requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings;
  static names(): { [key: string]: string } {
    return {
      gatewaySource: 'GatewaySource',
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
      supplementParameters: 'SupplementParameters',
      paging: 'Paging',
      requiredAttributeMappings: 'RequiredAttributeMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewaySource: 'string',
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
      supplementParameters: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosSupplementParameters },
      paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosPaging,
      requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfosRequiredAttributeMappings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet extends $tea.Model {
  attributeMappings: { [key: string]: any };
  apiInfos: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos[];
  static names(): { [key: string]: string } {
    return {
      attributeMappings: 'AttributeMappings',
      apiInfos: 'ApiInfos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      apiInfos: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGetApiInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters extends $tea.Model {
  mappingType: string;
  position: string;
  in: string;
  path: string;
  value: string;
  static names(): { [key: string]: string } {
    return {
      mappingType: 'MappingType',
      position: 'Position',
      in: 'In',
      path: 'Path',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mappingType: 'string',
      position: 'string',
      in: 'string',
      path: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging extends $tea.Model {
  type: string;
  nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig;
  pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig;
  static names(): { [key: string]: string } {
    return {
      type: 'Type',
      nextTokenConfig: 'NextTokenConfig',
      pageNumberConfig: 'PageNumberConfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingNextTokenConfig,
      pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPagingPageNumberConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings extends $tea.Model {
  idMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      idMappings: 'IdMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos extends $tea.Model {
  gatewaySource: string;
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  supplementParameters: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters[];
  paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging;
  requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings;
  static names(): { [key: string]: string } {
    return {
      gatewaySource: 'GatewaySource',
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
      supplementParameters: 'SupplementParameters',
      paging: 'Paging',
      requiredAttributeMappings: 'RequiredAttributeMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewaySource: 'string',
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
      supplementParameters: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosSupplementParameters },
      paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosPaging,
      requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfosRequiredAttributeMappings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate extends $tea.Model {
  attributeMappings: { [key: string]: any };
  apiInfos: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos[];
  static names(): { [key: string]: string } {
    return {
      attributeMappings: 'AttributeMappings',
      apiInfos: 'ApiInfos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      apiInfos: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreateApiInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters extends $tea.Model {
  mappingType: string;
  position: string;
  in: string;
  path: string;
  value: string;
  static names(): { [key: string]: string } {
    return {
      mappingType: 'MappingType',
      position: 'Position',
      in: 'In',
      path: 'Path',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mappingType: 'string',
      position: 'string',
      in: 'string',
      path: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging extends $tea.Model {
  type: string;
  nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig;
  pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig;
  static names(): { [key: string]: string } {
    return {
      type: 'Type',
      nextTokenConfig: 'NextTokenConfig',
      pageNumberConfig: 'PageNumberConfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingNextTokenConfig,
      pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPagingPageNumberConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings extends $tea.Model {
  idMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      idMappings: 'IdMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos extends $tea.Model {
  gatewaySource: string;
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  supplementParameters: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters[];
  paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging;
  requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings;
  static names(): { [key: string]: string } {
    return {
      gatewaySource: 'GatewaySource',
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
      supplementParameters: 'SupplementParameters',
      paging: 'Paging',
      requiredAttributeMappings: 'RequiredAttributeMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewaySource: 'string',
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
      supplementParameters: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosSupplementParameters },
      paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosPaging,
      requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfosRequiredAttributeMappings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate extends $tea.Model {
  attributeMappings: { [key: string]: any };
  apiInfos: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos[];
  static names(): { [key: string]: string } {
    return {
      attributeMappings: 'AttributeMappings',
      apiInfos: 'ApiInfos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      apiInfos: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdateApiInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters extends $tea.Model {
  mappingType: string;
  position: string;
  in: string;
  path: string;
  value: string;
  static names(): { [key: string]: string } {
    return {
      mappingType: 'MappingType',
      position: 'Position',
      in: 'In',
      path: 'Path',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mappingType: 'string',
      position: 'string',
      in: 'string',
      path: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging extends $tea.Model {
  type: string;
  nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig;
  pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig;
  static names(): { [key: string]: string } {
    return {
      type: 'Type',
      nextTokenConfig: 'NextTokenConfig',
      pageNumberConfig: 'PageNumberConfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingNextTokenConfig,
      pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPagingPageNumberConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings extends $tea.Model {
  idMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      idMappings: 'IdMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos extends $tea.Model {
  gatewaySource: string;
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  supplementParameters: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters[];
  paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging;
  requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings;
  static names(): { [key: string]: string } {
    return {
      gatewaySource: 'GatewaySource',
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
      supplementParameters: 'SupplementParameters',
      paging: 'Paging',
      requiredAttributeMappings: 'RequiredAttributeMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewaySource: 'string',
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
      supplementParameters: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosSupplementParameters },
      paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosPaging,
      requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfosRequiredAttributeMappings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete extends $tea.Model {
  attributeMappings: { [key: string]: any };
  apiInfos: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos[];
  static names(): { [key: string]: string } {
    return {
      attributeMappings: 'AttributeMappings',
      apiInfos: 'ApiInfos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      apiInfos: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDeleteApiInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters extends $tea.Model {
  mappingType: string;
  position: string;
  in: string;
  path: string;
  value: string;
  static names(): { [key: string]: string } {
    return {
      mappingType: 'MappingType',
      position: 'Position',
      in: 'In',
      path: 'Path',
      value: 'Value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mappingType: 'string',
      position: 'string',
      in: 'string',
      path: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig extends $tea.Model {
  requestParameterMappings: { [key: string]: any };
  responseParameterMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      requestParameterMappings: 'RequestParameterMappings',
      responseParameterMappings: 'ResponseParameterMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      responseParameterMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging extends $tea.Model {
  type: string;
  nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig;
  pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig;
  static names(): { [key: string]: string } {
    return {
      type: 'Type',
      nextTokenConfig: 'NextTokenConfig',
      pageNumberConfig: 'PageNumberConfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      nextTokenConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingNextTokenConfig,
      pageNumberConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPagingPageNumberConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings extends $tea.Model {
  idMappings: { [key: string]: any };
  static names(): { [key: string]: string } {
    return {
      idMappings: 'IdMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos extends $tea.Model {
  gatewaySource: string;
  gatewayProduct: string;
  gatewayVersion: string;
  apiName: string;
  supplementParameters: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters[];
  paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging;
  requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings;
  static names(): { [key: string]: string } {
    return {
      gatewaySource: 'GatewaySource',
      gatewayProduct: 'GatewayProduct',
      gatewayVersion: 'GatewayVersion',
      apiName: 'ApiName',
      supplementParameters: 'SupplementParameters',
      paging: 'Paging',
      requiredAttributeMappings: 'RequiredAttributeMappings',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewaySource: 'string',
      gatewayProduct: 'string',
      gatewayVersion: 'string',
      apiName: 'string',
      supplementParameters: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosSupplementParameters },
      paging: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosPaging,
      requiredAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfosRequiredAttributeMappings,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList extends $tea.Model {
  attributeMappings: { [key: string]: any };
  apiInfos: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos[];
  static names(): { [key: string]: string } {
    return {
      attributeMappings: 'AttributeMappings',
      apiInfos: 'ApiInfos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeMappings: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      apiInfos: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationListApiInfos },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesResourceTypeAttributeMappings extends $tea.Model {
  enableAttributeMapping: string;
  optionalConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig;
  operationGet: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet;
  operationCreate: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate;
  operationUpdate: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate;
  operationDelete: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete;
  operationList: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList;
  static names(): { [key: string]: string } {
    return {
      enableAttributeMapping: 'EnableAttributeMapping',
      optionalConfig: 'OptionalConfig',
      operationGet: 'OperationGet',
      operationCreate: 'OperationCreate',
      operationUpdate: 'OperationUpdate',
      operationDelete: 'OperationDelete',
      operationList: 'OperationList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enableAttributeMapping: 'string',
      optionalConfig: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOptionalConfig,
      operationGet: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationGet,
      operationCreate: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationCreate,
      operationUpdate: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationUpdate,
      operationDelete: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationDelete,
      operationList: HiFucker4ResponseResourceTypesResourceTypeAttributeMappingsOperationList,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypesCommonAttributeMark extends $tea.Model {
  billingMethod: string;
  uids: string[];
  static names(): { [key: string]: string } {
    return {
      billingMethod: 'BillingMethod',
      uids: 'Uids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billingMethod: 'string',
      uids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HiFucker4ResponseResourceTypes extends $tea.Model {
  product: string;
  resourceTypeCode: string;
  resourceTypeVersion: string;
  title: string;
  uniqueIdentifier: string;
  description: string;
  deliveryScope: string;
  resourceIdField: boolean;
  definitions: { [key: string]: any };
  schemaRef: string;
  states: HiFucker4ResponseResourceTypesStates[];
  operationAPI: HiFucker4ResponseResourceTypesOperationAPI;
  resourceTypeAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappings;
  commonAttributeMark: HiFucker4ResponseResourceTypesCommonAttributeMark;
  static names(): { [key: string]: string } {
    return {
      product: 'Product',
      resourceTypeCode: 'ResourceTypeCode',
      resourceTypeVersion: 'ResourceTypeVersion',
      title: 'Title',
      uniqueIdentifier: 'UniqueIdentifier',
      description: 'Description',
      deliveryScope: 'DeliveryScope',
      resourceIdField: 'ResourceIdField',
      definitions: 'Definitions',
      schemaRef: 'SchemaRef',
      states: 'States',
      operationAPI: 'OperationAPI',
      resourceTypeAttributeMappings: 'ResourceTypeAttributeMappings',
      commonAttributeMark: 'CommonAttributeMark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      product: 'string',
      resourceTypeCode: 'string',
      resourceTypeVersion: 'string',
      title: 'string',
      uniqueIdentifier: 'string',
      description: 'string',
      deliveryScope: 'string',
      resourceIdField: 'boolean',
      definitions: { 'type': 'map', 'keyType': 'string', 'valueType': 'any' },
      schemaRef: 'string',
      states: { 'type': 'array', 'itemType': HiFucker4ResponseResourceTypesStates },
      operationAPI: HiFucker4ResponseResourceTypesOperationAPI,
      resourceTypeAttributeMappings: HiFucker4ResponseResourceTypesResourceTypeAttributeMappings,
      commonAttributeMark: HiFucker4ResponseResourceTypesCommonAttributeMark,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInstance01ResponseResult extends $tea.Model {
  id: number;
  projectName: string;
  static names(): { [key: string]: string } {
    return {
      id: 'Id',
      projectName: 'ProjectName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      projectName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableDiskResponseData extends $tea.Model {
  code: string;
  name: string;
  option: number;
  static names(): { [key: string]: string } {
    return {
      code: 'Code',
      name: 'Name',
      option: 'Option',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      option: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInstanceRequestSystemDisk extends $tea.Model {
  size?: number;
  category?: string;
  diskName?: string;
  description?: string;
  performanceLevel?: string;
  static names(): { [key: string]: string } {
    return {
      size: 'Size',
      category: 'Category',
      diskName: 'DiskName',
      description: 'Description',
      performanceLevel: 'PerformanceLevel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      size: 'number',
      category: 'string',
      diskName: 'string',
      description: 'string',
      performanceLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInstanceRequestDataDisk extends $tea.Model {
  size: number;
  snapshotId: string;
  category: string;
  diskName: string;
  description: string;
  device: string;
  deleteWithInstance: boolean;
  encrypted: boolean;
  KMSKeyId: string;
  performanceLevel: string;
  static names(): { [key: string]: string } {
    return {
      size: 'Size',
      snapshotId: 'SnapshotId',
      category: 'Category',
      diskName: 'DiskName',
      description: 'Description',
      device: 'Device',
      deleteWithInstance: 'DeleteWithInstance',
      encrypted: 'Encrypted',
      KMSKeyId: 'KMSKeyId',
      performanceLevel: 'PerformanceLevel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      size: 'number',
      snapshotId: 'string',
      category: 'string',
      diskName: 'string',
      description: 'string',
      device: 'string',
      deleteWithInstance: 'boolean',
      encrypted: 'boolean',
      KMSKeyId: 'string',
      performanceLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInstanceRequestArn extends $tea.Model {
  assumeRoleFor: number;
  rolearn: string;
  roleType: string;
  static names(): { [key: string]: string } {
    return {
      assumeRoleFor: 'AssumeRoleFor',
      rolearn: 'Rolearn',
      roleType: 'RoleType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assumeRoleFor: 'number',
      rolearn: 'string',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInstanceRequestTag extends $tea.Model {
  value: string;
  key: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client extends RPC {

  constructor(config: $RPC.Config) {
    super(config);
    this._endpointRule = "";
    this.checkConfig(config);
    this._endpoint = this.getEndpoint(this._productId, this._regionId, this._endpointRule, this._network, this._suffix, this._endpointMap, this._endpoint);
  }


  async asdwqwEx(request: AsdwqwRequest, runtime: $Util.RuntimeOptions): Promise<AsdwqwResponse> {
    Util.validateModel(request);
    return $tea.cast<AsdwqwResponse>(await this.doRequest("Asdwqw", "HTTPS", "PUT", "2019-06-20", "AK,APP", $tea.toMap(request), null, runtime), new AsdwqwResponse({}));
  }

  async asdwqw(request: AsdwqwRequest): Promise<AsdwqwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.asdwqwEx(request, runtime);
  }

  async hsfMockEx(request: HsfMockRequest, runtime: $Util.RuntimeOptions): Promise<HsfMockResponse> {
    Util.validateModel(request);
    return $tea.cast<HsfMockResponse>(await this.doRequest("HsfMock", "HTTPS", "POST", "2019-06-20", "AK", null, $tea.toMap(request), runtime), new HsfMockResponse({}));
  }

  async hsfMock(request: HsfMockRequest): Promise<HsfMockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.hsfMockEx(request, runtime);
  }

  async deleteEcsDemoIncEx(request: DeleteEcsDemoIncRequest, runtime: $Util.RuntimeOptions): Promise<DeleteEcsDemoIncResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteEcsDemoIncResponse>(await this.doRequest("DeleteEcsDemoInc", "HTTPS", "GET", "2019-06-20", "Anonymous", null, $tea.toMap(request), runtime), new DeleteEcsDemoIncResponse({}));
  }

  async deleteEcsDemoInc(request: DeleteEcsDemoIncRequest): Promise<DeleteEcsDemoIncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteEcsDemoIncEx(request, runtime);
  }

  async describeInstancesEx(request: DescribeInstancesRequest, runtime: $Util.RuntimeOptions): Promise<DescribeInstancesResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeInstancesResponse>(await this.doRequest("DescribeInstances", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new DescribeInstancesResponse({}));
  }

  async describeInstances(request: DescribeInstancesRequest): Promise<DescribeInstancesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.describeInstancesEx(request, runtime);
  }

  async createEcsDemoIncEx(request: CreateEcsDemoIncRequest, runtime: $Util.RuntimeOptions): Promise<CreateEcsDemoIncResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEcsDemoIncResponse>(await this.doRequest("CreateEcsDemoInc", "HTTPS", "POST", "2019-06-20", "Anonymous", null, $tea.toMap(request), runtime), new CreateEcsDemoIncResponse({}));
  }

  async createEcsDemoInc(request: CreateEcsDemoIncRequest): Promise<CreateEcsDemoIncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createEcsDemoIncEx(request, runtime);
  }

  async listDisks001Ex(request: ListDisks001Request, runtime: $Util.RuntimeOptions): Promise<ListDisks001Response> {
    Util.validateModel(request);
    return $tea.cast<ListDisks001Response>(await this.doRequest("ListDisks001", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new ListDisks001Response({}));
  }

  async listDisks001(request: ListDisks001Request): Promise<ListDisks001Response> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listDisks001Ex(request, runtime);
  }

  async listDisks1233Ex(request: ListDisks1233Request, runtime: $Util.RuntimeOptions): Promise<ListDisks1233Response> {
    Util.validateModel(request);
    return $tea.cast<ListDisks1233Response>(await this.doRequest("ListDisks1233", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new ListDisks1233Response({}));
  }

  async listDisks1233(request: ListDisks1233Request): Promise<ListDisks1233Response> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listDisks1233Ex(request, runtime);
  }

  async modifyInstanceEx(request: ModifyInstanceRequest, runtime: $Util.RuntimeOptions): Promise<ModifyInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ModifyInstanceResponse>(await this.doRequest("ModifyInstance", "HTTPS", "POST", "2019-06-20", "Anonymous", null, $tea.toMap(request), runtime), new ModifyInstanceResponse({}));
  }

  async modifyInstance(request: ModifyInstanceRequest): Promise<ModifyInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.modifyInstanceEx(request, runtime);
  }

  async hiFucker4Ex(request: HiFucker4Request, runtime: $Util.RuntimeOptions): Promise<HiFucker4Response> {
    Util.validateModel(request);
    return $tea.cast<HiFucker4Response>(await this.doRequest("HiFucker4", "HTTPS", "GET", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new HiFucker4Response({}));
  }

  async hiFucker4(request: HiFucker4Request): Promise<HiFucker4Response> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.hiFucker4Ex(request, runtime);
  }

  async createTestEcsEx(request: CreateTestEcsRequest, runtime: $Util.RuntimeOptions): Promise<CreateTestEcsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTestEcsResponse>(await this.doRequest("CreateTestEcs", "HTTPS", "POST", "2019-06-20", "APP", $tea.toMap(request), null, runtime), new CreateTestEcsResponse({}));
  }

  async createTestEcs(request: CreateTestEcsRequest): Promise<CreateTestEcsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTestEcsEx(request, runtime);
  }

  async listDisks00Ex(request: ListDisks00Request, runtime: $Util.RuntimeOptions): Promise<ListDisks00Response> {
    Util.validateModel(request);
    return $tea.cast<ListDisks00Response>(await this.doRequest("ListDisks00", "HTTPS", "GET", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new ListDisks00Response({}));
  }

  async listDisks00(request: ListDisks00Request): Promise<ListDisks00Response> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listDisks00Ex(request, runtime);
  }

  async getInstance01Ex(request: GetInstance01Request, runtime: $Util.RuntimeOptions): Promise<GetInstance01Response> {
    Util.validateModel(request);
    return $tea.cast<GetInstance01Response>(await this.doRequest("GetInstance01", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new GetInstance01Response({}));
  }

  async getInstance01(request: GetInstance01Request): Promise<GetInstance01Response> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getInstance01Ex(request, runtime);
  }

  async disableDiskEx(request: DisableDiskRequest, runtime: $Util.RuntimeOptions): Promise<DisableDiskResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableDiskResponse>(await this.doRequest("DisableDisk", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new DisableDiskResponse({}));
  }

  async disableDisk(request: DisableDiskRequest): Promise<DisableDiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.disableDiskEx(request, runtime);
  }

  async fsEx(request: FsRequest, runtime: $Util.RuntimeOptions): Promise<FsResponse> {
    Util.validateModel(request);
    return $tea.cast<FsResponse>(await this.doRequest("Fs", "HTTPS", "POST", "2019-06-20", "AK", null, $tea.toMap(request), runtime), new FsResponse({}));
  }

  async fs(request: FsRequest): Promise<FsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.fsEx(request, runtime);
  }

  async attachDiskEx(request: AttachDiskRequest, runtime: $Util.RuntimeOptions): Promise<AttachDiskResponse> {
    Util.validateModel(request);
    return $tea.cast<AttachDiskResponse>(await this.doRequest("AttachDisk", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new AttachDiskResponse({}));
  }

  async attachDisk(request: AttachDiskRequest): Promise<AttachDiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.attachDiskEx(request, runtime);
  }

  async deleteInstanceEx(request: DeleteInstanceRequest, runtime: $Util.RuntimeOptions): Promise<DeleteInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteInstanceResponse>(await this.doRequest("DeleteInstance", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new DeleteInstanceResponse({}));
  }

  async deleteInstance(request: DeleteInstanceRequest): Promise<DeleteInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteInstanceEx(request, runtime);
  }

  async createInstanceEx(request: CreateInstanceRequest, runtime: $Util.RuntimeOptions): Promise<CreateInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInstanceResponse>(await this.doRequest("CreateInstance", "HTTPS", "POST", "2019-06-20", "AK", $tea.toMap(request), null, runtime), new CreateInstanceResponse({}));
  }

  async createInstance(request: CreateInstanceRequest): Promise<CreateInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createInstanceEx(request, runtime);
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
