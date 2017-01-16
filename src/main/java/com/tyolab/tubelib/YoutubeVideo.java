package com.tyolab.tubelib;

import java.util.ArrayList;

/**
 * Created by "Eric Tang (dev@tyo.com.au)" on 16/1/17.
 */

public class YoutubeVideo extends VideoItem {

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
    private ArrayList<String> thumbnailUrls;

    public YoutubeVideo(String id) {
        super(id);
    }

}
