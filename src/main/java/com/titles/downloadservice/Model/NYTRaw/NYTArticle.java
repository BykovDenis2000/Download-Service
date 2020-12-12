package com.titles.downloadservice.Model.NYTRaw;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/*
{
      "uri": "nyt://article/b634ac1a-4614-5fd4-a85b-2915c2909fad",
      "url": "https://www.nytimes.com/2020/12/10/health/covid-vaccine-pfizer-fda.html",
      "id": 100000007495104,
      "asset_id": 100000007495104,
      "source": "New York Times",
      "published_date": "2020-12-10",
      "updated": "2020-12-11 08:11:37",
      "section": "Health",
      "subsection": "",
      "nytdsection": "health",
      "adx_keywords": "Vaccination and Immunization;Clinical Trials;Coronavirus (2019-nCoV);Regulation and Deregulation of Industry;your-feed-healthcare;Food and Drug Administration;BioNTech SE;Pfizer Inc",
      "column": null,
      "byline": "By Katie Thomas, Noah Weiland and Sharon LaFraniere",
      "type": "Article",
      "title": "F.D.A. Advisory Panel Gives Green Light to Pfizer Vaccine",
      "abstract": "The blessing of these experts means that the agency will likely OK the vaccine’s use, paving the way for health care workers to begin getting shots next week.",
      "des_facet": [ "Vaccination and Immunization", "Clinical Trials", "Coronavirus (2019-nCoV)", "Regulation and Deregulation of Industry", "your-feed-healthcare"],
      "org_facet": ["Food and Drug Administration", "BioNTech SE", "Pfizer Inc"],
      "per_facet": ["Someone"],
      "geo_facet": ["Somewhere"],
      "media": [{}],
      "eta_id": 0
    },
 */

public class NYTArticle implements Serializable {

    private Optional<String> uri;
    private Optional<String> url;
    private Optional<Long> id;
    private Optional<Long> asset_id;
    private Optional<String> source;
    private Optional<String> published_date;
    private Optional<String> updated;
    private Optional<String> section;
    private Optional<String> subsection;
    private Optional<String> nytdsection;
    private Optional<String> adx_keywords;
    private Optional<String> column;
    private Optional<String> byline;
    private Optional<String> type;
    private Optional<String> title;

    @JsonProperty("abstract")
    private Optional<String> _abstract;

    private Optional<List<String>> des_facet;
    private Optional<List<String>> org_facet;
    private Optional<List<String>> per_facet;
    private Optional<List<String>> geo_facet;
    private Optional<List<NYTMedia>> media;
    private Optional<String> eta_id;

    @Override
    public String toString() {
        return "NYTArticle{" +
                "\nuri=" + uri +
                ",\n url=" + url +
                ",\n id=" + id +
                ",\n asset_id=" + asset_id +
                ",\n source=" + source +
                ",\n published_date=" + published_date +
                ",\n updated=" + updated +
                ",\n section=" + section +
                ",\n subsection=" + subsection +
                ",\n nytdsection=" + nytdsection +
                ",\n adx_keywords=" + adx_keywords +
                ",\n column=" + column +
                ",\n byline=" + byline +
                ",\n type=" + type +
                ",\n title=" + title +
                ",\n _abstract=" + _abstract +
                ",\n des_facet=" + des_facet +
                ",\n org_facet=" + org_facet +
                ",\n per_facet=" + per_facet +
                ",\n geo_facet=" + geo_facet +
                ",\n media=" + media +
                ",\n eta_id=" + eta_id +
                "\n}";
    }

    public Optional<String> getUri() {
        return uri;
    }

    public void setUri(Optional<String> uri) {
        this.uri = uri;
    }

    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public Optional<Long> getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(Optional<Long> asset_id) {
        this.asset_id = asset_id;
    }

    public Optional<String> getSource() {
        return source;
    }

    public void setSource(Optional<String> source) {
        this.source = source;
    }

    public Optional<String> getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Optional<String> published_date) {
        this.published_date = published_date;
    }

    public Optional<String> getUpdated() {
        return updated;
    }

    public void setUpdated(Optional<String> updated) {
        this.updated = updated;
    }

    public Optional<String> getSection() {
        return section;
    }

    public void setSection(Optional<String> section) {
        this.section = section;
    }

    public Optional<String> getSubsection() {
        return subsection;
    }

    public void setSubsection(Optional<String> subsection) {
        this.subsection = subsection;
    }

    public Optional<String> getNytdsection() {
        return nytdsection;
    }

    public void setNytdsection(Optional<String> nytdsection) {
        this.nytdsection = nytdsection;
    }

    public Optional<String> getAdx_keywords() {
        return adx_keywords;
    }

    public void setAdx_keywords(Optional<String> adx_keywords) {
        this.adx_keywords = adx_keywords;
    }

    public Optional<String> getColumn() {
        return column;
    }

    public void setColumn(Optional<String> column) {
        this.column = column;
    }

    public Optional<String> getByline() {
        return byline;
    }

    public void setByline(Optional<String> byline) {
        this.byline = byline;
    }

    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public Optional<String> get_abstract() {
        return _abstract;
    }

    public void set_abstract(Optional<String> _abstract) {
        this._abstract = _abstract;
    }

    public Optional<List<String>> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(Optional<List<String>> des_facet) {
        this.des_facet = des_facet;
    }

    public Optional<List<String>> getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(Optional<List<String>> org_facet) {
        this.org_facet = org_facet;
    }

    public Optional<List<String>> getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(Optional<List<String>> per_facet) {
        this.per_facet = per_facet;
    }

    public Optional<List<String>> getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(Optional<List<String>> geo_facet) {
        this.geo_facet = geo_facet;
    }

    public Optional<List<NYTMedia>> getMedia() {
        return media;
    }

    public void setMedia(Optional<List<NYTMedia>> media) {
        this.media = media;
    }

    public Optional<String> getEta_id() {
        return eta_id;
    }

    public void setEta_id(Optional<String> eta_id) {
        this.eta_id = eta_id;
    }
}
