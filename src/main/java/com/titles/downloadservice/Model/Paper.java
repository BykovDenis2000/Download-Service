package com.titles.downloadservice.Model;


import java.util.List;

public class Paper {

    private final String source;
    private final String author;
    private final Integer time;
    private final Integer score;
    private final List<String> tags;
    private final List<String> theme;
    private final String url;
    private final String title;
    private final String description;
    private final String text;
    private final List<Content> content;

    public Paper(String source,
                 String author,
                 Integer time,
                 Integer score,
                 List<String> tags,
                 List<String> theme,
                 String url,
                 String title,
                 String description,
                 String text,
                 List<Content> content)
    {
        this.source = source;
        this.author = author;
        this.time = time;
        this.score = score;
        this.tags = tags;
        this.theme = theme;
        this.url = url;
        this.title = title;
        this.description = description;
        this.text = text;
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getTime() {
        return time;
    }

    public Integer getScore() {
        return score;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<String> getTheme() {
        return theme;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getText() {
        return text;
    }

    public List<Content> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Paper{" +
                ", source='" + source + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                ", score=" + score +
                ", tags=" + tags +
                ", theme=" + theme +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", text='" + text + '\'' +
                ", content=" + content +
                '}';
    }
}
