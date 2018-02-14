package structuralPatterns.facade.some_complex_media_library;

import java.io.File;

public class OggCompressionCodec implements Codec {
    private AudioMixer audioMixer;

    public File compress(VideoFile videoFile) {
        //...
        //use audioMixer
        //...
        return new File("");
    }
}
