package com.tyolab.tubelib;

/**
 * Created by "Eric Tang (dev@tyo.com.au)" on 16/1/17.
 */

public class YoutubeVideo extends VideoItem {

    public static final int IMAGE_QUALITY_ONE = 1;

    public static final int IMAGE_QUALITY_TWO = 2;

    public static final int IMAGE_QUALITY_THREE = 3;

    public static final int IMAGE_QUALITY_FOUR = 4;

    public static final int IMAGE_QUALITY_DEFAUT = 40;

    public static final int IMAGE_QUALITY_STANDARD = 50;

    public static final int IMAGE_QUALITY_HD = 60;

    public static final int IMAGE_QUALITY_MEDIUM = 70;

    public static final int IMAGE_QUALITY_MAXIMUM = 80;

    private static String protocol = "https";
    private static String host = "img.youtube.com";
    private static String path = "/vi/";

    private static String imgExtension = "jpg";

    private static int quality = IMAGE_QUALITY_MEDIUM;

    public static void setQuality(int quality) {
        YoutubeVideo.quality = quality;
    }

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
        return getThumbnailWithName(getId(), name);
    }

    private static String getThumbnailWithName(String id, String name) {
        return baseUrl + id + "/" + name + "." + imgExtension;
    }

    public static String getThumbnail(String id) {
        String url = getThumbnailDefault(id);
        switch (quality) {
            case IMAGE_QUALITY_DEFAUT:
                url = getThumbnailDefault(id);
                break;

            case IMAGE_QUALITY_HD:
                url = getThumbnailHighQuality(id);
                break;

            case IMAGE_QUALITY_MEDIUM:
                url = getThumbnailMediumQuality(id);
                break;

            case IMAGE_QUALITY_MAXIMUM:
                url = getThumbnailMaximunResolution(id);
                break;

            case IMAGE_QUALITY_ONE:
                url = getThumbnailOne(id);
                break;

            case IMAGE_QUALITY_THREE:
                url = getThumbnailThree(id);
                break;

            case IMAGE_QUALITY_TWO:
                url = getThumbnailTwo(id);
                break;

            case IMAGE_QUALITY_FOUR:
                url = getThumbnailFour(id);
                break;

            case IMAGE_QUALITY_STANDARD:
                break;
        }
        return url;
    }

    public static String getThumbnailWithIndex(String id, int index) {
        return getThumbnailWithName(id, String.valueOf(index));
    }

    public String getThumbnailOne() {
        return getThumbnailOne(getId());
    }

    public String getThumbnailTwo() {
        return getThumbnailTwo(getId());
    }

    public String getThumbnailThree() {
        return getThumbnailThree(getId());
    }

    public String getThumbnailFour() {
        return getThumbnailFour(getId());
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

    public static String getThumbnailOne(String id) {
        return getThumbnailWithIndex(id, 1);
    }

    public static String getThumbnailTwo(String id) {
        return getThumbnailWithIndex(id, 2);
    }

    public static String getThumbnailThree(String id) {
        return getThumbnailWithIndex(id, 3);
    }

    public static String getThumbnailFour(String id) {
        return getThumbnailWithIndex(id, 4);
    }

    public static String getThumbnailDefault(String id) {
        return getThumbnailWithName(id, "default");
    }

    public static String getThumbnailHighQuality(String id) {
        return getThumbnailWithName(id, "hqdefault");
    }

    public static String getThumbnailStandard(String id) {
        return getThumbnailWithName(id, "sddefault");
    }

    public static String getThumbnailMediumQuality(String id) {
        return getThumbnailWithName(id, "mqdefault");
    }

    public String getThumbnailMediumQuality() {
        return getThumbnailMediumQuality(getId());
    }

    public static String getThumbnailMaximunResolution(String id) {
        return getThumbnailWithName(id, "maxresdefault");
    }

    public String getThumbnailMaximunResolution() {
        return getThumbnailMaximunResolution(getId());
    }
}
