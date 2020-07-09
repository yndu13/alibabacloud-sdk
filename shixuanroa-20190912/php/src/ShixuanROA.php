<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\ShixuanROA\V20190912;

use AlibabaCloud\Endpoint\Endpoint;
use AlibabaCloud\SDK\ShixuanROA\V20190912\Models\CreateClusterBakRequest;
use AlibabaCloud\SDK\ShixuanROA\V20190912\Models\CreateClusterBakResponse;
use AlibabaCloud\Tea\Roa\Roa;
use AlibabaCloud\Tea\Utils\Utils;
use AlibabaCloud\Tea\Utils\Utils\RuntimeOptions;

class ShixuanROA extends Roa
{
    public function __construct($config)
    {
        parent::__construct($config);
        $this->_endpointRule = '';
        $this->checkConfig($config);
        $this->_endpointHost = $this->getEndpoint('shixuanroa', $this->_regionId, $this->_endpointRule, $this->_network, $this->_suffix, $this->_endpointMap, $this->_endpointHost);
    }

    /**
     * @param string $productId
     * @param string $regionId
     * @param string $endpointRule
     * @param string $network
     * @param string $suffix
     * @param array  $endpointMap
     * @param string $endpoint
     *
     * @throws \Exception
     *
     * @return string
     */
    public function getEndpoint($productId, $regionId, $endpointRule, $network, $suffix, $endpointMap, $endpoint)
    {
        if (!Utils::empty_($endpoint)) {
            return $endpoint;
        }
        if (!Utils::isUnset($endpointMap) && !Utils::empty_($endpointMap['regionId'])) {
            return $endpointMap['regionId'];
        }

        return Endpoint::getEndpointRules($productId, $regionId, $endpointRule, $network, $suffix);
    }

    /**
     * CreateClusterBakCreateClusterBak.
     *
     * @throws \Exception
     *
     * @return CreateClusterBakResponse
     */
    public function CreateClusterBak(CreateClusterBakRequest $request)
    {
        $runtime = new RuntimeOptions([]);

        return $this->CreateClusterBakWithOptions($request, $runtime);
    }

    /**
     * @throws \Exception
     *
     * @return CreateClusterBakResponse
     */
    public function CreateClusterBakWithOptions(CreateClusterBakRequest $request, RuntimeOptions $runtime)
    {
        Utils::validateModel($request);

        return CreateClusterBakResponse::fromMap($this->doRequest('2019-09-12', 'https', 'get', 'Anonymous', '/', $request->headers, null, $request->body, $runtime));
    }
}
