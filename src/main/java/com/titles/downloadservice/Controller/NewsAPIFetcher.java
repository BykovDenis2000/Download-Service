package com.titles.downloadservice.Controller;

import com.titles.downloadservice.Controller.Interfaces.Source;
import com.titles.downloadservice.Model.Article;
import com.titles.downloadservice.Model.Content;
import com.titles.downloadservice.Model.NewsAPIRawData;
import com.titles.downloadservice.Model.Paper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * // https://newsapi.org/docs/get-started
 */
@Service
public class NewsAPIFetcher implements Source {

    private final RestTemplate restTemplate;

    public NewsAPIFetcher() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        this.restTemplate = restTemplateBuilder.build();
    }

    private Optional<NewsAPIRawData> getArticles() {

        Optional<NewsAPIRawData> res = Optional.empty();
        try {
            res = Optional.ofNullable(this.restTemplate.getForObject(url, NewsAPIRawData.class));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return res;
    }
    Integer timeParser(String strTime) {
        return 1111;
    }


    private List<Paper> converter(NewsAPIRawData rawData) {
        ArrayList<Paper> res = new ArrayList<>();

        if (rawData.getArticles().isEmpty()) { return List.of(); }

        for (Article article : rawData.getArticles().get()) {

            String source = "";
            if (article.getSource().isPresent() && article.getSource().get().getName().isPresent())
                source = article.getSource().get().getName().get();

            String author = "";
            if (article.getAuthor().isPresent())
                author = article.getAuthor().get();

            // TODO: Добавить конвертацию времени
            Integer time = -1;
            if (article.getPublishedAt().isPresent())
                time = timeParser(article.getPublishedAt().get());

            Integer score = -1;
            List<String> tags = List.of("");
            List<String> theme = List.of("");

            String url = "";
            if (article.getUrl().isPresent())
                url = article.getUrl().get();

            String title = "";
            if (article.getTitle().isPresent())
                title = article.getTitle().get();

            String description = "";
            if (article.getDescription().isPresent())
                author = article.getDescription().get();

            String text = "";
            if (article.getContent().isPresent())
                author = article.getContent().get();

            Integer type = 1;

            String contentUrl = "";
            if (article.getUrlToImage().isPresent())
                author = article.getUrlToImage().get();

            List<Content> content = List.of(new Content(type, contentUrl));

            Paper paper = new Paper(source, author, time, score, tags, theme, url, title, description, text, content);
            res.add(paper);
        }
        return res;
    }

    @Override
    public List<Paper> getData() {
        Optional<NewsAPIRawData> rawData = getArticles();
        return rawData.map(this::converter).orElseGet(List::of);
    }
}
