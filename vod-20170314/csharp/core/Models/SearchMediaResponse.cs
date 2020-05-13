// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SearchMediaResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("ScrollToken")]
        [Validation(Required=true)]
        public string ScrollToken { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public long Total { get; set; }

        [NameInMap("MediaList")]
        [Validation(Required=true)]
        public List<SearchMediaResponseMediaList> MediaList { get; set; }
        public class SearchMediaResponseMediaList : TeaModel {
            [NameInMap("MediaType")]
            [Validation(Required=true)]
            public string MediaType { get; set; }

            [NameInMap("CreationTime")]
            [Validation(Required=true)]
            public string CreationTime { get; set; }

            [NameInMap("MediaId")]
            [Validation(Required=true)]
            public string MediaId { get; set; }

            [NameInMap("Video")]
            [Validation(Required=true)]
            public SearchMediaResponseMediaListVideo Video { get; set; }
            public class SearchMediaResponseMediaListVideo : TeaModel {
                [NameInMap("VideoId")]
                [Validation(Required=true)]
                public string VideoId { get; set; }
                [NameInMap("MediaSource")]
                [Validation(Required=true)]
                public string MediaSource { get; set; }
                [NameInMap("MediaType")]
                [Validation(Required=true)]
                public string MediaType { get; set; }
                [NameInMap("Title")]
                [Validation(Required=true)]
                public string Title { get; set; }
                [NameInMap("Tags")]
                [Validation(Required=true)]
                public string Tags { get; set; }
                [NameInMap("Status")]
                [Validation(Required=true)]
                public string Status { get; set; }
                [NameInMap("Size")]
                [Validation(Required=true)]
                public long Size { get; set; }
                [NameInMap("Duration")]
                [Validation(Required=true)]
                public float? Duration { get; set; }
                [NameInMap("Description")]
                [Validation(Required=true)]
                public string Description { get; set; }
                [NameInMap("ModificationTime")]
                [Validation(Required=true)]
                public string ModificationTime { get; set; }
                [NameInMap("CreationTime")]
                [Validation(Required=true)]
                public string CreationTime { get; set; }
                [NameInMap("CoverURL")]
                [Validation(Required=true)]
                public string CoverURL { get; set; }
                [NameInMap("CateId")]
                [Validation(Required=true)]
                public long CateId { get; set; }
                [NameInMap("CateName")]
                [Validation(Required=true)]
                public string CateName { get; set; }
                [NameInMap("DownloadSwitch")]
                [Validation(Required=true)]
                public string DownloadSwitch { get; set; }
                [NameInMap("PreprocessStatus")]
                [Validation(Required=true)]
                public string PreprocessStatus { get; set; }
                [NameInMap("StorageLocation")]
                [Validation(Required=true)]
                public string StorageLocation { get; set; }
                [NameInMap("RegionId")]
                [Validation(Required=true)]
                public string RegionId { get; set; }
                [NameInMap("TranscodeMode")]
                [Validation(Required=true)]
                public string TranscodeMode { get; set; }
                [NameInMap("AuditStatus")]
                [Validation(Required=true)]
                public string AuditStatus { get; set; }
                [NameInMap("AuditAIStatus")]
                [Validation(Required=true)]
                public string AuditAIStatus { get; set; }
                [NameInMap("AuditManualStatus")]
                [Validation(Required=true)]
                public string AuditManualStatus { get; set; }
                [NameInMap("AuditAIResult")]
                [Validation(Required=true)]
                public string AuditAIResult { get; set; }
                [NameInMap("AuditTemplateId")]
                [Validation(Required=true)]
                public string AuditTemplateId { get; set; }
                [NameInMap("CustomMediaInfo")]
                [Validation(Required=true)]
                public string CustomMediaInfo { get; set; }
                [NameInMap("PlayInfoList")]
                [Validation(Required=true)]
                public List<SearchMediaResponseMediaListVideoPlayInfoList> PlayInfoList { get; set; }
                public class SearchMediaResponseMediaListVideoPlayInfoList : TeaModel {
                        public long Width { get; set; }
                        public long Height { get; set; }
                        public long Size { get; set; }
                        public string PlayURL { get; set; }
                        public string Bitrate { get; set; }
                        public string Definition { get; set; }
                        public string Duration { get; set; }
                        public string Format { get; set; }
                        public string Fps { get; set; }
                        public long Encrypt { get; set; }
                        public string Plaintext { get; set; }
                        public string Complexity { get; set; }
                        public string StreamType { get; set; }
                        public string Rand { get; set; }
                        public string JobId { get; set; }
                }
                [NameInMap("Snapshots")]
                [Validation(Required=true)]
                public List<string> Snapshots { get; set; }
                [NameInMap("SpriteSnapshots")]
                [Validation(Required=true)]
                public List<string> SpriteSnapshots { get; set; }
            };

            [NameInMap("Audio")]
            [Validation(Required=true)]
            public SearchMediaResponseMediaListAudio Audio { get; set; }
            public class SearchMediaResponseMediaListAudio : TeaModel {
                [NameInMap("AudioId")]
                [Validation(Required=true)]
                public string AudioId { get; set; }
                [NameInMap("MediaSource")]
                [Validation(Required=true)]
                public string MediaSource { get; set; }
                [NameInMap("Title")]
                [Validation(Required=true)]
                public string Title { get; set; }
                [NameInMap("Tags")]
                [Validation(Required=true)]
                public string Tags { get; set; }
                [NameInMap("Status")]
                [Validation(Required=true)]
                public string Status { get; set; }
                [NameInMap("Size")]
                [Validation(Required=true)]
                public long Size { get; set; }
                [NameInMap("Duration")]
                [Validation(Required=true)]
                public float? Duration { get; set; }
                [NameInMap("Description")]
                [Validation(Required=true)]
                public string Description { get; set; }
                [NameInMap("ModificationTime")]
                [Validation(Required=true)]
                public string ModificationTime { get; set; }
                [NameInMap("CreationTime")]
                [Validation(Required=true)]
                public string CreationTime { get; set; }
                [NameInMap("CoverURL")]
                [Validation(Required=true)]
                public string CoverURL { get; set; }
                [NameInMap("CateId")]
                [Validation(Required=true)]
                public long CateId { get; set; }
                [NameInMap("CateName")]
                [Validation(Required=true)]
                public string CateName { get; set; }
                [NameInMap("DownloadSwitch")]
                [Validation(Required=true)]
                public string DownloadSwitch { get; set; }
                [NameInMap("PreprocessStatus")]
                [Validation(Required=true)]
                public string PreprocessStatus { get; set; }
                [NameInMap("StorageLocation")]
                [Validation(Required=true)]
                public string StorageLocation { get; set; }
                [NameInMap("RegionId")]
                [Validation(Required=true)]
                public string RegionId { get; set; }
                [NameInMap("TranscodeMode")]
                [Validation(Required=true)]
                public string TranscodeMode { get; set; }
                [NameInMap("AuditStatus")]
                [Validation(Required=true)]
                public string AuditStatus { get; set; }
                [NameInMap("AuditAIStatus")]
                [Validation(Required=true)]
                public string AuditAIStatus { get; set; }
                [NameInMap("AuditManualStatus")]
                [Validation(Required=true)]
                public string AuditManualStatus { get; set; }
                [NameInMap("AuditAIResult")]
                [Validation(Required=true)]
                public string AuditAIResult { get; set; }
                [NameInMap("AuditTemplateId")]
                [Validation(Required=true)]
                public string AuditTemplateId { get; set; }
                [NameInMap("CustomMediaInfo")]
                [Validation(Required=true)]
                public string CustomMediaInfo { get; set; }
                [NameInMap("PlayInfoList")]
                [Validation(Required=true)]
                public List<SearchMediaResponseMediaListAudioPlayInfoList> PlayInfoList { get; set; }
                public class SearchMediaResponseMediaListAudioPlayInfoList : TeaModel {
                        public long Width { get; set; }
                        public long Height { get; set; }
                        public long Size { get; set; }
                        public string PlayURL { get; set; }
                        public string Bitrate { get; set; }
                        public string Definition { get; set; }
                        public string Duration { get; set; }
                        public string Format { get; set; }
                        public string Fps { get; set; }
                        public long Encrypt { get; set; }
                        public string Plaintext { get; set; }
                        public string Complexity { get; set; }
                        public string StreamType { get; set; }
                        public string Rand { get; set; }
                        public string JobId { get; set; }
                }
                [NameInMap("Snapshots")]
                [Validation(Required=true)]
                public List<string> Snapshots { get; set; }
                [NameInMap("SpriteSnapshots")]
                [Validation(Required=true)]
                public List<string> SpriteSnapshots { get; set; }
            };

            [NameInMap("Image")]
            [Validation(Required=true)]
            public SearchMediaResponseMediaListImage Image { get; set; }
            public class SearchMediaResponseMediaListImage : TeaModel {
                [NameInMap("Title")]
                [Validation(Required=true)]
                public string Title { get; set; }
                [NameInMap("ImageId")]
                [Validation(Required=true)]
                public string ImageId { get; set; }
                [NameInMap("CateId")]
                [Validation(Required=true)]
                public long CateId { get; set; }
                [NameInMap("CateName")]
                [Validation(Required=true)]
                public string CateName { get; set; }
                [NameInMap("Ext")]
                [Validation(Required=true)]
                public string Ext { get; set; }
                [NameInMap("CreationTime")]
                [Validation(Required=true)]
                public string CreationTime { get; set; }
                [NameInMap("ModificationTime")]
                [Validation(Required=true)]
                public string ModificationTime { get; set; }
                [NameInMap("Tags")]
                [Validation(Required=true)]
                public string Tags { get; set; }
                [NameInMap("Type")]
                [Validation(Required=true)]
                public string Type { get; set; }
                [NameInMap("URL")]
                [Validation(Required=true)]
                public string URL { get; set; }
                [NameInMap("Status")]
                [Validation(Required=true)]
                public string Status { get; set; }
                [NameInMap("Description")]
                [Validation(Required=true)]
                public string Description { get; set; }
                [NameInMap("StorageLocation")]
                [Validation(Required=true)]
                public string StorageLocation { get; set; }
                [NameInMap("RegionId")]
                [Validation(Required=true)]
                public string RegionId { get; set; }
            };

        }

    }

}
