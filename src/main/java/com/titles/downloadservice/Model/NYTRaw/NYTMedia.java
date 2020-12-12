package com.titles.downloadservice.Model.NYTRaw;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
"media": [
        {
          "type": "image",
          "subtype": "photo",
          "caption": "What You Need to Know About Getting Tested for Coronavirus",
          "copyright": "Cathryn Virginia",
          "approved_for_syndication": 0,
          "media-metadata": [{}]
        }
      ]
 */
public class NYTMedia implements Serializable {
    private Optional<String> type;
    private Optional<String> subtype;
    private Optional<String> caption;
    private Optional<String> copyright;
    private Optional<Boolean> approved_for_syndication;

    @JsonProperty("media-metadata")
    private Optional<List<NYTMediaData>> media_metadata;


    @Override
    public String toString() {
        return "NYTMedia{" +
                ",\ntype=" + type +
                ",\n subtype=" + subtype +
                ",\n caption=" + caption +
                ",\n copyright=" + copyright +
                ",\n approved_for_syndication=" + approved_for_syndication +
                ",\n media_metadata=" + media_metadata +
                "\n}";
    }

    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public Optional<String> getSubtype() {
        return subtype;
    }

    public void setSubtype(Optional<String> subtype) {
        this.subtype = subtype;
    }

    public Optional<String> getCaption() {
        return caption;
    }

    public void setCaption(Optional<String> caption) {
        this.caption = caption;
    }

    public Optional<String> getCopyright() {
        return copyright;
    }

    public void setCopyright(Optional<String> copyright) {
        this.copyright = copyright;
    }

    public Optional<Boolean> getApproved_for_syndication() {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication(Optional<Boolean> approved_for_syndication) {
        this.approved_for_syndication = approved_for_syndication;
    }

    public Optional<List<NYTMediaData>> getMedia_metadata() {
        return media_metadata;
    }

    public void setMedia_metadata(Optional<List<NYTMediaData>> media_metadata) {
        this.media_metadata = media_metadata;
    }
}
