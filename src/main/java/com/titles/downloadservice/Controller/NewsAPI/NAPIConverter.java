package com.titles.downloadservice.Controller.NewsAPI;

import com.titles.downloadservice.Model.NAPIRaw.Article;
import com.titles.downloadservice.Model.Paper.Content;
import com.titles.downloadservice.Model.NAPIRaw.NewsAPIRawData;
import com.titles.downloadservice.Model.Paper.Paper;

import java.util.ArrayList;
import java.util.List;

public class NAPIConverter {

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
    public static List<Paper> converter(NewsAPIRawData rawData) {
        ArrayList<Paper> res = new ArrayList<>();
        if (rawData.getArticles().isEmpty()) { return List.of(); }

        for (Article article : rawData.getArticles().get()) {
            res.add(toPaper(article));
        }

        return res;
    }

    /**
     *
     * @param article
     * @return
     */
    private static Paper toPaper(Article article) {
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
        List<String> mems = List.of(source, author);

        String url = "";
        if (article.getUrl().isPresent())
            url = article.getUrl().get();

        String title = "";
        if (article.getTitle().isPresent())
            title = article.getTitle().get();

        String description = "";
        if (article.getDescription().isPresent())
            description = article.getDescription().get();

        String text = "";
        if (article.getContent().isPresent())
            text = article.getContent().get();

        Integer type = 1;

        String contentUrl = "";
        if (article.getUrlToImage().isPresent())
            contentUrl = article.getUrlToImage().get();

        List<Content> content = List.of(new Content(type, contentUrl));

        return new Paper(source, score, mems, time, url, author, title, description, text, content);
    }


}
