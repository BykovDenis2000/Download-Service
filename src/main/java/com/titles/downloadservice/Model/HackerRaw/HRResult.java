package com.titles.downloadservice.Model.HackerRaw;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/*
"title": {
  "value": "We can have democracy or we can have Facebook",
  "matchLevel": "none",
  "matchedWords": []
},
"url": {
  "value": "https://the.ink/p/we-can-have-democracy-or-we-can-have",
  "matchLevel": "none",
  "matchedWords": []
},
"author": {
  "value": "imartin2k",
  "matchLevel": "none",
  "matchedWords": []
}
*/
public class HRResult implements Serializable {
    private Optional<String> value;
    private Optional<String> matchLevel;
    private Optional<List<String>> matchedWords;

    @Override
    public String toString() {
        return "HRResult{" +
                "value=" + value +
                ", matchLevel=" + matchLevel +
                ", matchedWords=" + matchedWords +
                '}';
    }

    public Optional<String> getValue() {
        return value;
    }

    public void setValue(Optional<String> value) {
        this.value = value;
    }

    public Optional<String> getMatchLevel() {
        return matchLevel;
    }

    public void setMatchLevel(Optional<String> matchLevel) {
        this.matchLevel = matchLevel;
    }

    public Optional<List<String>> getMatchedWords() {
        return matchedWords;
    }

    public void setMatchedWords(Optional<List<String>> matchedWords) {
        this.matchedWords = matchedWords;
    }
}
