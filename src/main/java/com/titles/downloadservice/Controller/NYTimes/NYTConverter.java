package com.titles.downloadservice.Controller.NYTimes;

import com.titles.downloadservice.Model.NYTRaw.NYTArticle;
import com.titles.downloadservice.Model.NYTRaw.NYTMedia;
import com.titles.downloadservice.Model.NYTRaw.NYTMediaData;
import com.titles.downloadservice.Model.NYTRaw.NYTRawData;
import com.titles.downloadservice.Model.Paper.Content;
import com.titles.downloadservice.Model.Paper.Paper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NYTConverter {

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
    public static List<Paper> converter(NYTRawData rawData) {

        ArrayList<Paper> res = new ArrayList<>();
        if (rawData.getResults().isEmpty()) { return List.of(); }

        for (NYTArticle result : rawData.getResults().get()) {
            res.add(toPaper(result));
        }

        return res;
    }

    /**
     *
     * @param result
     * @return
     */
    private static Paper toPaper(NYTArticle result) {

        String source = result.getSource().orElse("");
        String author = result.getByline().orElse("");

        // TODO: Добавить конвертацию времени
        Integer time = -1;
        if (result.getUpdated().isPresent()) {
            time = timeParser(result.getUpdated().get());
        } else if (result.getPublished_date().isPresent()) {
            time = timeParser(result.getPublished_date().get());
        }

        // TODO: Добавить базовое значение
        Integer score = -1;

        ArrayList<String> mems = new ArrayList<>();

        mems.add("NYTimes");
        mems.add(result.getSection().orElse(""));

        if (result.getSubsection().isPresent())
            mems.add(result.getSubsection().get());

        if (result.getAdx_keywords().isPresent()) {
            List<String> adx_keywords = Arrays.asList(result.getAdx_keywords().get().split(";"));
            mems.addAll(adx_keywords);
        }

        if (result.getDes_facet().isPresent())
            mems.addAll(result.getDes_facet().get());

        if (result.getOrg_facet().isPresent())
            mems.addAll(result.getOrg_facet().get());

        if (result.getPer_facet().isPresent())
            mems.addAll(result.getPer_facet().get());

        if (result.getGeo_facet().isPresent())
            mems.addAll(result.getGeo_facet().get());


        String url = result.getUrl().orElse("");
        String title = result.getTitle().orElse("");
        String description = result.get_abstract().get();

        String text = "";

        ArrayList<Content> content = new ArrayList<>();
        if (result.getMedia().isPresent()) {
            for (NYTMedia media : result.getMedia().get()) {
                int type = -1;
                String mediaUrl = "";

                if (media.getType().orElse("").equals("image")) {
                    type = 1;
                } else if (media.getType().orElse("").equals("audio")) {
                    type = 2;
                }

                if (media.getMedia_metadata().isPresent()) {
                    Integer maxArea = 0;
                    NYTMediaData mediaBody = media.getMedia_metadata().get().stream().max( (m1, m2) -> {
                        Integer area1 = m1.getHeight().orElse(0) * m1.getWidth().orElse(0);
                        Integer area2 = m2.getHeight().orElse(0) * m2.getWidth().orElse(0);
                        return area1 - area2;
                        }
                    ).get();

                    mediaUrl = mediaBody.getUrl().orElse("");

                }

                if (media.getCopyright().isPresent())
                    mems.add(media.getCopyright().get());

                 content.add(new Content(type, mediaUrl));
            }
        }

        return new Paper(source, score, mems, time, url, author, title, description, text, content);
    }

}
