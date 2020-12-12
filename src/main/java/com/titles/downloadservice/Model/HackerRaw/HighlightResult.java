package com.titles.downloadservice.Model.HackerRaw;

import java.io.Serializable;
import java.util.Optional;

/*
"_highlightResult": {
    "title": {},
    "url": {},
    "author": {}
}
 */
public class HighlightResult implements Serializable {
    private Optional<HRResult> title;
    private Optional<HRResult> url;
    private Optional<HRResult> author;

    @Override
    public String toString() {
        return "HighlightResult{" +
                "title=" + title +
                ", url=" + url +
                ", author=" + author +
                '}';
    }

    public Optional<HRResult> getTitle() {
        return title;
    }

    public void setTitle(Optional<HRResult> title) {
        this.title = title;
    }

    public Optional<HRResult> getUrl() {
        return url;
    }

    public void setUrl(Optional<HRResult> url) {
        this.url = url;
    }

    public Optional<HRResult> getAuthor() {
        return author;
    }

    public void setAuthor(Optional<HRResult> author) {
        this.author = author;
    }
}
