package com.titles.downloadservice.Model.Paper;

public class Content {

    private final Integer type;
    private final String url;

    public Content(Integer type, String url) {
        this.type = type;
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Content{" +
                "type=" + type +
                ", url='" + url + '\'' +
                '}';
    }
}
