// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetUploadProgressResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("UploadProgress")]
        [Validation(Required=true)]
        public GetUploadProgressResponseUploadProgress UploadProgress { get; set; }
        public class GetUploadProgressResponseUploadProgress : TeaModel {
            [NameInMap("UploadProgressList")]
            [Validation(Required=true)]
            public List<GetUploadProgressResponseUploadProgressUploadProgressList> UploadProgressList { get; set; }
            public class GetUploadProgressResponseUploadProgressUploadProgressList : TeaModel {
                    public string Source { get; set; }
                    public string ClientId { get; set; }
                    public string BusinessType { get; set; }
                    public string TerminalType { get; set; }
                    public string DeviceModel { get; set; }
                    public string AppVersion { get; set; }
                    public string AuthTimestamp { get; set; }
                    public string AuthInfo { get; set; }
                    public string FileName { get; set; }
                    public long FileSize { get; set; }
                    public string FileCreateTime { get; set; }
                    public string FileHash { get; set; }
                    public float? UploadSpeed { get; set; }
                    public float? UploadRatio { get; set; }
                    public string UploadId { get; set; }
                    public int? DonePartsCount { get; set; }
                    public string TotalPart { get; set; }
                    public long PartSize { get; set; }
                    public string UploadPoint { get; set; }
                    public string UploadAddress { get; set; }
                    public string VideoId { get; set; }
            }
        };

    }

}
