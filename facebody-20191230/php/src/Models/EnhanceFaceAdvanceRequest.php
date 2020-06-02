<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\facebody\V20191230\Models;

use AlibabaCloud\Tea\Model;

class EnhanceFaceAdvanceRequest extends Model {
    protected $_name = [
        'imageURLObject' => 'ImageURLObject',
    ];
    public function validate() {
        Model::validateRequired('imageURLObject', $this->imageURLObject, true);
    }
    public function toMap() {
        $res = [];
        $res['ImageURLObject'] = $this->imageURLObject;
        return $res;
    }
    /**
     * @param array $map
     * @return EnhanceFaceAdvanceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ImageURLObject'])){
            $model->imageURLObject = $map['ImageURLObject'];
        }
        return $model;
    }
    /**
     * @description ImageURLObject
     * @var Stream
     */
    public $imageURLObject;

}
