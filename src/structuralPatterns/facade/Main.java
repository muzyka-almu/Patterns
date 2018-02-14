package structuralPatterns.facade;

import structuralPatterns.facade.facade.VideoConversionFacade;
import structuralPatterns.facade.model.VideoFormat;

import java.io.File;

public class Main {
    private static VideoConversionFacade videoConversionFacade = new VideoConversionFacade();

    public static void main(String ...args) {
        File file = videoConversionFacade.convertVideo("qweewq", VideoFormat.Mp4);
        // We just use our simple facade in our business logic and don't think about difficult video libs
    }
}
