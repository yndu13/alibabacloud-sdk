// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class SearchVideoResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("ScrollToken")]
        [Validation(Required=true)]
        public string ScrollToken { get; set; }

        [NameInMap("Total")]
        [Validation(Required=true)]
        public int? Total { get; set; }

        [NameInMap("VideoList")]
        [Validation(Required=true)]
        public SearchVideoResponseVideoList VideoList { get; set; }
        public class SearchVideoResponseVideoList : TeaModel {
            [NameInMap("Video")]
            [Validation(Required=true)]
            public List<SearchVideoResponseVideoListVideo> Video { get; set; }
            public class SearchVideoResponseVideoListVideo : TeaModel {
                    public string VideoId { get; set; }
                    public string Source { get; set; }
                    public string MediaType { get; set; }
                    public string Title { get; set; }
                    public string Tags { get; set; }
                    public string Status { get; set; }
                    public long Size { get; set; }
                    public float? Duration { get; set; }
                    public string Description { get; set; }
                    public long CustomerId { get; set; }
                    public string CreateTime { get; set; }
                    public string ModifyTime { get; set; }
                    public string ModificationTime { get; set; }
                    public string CreationTime { get; set; }
                    public string CoverURL { get; set; }
                    public int? CateId { get; set; }
                    public string CateName { get; set; }
                    public string DownloadSwitch { get; set; }
                    public string PreprocessStatus { get; set; }
                    public string StorageLocation { get; set; }
                    public string RegionId { get; set; }
                    public SearchVideoResponseVideoListVideoPlayInfoList PlayInfoList { get; set; }
                    public class SearchVideoResponseVideoListVideoPlayInfoList : TeaModel {
                        [NameInMap("PlayInfo")]
                        [Validation(Required=true)]
                        public List<SearchVideoResponseVideoListVideoPlayInfoListPlayInfo> PlayInfo { get; set; }
                        public class SearchVideoResponseVideoListVideoPlayInfoListPlayInfo : TeaModel {
                            [NameInMap("Width")]
                            [Validation(Required=true)]
                            public long Width { get; set; }

                            [NameInMap("Height")]
                            [Validation(Required=true)]
                            public long Height { get; set; }

                            [NameInMap("Size")]
                            [Validation(Required=true)]
                            public long Size { get; set; }

                            [NameInMap("PlayURL")]
                            [Validation(Required=true)]
                            public string PlayURL { get; set; }

                            [NameInMap("Bitrate")]
                            [Validation(Required=true)]
                            public string Bitrate { get; set; }

                            [NameInMap("Definition")]
                            [Validation(Required=true)]
                            public string Definition { get; set; }

                            [NameInMap("Duration")]
                            [Validation(Required=true)]
                            public string Duration { get; set; }

                            [NameInMap("Format")]
                            [Validation(Required=true)]
                            public string Format { get; set; }

                            [NameInMap("Fps")]
                            [Validation(Required=true)]
                            public string Fps { get; set; }

                            [NameInMap("Encrypt")]
                            [Validation(Required=true)]
                            public long Encrypt { get; set; }

                            [NameInMap("Plaintext")]
                            [Validation(Required=true)]
                            public string Plaintext { get; set; }

                            [NameInMap("Complexity")]
                            [Validation(Required=true)]
                            public string Complexity { get; set; }

                            [NameInMap("StreamType")]
                            [Validation(Required=true)]
                            public string StreamType { get; set; }

                            [NameInMap("Rand")]
                            [Validation(Required=true)]
                            public string Rand { get; set; }

                            [NameInMap("JobId")]
                            [Validation(Required=true)]
                            public string JobId { get; set; }

                        }

                    }
                    public SearchVideoResponseVideoListVideoSnapshots Snapshots { get; set; }
                    public class SearchVideoResponseVideoListVideoSnapshots : TeaModel {
                        [NameInMap("Snapshot")]
                        [Validation(Required=true)]
                        public List<string> Snapshot { get; set; }

                    }
                    public SearchVideoResponseVideoListVideoSpriteSnapshots SpriteSnapshots { get; set; }
                    public class SearchVideoResponseVideoListVideoSpriteSnapshots : TeaModel {
                        [NameInMap("SpriteSnapshot")]
                        [Validation(Required=true)]
                        public List<string> SpriteSnapshot { get; set; }

                    }
            }
        };

    }

}
