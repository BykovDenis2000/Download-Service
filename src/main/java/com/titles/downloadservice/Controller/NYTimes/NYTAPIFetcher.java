package com.titles.downloadservice.Controller.NYTimes;

import com.titles.downloadservice.Controller.Interfaces.Source;
import com.titles.downloadservice.Model.NYTRaw.NYTRawData;
import com.titles.downloadservice.Model.Paper.Paper;
import org.json.simple.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

public class NYTAPIFetcher implements Source {

    private final RestTemplate restTemplate;

    // FIXME hide this
    private final String pivateKey = "vT5AK7ZlIM17z07vUA8x67wnxYnYSbHO";

    private final String url = "https://api.nytimes.com/svc/mostpopular/v2/viewed/1.json?api-key=";

    public NYTAPIFetcher() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        this.restTemplate = restTemplateBuilder.build();
    }

    private Optional<NYTRawData> getArticles() {
        Optional<NYTRawData> res = Optional.empty();
        try {
            res = Optional.ofNullable(this.restTemplate.getForObject(url + pivateKey, NYTRawData.class));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(res);
        return res;
    }

    @Override
    public List<Paper> getData() {
        Optional<NYTRawData> rawData = getArticles();
        return rawData.map(NYTConverter::converter).orElseGet(List::of);
    }
}
