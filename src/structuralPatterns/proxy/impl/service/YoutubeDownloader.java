package structuralPatterns.proxy.impl.service;

import structuralPatterns.proxy.api.ThirdPartyYoutubeLib;
import structuralPatterns.proxy.api.model.Video;

import java.util.HashMap;

public class YoutubeDownloader {
    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public Video renderVideoPage(String videoId) {
        return api.getVideo(videoId);
    }

    public HashMap<String, Video> renderPopularVideos() {
        return api.popularVideos();
    }
}
