package com.titles.downloadservice.Model.NYTRaw;

/*
"status": "OK",
"copyright": "Copyright (c) 2020 The New York Times Company.  All Rights Reserved.",
"num_results": 20,
"results": []
 */

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class NYTRawData implements Serializable {

    private Optional<String> status;
    private Optional<String> copyright;
    private Optional<Integer> num_results;

    private Optional<List<NYTArticle>> results;

    @Override
    public String toString() {
        return "NYTRawData{" +
                "status=" + status +
                ", copyright=" + copyright +
                ", num_results=" + num_results +
                ", results=" + results +
                '}';
    }

    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    public Optional<String> getCopyright() {
        return copyright;
    }

    public void setCopyright(Optional<String> copyright) {
        this.copyright = copyright;
    }

    public Optional<Integer> getNum_results() {
        return num_results;
    }

    public void setNum_results(Optional<Integer> num_results) {
        this.num_results = num_results;
    }

    public Optional<List<NYTArticle>> getResults() {
        return results;
    }

    public void setResults(Optional<List<NYTArticle>> results) {
        this.results = results;
    }
}
