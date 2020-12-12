package com.titles.downloadservice.Model.HackerRaw;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/*
"hits": []
"nbHits": 32,
"page": 0,
"nbPages": 2,
"hitsPerPage": 20,
"exhaustiveNbHits": true,
"query": "",
"params": "advancedSyntax=true&analytics=true&analyticsTags=backend&tags=front_page",
"processingTimeMS": 1
 */
public class HackerRawData implements Serializable {

    private Optional<List<HackerHit>> hits;

    private Optional<Integer> nbHits;
    private Optional<Integer> page;
    private Optional<Integer> nbPages;
    private Optional<Integer> hitsPerPage;
    private Optional<Boolean> exhaustiveNbHits;
    private Optional<String> query;
    private Optional<String> params;
    private Optional<Integer> processingTimeMS;

    @Override
    public String toString() {
        return "HackerRawData{" +
                "hits=" + hits +
                '}';
    }

    public Optional<List<HackerHit>> getHits() {
        return hits;
    }

    public void setHits(Optional<List<HackerHit>> hits) {
        this.hits = hits;
    }

    public Optional<Integer> getNbHits() {
        return nbHits;
    }

    public void setNbHits(Optional<Integer> nbHits) {
        this.nbHits = nbHits;
    }

    public Optional<Integer> getPage() {
        return page;
    }

    public void setPage(Optional<Integer> page) {
        this.page = page;
    }

    public Optional<Integer> getNbPages() {
        return nbPages;
    }

    public void setNbPages(Optional<Integer> nbPages) {
        this.nbPages = nbPages;
    }

    public Optional<Integer> getHitsPerPage() {
        return hitsPerPage;
    }

    public void setHitsPerPage(Optional<Integer> hitsPerPage) {
        this.hitsPerPage = hitsPerPage;
    }

    public Optional<Boolean> getExhaustiveNbHits() {
        return exhaustiveNbHits;
    }

    public void setExhaustiveNbHits(Optional<Boolean> exhaustiveNbHits) {
        this.exhaustiveNbHits = exhaustiveNbHits;
    }

    public Optional<String> getQuery() {
        return query;
    }

    public void setQuery(Optional<String> query) {
        this.query = query;
    }

    public Optional<String> getParams() {
        return params;
    }

    public void setParams(Optional<String> params) {
        this.params = params;
    }

    public Optional<Integer> getProcessingTimeMS() {
        return processingTimeMS;
    }

    public void setProcessingTimeMS(Optional<Integer> processingTimeMS) {
        this.processingTimeMS = processingTimeMS;
    }
}

