# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class CreateClusterBakBody(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class CreateClusterBakRequest(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = {}
        self.body = body

    def validate(self):
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = CreateClusterBakBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self


class CreateClusterBakResponseBody(TeaModel):
    def __init__(self, cluster_id=None, request_id=None, task_id=None):
        self.cluster_id = cluster_id
        self.request_id = request_id
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cluster_id'] = self.cluster_id
        result['request_id'] = self.request_id
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.cluster_id = map.get('cluster_id')
        self.request_id = map.get('request_id')
        self.task_id = map.get('task_id')
        return self


class CreateClusterBakResponse(TeaModel):
    def __init__(self, headers=None, body=None):
        self.headers = {}
        self.body = body

    def validate(self):
        self.validate_required(self.headers, 'headers')
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        result = {}
        result['headers'] = self.headers
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        return result

    def from_map(self, map={}):
        self.headers = map.get('headers')
        if map.get('body') is not None:
            temp_model = CreateClusterBakResponseBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        return self
