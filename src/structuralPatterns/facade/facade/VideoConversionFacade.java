package structuralPatterns.facade.facade;

import structuralPatterns.facade.model.VideoFormat;
import structuralPatterns.facade.some_complex_media_library.Codec;
import structuralPatterns.facade.some_complex_media_library.MPEG4CompressionCodec;
import structuralPatterns.facade.some_complex_media_library.OggCompressionCodec;
import structuralPatterns.facade.some_complex_media_library.VideoFile;

import java.io.File;


public class VideoConversionFacade {
    public File convertVideo(String fileName, VideoFormat format) {
        VideoFile file = new VideoFile(fileName);

        Codec destinationCodec;
        switch (format){
            case Mp4:
                destinationCodec = new MPEG4CompressionCodec();
                break;
            case Ogg:
                destinationCodec = new OggCompressionCodec();
                break;
            default:
                throw new RuntimeException("format should be defined");
        }

        return destinationCodec.compress(file);
    }
}
