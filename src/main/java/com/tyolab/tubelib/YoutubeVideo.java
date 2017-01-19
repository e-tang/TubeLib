package com.tyolab.tubelib;

/**
 * Created by "Eric Tang (dev@tyo.com.au)" on 16/1/17.
 */

public class YoutubeVideo extends VideoItem {

    private static String protocol = "https";
    private static String host = "img.youtube.com";
    private static String path = "/vi/";

    private static String imgExtension = "jpg";

    public static void setYoutubeHost(String host, String path, String protocol) {
        YoutubeVideo.path = path;
        YoutubeVideo.host = host;
        YoutubeVideo.protocol = protocol;

        buildUrl();
    }

    private static String baseUrl = buildUrl();

    private static String buildUrl() {
       return baseUrl = protocol + "://" + host + path;
    }

    /**
     *
     */

    private int INDEX_ONE  = 0;

    private int INDEX_TWO  = 1;

    private int INDEX_THREE  = 2;

    private int INDEX_FOUR  = 3;

    private int INDEX_MEDIUM_QUALITY  = 4;

    private int INDEX_MAX_QUALITY = 6;

    private int INDEX_HIGH_QUALITY = 5;

    private int INDEX_STANDARD_QUALITY = 7;

    /**
     *
     */


    /**
     * a whole list of thumbnail urls
     *
     * 1, 2, 3, 4
     *
     * md
     */
//    private List<String> thumbnailUrls;

    public YoutubeVideo(String id) {
        super(id);
    }

    public YoutubeVideo(String id, String url) {
        this(id);
        this.setUrl(url);
    }

//    public void createThumbnailImages() {
//        thumbnailUrls = new ArrayList<String>(8);
//
//        for (int i = 0; i < 4; ++i)
//            thumbnailUrls.set(i, "" + i);
//    }

    private String getThumbnailWithName(String name) {
        return baseUrl + getId() + "/" + name + "." + imgExtension;
    }

    public String getThumbnail(int index) {
        return getThumbnailWithName(String.valueOf(index));
    }

    public String getThumbnailOne() {
        return getThumbnail(1);
    }

    public String getThumbnailTwo() {
        return getThumbnail(2);
    }

    public String getThumbnailThree() {
        return getThumbnail(3);
    }

    public String getThumbnailFour() {
        return getThumbnail(4);
    }

    public String getThumbnailDefault() {
        return getThumbnailWithName("default");
    }

    public String getThumbnailHighQuality() {
        return getThumbnailWithName("hqdefault");
    }

    public String getThumbnailStandard() {
        return getThumbnailWithName("sddefault");
    }

    public String getThumbnailMediumQuality() {
        return getThumbnailWithName("mqdefault");
    }

    public String getThumbnailMaximunResolution() {
        return getThumbnailWithName("maxresdefault");
    }
}
