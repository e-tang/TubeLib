package com.tyolab.tubelib;

import java.io.Serializable;

/**
 * Created by "Eric Tang (dev@tyo.com.au)" on 15/1/17.
 */

public class VideoItem extends ItemBase implements Serializable {

    private String title = "";

    private String description ="";

    private String url;

    private String publisher = "";

    private String category = "";

    private String id;

    public VideoItem(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Video {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", backgroundImageUrl='" + getBackgroundImageUrl() + '\'' +
                '}';
    }
}
