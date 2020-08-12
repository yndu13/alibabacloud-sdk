// This file is auto-generated, don't edit it
import Util, * as $Util from '@alicloud/tea-util';
import RPC, * as $RPC from '@alicloud/rpc-client';
import EndpointUtil from '@alicloud/endpoint-util';
import * as $tea from '@alicloud/tea-typescript';

export class TagResourcesRequest extends $tea.Model {
  tag: TagResourcesRequestTag[];
  resourceId: string[];
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      tag: 'Tag',
      resourceId: 'ResourceId',
      resourceType: 'ResourceType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tag: { 'type': 'array', 'itemType': TagResourcesRequestTag },
      resourceId: { 'type': 'array', 'itemType': 'string' },
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TagResourcesResponse extends $tea.Model {
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

export class UntagResourcesRequest extends $tea.Model {
  tagKey?: string[];
  resourceId: string[];
  all?: string;
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      tagKey: 'TagKey',
      resourceId: 'ResourceId',
      all: 'All',
      resourceType: 'ResourceType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagKey: { 'type': 'array', 'itemType': 'string' },
      resourceId: { 'type': 'array', 'itemType': 'string' },
      all: 'string',
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UntagResourcesResponse extends $tea.Model {
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

export class ListTagResourcesRequest extends $tea.Model {
  tag?: ListTagResourcesRequestTag[];
  resourceId?: string[];
  nextToken?: string;
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      tag: 'Tag',
      resourceId: 'ResourceId',
      nextToken: 'NextToken',
      resourceType: 'ResourceType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tag: { 'type': 'array', 'itemType': ListTagResourcesRequestTag },
      resourceId: { 'type': 'array', 'itemType': 'string' },
      nextToken: 'string',
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTagResourcesResponse extends $tea.Model {
  requestId: string;
  nextToken: string;
  tagResources: ListTagResourcesResponseTagResources;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      nextToken: 'NextToken',
      tagResources: 'TagResources',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      nextToken: 'string',
      tagResources: ListTagResourcesResponseTagResources,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIncrementRequest extends $tea.Model {
  instanceId: number;
  pageSize: number;
  pageNumber: number;
  taskType: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
      pageSize: 'PageSize',
      pageNumber: 'PageNumber',
      taskType: 'TaskType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'number',
      pageSize: 'number',
      pageNumber: 'number',
      taskType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIncrementResponse extends $tea.Model {
  requestId: string;
  data: ListIncrementResponseData;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: ListIncrementResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountInstanceRequest extends $tea.Model {
  instanceId: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountInstanceResponse extends $tea.Model {
  requestId: string;
  data: CountInstanceResponseData;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: CountInstanceResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInstanceRequest extends $tea.Model {
  serviceType: number;
  name: string;
  pageSize: number;
  pageNumber: number;
  tag?: ListInstanceRequestTag[];
  static names(): { [key: string]: string } {
    return {
      serviceType: 'ServiceType',
      name: 'Name',
      pageSize: 'PageSize',
      pageNumber: 'PageNumber',
      tag: 'Tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceType: 'number',
      name: 'string',
      pageSize: 'number',
      pageNumber: 'number',
      tag: { 'type': 'array', 'itemType': ListInstanceRequestTag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInstanceResponse extends $tea.Model {
  requestId: string;
  data: ListInstanceResponseData;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: ListInstanceResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitInstanceRequest extends $tea.Model {
  instanceId: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitInstanceResponse extends $tea.Model {
  requestId: string;
  data: InitInstanceResponseData;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: InitInstanceResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IncreaseInstanceRequest extends $tea.Model {
  instanceId: number;
  arn: string;
  bucketName: string;
  path: string;
  taskType?: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
      arn: 'Arn',
      bucketName: 'BucketName',
      path: 'Path',
      taskType: 'TaskType',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'number',
      arn: 'string',
      bucketName: 'string',
      path: 'string',
      taskType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IncreaseInstanceResponse extends $tea.Model {
  requestId: string;
  data: IncreaseInstanceResponseData;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: IncreaseInstanceResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstanceRequest extends $tea.Model {
  instanceId: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstanceResponse extends $tea.Model {
  requestId: string;
  instance: DescribeInstanceResponseInstance;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      instance: 'Instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      instance: DescribeInstanceResponseInstance,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ClearInstanceRequest extends $tea.Model {
  instanceId: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'InstanceId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ClearInstanceResponse extends $tea.Model {
  requestId: string;
  data: ClearInstanceResponseData;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: ClearInstanceResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRegionsRequest extends $tea.Model {
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

export class DescribeRegionsResponse extends $tea.Model {
  requestId: string;
  regions: DescribeRegionsResponseRegions;
  static names(): { [key: string]: string } {
    return {
      requestId: 'RequestId',
      regions: 'Regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      regions: DescribeRegionsResponseRegions,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TagResourcesRequestTag extends $tea.Model {
  key: string;
  value: string;
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

export class ListTagResourcesRequestTag extends $tea.Model {
  key: string;
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

export class ListTagResourcesResponseTagResourcesTagResource extends $tea.Model {
  resourceId: string;
  resourceType: string;
  tagKey: string;
  tagValue: string;
  static names(): { [key: string]: string } {
    return {
      resourceId: 'ResourceId',
      resourceType: 'ResourceType',
      tagKey: 'TagKey',
      tagValue: 'TagValue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourceId: 'string',
      resourceType: 'string',
      tagKey: 'string',
      tagValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTagResourcesResponseTagResources extends $tea.Model {
  tagResource: ListTagResourcesResponseTagResourcesTagResource[];
  static names(): { [key: string]: string } {
    return {
      tagResource: 'TagResource',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagResource: { 'type': 'array', 'itemType': ListTagResourcesResponseTagResourcesTagResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIncrementResponseDataIncrementsInstance extends $tea.Model {
  id: number;
  utcCreate: string;
  utcModified: number;
  instanceId: string;
  arn: string;
  bucketName: string;
  path: string;
  status: string;
  msg: string;
  code: string;
  errorUrl: string;
  static names(): { [key: string]: string } {
    return {
      id: 'Id',
      utcCreate: 'UtcCreate',
      utcModified: 'UtcModified',
      instanceId: 'InstanceId',
      arn: 'Arn',
      bucketName: 'BucketName',
      path: 'Path',
      status: 'Status',
      msg: 'Msg',
      code: 'Code',
      errorUrl: 'ErrorUrl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      utcCreate: 'string',
      utcModified: 'number',
      instanceId: 'string',
      arn: 'string',
      bucketName: 'string',
      path: 'string',
      status: 'string',
      msg: 'string',
      code: 'string',
      errorUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIncrementResponseDataIncrements extends $tea.Model {
  instance: ListIncrementResponseDataIncrementsInstance[];
  static names(): { [key: string]: string } {
    return {
      instance: 'Instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instance: { 'type': 'array', 'itemType': ListIncrementResponseDataIncrementsInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIncrementResponseData extends $tea.Model {
  pageSize: number;
  pageNumber: number;
  totalCount: number;
  increments: ListIncrementResponseDataIncrements;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'PageSize',
      pageNumber: 'PageNumber',
      totalCount: 'TotalCount',
      increments: 'Increments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageNumber: 'number',
      totalCount: 'number',
      increments: ListIncrementResponseDataIncrements,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountInstanceResponseData extends $tea.Model {
  instacneId: number;
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      instacneId: 'InstacneId',
      totalCount: 'TotalCount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instacneId: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInstanceRequestTag extends $tea.Model {
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

export class ListInstanceResponseDataInstancesInstanceTagsTag extends $tea.Model {
  key: string;
  value: string;
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

export class ListInstanceResponseDataInstancesInstanceTags extends $tea.Model {
  tag: ListInstanceResponseDataInstancesInstanceTagsTag[];
  static names(): { [key: string]: string } {
    return {
      tag: 'Tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tag: { 'type': 'array', 'itemType': ListInstanceResponseDataInstancesInstanceTagsTag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInstanceResponseDataInstancesInstance extends $tea.Model {
  id: number;
  utcCreate: string;
  utcModified: string;
  name: string;
  status: string;
  orderStatus: string;
  updateStatus: string;
  serviceType: number;
  dataplusInstanceId: string;
  version: string;
  freeTrial: boolean;
  utcExpireTime: string;
  tags: ListInstanceResponseDataInstancesInstanceTags;
  static names(): { [key: string]: string } {
    return {
      id: 'Id',
      utcCreate: 'UtcCreate',
      utcModified: 'UtcModified',
      name: 'Name',
      status: 'Status',
      orderStatus: 'OrderStatus',
      updateStatus: 'UpdateStatus',
      serviceType: 'ServiceType',
      dataplusInstanceId: 'DataplusInstanceId',
      version: 'Version',
      freeTrial: 'FreeTrial',
      utcExpireTime: 'UtcExpireTime',
      tags: 'Tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      utcCreate: 'string',
      utcModified: 'string',
      name: 'string',
      status: 'string',
      orderStatus: 'string',
      updateStatus: 'string',
      serviceType: 'number',
      dataplusInstanceId: 'string',
      version: 'string',
      freeTrial: 'boolean',
      utcExpireTime: 'string',
      tags: ListInstanceResponseDataInstancesInstanceTags,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInstanceResponseDataInstances extends $tea.Model {
  instance: ListInstanceResponseDataInstancesInstance[];
  static names(): { [key: string]: string } {
    return {
      instance: 'Instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instance: { 'type': 'array', 'itemType': ListInstanceResponseDataInstancesInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInstanceResponseData extends $tea.Model {
  pageSize: number;
  pageNumber: number;
  totalCount: number;
  instances: ListInstanceResponseDataInstances;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'PageSize',
      pageNumber: 'PageNumber',
      totalCount: 'TotalCount',
      instances: 'Instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageNumber: 'number',
      totalCount: 'number',
      instances: ListInstanceResponseDataInstances,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitInstanceResponseData extends $tea.Model {
  instacneId: number;
  status: string;
  static names(): { [key: string]: string } {
    return {
      instacneId: 'InstacneId',
      status: 'Status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instacneId: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IncreaseInstanceResponseData extends $tea.Model {
  instacneId: number;
  incrementStatus: string;
  static names(): { [key: string]: string } {
    return {
      instacneId: 'InstacneId',
      incrementStatus: 'IncrementStatus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instacneId: 'number',
      incrementStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstanceResponseInstanceMeasure extends $tea.Model {
  billingCycleStart: string;
  billingCycleEnd: string;
  packetCapacity: number;
  packetType: string;
  packetUsed: number;
  excessAmount: number;
  lastPostTime: string;
  packetUsedBySearch: number;
  packetUsedByAdd: number;
  excessAmountBySearch: number;
  excessAmountByAdd: number;
  static names(): { [key: string]: string } {
    return {
      billingCycleStart: 'BillingCycleStart',
      billingCycleEnd: 'BillingCycleEnd',
      packetCapacity: 'PacketCapacity',
      packetType: 'PacketType',
      packetUsed: 'PacketUsed',
      excessAmount: 'ExcessAmount',
      lastPostTime: 'LastPostTime',
      packetUsedBySearch: 'PacketUsedBySearch',
      packetUsedByAdd: 'PacketUsedByAdd',
      excessAmountBySearch: 'ExcessAmountBySearch',
      excessAmountByAdd: 'ExcessAmountByAdd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billingCycleStart: 'string',
      billingCycleEnd: 'string',
      packetCapacity: 'number',
      packetType: 'string',
      packetUsed: 'number',
      excessAmount: 'number',
      lastPostTime: 'string',
      packetUsedBySearch: 'number',
      packetUsedByAdd: 'number',
      excessAmountBySearch: 'number',
      excessAmountByAdd: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeInstanceResponseInstance extends $tea.Model {
  id: number;
  utcCreate: string;
  utcModified: string;
  name: string;
  status: string;
  orderStatus: string;
  updateStatus: string;
  totalCount: number;
  orderId: string;
  serviceType: number;
  region: string;
  dataplusInstanceId: string;
  incrementStatus: string;
  incrementProgress: number;
  fullUpdateStatus: string;
  fullUpdatePullProgress: number;
  version: number;
  utcExpireTime: string;
  freeAddAmount: string;
  freeAddUsed: string;
  qps: number;
  capacity: number;
  freeTrial: boolean;
  measure: DescribeInstanceResponseInstanceMeasure;
  static names(): { [key: string]: string } {
    return {
      id: 'Id',
      utcCreate: 'UtcCreate',
      utcModified: 'UtcModified',
      name: 'Name',
      status: 'Status',
      orderStatus: 'OrderStatus',
      updateStatus: 'UpdateStatus',
      totalCount: 'TotalCount',
      orderId: 'OrderId',
      serviceType: 'ServiceType',
      region: 'Region',
      dataplusInstanceId: 'DataplusInstanceId',
      incrementStatus: 'IncrementStatus',
      incrementProgress: 'IncrementProgress',
      fullUpdateStatus: 'FullUpdateStatus',
      fullUpdatePullProgress: 'FullUpdatePullProgress',
      version: 'Version',
      utcExpireTime: 'UtcExpireTime',
      freeAddAmount: 'FreeAddAmount',
      freeAddUsed: 'FreeAddUsed',
      qps: 'Qps',
      capacity: 'Capacity',
      freeTrial: 'FreeTrial',
      measure: 'Measure',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      utcCreate: 'string',
      utcModified: 'string',
      name: 'string',
      status: 'string',
      orderStatus: 'string',
      updateStatus: 'string',
      totalCount: 'number',
      orderId: 'string',
      serviceType: 'number',
      region: 'string',
      dataplusInstanceId: 'string',
      incrementStatus: 'string',
      incrementProgress: 'number',
      fullUpdateStatus: 'string',
      fullUpdatePullProgress: 'number',
      version: 'number',
      utcExpireTime: 'string',
      freeAddAmount: 'string',
      freeAddUsed: 'string',
      qps: 'number',
      capacity: 'number',
      freeTrial: 'boolean',
      measure: DescribeInstanceResponseInstanceMeasure,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ClearInstanceResponseData extends $tea.Model {
  instacneId: number;
  status: string;
  static names(): { [key: string]: string } {
    return {
      instacneId: 'InstacneId',
      status: 'Status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instacneId: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRegionsResponseRegionsRegion extends $tea.Model {
  regionId: string;
  localName: string;
  static names(): { [key: string]: string } {
    return {
      regionId: 'RegionId',
      localName: 'LocalName',
    };
  }

  static types(): { [key: string]: any } {
    return {
      regionId: 'string',
      localName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeRegionsResponseRegions extends $tea.Model {
  region: DescribeRegionsResponseRegionsRegion[];
  static names(): { [key: string]: string } {
    return {
      region: 'Region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      region: { 'type': 'array', 'itemType': DescribeRegionsResponseRegionsRegion },
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
    this._endpoint = this.getEndpoint("imagesearch", this._regionId, this._endpointRule, this._network, this._suffix, this._endpointMap, this._endpoint);
  }


  async tagResourcesWithOptions(request: TagResourcesRequest, runtime: $Util.RuntimeOptions): Promise<TagResourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<TagResourcesResponse>(await this.doRequest("TagResources", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new TagResourcesResponse({}));
  }

  async tagResources(request: TagResourcesRequest): Promise<TagResourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.tagResourcesWithOptions(request, runtime);
  }

  async untagResourcesWithOptions(request: UntagResourcesRequest, runtime: $Util.RuntimeOptions): Promise<UntagResourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<UntagResourcesResponse>(await this.doRequest("UntagResources", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new UntagResourcesResponse({}));
  }

  async untagResources(request: UntagResourcesRequest): Promise<UntagResourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.untagResourcesWithOptions(request, runtime);
  }

  async listTagResourcesWithOptions(request: ListTagResourcesRequest, runtime: $Util.RuntimeOptions): Promise<ListTagResourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTagResourcesResponse>(await this.doRequest("ListTagResources", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new ListTagResourcesResponse({}));
  }

  async listTagResources(request: ListTagResourcesRequest): Promise<ListTagResourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listTagResourcesWithOptions(request, runtime);
  }

  async listIncrementWithOptions(request: ListIncrementRequest, runtime: $Util.RuntimeOptions): Promise<ListIncrementResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIncrementResponse>(await this.doRequest("ListIncrement", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new ListIncrementResponse({}));
  }

  async listIncrement(request: ListIncrementRequest): Promise<ListIncrementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listIncrementWithOptions(request, runtime);
  }

  async countInstanceWithOptions(request: CountInstanceRequest, runtime: $Util.RuntimeOptions): Promise<CountInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CountInstanceResponse>(await this.doRequest("CountInstance", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new CountInstanceResponse({}));
  }

  async countInstance(request: CountInstanceRequest): Promise<CountInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.countInstanceWithOptions(request, runtime);
  }

  async listInstanceWithOptions(request: ListInstanceRequest, runtime: $Util.RuntimeOptions): Promise<ListInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListInstanceResponse>(await this.doRequest("ListInstance", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new ListInstanceResponse({}));
  }

  async listInstance(request: ListInstanceRequest): Promise<ListInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listInstanceWithOptions(request, runtime);
  }

  async initInstanceWithOptions(request: InitInstanceRequest, runtime: $Util.RuntimeOptions): Promise<InitInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<InitInstanceResponse>(await this.doRequest("InitInstance", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new InitInstanceResponse({}));
  }

  async initInstance(request: InitInstanceRequest): Promise<InitInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.initInstanceWithOptions(request, runtime);
  }

  async increaseInstanceWithOptions(request: IncreaseInstanceRequest, runtime: $Util.RuntimeOptions): Promise<IncreaseInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<IncreaseInstanceResponse>(await this.doRequest("IncreaseInstance", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new IncreaseInstanceResponse({}));
  }

  async increaseInstance(request: IncreaseInstanceRequest): Promise<IncreaseInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.increaseInstanceWithOptions(request, runtime);
  }

  async describeInstanceWithOptions(request: DescribeInstanceRequest, runtime: $Util.RuntimeOptions): Promise<DescribeInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeInstanceResponse>(await this.doRequest("DescribeInstance", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new DescribeInstanceResponse({}));
  }

  async describeInstance(request: DescribeInstanceRequest): Promise<DescribeInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.describeInstanceWithOptions(request, runtime);
  }

  async clearInstanceWithOptions(request: ClearInstanceRequest, runtime: $Util.RuntimeOptions): Promise<ClearInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ClearInstanceResponse>(await this.doRequest("ClearInstance", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new ClearInstanceResponse({}));
  }

  async clearInstance(request: ClearInstanceRequest): Promise<ClearInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.clearInstanceWithOptions(request, runtime);
  }

  async describeRegionsWithOptions(request: DescribeRegionsRequest, runtime: $Util.RuntimeOptions): Promise<DescribeRegionsResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeRegionsResponse>(await this.doRequest("DescribeRegions", "HTTPS", "POST", "2018-01-11", "AK", null, $tea.toMap(request), runtime), new DescribeRegionsResponse({}));
  }

  async describeRegions(request: DescribeRegionsRequest): Promise<DescribeRegionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.describeRegionsWithOptions(request, runtime);
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
