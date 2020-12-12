package com.titles.downloadservice.Model.Paper;


import java.util.List;

public class Paper {

    // Data for logic
    private final String source;
    private final Integer score;
    private final List<String> mems;
    private final Integer time;

    // Data for accessing
    private final String sourceUrl;

    // Data for output
    private final String author;
    private final String title;
    private final String description;
    private final String body;
    private final List<Content> content;

    public Paper(String source, Integer score, List<String> mems, Integer time, String sourceUrl, String author, String title, String description, String body, List<Content> content) {
        this.source = source;
        this.score = score;
        this.mems = mems;
        this.time = time;
        this.sourceUrl = sourceUrl;
        this.author = author;
        this.title = title;
        this.description = description;
        this.body = body;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "source='" + source + '\'' +
                ", score=" + score +
                ", mems=" + mems +
                ", time=" + time +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", body='" + body + '\'' +
                ", content=" + content +
                '}';
    }

    public String getSource() {
        return source;
    }

    public Integer getScore() {
        return score;
    }

    public List<String> getMems() {
        return mems;
    }

    public Integer getTime() {
        return time;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBody() {
        return body;
    }

    public List<Content> getContent() {
        return content;
    }
}
