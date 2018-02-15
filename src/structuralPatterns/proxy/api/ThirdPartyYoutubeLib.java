package structuralPatterns.proxy.api;

import structuralPatterns.proxy.api.model.Video;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    public HashMap<String, Video> popularVideos();
    public Video getVideo(String videoId);
}
