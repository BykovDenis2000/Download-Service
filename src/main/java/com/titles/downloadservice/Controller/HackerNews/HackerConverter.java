package com.titles.downloadservice.Controller.HackerNews;

import com.titles.downloadservice.Model.HackerRaw.HackerHit;
import com.titles.downloadservice.Model.HackerRaw.HackerRawData;
import com.titles.downloadservice.Model.Paper.Content;
import com.titles.downloadservice.Model.Paper.Paper;

import java.util.ArrayList;
import java.util.List;

public class HackerConverter {

    /**
     *
     * @param strTime
     * @return
     */
    private static Integer timeParser(String strTime) {
        return 1111;
    }

    /**
     *
     * @param rawData
     * @return
     */
    public static List<Paper> converter(HackerRawData rawData) {

        ArrayList<Paper> res = new ArrayList<>();
        if (rawData.getHits().isEmpty()) { return List.of(); }

        for (HackerHit hit : rawData.getHits().get()) {
            res.add(toPaper(hit));
        }

        return res;
    }

    /**
     *
     * @param hit
     * @return
     */
    private static Paper toPaper(HackerHit hit) {

        String source = "HackerNews";

        String author = "";
        if (hit.getAuthor().isPresent())
            author = hit.getAuthor().get();

        // TODO: Добавить конвертацию времени
        Integer time = -1;
        if (hit.getCreated_at().isPresent())
            time = timeParser(hit.getCreated_at().get());

        Integer score = -1;
        if (hit.getPoints().isPresent()) {
            score = hit.getPoints().get();
            if (hit.getNum_comments().isPresent()) {
                double increase =  Double.valueOf(hit.getNum_comments().get()) / 100;
                score += (int) increase;
            }
        }

        List<String> mems = List.of(source, author);

        String url = "";
        if (hit.getUrl().isPresent())
            url = hit.getUrl().get();

        String title = "";
        if (hit.getTitle().isPresent())
            title = hit.getTitle().get();

        String description = "";
        if (hit.get_highlightResult().isPresent())
            if (hit.get_highlightResult().get().getTitle().isPresent())
                if (hit.get_highlightResult().get().getTitle().get().getValue().isPresent())
                    description = hit.get_highlightResult().get().getTitle().get().getValue().get();

        String text = "";

        List<Content> content = List.of();

        return new Paper(source, score, mems, time, url, author, title, description, text, content);
    }


}
