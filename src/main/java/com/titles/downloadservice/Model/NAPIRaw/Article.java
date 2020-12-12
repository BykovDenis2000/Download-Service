package com.titles.downloadservice.Model.NAPIRaw;

import java.io.Serializable;
import java.util.Optional;

public class Article implements Serializable {
    private Optional<ArticleSource> source;
    private Optional<String> author;
    private Optional<String> title;
    private Optional<String> description;
    private Optional<String> url;
    private Optional<String> urlToImage;
    private Optional<String> publishedAt;
    private Optional<String> content;

    @Override
    public String toString() {
        return "Article{" +
                "source=" + source +
                ", author=" + author.orElse("") +
                ", title=" + title.orElse("") +
                ", description=" + description.orElse("") +
                ", url=" + url.orElse("") +
                ", urlToImage=" + urlToImage.orElse("") +
                ", publishedAt=" + publishedAt.orElse("") +
                ", content=" + content.orElse("") +
                '}';
    }

    public Optional<ArticleSource> getSource() {
        return source;
    }

    public void setSource(Optional<ArticleSource> source) { this.source = source; }

    public Optional<String> getAuthor() { return author; }

    public void setAuthor(Optional<String> author) {
        this.author = author;
    }

    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public Optional<String> getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(Optional<String> urlToImage) {
        this.urlToImage = urlToImage;
    }

    public Optional<String> getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Optional<String> publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Optional<String> getContent() {
        return content;
    }

    public void setContent(Optional<String> content) {
        this.content = content;
    }
}
