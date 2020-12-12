package com.titles.downloadservice.Controller;

import com.titles.downloadservice.Model.Paper.Content;
import com.titles.downloadservice.Model.Paper.Paper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class JSONMaker {

    /**
     *
     */
    public static JSONArray makeJSON(List<Paper> data) {

        JSONArray file = new JSONArray();

        for (Paper paper : data) {
            JSONObject JSONpaper = new JSONObject();

            JSONpaper.put("source", paper.getSource());             // source
            JSONpaper.put("score", paper.getScore());               // score

            JSONArray mems = new JSONArray();
            for (String mem : paper.getMems())
                mems.add(mem);
            JSONpaper.put("mems", mems);                            // mems

            JSONpaper.put("time", paper.getTime());                 // time
            JSONpaper.put("sourceUrl", paper.getSourceUrl());       // sourceUrl
            JSONpaper.put("author", paper.getAuthor());             // author
            JSONpaper.put("title", paper.getTitle());               // title
            JSONpaper.put("description", paper.getDescription());   // description
            JSONpaper.put("body", paper.getBody());                 // body

            JSONArray contents = new JSONArray();
            for (Content content : paper.getContent()) {
                JSONObject JSONcontent = new JSONObject();
                JSONcontent.put("type", content.getType());
                JSONcontent.put("url", content.getUrl());
                contents.add(JSONcontent);
            }
            JSONpaper.put("content", contents);                         // content



            file.add(JSONpaper);
        }

        return file;
    }



}
