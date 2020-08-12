<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\ImageSearch\V20180319\Models\SearchItemResponseBody\auctions;

use AlibabaCloud\Tea\Model;

class auction extends Model
{
    /**
     * @var string
     */
    public $custContent;

    /**
     * @var string
     */
    public $itemId;

    /**
     * @var string
     */
    public $sortExprValues;

    /**
     * @var string
     */
    public $catId;

    /**
     * @var string
     */
    public $picName;
    protected $_name = [
        'custContent'    => 'CustContent',
        'itemId'         => 'ItemId',
        'sortExprValues' => 'SortExprValues',
        'catId'          => 'CatId',
        'picName'        => 'PicName',
    ];

    public function validate()
    {
        Model::validateRequired('custContent', $this->custContent, true);
        Model::validateRequired('itemId', $this->itemId, true);
        Model::validateRequired('sortExprValues', $this->sortExprValues, true);
        Model::validateRequired('catId', $this->catId, true);
        Model::validateRequired('picName', $this->picName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->custContent) {
            $res['CustContent'] = $this->custContent;
        }
        if (null !== $this->itemId) {
            $res['ItemId'] = $this->itemId;
        }
        if (null !== $this->sortExprValues) {
            $res['SortExprValues'] = $this->sortExprValues;
        }
        if (null !== $this->catId) {
            $res['CatId'] = $this->catId;
        }
        if (null !== $this->picName) {
            $res['PicName'] = $this->picName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return auction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['CustContent'])) {
            $model->custContent = $map['CustContent'];
        }
        if (isset($map['ItemId'])) {
            $model->itemId = $map['ItemId'];
        }
        if (isset($map['SortExprValues'])) {
            $model->sortExprValues = $map['SortExprValues'];
        }
        if (isset($map['CatId'])) {
            $model->catId = $map['CatId'];
        }
        if (isset($map['PicName'])) {
            $model->picName = $map['PicName'];
        }

        return $model;
    }
}
