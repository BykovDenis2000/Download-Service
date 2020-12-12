package com.titles.downloadservice.Model.NYTRaw;

import java.io.Serializable;
import java.util.Optional;

/*
{
              "url": "https://static01.nyt.com/images/2020/12/15/well/00well-virus-testing-guide/00well-virus-testing-guide-thumbStandard-v4.jpg",
              "format": "Standard Thumbnail",
              "height": 75,
              "width": 75
},
 */
public class NYTMediaData implements Serializable {
    private Optional<String> url;
    private Optional<String> format;
    private Optional<Integer> height;
    private Optional<Integer> width;

    @Override
    public String toString() {
        return "\nNYTMediaData{" +
                "\nurl=" + url +
                "\n, format=" + format +
                "\n, height=" + height +
                "\n, width=" + width +
                "\n}";
    }

    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public Optional<String> getFormat() {
        return format;
    }

    public void setFormat(Optional<String> format) {
        this.format = format;
    }

    public Optional<Integer> getHeight() {
        return height;
    }

    public void setHeight(Optional<Integer> height) {
        this.height = height;
    }

    public Optional<Integer> getWidth() {
        return width;
    }

    public void setWidth(Optional<Integer> width) {
        this.width = width;
    }
}
