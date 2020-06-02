<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\facebody\V20191230\Models;

use AlibabaCloud\Tea\Model;

class RecognizeFaceRequest extends Model {
    protected $_name = [
        'imageURL' => 'ImageURL',
    ];
    public function validate() {
        Model::validateRequired('imageURL', $this->imageURL, true);
    }
    public function toMap() {
        $res = [];
        $res['ImageURL'] = $this->imageURL;
        return $res;
    }
    /**
     * @param array $map
     * @return RecognizeFaceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ImageURL'])){
            $model->imageURL = $map['ImageURL'];
        }
        return $model;
    }
    /**
     * @description imageUrl
     * @var string
     */
    public $imageURL;

}
