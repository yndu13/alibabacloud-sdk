"use strict";
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
// This file is auto-generated, don't edit it
const oss_client_1 = __importStar(require("@alicloud/oss-client")), $OSS = oss_client_1;
const openplatform20191219_1 = __importStar(require("@alicloud/openplatform20191219")), $OpenPlatform = openplatform20191219_1;
const rpc_util_1 = __importDefault(require("@alicloud/rpc-util"));
const rpc_client_1 = __importStar(require("@alicloud/rpc-client")), $RPC = rpc_client_1;
const $OSSUtil = __importStar(require("@alicloud/oss-util"));
const tea_util_1 = __importDefault(require("@alicloud/tea-util"));
const $FileForm = __importStar(require("@alicloud/tea-fileform"));
const endpoint_util_1 = __importDefault(require("@alicloud/endpoint-util"));
const $tea = __importStar(require("@alicloud/tea-typescript"));
class DetectVideoLivingFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            videoUrl: 'VideoUrl',
        };
    }
    static types() {
        return {
            videoUrl: 'string',
        };
    }
}
exports.DetectVideoLivingFaceRequest = DetectVideoLivingFaceRequest;
class DetectVideoLivingFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: DetectVideoLivingFaceResponseData,
        };
    }
}
exports.DetectVideoLivingFaceResponse = DetectVideoLivingFaceResponse;
class DetectVideoLivingFaceAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            videoUrlObject: 'VideoUrlObject',
        };
    }
    static types() {
        return {
            videoUrlObject: 'Readable',
        };
    }
}
exports.DetectVideoLivingFaceAdvanceRequest = DetectVideoLivingFaceAdvanceRequest;
class SwapFacialFeaturesRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            sourceImageURL: 'SourceImageURL',
            editPart: 'EditPart',
            targetImageURL: 'TargetImageURL',
        };
    }
    static types() {
        return {
            sourceImageURL: 'string',
            editPart: 'string',
            targetImageURL: 'string',
        };
    }
}
exports.SwapFacialFeaturesRequest = SwapFacialFeaturesRequest;
class SwapFacialFeaturesResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: SwapFacialFeaturesResponseData,
        };
    }
}
exports.SwapFacialFeaturesResponse = SwapFacialFeaturesResponse;
class SwapFacialFeaturesAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            sourceImageURLObject: 'SourceImageURLObject',
            editPart: 'EditPart',
            targetImageURL: 'TargetImageURL',
        };
    }
    static types() {
        return {
            sourceImageURLObject: 'Readable',
            editPart: 'string',
            targetImageURL: 'string',
        };
    }
}
exports.SwapFacialFeaturesAdvanceRequest = SwapFacialFeaturesAdvanceRequest;
class AddFaceEntityRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            entityId: 'EntityId',
            labels: 'Labels',
        };
    }
    static types() {
        return {
            dbName: 'string',
            entityId: 'string',
            labels: 'string',
        };
    }
}
exports.AddFaceEntityRequest = AddFaceEntityRequest;
class AddFaceEntityResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.AddFaceEntityResponse = AddFaceEntityResponse;
class DeleteFaceEntityRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            entityId: 'EntityId',
        };
    }
    static types() {
        return {
            dbName: 'string',
            entityId: 'string',
        };
    }
}
exports.DeleteFaceEntityRequest = DeleteFaceEntityRequest;
class DeleteFaceEntityResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.DeleteFaceEntityResponse = DeleteFaceEntityResponse;
class ListFaceEntitiesRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            offset: 'Offset',
            limit: 'Limit',
            token: 'Token',
            labels: 'Labels',
            entityIdPrefix: 'EntityIdPrefix',
            order: 'Order',
        };
    }
    static types() {
        return {
            dbName: 'string',
            offset: 'number',
            limit: 'number',
            token: 'string',
            labels: 'string',
            entityIdPrefix: 'string',
            order: 'string',
        };
    }
}
exports.ListFaceEntitiesRequest = ListFaceEntitiesRequest;
class ListFaceEntitiesResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: ListFaceEntitiesResponseData,
        };
    }
}
exports.ListFaceEntitiesResponse = ListFaceEntitiesResponse;
class GetFaceEntityRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            entityId: 'EntityId',
        };
    }
    static types() {
        return {
            dbName: 'string',
            entityId: 'string',
        };
    }
}
exports.GetFaceEntityRequest = GetFaceEntityRequest;
class GetFaceEntityResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: GetFaceEntityResponseData,
        };
    }
}
exports.GetFaceEntityResponse = GetFaceEntityResponse;
class UpdateFaceEntityRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            entityId: 'EntityId',
            labels: 'Labels',
        };
    }
    static types() {
        return {
            dbName: 'string',
            entityId: 'string',
            labels: 'string',
        };
    }
}
exports.UpdateFaceEntityRequest = UpdateFaceEntityRequest;
class UpdateFaceEntityResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.UpdateFaceEntityResponse = UpdateFaceEntityResponse;
class FaceMakeupRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
            makeupType: 'MakeupType',
            resourceType: 'ResourceType',
            strength: 'Strength',
        };
    }
    static types() {
        return {
            imageURL: 'string',
            makeupType: 'string',
            resourceType: 'string',
            strength: 'number',
        };
    }
}
exports.FaceMakeupRequest = FaceMakeupRequest;
class FaceMakeupResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: FaceMakeupResponseData,
        };
    }
}
exports.FaceMakeupResponse = FaceMakeupResponse;
class FaceMakeupAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
            makeupType: 'MakeupType',
            resourceType: 'ResourceType',
            strength: 'Strength',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
            makeupType: 'string',
            resourceType: 'string',
            strength: 'number',
        };
    }
}
exports.FaceMakeupAdvanceRequest = FaceMakeupAdvanceRequest;
class HandPostureRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.HandPostureRequest = HandPostureRequest;
class HandPostureResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: HandPostureResponseData,
        };
    }
}
exports.HandPostureResponse = HandPostureResponse;
class HandPostureAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.HandPostureAdvanceRequest = HandPostureAdvanceRequest;
class BodyPostureRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.BodyPostureRequest = BodyPostureRequest;
class BodyPostureResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: BodyPostureResponseData,
        };
    }
}
exports.BodyPostureResponse = BodyPostureResponse;
class BodyPostureAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.BodyPostureAdvanceRequest = BodyPostureAdvanceRequest;
class DetectPedestrianRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.DetectPedestrianRequest = DetectPedestrianRequest;
class DetectPedestrianResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: DetectPedestrianResponseData,
        };
    }
}
exports.DetectPedestrianResponse = DetectPedestrianResponse;
class DetectPedestrianAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.DetectPedestrianAdvanceRequest = DetectPedestrianAdvanceRequest;
class FaceBeautyRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
            sharp: 'Sharp',
            smooth: 'Smooth',
            white: 'White',
        };
    }
    static types() {
        return {
            imageURL: 'string',
            sharp: 'number',
            smooth: 'number',
            white: 'number',
        };
    }
}
exports.FaceBeautyRequest = FaceBeautyRequest;
class FaceBeautyResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: FaceBeautyResponseData,
        };
    }
}
exports.FaceBeautyResponse = FaceBeautyResponse;
class FaceBeautyAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
            sharp: 'Sharp',
            smooth: 'Smooth',
            white: 'White',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
            sharp: 'number',
            smooth: 'number',
            white: 'number',
        };
    }
}
exports.FaceBeautyAdvanceRequest = FaceBeautyAdvanceRequest;
class FaceFilterRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
            resourceType: 'ResourceType',
            strength: 'Strength',
        };
    }
    static types() {
        return {
            imageURL: 'string',
            resourceType: 'string',
            strength: 'number',
        };
    }
}
exports.FaceFilterRequest = FaceFilterRequest;
class FaceFilterResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: FaceFilterResponseData,
        };
    }
}
exports.FaceFilterResponse = FaceFilterResponse;
class FaceFilterAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
            resourceType: 'ResourceType',
            strength: 'Strength',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
            resourceType: 'string',
            strength: 'number',
        };
    }
}
exports.FaceFilterAdvanceRequest = FaceFilterAdvanceRequest;
class EnhanceFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.EnhanceFaceRequest = EnhanceFaceRequest;
class EnhanceFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: EnhanceFaceResponseData,
        };
    }
}
exports.EnhanceFaceResponse = EnhanceFaceResponse;
class EnhanceFaceAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.EnhanceFaceAdvanceRequest = EnhanceFaceAdvanceRequest;
class FaceTidyupRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
            shapeType: 'ShapeType',
            strength: 'Strength',
        };
    }
    static types() {
        return {
            imageURL: 'string',
            shapeType: 'number',
            strength: 'number',
        };
    }
}
exports.FaceTidyupRequest = FaceTidyupRequest;
class FaceTidyupResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: FaceTidyupResponseData,
        };
    }
}
exports.FaceTidyupResponse = FaceTidyupResponse;
class FaceTidyupAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
            shapeType: 'ShapeType',
            strength: 'Strength',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
            shapeType: 'number',
            strength: 'number',
        };
    }
}
exports.FaceTidyupAdvanceRequest = FaceTidyupAdvanceRequest;
class SearchFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            imageUrl: 'ImageUrl',
            limit: 'Limit',
        };
    }
    static types() {
        return {
            dbName: 'string',
            imageUrl: 'string',
            limit: 'number',
        };
    }
}
exports.SearchFaceRequest = SearchFaceRequest;
class SearchFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: SearchFaceResponseData,
        };
    }
}
exports.SearchFaceResponse = SearchFaceResponse;
class SearchFaceAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageUrlObject: 'ImageUrlObject',
            dbName: 'DbName',
            limit: 'Limit',
        };
    }
    static types() {
        return {
            imageUrlObject: 'Readable',
            dbName: 'string',
            limit: 'number',
        };
    }
}
exports.SearchFaceAdvanceRequest = SearchFaceAdvanceRequest;
class ListFaceDbsRequest extends $tea.Model {
    static names() {
        return {};
    }
    static types() {
        return {};
    }
    constructor(map) {
        super(map);
    }
}
exports.ListFaceDbsRequest = ListFaceDbsRequest;
class ListFaceDbsResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: ListFaceDbsResponseData,
        };
    }
}
exports.ListFaceDbsResponse = ListFaceDbsResponse;
class CreateFaceDbRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.CreateFaceDbRequest = CreateFaceDbRequest;
class CreateFaceDbResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.CreateFaceDbResponse = CreateFaceDbResponse;
class DeleteFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            faceId: 'FaceId',
        };
    }
    static types() {
        return {
            dbName: 'string',
            faceId: 'string',
        };
    }
}
exports.DeleteFaceRequest = DeleteFaceRequest;
class DeleteFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.DeleteFaceResponse = DeleteFaceResponse;
class DeleteFaceDbRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.DeleteFaceDbRequest = DeleteFaceDbRequest;
class DeleteFaceDbResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
        };
    }
    static types() {
        return {
            requestId: 'string',
        };
    }
}
exports.DeleteFaceDbResponse = DeleteFaceDbResponse;
class AddFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            imageUrl: 'ImageUrl',
            entityId: 'EntityId',
            extraData: 'ExtraData',
        };
    }
    static types() {
        return {
            dbName: 'string',
            imageUrl: 'string',
            entityId: 'string',
            extraData: 'string',
        };
    }
}
exports.AddFaceRequest = AddFaceRequest;
class AddFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: AddFaceResponseData,
        };
    }
}
exports.AddFaceResponse = AddFaceResponse;
class AddFaceAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageUrlObject: 'ImageUrlObject',
            dbName: 'DbName',
            entityId: 'EntityId',
            extraData: 'ExtraData',
        };
    }
    static types() {
        return {
            imageUrlObject: 'Readable',
            dbName: 'string',
            entityId: 'string',
            extraData: 'string',
        };
    }
}
exports.AddFaceAdvanceRequest = AddFaceAdvanceRequest;
class RecognizeExpressionRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.RecognizeExpressionRequest = RecognizeExpressionRequest;
class RecognizeExpressionResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: RecognizeExpressionResponseData,
        };
    }
}
exports.RecognizeExpressionResponse = RecognizeExpressionResponse;
class RecognizeExpressionAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.RecognizeExpressionAdvanceRequest = RecognizeExpressionAdvanceRequest;
class RecognizePublicFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            task: 'Task',
        };
    }
    static types() {
        return {
            task: { 'type': 'array', 'itemType': RecognizePublicFaceRequestTask },
        };
    }
}
exports.RecognizePublicFaceRequest = RecognizePublicFaceRequest;
class RecognizePublicFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: RecognizePublicFaceResponseData,
        };
    }
}
exports.RecognizePublicFaceResponse = RecognizePublicFaceResponse;
class DetectLivingFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            tasks: 'Tasks',
        };
    }
    static types() {
        return {
            tasks: { 'type': 'array', 'itemType': DetectLivingFaceRequestTasks },
        };
    }
}
exports.DetectLivingFaceRequest = DetectLivingFaceRequest;
class DetectLivingFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: DetectLivingFaceResponseData,
        };
    }
}
exports.DetectLivingFaceResponse = DetectLivingFaceResponse;
class DetectBodyCountRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.DetectBodyCountRequest = DetectBodyCountRequest;
class DetectBodyCountResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: DetectBodyCountResponseData,
        };
    }
}
exports.DetectBodyCountResponse = DetectBodyCountResponse;
class DetectBodyCountAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.DetectBodyCountAdvanceRequest = DetectBodyCountAdvanceRequest;
class DetectMaskRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.DetectMaskRequest = DetectMaskRequest;
class DetectMaskResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: DetectMaskResponseData,
        };
    }
}
exports.DetectMaskResponse = DetectMaskResponse;
class DetectMaskAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.DetectMaskAdvanceRequest = DetectMaskAdvanceRequest;
class RecognizeFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.RecognizeFaceRequest = RecognizeFaceRequest;
class RecognizeFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: RecognizeFaceResponseData,
        };
    }
}
exports.RecognizeFaceResponse = RecognizeFaceResponse;
class RecognizeFaceAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.RecognizeFaceAdvanceRequest = RecognizeFaceAdvanceRequest;
class CompareFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLA: 'ImageURLA',
            imageURLB: 'ImageURLB',
        };
    }
    static types() {
        return {
            imageURLA: 'string',
            imageURLB: 'string',
        };
    }
}
exports.CompareFaceRequest = CompareFaceRequest;
class CompareFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: CompareFaceResponseData,
        };
    }
}
exports.CompareFaceResponse = CompareFaceResponse;
class DetectFaceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.DetectFaceRequest = DetectFaceRequest;
class DetectFaceResponse extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            requestId: 'RequestId',
            data: 'Data',
        };
    }
    static types() {
        return {
            requestId: 'string',
            data: DetectFaceResponseData,
        };
    }
}
exports.DetectFaceResponse = DetectFaceResponse;
class DetectFaceAdvanceRequest extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURLObject: 'ImageURLObject',
        };
    }
    static types() {
        return {
            imageURLObject: 'Readable',
        };
    }
}
exports.DetectFaceAdvanceRequest = DetectFaceAdvanceRequest;
class DetectVideoLivingFaceResponseDataElements extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            liveConfidence: 'LiveConfidence',
            faceConfidence: 'FaceConfidence',
            rect: 'Rect',
        };
    }
    static types() {
        return {
            liveConfidence: 'number',
            faceConfidence: 'number',
            rect: { 'type': 'array', 'itemType': 'integer' },
        };
    }
}
exports.DetectVideoLivingFaceResponseDataElements = DetectVideoLivingFaceResponseDataElements;
class DetectVideoLivingFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            elements: 'Elements',
        };
    }
    static types() {
        return {
            elements: { 'type': 'array', 'itemType': DetectVideoLivingFaceResponseDataElements },
        };
    }
}
exports.DetectVideoLivingFaceResponseData = DetectVideoLivingFaceResponseData;
class SwapFacialFeaturesResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.SwapFacialFeaturesResponseData = SwapFacialFeaturesResponseData;
class ListFaceEntitiesResponseDataEntities extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            entityId: 'EntityId',
            faceCount: 'FaceCount',
            labels: 'Labels',
            createdAt: 'CreatedAt',
            updatedAt: 'UpdatedAt',
        };
    }
    static types() {
        return {
            dbName: 'string',
            entityId: 'string',
            faceCount: 'number',
            labels: 'string',
            createdAt: 'number',
            updatedAt: 'number',
        };
    }
}
exports.ListFaceEntitiesResponseDataEntities = ListFaceEntitiesResponseDataEntities;
class ListFaceEntitiesResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            token: 'Token',
            totalCount: 'TotalCount',
            entities: 'Entities',
        };
    }
    static types() {
        return {
            token: 'string',
            totalCount: 'number',
            entities: { 'type': 'array', 'itemType': ListFaceEntitiesResponseDataEntities },
        };
    }
}
exports.ListFaceEntitiesResponseData = ListFaceEntitiesResponseData;
class GetFaceEntityResponseDataFaces extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            faceId: 'FaceId',
        };
    }
    static types() {
        return {
            faceId: 'string',
        };
    }
}
exports.GetFaceEntityResponseDataFaces = GetFaceEntityResponseDataFaces;
class GetFaceEntityResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbName: 'DbName',
            entityId: 'EntityId',
            labels: 'Labels',
            faces: 'Faces',
        };
    }
    static types() {
        return {
            dbName: 'string',
            entityId: 'string',
            labels: 'string',
            faces: { 'type': 'array', 'itemType': GetFaceEntityResponseDataFaces },
        };
    }
}
exports.GetFaceEntityResponseData = GetFaceEntityResponseData;
class FaceMakeupResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.FaceMakeupResponseData = FaceMakeupResponseData;
class HandPostureResponseDataOutputsResultsBoxPositions extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            points: 'Points',
        };
    }
    static types() {
        return {
            points: { 'type': 'array', 'itemType': 'float' },
        };
    }
}
exports.HandPostureResponseDataOutputsResultsBoxPositions = HandPostureResponseDataOutputsResultsBoxPositions;
class HandPostureResponseDataOutputsResultsBox extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            confident: 'Confident',
            positions: 'Positions',
        };
    }
    static types() {
        return {
            confident: 'number',
            positions: { 'type': 'array', 'itemType': HandPostureResponseDataOutputsResultsBoxPositions },
        };
    }
}
exports.HandPostureResponseDataOutputsResultsBox = HandPostureResponseDataOutputsResultsBox;
class HandPostureResponseDataOutputsResultsHandsKeyPointsPositions extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            points: 'Points',
        };
    }
    static types() {
        return {
            points: { 'type': 'array', 'itemType': 'float' },
        };
    }
}
exports.HandPostureResponseDataOutputsResultsHandsKeyPointsPositions = HandPostureResponseDataOutputsResultsHandsKeyPointsPositions;
class HandPostureResponseDataOutputsResultsHandsKeyPoints extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            label: 'Label',
            positions: 'Positions',
        };
    }
    static types() {
        return {
            label: 'string',
            positions: { 'type': 'array', 'itemType': HandPostureResponseDataOutputsResultsHandsKeyPointsPositions },
        };
    }
}
exports.HandPostureResponseDataOutputsResultsHandsKeyPoints = HandPostureResponseDataOutputsResultsHandsKeyPoints;
class HandPostureResponseDataOutputsResultsHands extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            confident: 'Confident',
            keyPoints: 'KeyPoints',
        };
    }
    static types() {
        return {
            confident: 'number',
            keyPoints: { 'type': 'array', 'itemType': HandPostureResponseDataOutputsResultsHandsKeyPoints },
        };
    }
}
exports.HandPostureResponseDataOutputsResultsHands = HandPostureResponseDataOutputsResultsHands;
class HandPostureResponseDataOutputsResults extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            box: 'Box',
            hands: 'Hands',
        };
    }
    static types() {
        return {
            box: HandPostureResponseDataOutputsResultsBox,
            hands: HandPostureResponseDataOutputsResultsHands,
        };
    }
}
exports.HandPostureResponseDataOutputsResults = HandPostureResponseDataOutputsResults;
class HandPostureResponseDataOutputs extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            handCount: 'HandCount',
            results: 'Results',
        };
    }
    static types() {
        return {
            handCount: 'number',
            results: { 'type': 'array', 'itemType': HandPostureResponseDataOutputsResults },
        };
    }
}
exports.HandPostureResponseDataOutputs = HandPostureResponseDataOutputs;
class HandPostureResponseDataMetaObject extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            height: 'Height',
            width: 'Width',
        };
    }
    static types() {
        return {
            height: 'number',
            width: 'number',
        };
    }
}
exports.HandPostureResponseDataMetaObject = HandPostureResponseDataMetaObject;
class HandPostureResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            outputs: 'Outputs',
            metaObject: 'MetaObject',
        };
    }
    static types() {
        return {
            outputs: { 'type': 'array', 'itemType': HandPostureResponseDataOutputs },
            metaObject: HandPostureResponseDataMetaObject,
        };
    }
}
exports.HandPostureResponseData = HandPostureResponseData;
class BodyPostureResponseDataOutputsResultsBodiesPositions extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            points: 'Points',
        };
    }
    static types() {
        return {
            points: { 'type': 'array', 'itemType': 'float' },
        };
    }
}
exports.BodyPostureResponseDataOutputsResultsBodiesPositions = BodyPostureResponseDataOutputsResultsBodiesPositions;
class BodyPostureResponseDataOutputsResultsBodies extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            confident: 'Confident',
            label: 'Label',
            positions: 'Positions',
        };
    }
    static types() {
        return {
            confident: 'number',
            label: 'string',
            positions: { 'type': 'array', 'itemType': BodyPostureResponseDataOutputsResultsBodiesPositions },
        };
    }
}
exports.BodyPostureResponseDataOutputsResultsBodies = BodyPostureResponseDataOutputsResultsBodies;
class BodyPostureResponseDataOutputsResults extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            bodies: 'Bodies',
        };
    }
    static types() {
        return {
            bodies: { 'type': 'array', 'itemType': BodyPostureResponseDataOutputsResultsBodies },
        };
    }
}
exports.BodyPostureResponseDataOutputsResults = BodyPostureResponseDataOutputsResults;
class BodyPostureResponseDataOutputs extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            humanCount: 'HumanCount',
            results: 'Results',
        };
    }
    static types() {
        return {
            humanCount: 'number',
            results: { 'type': 'array', 'itemType': BodyPostureResponseDataOutputsResults },
        };
    }
}
exports.BodyPostureResponseDataOutputs = BodyPostureResponseDataOutputs;
class BodyPostureResponseDataMetaObject extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            height: 'Height',
            width: 'Width',
        };
    }
    static types() {
        return {
            height: 'number',
            width: 'number',
        };
    }
}
exports.BodyPostureResponseDataMetaObject = BodyPostureResponseDataMetaObject;
class BodyPostureResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            outputs: 'Outputs',
            metaObject: 'MetaObject',
        };
    }
    static types() {
        return {
            outputs: { 'type': 'array', 'itemType': BodyPostureResponseDataOutputs },
            metaObject: BodyPostureResponseDataMetaObject,
        };
    }
}
exports.BodyPostureResponseData = BodyPostureResponseData;
class DetectPedestrianResponseDataElements extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            score: 'Score',
            type: 'Type',
            boxes: 'Boxes',
        };
    }
    static types() {
        return {
            score: 'number',
            type: 'string',
            boxes: { 'type': 'array', 'itemType': 'integer' },
        };
    }
}
exports.DetectPedestrianResponseDataElements = DetectPedestrianResponseDataElements;
class DetectPedestrianResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            width: 'Width',
            height: 'Height',
            elements: 'Elements',
        };
    }
    static types() {
        return {
            width: 'number',
            height: 'number',
            elements: { 'type': 'array', 'itemType': DetectPedestrianResponseDataElements },
        };
    }
}
exports.DetectPedestrianResponseData = DetectPedestrianResponseData;
class FaceBeautyResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.FaceBeautyResponseData = FaceBeautyResponseData;
class FaceFilterResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.FaceFilterResponseData = FaceFilterResponseData;
class EnhanceFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.EnhanceFaceResponseData = EnhanceFaceResponseData;
class FaceTidyupResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.FaceTidyupResponseData = FaceTidyupResponseData;
class SearchFaceResponseDataMatchListFaceItems extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            faceId: 'FaceId',
            score: 'Score',
            extraData: 'ExtraData',
            entityId: 'EntityId',
        };
    }
    static types() {
        return {
            faceId: 'string',
            score: 'number',
            extraData: 'string',
            entityId: 'string',
        };
    }
}
exports.SearchFaceResponseDataMatchListFaceItems = SearchFaceResponseDataMatchListFaceItems;
class SearchFaceResponseDataMatchListLocation extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            x: 'X',
            y: 'Y',
            width: 'Width',
            height: 'Height',
        };
    }
    static types() {
        return {
            x: 'number',
            y: 'number',
            width: 'number',
            height: 'number',
        };
    }
}
exports.SearchFaceResponseDataMatchListLocation = SearchFaceResponseDataMatchListLocation;
class SearchFaceResponseDataMatchList extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            faceItems: 'FaceItems',
            location: 'Location',
        };
    }
    static types() {
        return {
            faceItems: { 'type': 'array', 'itemType': SearchFaceResponseDataMatchListFaceItems },
            location: SearchFaceResponseDataMatchListLocation,
        };
    }
}
exports.SearchFaceResponseDataMatchList = SearchFaceResponseDataMatchList;
class SearchFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            matchList: 'MatchList',
        };
    }
    static types() {
        return {
            matchList: { 'type': 'array', 'itemType': SearchFaceResponseDataMatchList },
        };
    }
}
exports.SearchFaceResponseData = SearchFaceResponseData;
class ListFaceDbsResponseDataDbList extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            name: 'Name',
        };
    }
    static types() {
        return {
            name: 'string',
        };
    }
}
exports.ListFaceDbsResponseDataDbList = ListFaceDbsResponseDataDbList;
class ListFaceDbsResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            dbList: 'DbList',
        };
    }
    static types() {
        return {
            dbList: { 'type': 'array', 'itemType': ListFaceDbsResponseDataDbList },
        };
    }
}
exports.ListFaceDbsResponseData = ListFaceDbsResponseData;
class AddFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            faceId: 'FaceId',
        };
    }
    static types() {
        return {
            faceId: 'string',
        };
    }
}
exports.AddFaceResponseData = AddFaceResponseData;
class RecognizeExpressionResponseDataElementsFaceRectangle extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            height: 'Height',
            left: 'Left',
            top: 'Top',
            width: 'Width',
        };
    }
    static types() {
        return {
            height: 'number',
            left: 'number',
            top: 'number',
            width: 'number',
        };
    }
}
exports.RecognizeExpressionResponseDataElementsFaceRectangle = RecognizeExpressionResponseDataElementsFaceRectangle;
class RecognizeExpressionResponseDataElements extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            expression: 'Expression',
            faceProbability: 'FaceProbability',
            faceRectangle: 'FaceRectangle',
        };
    }
    static types() {
        return {
            expression: 'string',
            faceProbability: 'number',
            faceRectangle: RecognizeExpressionResponseDataElementsFaceRectangle,
        };
    }
}
exports.RecognizeExpressionResponseDataElements = RecognizeExpressionResponseDataElements;
class RecognizeExpressionResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            elements: 'Elements',
        };
    }
    static types() {
        return {
            elements: { 'type': 'array', 'itemType': RecognizeExpressionResponseDataElements },
        };
    }
}
exports.RecognizeExpressionResponseData = RecognizeExpressionResponseData;
class RecognizePublicFaceRequestTask extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.RecognizePublicFaceRequestTask = RecognizePublicFaceRequestTask;
class RecognizePublicFaceResponseDataElementsResultsSubResultsFaces extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            id: 'Id',
            name: 'Name',
            rate: 'Rate',
        };
    }
    static types() {
        return {
            id: 'string',
            name: 'string',
            rate: 'number',
        };
    }
}
exports.RecognizePublicFaceResponseDataElementsResultsSubResultsFaces = RecognizePublicFaceResponseDataElementsResultsSubResultsFaces;
class RecognizePublicFaceResponseDataElementsResultsSubResults extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            h: 'H',
            w: 'W',
            x: 'X',
            y: 'Y',
            faces: 'Faces',
        };
    }
    static types() {
        return {
            h: 'number',
            w: 'number',
            x: 'number',
            y: 'number',
            faces: { 'type': 'array', 'itemType': RecognizePublicFaceResponseDataElementsResultsSubResultsFaces },
        };
    }
}
exports.RecognizePublicFaceResponseDataElementsResultsSubResults = RecognizePublicFaceResponseDataElementsResultsSubResults;
class RecognizePublicFaceResponseDataElementsResults extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            label: 'Label',
            suggestion: 'Suggestion',
            rate: 'Rate',
            subResults: 'SubResults',
        };
    }
    static types() {
        return {
            label: 'string',
            suggestion: 'string',
            rate: 'number',
            subResults: { 'type': 'array', 'itemType': RecognizePublicFaceResponseDataElementsResultsSubResults },
        };
    }
}
exports.RecognizePublicFaceResponseDataElementsResults = RecognizePublicFaceResponseDataElementsResults;
class RecognizePublicFaceResponseDataElements extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            taskId: 'TaskId',
            imageURL: 'ImageURL',
            results: 'Results',
        };
    }
    static types() {
        return {
            taskId: 'string',
            imageURL: 'string',
            results: { 'type': 'array', 'itemType': RecognizePublicFaceResponseDataElementsResults },
        };
    }
}
exports.RecognizePublicFaceResponseDataElements = RecognizePublicFaceResponseDataElements;
class RecognizePublicFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            elements: 'Elements',
        };
    }
    static types() {
        return {
            elements: { 'type': 'array', 'itemType': RecognizePublicFaceResponseDataElements },
        };
    }
}
exports.RecognizePublicFaceResponseData = RecognizePublicFaceResponseData;
class DetectLivingFaceRequestTasks extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            imageURL: 'ImageURL',
        };
    }
    static types() {
        return {
            imageURL: 'string',
        };
    }
}
exports.DetectLivingFaceRequestTasks = DetectLivingFaceRequestTasks;
class DetectLivingFaceResponseDataElementsResultsFrames extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            rate: 'Rate',
            url: 'Url',
        };
    }
    static types() {
        return {
            rate: 'number',
            url: 'string',
        };
    }
}
exports.DetectLivingFaceResponseDataElementsResultsFrames = DetectLivingFaceResponseDataElementsResultsFrames;
class DetectLivingFaceResponseDataElementsResults extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            label: 'Label',
            suggestion: 'Suggestion',
            rate: 'Rate',
            frames: 'Frames',
        };
    }
    static types() {
        return {
            label: 'string',
            suggestion: 'string',
            rate: 'number',
            frames: { 'type': 'array', 'itemType': DetectLivingFaceResponseDataElementsResultsFrames },
        };
    }
}
exports.DetectLivingFaceResponseDataElementsResults = DetectLivingFaceResponseDataElementsResults;
class DetectLivingFaceResponseDataElements extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            taskId: 'TaskId',
            imageURL: 'ImageURL',
            results: 'Results',
        };
    }
    static types() {
        return {
            taskId: 'string',
            imageURL: 'string',
            results: { 'type': 'array', 'itemType': DetectLivingFaceResponseDataElementsResults },
        };
    }
}
exports.DetectLivingFaceResponseDataElements = DetectLivingFaceResponseDataElements;
class DetectLivingFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            elements: 'Elements',
        };
    }
    static types() {
        return {
            elements: { 'type': 'array', 'itemType': DetectLivingFaceResponseDataElements },
        };
    }
}
exports.DetectLivingFaceResponseData = DetectLivingFaceResponseData;
class DetectBodyCountResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            personNumber: 'PersonNumber',
        };
    }
    static types() {
        return {
            personNumber: 'number',
        };
    }
}
exports.DetectBodyCountResponseData = DetectBodyCountResponseData;
class DetectMaskResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            mask: 'Mask',
            faceProbability: 'FaceProbability',
        };
    }
    static types() {
        return {
            mask: 'number',
            faceProbability: 'number',
        };
    }
}
exports.DetectMaskResponseData = DetectMaskResponseData;
class RecognizeFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            faceCount: 'FaceCount',
            landmarkCount: 'LandmarkCount',
            denseFeatureLength: 'DenseFeatureLength',
            faceRectangles: 'FaceRectangles',
            faceProbabilityList: 'FaceProbabilityList',
            poseList: 'PoseList',
            landmarks: 'Landmarks',
            pupils: 'Pupils',
            genderList: 'GenderList',
            ageList: 'AgeList',
            expressions: 'Expressions',
            glasses: 'Glasses',
            denseFeatures: 'DenseFeatures',
        };
    }
    static types() {
        return {
            faceCount: 'number',
            landmarkCount: 'number',
            denseFeatureLength: 'number',
            faceRectangles: { 'type': 'array', 'itemType': 'integer' },
            faceProbabilityList: { 'type': 'array', 'itemType': 'float' },
            poseList: { 'type': 'array', 'itemType': 'float' },
            landmarks: { 'type': 'array', 'itemType': 'float' },
            pupils: { 'type': 'array', 'itemType': 'float' },
            genderList: { 'type': 'array', 'itemType': 'integer' },
            ageList: { 'type': 'array', 'itemType': 'integer' },
            expressions: { 'type': 'array', 'itemType': 'integer' },
            glasses: { 'type': 'array', 'itemType': 'integer' },
            denseFeatures: { 'type': 'array', 'itemType': 'string' },
        };
    }
}
exports.RecognizeFaceResponseData = RecognizeFaceResponseData;
class CompareFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            confidence: 'Confidence',
            thresholds: 'Thresholds',
            rectAList: 'RectAList',
            rectBList: 'RectBList',
        };
    }
    static types() {
        return {
            confidence: 'number',
            thresholds: { 'type': 'array', 'itemType': 'float' },
            rectAList: { 'type': 'array', 'itemType': 'integer' },
            rectBList: { 'type': 'array', 'itemType': 'integer' },
        };
    }
}
exports.CompareFaceResponseData = CompareFaceResponseData;
class DetectFaceResponseData extends $tea.Model {
    constructor(map) {
        super(map);
    }
    static names() {
        return {
            faceCount: 'FaceCount',
            landmarkCount: 'LandmarkCount',
            faceRectangles: 'FaceRectangles',
            faceProbabilityList: 'FaceProbabilityList',
            poseList: 'PoseList',
            landmarks: 'Landmarks',
            pupils: 'Pupils',
        };
    }
    static types() {
        return {
            faceCount: 'number',
            landmarkCount: 'number',
            faceRectangles: { 'type': 'array', 'itemType': 'integer' },
            faceProbabilityList: { 'type': 'array', 'itemType': 'float' },
            poseList: { 'type': 'array', 'itemType': 'float' },
            landmarks: { 'type': 'array', 'itemType': 'float' },
            pupils: { 'type': 'array', 'itemType': 'float' },
        };
    }
}
exports.DetectFaceResponseData = DetectFaceResponseData;
class Client extends rpc_client_1.default {
    constructor(config) {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint(this._productId, this._regionId, this._endpointRule, this._network, this._suffix, this._endpointMap, this._endpoint);
    }
    async detectVideoLivingFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DetectVideoLivingFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DetectVideoLivingFaceResponse({}));
    }
    async detectVideoLivingFaceAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.videoUrlObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let detectVideoLivingFacereq = new DetectVideoLivingFaceRequest({});
        rpc_util_1.default.convert(request, detectVideoLivingFacereq);
        detectVideoLivingFacereq.videoUrl = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let detectVideoLivingFaceResp = await this.detectVideoLivingFace(detectVideoLivingFacereq, runtime);
        return detectVideoLivingFaceResp;
    }
    async swapFacialFeatures(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("SwapFacialFeatures", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new SwapFacialFeaturesResponse({}));
    }
    async swapFacialFeaturesAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.sourceImageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let swapFacialFeaturesreq = new SwapFacialFeaturesRequest({});
        rpc_util_1.default.convert(request, swapFacialFeaturesreq);
        swapFacialFeaturesreq.sourceImageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let swapFacialFeaturesResp = await this.swapFacialFeatures(swapFacialFeaturesreq, runtime);
        return swapFacialFeaturesResp;
    }
    async addFaceEntity(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("AddFaceEntity", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new AddFaceEntityResponse({}));
    }
    async deleteFaceEntity(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DeleteFaceEntity", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DeleteFaceEntityResponse({}));
    }
    async listFaceEntities(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("ListFaceEntities", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new ListFaceEntitiesResponse({}));
    }
    async getFaceEntity(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("GetFaceEntity", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new GetFaceEntityResponse({}));
    }
    async updateFaceEntity(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("UpdateFaceEntity", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new UpdateFaceEntityResponse({}));
    }
    async faceMakeup(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FaceMakeup", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new FaceMakeupResponse({}));
    }
    async faceMakeupAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let faceMakeupreq = new FaceMakeupRequest({});
        rpc_util_1.default.convert(request, faceMakeupreq);
        faceMakeupreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let faceMakeupResp = await this.faceMakeup(faceMakeupreq, runtime);
        return faceMakeupResp;
    }
    async handPosture(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("HandPosture", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new HandPostureResponse({}));
    }
    async handPostureAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let handPosturereq = new HandPostureRequest({});
        rpc_util_1.default.convert(request, handPosturereq);
        handPosturereq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let handPostureResp = await this.handPosture(handPosturereq, runtime);
        return handPostureResp;
    }
    async bodyPosture(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("BodyPosture", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new BodyPostureResponse({}));
    }
    async bodyPostureAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let bodyPosturereq = new BodyPostureRequest({});
        rpc_util_1.default.convert(request, bodyPosturereq);
        bodyPosturereq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let bodyPostureResp = await this.bodyPosture(bodyPosturereq, runtime);
        return bodyPostureResp;
    }
    async detectPedestrian(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DetectPedestrian", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DetectPedestrianResponse({}));
    }
    async detectPedestrianAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let detectPedestrianreq = new DetectPedestrianRequest({});
        rpc_util_1.default.convert(request, detectPedestrianreq);
        detectPedestrianreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let detectPedestrianResp = await this.detectPedestrian(detectPedestrianreq, runtime);
        return detectPedestrianResp;
    }
    async faceBeauty(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FaceBeauty", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new FaceBeautyResponse({}));
    }
    async faceBeautyAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let faceBeautyreq = new FaceBeautyRequest({});
        rpc_util_1.default.convert(request, faceBeautyreq);
        faceBeautyreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let faceBeautyResp = await this.faceBeauty(faceBeautyreq, runtime);
        return faceBeautyResp;
    }
    async faceFilter(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FaceFilter", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new FaceFilterResponse({}));
    }
    async faceFilterAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let faceFilterreq = new FaceFilterRequest({});
        rpc_util_1.default.convert(request, faceFilterreq);
        faceFilterreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let faceFilterResp = await this.faceFilter(faceFilterreq, runtime);
        return faceFilterResp;
    }
    async enhanceFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("EnhanceFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new EnhanceFaceResponse({}));
    }
    async enhanceFaceAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let enhanceFacereq = new EnhanceFaceRequest({});
        rpc_util_1.default.convert(request, enhanceFacereq);
        enhanceFacereq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let enhanceFaceResp = await this.enhanceFace(enhanceFacereq, runtime);
        return enhanceFaceResp;
    }
    async faceTidyup(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("FaceTidyup", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new FaceTidyupResponse({}));
    }
    async faceTidyupAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let faceTidyupreq = new FaceTidyupRequest({});
        rpc_util_1.default.convert(request, faceTidyupreq);
        faceTidyupreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let faceTidyupResp = await this.faceTidyup(faceTidyupreq, runtime);
        return faceTidyupResp;
    }
    async searchFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("SearchFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new SearchFaceResponse({}));
    }
    async searchFaceAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageUrlObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let searchFacereq = new SearchFaceRequest({});
        rpc_util_1.default.convert(request, searchFacereq);
        searchFacereq.imageUrl = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let searchFaceResp = await this.searchFace(searchFacereq, runtime);
        return searchFaceResp;
    }
    async listFaceDbs(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("ListFaceDbs", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new ListFaceDbsResponse({}));
    }
    async createFaceDb(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("CreateFaceDb", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new CreateFaceDbResponse({}));
    }
    async deleteFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DeleteFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DeleteFaceResponse({}));
    }
    async deleteFaceDb(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DeleteFaceDb", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DeleteFaceDbResponse({}));
    }
    async addFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("AddFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new AddFaceResponse({}));
    }
    async addFaceAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageUrlObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let addFacereq = new AddFaceRequest({});
        rpc_util_1.default.convert(request, addFacereq);
        addFacereq.imageUrl = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let addFaceResp = await this.addFace(addFacereq, runtime);
        return addFaceResp;
    }
    async recognizeExpression(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("RecognizeExpression", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new RecognizeExpressionResponse({}));
    }
    async recognizeExpressionAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let recognizeExpressionreq = new RecognizeExpressionRequest({});
        rpc_util_1.default.convert(request, recognizeExpressionreq);
        recognizeExpressionreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let recognizeExpressionResp = await this.recognizeExpression(recognizeExpressionreq, runtime);
        return recognizeExpressionResp;
    }
    async recognizePublicFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("RecognizePublicFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new RecognizePublicFaceResponse({}));
    }
    async detectLivingFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DetectLivingFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DetectLivingFaceResponse({}));
    }
    async detectBodyCount(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DetectBodyCount", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DetectBodyCountResponse({}));
    }
    async detectBodyCountAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let detectBodyCountreq = new DetectBodyCountRequest({});
        rpc_util_1.default.convert(request, detectBodyCountreq);
        detectBodyCountreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let detectBodyCountResp = await this.detectBodyCount(detectBodyCountreq, runtime);
        return detectBodyCountResp;
    }
    async detectMask(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DetectMask", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DetectMaskResponse({}));
    }
    async detectMaskAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let detectMaskreq = new DetectMaskRequest({});
        rpc_util_1.default.convert(request, detectMaskreq);
        detectMaskreq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let detectMaskResp = await this.detectMask(detectMaskreq, runtime);
        return detectMaskResp;
    }
    async recognizeFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("RecognizeFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new RecognizeFaceResponse({}));
    }
    async recognizeFaceAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let recognizeFacereq = new RecognizeFaceRequest({});
        rpc_util_1.default.convert(request, recognizeFacereq);
        recognizeFacereq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let recognizeFaceResp = await this.recognizeFace(recognizeFacereq, runtime);
        return recognizeFaceResp;
    }
    async compareFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("CompareFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new CompareFaceResponse({}));
    }
    async detectFace(request, runtime) {
        tea_util_1.default.validateModel(request);
        return $tea.cast(await this.doRequest("DetectFace", "HTTPS", "POST", "2019-12-30", "AK", null, $tea.toMap(request), runtime), new DetectFaceResponse({}));
    }
    async detectFaceAdvance(request, runtime) {
        // Step 0: init client
        let accessKeyId = await this._credential.getAccessKeyId();
        let accessKeySecret = await this._credential.getAccessKeySecret();
        let authConfig = new $RPC.Config({
            accessKeyId: accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: "openplatform.aliyuncs.com",
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let authClient = new openplatform20191219_1.default(authConfig);
        let authRequest = new $OpenPlatform.AuthorizeFileUploadRequest({
            product: "facebody",
            regionId: this._regionId,
        });
        let authResponse = await authClient.authorizeFileUpload(authRequest, runtime);
        // Step 1: request OSS api to upload file
        let ossConfig = new $OSS.Config({
            accessKeyId: authResponse.accessKeyId,
            accessKeySecret: accessKeySecret,
            type: "access_key",
            endpoint: rpc_util_1.default.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, this._endpointType),
            protocol: this._protocol,
            regionId: this._regionId,
        });
        let ossClient = new oss_client_1.default(ossConfig);
        let fileObj = new $FileForm.FileField({
            filename: authResponse.objectKey,
            content: request.imageURLObject,
            contentType: "",
        });
        let ossHeader = new $OSS.PostObjectRequestHeader({
            accessKeyId: authResponse.accessKeyId,
            policy: authResponse.encodedPolicy,
            signature: authResponse.signature,
            key: authResponse.objectKey,
            file: fileObj,
            successActionStatus: "201",
        });
        let uploadRequest = new $OSS.PostObjectRequest({
            bucketName: authResponse.bucket,
            header: ossHeader,
        });
        let ossRuntime = new $OSSUtil.RuntimeOptions({});
        rpc_util_1.default.convert(runtime, ossRuntime);
        await ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        let detectFacereq = new DetectFaceRequest({});
        rpc_util_1.default.convert(request, detectFacereq);
        detectFacereq.imageURL = `http://${authResponse.bucket}.${authResponse.endpoint}/${authResponse.objectKey}`;
        let detectFaceResp = await this.detectFace(detectFacereq, runtime);
        return detectFaceResp;
    }
    getEndpoint(productId, regionId, endpointRule, network, suffix, endpointMap, endpoint) {
        if (!tea_util_1.default.empty(endpoint)) {
            return endpoint;
        }
        if (!tea_util_1.default.isUnset(endpointMap) && !tea_util_1.default.empty(endpointMap[regionId])) {
            return endpointMap[regionId];
        }
        return endpoint_util_1.default.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
exports.default = Client;
//# sourceMappingURL=client.js.map