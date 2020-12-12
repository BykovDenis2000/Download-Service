package com.titles.downloadservice.Controller;

import com.titles.downloadservice.Controller.Interfaces.Sender;
import com.titles.downloadservice.Model.Paper.Paper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;
import java.util.Collections;
import java.util.List;

public class SendService implements Sender {

    String destinationUrl = "http://selection-service:8080/selectioner/catch";

    public static SendService defaultService = new SendService();

    private final RestTemplate restTemplate;

    private SendService() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        this.restTemplate = restTemplateBuilder.build();
    }

    /**
     *
     * @param papers
     * @return
     */
    @Override
    public Integer send(List<Paper> papers) {
        JSONArray data = JSONMaker.makeJSON(papers);
        return createPostWithObject(data, destinationUrl);
    }

    /**
     *
     * @param object
     * @param url
     * @return
     */
    private Integer createPostWithObject(JSONArray object, String url) {

        // create headers
        HttpHeaders headers = new HttpHeaders();

        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);

        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // build the request
        HttpEntity<JSONArray> entity = new HttpEntity<>(object, headers);

        try {
            // send POST request
            restTemplate.postForObject(url, entity, JSONObject.class);
        } catch (RestClientException error) {
            System.out.println(error.getLocalizedMessage());
            return 0;
        }

        return 1;
    }



}
