package structuralPatterns.proxy.impl.lib;

import structuralPatterns.proxy.api.ThirdPartyYoutubeLib;
import structuralPatterns.proxy.api.model.Video;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        System.out.println("ThirdPartyYoutubeClass.popularVideos: Do request for popular videos");
        HashMap<String, Video> videos = new HashMap<>();
        videos.put("https://url.com/1", new Video());
        videos.put("https://url.com/2", new Video());

        return videos;
    }

    @Override
    public Video getVideo(String videoId) {
        System.out.println("ThirdPartyYoutubeClass.getVideo: Do request for " + videoId + " video");

        return new Video();
    }
}
