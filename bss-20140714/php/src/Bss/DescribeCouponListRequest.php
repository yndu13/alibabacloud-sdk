<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Bss\V20140714\Bss;

use AlibabaCloud\Tea\Model;

class DescribeCouponListRequest extends Model{
    protected $_name = [
        'status' => 'Status',
        'startDeliveryTime' => 'StartDeliveryTime',
        'endDeliveryTime' => 'EndDeliveryTime',
        'pageSize' => 'PageSize',
        'pageNum' => 'PageNum',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        $res['Status'] = $this->status;
        $res['StartDeliveryTime'] = $this->startDeliveryTime;
        $res['EndDeliveryTime'] = $this->endDeliveryTime;
        $res['PageSize'] = $this->pageSize;
        $res['PageNum'] = $this->pageNum;
        return $res;
    }
    /**
     * @param array $map
     * @return DescribeCouponListRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['Status'])){
            $model->status = $map['Status'];
        }
        if(isset($map['StartDeliveryTime'])){
            $model->startDeliveryTime = $map['StartDeliveryTime'];
        }
        if(isset($map['EndDeliveryTime'])){
            $model->endDeliveryTime = $map['EndDeliveryTime'];
        }
        if(isset($map['PageSize'])){
            $model->pageSize = $map['PageSize'];
        }
        if(isset($map['PageNum'])){
            $model->pageNum = $map['PageNum'];
        }
        return $model;
    }
    /**
     * @description status
     * @var string
     */
    public $status;

    /**
     * @description startDeliveryTime
     * @var string
     */
    public $startDeliveryTime;

    /**
     * @description endDeliveryTime
     * @var string
     */
    public $endDeliveryTime;

    /**
     * @description pageSize
     * @var integer
     */
    public $pageSize;

    /**
     * @description pageNum
     * @var integer
     */
    public $pageNum;

}
