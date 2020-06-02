/// <reference types="node" />
import RPC, * as $RPC from '@alicloud/rpc-client';
import * as $Util from '@alicloud/tea-util';
import { Readable } from 'stream';
import * as $tea from '@alicloud/tea-typescript';
export declare class DetectVideoLivingFaceRequest extends $tea.Model {
    videoUrl: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectVideoLivingFaceResponse extends $tea.Model {
    requestId: string;
    data: DetectVideoLivingFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectVideoLivingFaceAdvanceRequest extends $tea.Model {
    videoUrlObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SwapFacialFeaturesRequest extends $tea.Model {
    sourceImageURL: string;
    editPart: string;
    targetImageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SwapFacialFeaturesResponse extends $tea.Model {
    requestId: string;
    data: SwapFacialFeaturesResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SwapFacialFeaturesAdvanceRequest extends $tea.Model {
    sourceImageURLObject: Readable;
    editPart: string;
    targetImageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class AddFaceEntityRequest extends $tea.Model {
    dbName: string;
    entityId: string;
    labels?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class AddFaceEntityResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DeleteFaceEntityRequest extends $tea.Model {
    dbName: string;
    entityId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DeleteFaceEntityResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceEntitiesRequest extends $tea.Model {
    dbName: string;
    offset?: number;
    limit?: number;
    token?: string;
    labels?: string;
    entityIdPrefix?: string;
    order?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceEntitiesResponse extends $tea.Model {
    requestId: string;
    data: ListFaceEntitiesResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class GetFaceEntityRequest extends $tea.Model {
    dbName: string;
    entityId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class GetFaceEntityResponse extends $tea.Model {
    requestId: string;
    data: GetFaceEntityResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class UpdateFaceEntityRequest extends $tea.Model {
    dbName: string;
    entityId: string;
    labels?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class UpdateFaceEntityResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceMakeupRequest extends $tea.Model {
    imageURL: string;
    makeupType: string;
    resourceType: string;
    strength: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceMakeupResponse extends $tea.Model {
    requestId: string;
    data: FaceMakeupResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceMakeupAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    makeupType: string;
    resourceType: string;
    strength: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponse extends $tea.Model {
    requestId: string;
    data: HandPostureResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponse extends $tea.Model {
    requestId: string;
    data: BodyPostureResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectPedestrianRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectPedestrianResponse extends $tea.Model {
    requestId: string;
    data: DetectPedestrianResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectPedestrianAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceBeautyRequest extends $tea.Model {
    imageURL: string;
    sharp: number;
    smooth: number;
    white: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceBeautyResponse extends $tea.Model {
    requestId: string;
    data: FaceBeautyResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceBeautyAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    sharp: number;
    smooth: number;
    white: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceFilterRequest extends $tea.Model {
    imageURL: string;
    resourceType: string;
    strength: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceFilterResponse extends $tea.Model {
    requestId: string;
    data: FaceFilterResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceFilterAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    resourceType: string;
    strength: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class EnhanceFaceRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class EnhanceFaceResponse extends $tea.Model {
    requestId: string;
    data: EnhanceFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class EnhanceFaceAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceTidyupRequest extends $tea.Model {
    imageURL: string;
    shapeType: number;
    strength: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceTidyupResponse extends $tea.Model {
    requestId: string;
    data: FaceTidyupResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceTidyupAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    shapeType: number;
    strength: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceRequest extends $tea.Model {
    dbName: string;
    imageUrl: string;
    limit: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceResponse extends $tea.Model {
    requestId: string;
    data: SearchFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceAdvanceRequest extends $tea.Model {
    imageUrlObject: Readable;
    dbName: string;
    limit: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceDbsRequest extends $tea.Model {
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceDbsResponse extends $tea.Model {
    requestId: string;
    data: ListFaceDbsResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class CreateFaceDbRequest extends $tea.Model {
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class CreateFaceDbResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DeleteFaceRequest extends $tea.Model {
    dbName: string;
    faceId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DeleteFaceResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DeleteFaceDbRequest extends $tea.Model {
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DeleteFaceDbResponse extends $tea.Model {
    requestId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class AddFaceRequest extends $tea.Model {
    dbName: string;
    imageUrl: string;
    entityId: string;
    extraData?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class AddFaceResponse extends $tea.Model {
    requestId: string;
    data: AddFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class AddFaceAdvanceRequest extends $tea.Model {
    imageUrlObject: Readable;
    dbName: string;
    entityId: string;
    extraData?: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeExpressionRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeExpressionResponse extends $tea.Model {
    requestId: string;
    data: RecognizeExpressionResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeExpressionAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceRequest extends $tea.Model {
    task: RecognizePublicFaceRequestTask[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceResponse extends $tea.Model {
    requestId: string;
    data: RecognizePublicFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceRequest extends $tea.Model {
    tasks: DetectLivingFaceRequestTasks[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceResponse extends $tea.Model {
    requestId: string;
    data: DetectLivingFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectBodyCountRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectBodyCountResponse extends $tea.Model {
    requestId: string;
    data: DetectBodyCountResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectBodyCountAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectMaskRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectMaskResponse extends $tea.Model {
    requestId: string;
    data: DetectMaskResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectMaskAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeFaceRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeFaceResponse extends $tea.Model {
    requestId: string;
    data: RecognizeFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeFaceAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class CompareFaceRequest extends $tea.Model {
    imageURLA: string;
    imageURLB: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class CompareFaceResponse extends $tea.Model {
    requestId: string;
    data: CompareFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectFaceRequest extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectFaceResponse extends $tea.Model {
    requestId: string;
    data: DetectFaceResponseData;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectFaceAdvanceRequest extends $tea.Model {
    imageURLObject: Readable;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectVideoLivingFaceResponseDataElements extends $tea.Model {
    liveConfidence: number;
    faceConfidence: number;
    rect: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectVideoLivingFaceResponseData extends $tea.Model {
    elements: DetectVideoLivingFaceResponseDataElements[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SwapFacialFeaturesResponseData extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceEntitiesResponseDataEntities extends $tea.Model {
    dbName: string;
    entityId: string;
    faceCount: number;
    labels: string;
    createdAt: number;
    updatedAt: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceEntitiesResponseData extends $tea.Model {
    token: string;
    totalCount: number;
    entities: ListFaceEntitiesResponseDataEntities[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class GetFaceEntityResponseDataFaces extends $tea.Model {
    faceId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class GetFaceEntityResponseData extends $tea.Model {
    dbName: string;
    entityId: string;
    labels: string;
    faces: GetFaceEntityResponseDataFaces[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceMakeupResponseData extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputsResultsBoxPositions extends $tea.Model {
    points: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputsResultsBox extends $tea.Model {
    confident: number;
    positions: HandPostureResponseDataOutputsResultsBoxPositions[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputsResultsHandsKeyPointsPositions extends $tea.Model {
    points: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputsResultsHandsKeyPoints extends $tea.Model {
    label: string;
    positions: HandPostureResponseDataOutputsResultsHandsKeyPointsPositions[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputsResultsHands extends $tea.Model {
    confident: number;
    keyPoints: HandPostureResponseDataOutputsResultsHandsKeyPoints[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputsResults extends $tea.Model {
    box: HandPostureResponseDataOutputsResultsBox;
    hands: HandPostureResponseDataOutputsResultsHands;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataOutputs extends $tea.Model {
    handCount: number;
    results: HandPostureResponseDataOutputsResults[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseDataMetaObject extends $tea.Model {
    height: number;
    width: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class HandPostureResponseData extends $tea.Model {
    outputs: HandPostureResponseDataOutputs[];
    metaObject: HandPostureResponseDataMetaObject;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponseDataOutputsResultsBodiesPositions extends $tea.Model {
    points: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponseDataOutputsResultsBodies extends $tea.Model {
    confident: number;
    label: string;
    positions: BodyPostureResponseDataOutputsResultsBodiesPositions[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponseDataOutputsResults extends $tea.Model {
    bodies: BodyPostureResponseDataOutputsResultsBodies[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponseDataOutputs extends $tea.Model {
    humanCount: number;
    results: BodyPostureResponseDataOutputsResults[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponseDataMetaObject extends $tea.Model {
    height: number;
    width: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class BodyPostureResponseData extends $tea.Model {
    outputs: BodyPostureResponseDataOutputs[];
    metaObject: BodyPostureResponseDataMetaObject;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectPedestrianResponseDataElements extends $tea.Model {
    score: number;
    type: string;
    boxes: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectPedestrianResponseData extends $tea.Model {
    width: number;
    height: number;
    elements: DetectPedestrianResponseDataElements[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceBeautyResponseData extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceFilterResponseData extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class EnhanceFaceResponseData extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class FaceTidyupResponseData extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceResponseDataMatchListFaceItems extends $tea.Model {
    faceId: string;
    score: number;
    extraData: string;
    entityId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceResponseDataMatchListLocation extends $tea.Model {
    x: number;
    y: number;
    width: number;
    height: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceResponseDataMatchList extends $tea.Model {
    faceItems: SearchFaceResponseDataMatchListFaceItems[];
    location: SearchFaceResponseDataMatchListLocation;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class SearchFaceResponseData extends $tea.Model {
    matchList: SearchFaceResponseDataMatchList[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceDbsResponseDataDbList extends $tea.Model {
    name: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class ListFaceDbsResponseData extends $tea.Model {
    dbList: ListFaceDbsResponseDataDbList[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class AddFaceResponseData extends $tea.Model {
    faceId: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeExpressionResponseDataElementsFaceRectangle extends $tea.Model {
    height: number;
    left: number;
    top: number;
    width: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeExpressionResponseDataElements extends $tea.Model {
    expression: string;
    faceProbability: number;
    faceRectangle: RecognizeExpressionResponseDataElementsFaceRectangle;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeExpressionResponseData extends $tea.Model {
    elements: RecognizeExpressionResponseDataElements[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceRequestTask extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceResponseDataElementsResultsSubResultsFaces extends $tea.Model {
    id: string;
    name: string;
    rate: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceResponseDataElementsResultsSubResults extends $tea.Model {
    h: number;
    w: number;
    x: number;
    y: number;
    faces: RecognizePublicFaceResponseDataElementsResultsSubResultsFaces[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceResponseDataElementsResults extends $tea.Model {
    label: string;
    suggestion: string;
    rate: number;
    subResults: RecognizePublicFaceResponseDataElementsResultsSubResults[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceResponseDataElements extends $tea.Model {
    taskId: string;
    imageURL: string;
    results: RecognizePublicFaceResponseDataElementsResults[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizePublicFaceResponseData extends $tea.Model {
    elements: RecognizePublicFaceResponseDataElements[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceRequestTasks extends $tea.Model {
    imageURL: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceResponseDataElementsResultsFrames extends $tea.Model {
    rate: number;
    url: string;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceResponseDataElementsResults extends $tea.Model {
    label: string;
    suggestion: string;
    rate: number;
    frames: DetectLivingFaceResponseDataElementsResultsFrames[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceResponseDataElements extends $tea.Model {
    taskId: string;
    imageURL: string;
    results: DetectLivingFaceResponseDataElementsResults[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectLivingFaceResponseData extends $tea.Model {
    elements: DetectLivingFaceResponseDataElements[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectBodyCountResponseData extends $tea.Model {
    personNumber: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectMaskResponseData extends $tea.Model {
    mask: number;
    faceProbability: number;
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class RecognizeFaceResponseData extends $tea.Model {
    faceCount: number;
    landmarkCount: number;
    denseFeatureLength: number;
    faceRectangles: number[];
    faceProbabilityList: number[];
    poseList: number[];
    landmarks: number[];
    pupils: number[];
    genderList: number[];
    ageList: number[];
    expressions: number[];
    glasses: number[];
    denseFeatures: string[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class CompareFaceResponseData extends $tea.Model {
    confidence: number;
    thresholds: number[];
    rectAList: number[];
    rectBList: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export declare class DetectFaceResponseData extends $tea.Model {
    faceCount: number;
    landmarkCount: number;
    faceRectangles: number[];
    faceProbabilityList: number[];
    poseList: number[];
    landmarks: number[];
    pupils: number[];
    static names(): {
        [key: string]: string;
    };
    static types(): {
        [key: string]: any;
    };
    constructor(map?: {
        [key: string]: any;
    });
}
export default class Client extends RPC {
    constructor(config: $RPC.Config);
    detectVideoLivingFace(request: DetectVideoLivingFaceRequest, runtime: $Util.RuntimeOptions): Promise<DetectVideoLivingFaceResponse>;
    detectVideoLivingFaceAdvance(request: DetectVideoLivingFaceAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<DetectVideoLivingFaceResponse>;
    swapFacialFeatures(request: SwapFacialFeaturesRequest, runtime: $Util.RuntimeOptions): Promise<SwapFacialFeaturesResponse>;
    swapFacialFeaturesAdvance(request: SwapFacialFeaturesAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<SwapFacialFeaturesResponse>;
    addFaceEntity(request: AddFaceEntityRequest, runtime: $Util.RuntimeOptions): Promise<AddFaceEntityResponse>;
    deleteFaceEntity(request: DeleteFaceEntityRequest, runtime: $Util.RuntimeOptions): Promise<DeleteFaceEntityResponse>;
    listFaceEntities(request: ListFaceEntitiesRequest, runtime: $Util.RuntimeOptions): Promise<ListFaceEntitiesResponse>;
    getFaceEntity(request: GetFaceEntityRequest, runtime: $Util.RuntimeOptions): Promise<GetFaceEntityResponse>;
    updateFaceEntity(request: UpdateFaceEntityRequest, runtime: $Util.RuntimeOptions): Promise<UpdateFaceEntityResponse>;
    faceMakeup(request: FaceMakeupRequest, runtime: $Util.RuntimeOptions): Promise<FaceMakeupResponse>;
    faceMakeupAdvance(request: FaceMakeupAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<FaceMakeupResponse>;
    handPosture(request: HandPostureRequest, runtime: $Util.RuntimeOptions): Promise<HandPostureResponse>;
    handPostureAdvance(request: HandPostureAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<HandPostureResponse>;
    bodyPosture(request: BodyPostureRequest, runtime: $Util.RuntimeOptions): Promise<BodyPostureResponse>;
    bodyPostureAdvance(request: BodyPostureAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<BodyPostureResponse>;
    detectPedestrian(request: DetectPedestrianRequest, runtime: $Util.RuntimeOptions): Promise<DetectPedestrianResponse>;
    detectPedestrianAdvance(request: DetectPedestrianAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<DetectPedestrianResponse>;
    faceBeauty(request: FaceBeautyRequest, runtime: $Util.RuntimeOptions): Promise<FaceBeautyResponse>;
    faceBeautyAdvance(request: FaceBeautyAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<FaceBeautyResponse>;
    faceFilter(request: FaceFilterRequest, runtime: $Util.RuntimeOptions): Promise<FaceFilterResponse>;
    faceFilterAdvance(request: FaceFilterAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<FaceFilterResponse>;
    enhanceFace(request: EnhanceFaceRequest, runtime: $Util.RuntimeOptions): Promise<EnhanceFaceResponse>;
    enhanceFaceAdvance(request: EnhanceFaceAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<EnhanceFaceResponse>;
    faceTidyup(request: FaceTidyupRequest, runtime: $Util.RuntimeOptions): Promise<FaceTidyupResponse>;
    faceTidyupAdvance(request: FaceTidyupAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<FaceTidyupResponse>;
    searchFace(request: SearchFaceRequest, runtime: $Util.RuntimeOptions): Promise<SearchFaceResponse>;
    searchFaceAdvance(request: SearchFaceAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<SearchFaceResponse>;
    listFaceDbs(request: ListFaceDbsRequest, runtime: $Util.RuntimeOptions): Promise<ListFaceDbsResponse>;
    createFaceDb(request: CreateFaceDbRequest, runtime: $Util.RuntimeOptions): Promise<CreateFaceDbResponse>;
    deleteFace(request: DeleteFaceRequest, runtime: $Util.RuntimeOptions): Promise<DeleteFaceResponse>;
    deleteFaceDb(request: DeleteFaceDbRequest, runtime: $Util.RuntimeOptions): Promise<DeleteFaceDbResponse>;
    addFace(request: AddFaceRequest, runtime: $Util.RuntimeOptions): Promise<AddFaceResponse>;
    addFaceAdvance(request: AddFaceAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<AddFaceResponse>;
    recognizeExpression(request: RecognizeExpressionRequest, runtime: $Util.RuntimeOptions): Promise<RecognizeExpressionResponse>;
    recognizeExpressionAdvance(request: RecognizeExpressionAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<RecognizeExpressionResponse>;
    recognizePublicFace(request: RecognizePublicFaceRequest, runtime: $Util.RuntimeOptions): Promise<RecognizePublicFaceResponse>;
    detectLivingFace(request: DetectLivingFaceRequest, runtime: $Util.RuntimeOptions): Promise<DetectLivingFaceResponse>;
    detectBodyCount(request: DetectBodyCountRequest, runtime: $Util.RuntimeOptions): Promise<DetectBodyCountResponse>;
    detectBodyCountAdvance(request: DetectBodyCountAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<DetectBodyCountResponse>;
    detectMask(request: DetectMaskRequest, runtime: $Util.RuntimeOptions): Promise<DetectMaskResponse>;
    detectMaskAdvance(request: DetectMaskAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<DetectMaskResponse>;
    recognizeFace(request: RecognizeFaceRequest, runtime: $Util.RuntimeOptions): Promise<RecognizeFaceResponse>;
    recognizeFaceAdvance(request: RecognizeFaceAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<RecognizeFaceResponse>;
    compareFace(request: CompareFaceRequest, runtime: $Util.RuntimeOptions): Promise<CompareFaceResponse>;
    detectFace(request: DetectFaceRequest, runtime: $Util.RuntimeOptions): Promise<DetectFaceResponse>;
    detectFaceAdvance(request: DetectFaceAdvanceRequest, runtime: $Util.RuntimeOptions): Promise<DetectFaceResponse>;
    getEndpoint(productId: string, regionId: string, endpointRule: string, network: string, suffix: string, endpointMap: {
        [key: string]: string;
    }, endpoint: string): string;
}
