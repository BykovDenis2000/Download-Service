package com.titles.downloadservice.Controller.NewsAPI;

import com.titles.downloadservice.Controller.Interfaces.Source;
import com.titles.downloadservice.Model.NAPIRaw.NewsAPIRawData;
import com.titles.downloadservice.Model.Paper.Paper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * // https://newsapi.org/docs/get-started
 */
public class NewsAPIFetcher implements Source {

    private final RestTemplate restTemplate;

    // FIXME hide this
    private final String pivateKey = "";

    private final String url = "http://newsapi.org/v2/top-headlines?country=us&apiKey=";

    public NewsAPIFetcher() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        this.restTemplate = restTemplateBuilder.build();
    }

    private Optional<NewsAPIRawData> getArticles() {
        Optional<NewsAPIRawData> res = Optional.empty();
        try {
            res = Optional.ofNullable(this.restTemplate.getForObject(url + pivateKey, NewsAPIRawData.class));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return res;
    }

    @Override
    public List<Paper> getData() {
        Optional<NewsAPIRawData> rawData = getArticles();
        return rawData.map(NAPIConverter::converter).orElseGet(List::of);
    }
}
