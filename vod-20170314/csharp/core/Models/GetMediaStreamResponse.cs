// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.vod20170314.Models
{
    public class GetMediaStreamResponse : TeaModel {
        [NameInMap("RequestId")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        [NameInMap("StreamInfo")]
        [Validation(Required=true)]
        public GetMediaStreamResponseStreamInfo StreamInfo { get; set; }
        public class GetMediaStreamResponseStreamInfo : TeaModel {
            [NameInMap("VideoId")]
            [Validation(Required=true)]
            public string VideoId { get; set; }
            [NameInMap("FileType")]
            [Validation(Required=true)]
            public string FileType { get; set; }
            [NameInMap("AudioStream")]
            [Validation(Required=true)]
            public GetMediaStreamResponseStreamInfoAudioStream AudioStream { get; set; }
            public class GetMediaStreamResponseStreamInfoAudioStream : TeaModel {
                [NameInMap("Index")]
                [Validation(Required=true)]
                public string Index { get; set; }

                [NameInMap("CodecName")]
                [Validation(Required=true)]
                public string CodecName { get; set; }

                [NameInMap("CodecLongName")]
                [Validation(Required=true)]
                public string CodecLongName { get; set; }

                [NameInMap("CodecTimeBase")]
                [Validation(Required=true)]
                public string CodecTimeBase { get; set; }

                [NameInMap("CodecTagString")]
                [Validation(Required=true)]
                public string CodecTagString { get; set; }

                [NameInMap("CodecTag")]
                [Validation(Required=true)]
                public string CodecTag { get; set; }

                [NameInMap("SampleFmt")]
                [Validation(Required=true)]
                public string SampleFmt { get; set; }

                [NameInMap("SampleRate")]
                [Validation(Required=true)]
                public string SampleRate { get; set; }

                [NameInMap("Channels")]
                [Validation(Required=true)]
                public string Channels { get; set; }

                [NameInMap("ChannelLayout")]
                [Validation(Required=true)]
                public string ChannelLayout { get; set; }

                [NameInMap("Timebase")]
                [Validation(Required=true)]
                public string Timebase { get; set; }

                [NameInMap("StartTime")]
                [Validation(Required=true)]
                public string StartTime { get; set; }

                [NameInMap("Duration")]
                [Validation(Required=true)]
                public string Duration { get; set; }

                [NameInMap("Bitrate")]
                [Validation(Required=true)]
                public string Bitrate { get; set; }

                [NameInMap("NumFrames")]
                [Validation(Required=true)]
                public string NumFrames { get; set; }

                [NameInMap("Lang")]
                [Validation(Required=true)]
                public string Lang { get; set; }

            }
            [NameInMap("VideoStream")]
            [Validation(Required=true)]
            public GetMediaStreamResponseStreamInfoVideoStream VideoStream { get; set; }
            public class GetMediaStreamResponseStreamInfoVideoStream : TeaModel {
                [NameInMap("Index")]
                [Validation(Required=true)]
                public string Index { get; set; }

                [NameInMap("CodecName")]
                [Validation(Required=true)]
                public string CodecName { get; set; }

                [NameInMap("CodecLongName")]
                [Validation(Required=true)]
                public string CodecLongName { get; set; }

                [NameInMap("Profile")]
                [Validation(Required=true)]
                public string Profile { get; set; }

                [NameInMap("CodecTimeBase")]
                [Validation(Required=true)]
                public string CodecTimeBase { get; set; }

                [NameInMap("CodecTagString")]
                [Validation(Required=true)]
                public string CodecTagString { get; set; }

                [NameInMap("CodecTag")]
                [Validation(Required=true)]
                public string CodecTag { get; set; }

                [NameInMap("Width")]
                [Validation(Required=true)]
                public string Width { get; set; }

                [NameInMap("Height")]
                [Validation(Required=true)]
                public string Height { get; set; }

                [NameInMap("HasBFrames")]
                [Validation(Required=true)]
                public string HasBFrames { get; set; }

                [NameInMap("Sar")]
                [Validation(Required=true)]
                public string Sar { get; set; }

                [NameInMap("Dar")]
                [Validation(Required=true)]
                public string Dar { get; set; }

                [NameInMap("PixFmt")]
                [Validation(Required=true)]
                public string PixFmt { get; set; }

                [NameInMap("Level")]
                [Validation(Required=true)]
                public string Level { get; set; }

                [NameInMap("Fps")]
                [Validation(Required=true)]
                public string Fps { get; set; }

                [NameInMap("AvgFPS")]
                [Validation(Required=true)]
                public string AvgFPS { get; set; }

                [NameInMap("Timebase")]
                [Validation(Required=true)]
                public string Timebase { get; set; }

                [NameInMap("StartTime")]
                [Validation(Required=true)]
                public string StartTime { get; set; }

                [NameInMap("Duration")]
                [Validation(Required=true)]
                public string Duration { get; set; }

                [NameInMap("NumFrames")]
                [Validation(Required=true)]
                public string NumFrames { get; set; }

                [NameInMap("Lang")]
                [Validation(Required=true)]
                public string Lang { get; set; }

            }
            [NameInMap("PlayInfo")]
            [Validation(Required=true)]
            public GetMediaStreamResponseStreamInfoPlayInfo PlayInfo { get; set; }
            public class GetMediaStreamResponseStreamInfoPlayInfo : TeaModel {
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

                [NameInMap("PreprocessStatus")]
                [Validation(Required=true)]
                public string PreprocessStatus { get; set; }

                [NameInMap("WatermarkId")]
                [Validation(Required=true)]
                public string WatermarkId { get; set; }

                [NameInMap("Status")]
                [Validation(Required=true)]
                public string Status { get; set; }

                [NameInMap("CreationTime")]
                [Validation(Required=true)]
                public string CreationTime { get; set; }

                [NameInMap("ModificationTime")]
                [Validation(Required=true)]
                public string ModificationTime { get; set; }

                [NameInMap("EncryptType")]
                [Validation(Required=true)]
                public string EncryptType { get; set; }

                [NameInMap("TemplateGroupId")]
                [Validation(Required=true)]
                public string TemplateGroupId { get; set; }

                [NameInMap("Source")]
                [Validation(Required=true)]
                public string Source { get; set; }

            }
        };

    }

}
