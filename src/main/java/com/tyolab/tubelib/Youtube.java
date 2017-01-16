package com.tyolab.tubelib;

import java.net.URI;

public class Youtube {

    /**
     *
     * @param url
     * @return VideoItem, if null, it is not a valid youtube url
     */
    public static YoutubeVideo parseUrl (String url) {
        URI uri = null;

        try {
            uri = new URI(url);
        }
        catch (Exception ex) {
            return null;
        }

        String[] tokens = uri.getQuery().split("&");

        for (String pair : tokens) {
            int index = pair.indexOf('=');

            if (index > -1) {
                String key = pair.substring(0, index);
                if (key.equalsIgnoreCase("v")) {
                    String value = pair.substring(index + 1);

                    YoutubeVideo videoItem = new YoutubeVideo(value);
                    videoItem.setUrl(url);
                    return videoItem;
                }
            }
        }
        return null;
    }

}
