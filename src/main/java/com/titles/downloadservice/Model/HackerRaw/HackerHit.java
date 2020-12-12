package com.titles.downloadservice.Model.HackerRaw;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/*
{
      "created_at": "2020-12-09T10:48:39.000Z",
      "title": "Cameras and Lenses",
      "url": "https://ciechanow.ski/cameras-and-lenses/",
      "author": "mariuz",
      "points": 2015,
      "story_text": null,
      "comment_text": null,
      "num_comments": 189,
      "story_id": null,
      "story_title": null,
      "story_url": null,
      "parent_id": null,
      "created_at_i": 1607510919,
      "_tags": []
      "objectID": "25357315",
      "_highlightResult": {}
},
 */

public class HackerHit implements Serializable {

    private Optional<String> created_at;
    private Optional<String> title;
    private Optional<String> url;
    private Optional<String> author;
    private Optional<Integer> points;
    private Optional<String> story_text;
    private Optional<String> comment_text;
    private Optional<Integer> num_comments;
    private Optional<String> story_id;
    private Optional<String> story_title;
    private Optional<String> story_url;
    private Optional<String> parent_id;
    private Optional<Integer> created_at_i;

    private Optional<List<String>> _tags;

    private Optional<String> objectID;

    private Optional<HighlightResult> _highlightResult;

    @Override
    public String toString() {
        return "HackerHit{" +
                "created_at=" + created_at +
                ", title=" + title +
                ", url=" + url +
                ", author=" + author +
                ", points=" + points +
                ", story_text=" + story_text +
                ", comment_text=" + comment_text +
                ", num_comments=" + num_comments +
                ", story_id=" + story_id +
                ", story_title=" + story_title +
                ", story_url=" + story_url +
                ", parent_id=" + parent_id +
                ", created_at_i=" + created_at_i +
                ", _tags=" + _tags +
                ", objectID=" + objectID +
                ", _highlightResult=" + _highlightResult +
                '}';
    }

    public Optional<String> getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Optional<String> created_at) {
        this.created_at = created_at;
    }

    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public Optional<String> getAuthor() {
        return author;
    }

    public void setAuthor(Optional<String> author) {
        this.author = author;
    }

    public Optional<Integer> getPoints() {
        return points;
    }

    public void setPoints(Optional<Integer> points) {
        this.points = points;
    }

    public Optional<String> getStory_text() {
        return story_text;
    }

    public void setStory_text(Optional<String> story_text) {
        this.story_text = story_text;
    }

    public Optional<String> getComment_text() {
        return comment_text;
    }

    public void setComment_text(Optional<String> comment_text) {
        this.comment_text = comment_text;
    }

    public Optional<Integer> getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(Optional<Integer> num_comments) {
        this.num_comments = num_comments;
    }

    public Optional<String> getStory_id() {
        return story_id;
    }

    public void setStory_id(Optional<String> story_id) {
        this.story_id = story_id;
    }

    public Optional<String> getStory_title() {
        return story_title;
    }

    public void setStory_title(Optional<String> story_title) {
        this.story_title = story_title;
    }

    public Optional<String> getStory_url() {
        return story_url;
    }

    public void setStory_url(Optional<String> story_url) {
        this.story_url = story_url;
    }

    public Optional<String> getParent_id() {
        return parent_id;
    }

    public void setParent_id(Optional<String> parent_id) {
        this.parent_id = parent_id;
    }

    public Optional<Integer> getCreated_at_i() {
        return created_at_i;
    }

    public void setCreated_at_i(Optional<Integer> created_at_i) {
        this.created_at_i = created_at_i;
    }

    public Optional<List<String>> get_tags() {
        return _tags;
    }

    public void set_tags(Optional<List<String>> _tags) {
        this._tags = _tags;
    }

    public Optional<String> getObjectID() {
        return objectID;
    }

    public void setObjectID(Optional<String> objectID) {
        this.objectID = objectID;
    }

    public Optional<HighlightResult> get_highlightResult() {
        return _highlightResult;
    }

    public void set_highlightResult(Optional<HighlightResult> _highlightResult) {
        this._highlightResult = _highlightResult;
    }
}
