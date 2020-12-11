package com.titles.downloadservice.Model;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class NewsAPIRawData implements Serializable {
    private Optional<String> status;
    private Optional<Integer> totalResults;
    private Optional<List<Article>> articles;

    @Override
    public String toString() {
        String res =  "NewsAPIRawData{" +
                "status=" + status +
                ", totalResults=" + totalResults;

        for (Article a : articles.get())
            res += a.toString() + ", \n\n";

        return res;
    }

    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    public Optional<Integer> getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Optional<Integer> totalResults) {
        this.totalResults = totalResults;
    }

    public Optional<List<Article>> getArticles() {
        return articles;
    }

    public void setArticles(Optional<List<Article>> articles) {
        this.articles = articles;
    }
}

