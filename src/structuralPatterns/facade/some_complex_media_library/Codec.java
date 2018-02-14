package structuralPatterns.facade.some_complex_media_library;

import java.io.File;

public interface Codec {
    File compress(VideoFile videoFile);
}
