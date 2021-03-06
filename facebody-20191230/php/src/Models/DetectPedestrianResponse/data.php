<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Facebody\V20191230\Models\DetectPedestrianResponse;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\Facebody\V20191230\Models\DetectPedestrianResponse\data\elements;

class data extends Model {
    protected $_name = [
        'width' => 'Width',
        'height' => 'Height',
        'elements' => 'Elements',
    ];
    public function validate() {
        Model::validateRequired('width', $this->width, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('elements', $this->elements, true);
    }
    public function toMap() {
        $res = [];
        $res['Width'] = $this->width;
        $res['Height'] = $this->height;
        $res['Elements'] = [];
        if(null !== $this->elements && is_array($this->elements)){
            $n = 0;
            foreach($this->elements as $item){
                $res['Elements'][$n++] = null !== $item ? $item->toMap() : $item;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return data
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['Width'])){
            $model->width = $map['Width'];
        }
        if(isset($map['Height'])){
            $model->height = $map['Height'];
        }
        if(isset($map['Elements'])){
            if(!empty($map['Elements'])){
                $model->elements = [];
                $n = 0;
                foreach($map['Elements'] as $item) {
                    $model->elements[$n++] = null !== $item ? elements::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description width
     * @var integer
     */
    public $width;

    /**
     * @description height
     * @var integer
     */
    public $height;

    /**
     * @description elements
     * @var array
     */
    public $elements;

}
