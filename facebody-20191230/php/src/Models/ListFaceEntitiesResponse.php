<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\facebody\V20191230\Models;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\facebody\V20191230\Models\ListFaceEntitiesResponse\data;

class ListFaceEntitiesResponse extends Model {
    protected $_name = [
        'requestId' => 'RequestId',
        'data' => 'Data',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('data', $this->data, true);
    }
    public function toMap() {
        $res = [];
        $res['RequestId'] = $this->requestId;
        $res['Data'] = null !== $this->data ? $this->data->toMap() : null;
        return $res;
    }
    /**
     * @param array $map
     * @return ListFaceEntitiesResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['RequestId'])){
            $model->requestId = $map['RequestId'];
        }
        if(isset($map['Data'])){
            $model->data = data::fromMap($map['Data']);
        }
        return $model;
    }
    /**
     * @description requestId
     * @var string
     */
    public $requestId;

    /**
     * @description data
     * @var ListFaceEntitiesResponse.data
     */
    public $data;

}
