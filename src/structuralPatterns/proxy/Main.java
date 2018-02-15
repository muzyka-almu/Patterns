package structuralPatterns.proxy;

import structuralPatterns.proxy.impl.lib.ThirdPartyYoutubeClass;
import structuralPatterns.proxy.impl.proxy.YoutubeCacheProxy;
import structuralPatterns.proxy.impl.service.YoutubeDownloader;

public class Main {
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        System.out.println("First test ----------------------- start");
        test(naiveDownloader);
        System.out.println("First test ----------------------- end");
        System.out.println();
        System.out.println("Second test ----------------------- start");
        test(smartDownloader);
        System.out.println("Second test ----------------------- end");
    }

    public static void test(YoutubeDownloader downloader) {
        downloader.renderPopularVideos();
        downloader.renderVideoPage("testVideo1");
        downloader.renderVideoPage("testVideo1");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("testVideo2");
    }
}
