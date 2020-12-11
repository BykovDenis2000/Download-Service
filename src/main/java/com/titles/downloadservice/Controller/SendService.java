package com.titles.downloadservice.Controller;

import com.titles.downloadservice.Controller.Interfaces.Sender;
import com.titles.downloadservice.Model.Content;
import com.titles.downloadservice.Model.Paper;
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

    @Override
    public Integer send(List<Paper> papers) {
        JSONArray data = makeJSON(papers);
        if (createPostWithObject(data, destinationUrl) != null) {
            return 1;
        }
        return 0;
    }

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

    private Object getRequest(String url) {
        RestTemplate restTemplate = new RestTemplate();
        Object response = null;
        try {
            response = restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return response;
    }

    // FIXME: make private
    public JSONArray makeJSON(List<Paper> papers) {
        //        https://www.geeksforgeeks.org/working-with-json-data-in-java/
        // In java JSONObject is used to create JSON object
        // which is a subclass of java.util.HashMap.

        JSONArray file = new JSONArray();

        for (Paper paper : papers) {
            JSONObject JSONpaper = new JSONObject();

            JSONpaper.put("source", paper.getSource());
            JSONpaper.put("author", paper.getAuthor());
            JSONpaper.put("time", paper.getTime());
            JSONpaper.put("score", paper.getScore());

            JSONArray JSONtags = new JSONArray();
            for (String tag : paper.getTags())
                JSONtags.add(tag);
            JSONpaper.put("tags", JSONtags);

            JSONArray JSONthemes = new JSONArray();
            for (String theme : paper.getTheme())
                JSONthemes.add(theme);
            JSONpaper.put("themes", JSONthemes);

            JSONpaper.put("url", paper.getUrl());
            JSONpaper.put("title", paper.getTitle());
            JSONpaper.put("description", paper.getDescription());
            JSONpaper.put("text", paper.getText());

            JSONArray JSONcontent = new JSONArray();
            for (Content c : paper.getContent()) {
                JSONObject content = new JSONObject();
                content.put("type", c.getType());
                content.put("url", c.getUrl());
                JSONcontent.add(content);
            }
            JSONpaper.put("content", JSONcontent);

            file.add(JSONpaper);
        }

        // To print in JSON format.
        System.out.print(file);
        return file;
    }

}
