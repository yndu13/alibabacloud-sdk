<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Bss;

use AlibabaCloud\Tea\Model;

class SetResourceBusinessStatusRequest extends Model{
    protected $_name = [
        'accessKeyId' => 'AccessKeyId',
        'ownerId' => 'OwnerId',
        'resourceOwnerAccount' => 'ResourceOwnerAccount',
        'resourceOwnerId' => 'ResourceOwnerId',
        'resourceType' => 'ResourceType',
        'resourceId' => 'ResourceId',
        'businessStatus' => 'BusinessStatus',
        'ownerAccount' => 'OwnerAccount',
    ];
    public function validate() {
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('businessStatus', $this->businessStatus, true);
    }
    public function toMap() {
        $res = [];
        $res['AccessKeyId'] = $this->accessKeyId;
        $res['OwnerId'] = $this->ownerId;
        $res['ResourceOwnerAccount'] = $this->resourceOwnerAccount;
        $res['ResourceOwnerId'] = $this->resourceOwnerId;
        $res['ResourceType'] = $this->resourceType;
        $res['ResourceId'] = $this->resourceId;
        $res['BusinessStatus'] = $this->businessStatus;
        $res['OwnerAccount'] = $this->ownerAccount;
        return $res;
    }
    /**
     * @param array $map
     * @return SetResourceBusinessStatusRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['AccessKeyId'])){
            $model->accessKeyId = $map['AccessKeyId'];
        }
        if(isset($map['OwnerId'])){
            $model->ownerId = $map['OwnerId'];
        }
        if(isset($map['ResourceOwnerAccount'])){
            $model->resourceOwnerAccount = $map['ResourceOwnerAccount'];
        }
        if(isset($map['ResourceOwnerId'])){
            $model->resourceOwnerId = $map['ResourceOwnerId'];
        }
        if(isset($map['ResourceType'])){
            $model->resourceType = $map['ResourceType'];
        }
        if(isset($map['ResourceId'])){
            $model->resourceId = $map['ResourceId'];
        }
        if(isset($map['BusinessStatus'])){
            $model->businessStatus = $map['BusinessStatus'];
        }
        if(isset($map['OwnerAccount'])){
            $model->ownerAccount = $map['OwnerAccount'];
        }
        return $model;
    }
    /**
     * @description appKey
     * @var string
     */
    public $accessKeyId;
    /**
     * @description ownerId
     * @var integer
     */
    public $ownerId;
    /**
     * @description resourceOwnerAccount
     * @var string
     */
    public $resourceOwnerAccount;
    /**
     * @description resourceOwnerId
     * @var integer
     */
    public $resourceOwnerId;
    /**
     * @description resourceType
     * @var string
     */
    public $resourceType;
    /**
     * @description resourceId
     * @var string
     */
    public $resourceId;
    /**
     * @description businessStatus
     * @var string
     */
    public $businessStatus;
    /**
     * @description ownerAccount
     * @var string
     */
    public $ownerAccount;
}
