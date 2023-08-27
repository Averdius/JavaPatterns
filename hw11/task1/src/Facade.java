public class Facade {
    public VideoFile convertVideo(String fileName, String format) {
        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec = format.equals("mp4") ? new MPEG4CompressionCodec() : new OggCompressionCodec();

        Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile videoFileConverted = BitrateReader.convert(buffer, videoFile.getName(), destinationCodec);

        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(videoFileConverted, videoFile.getAudioBuffer());

        return videoFileConverted;
    }
}