package com.titles.downloadservice.Controller.HackerNews;

import com.titles.downloadservice.Controller.Interfaces.Source;
import com.titles.downloadservice.Model.HackerRaw.HackerRawData;
import com.titles.downloadservice.Model.Paper.Paper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

public class HackerAPIFetcher implements Source {

    private final String url = "https://hn.algolia.com/api/v1/search?tags=front_page";

    private final RestTemplate restTemplate;

    public HackerAPIFetcher() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        this.restTemplate = restTemplateBuilder.build();
    }

    private Optional<HackerRawData> getArticles() {
        Optional<HackerRawData> res = Optional.empty();
        try {
            res = Optional.ofNullable(this.restTemplate.getForObject(url, HackerRawData.class));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return res;
    }

    @Override
    public List<Paper> getData() {
        Optional<HackerRawData> rawData = getArticles();
        return rawData.map(HackerConverter::converter).orElseGet(List::of);
    }
}
