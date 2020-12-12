package com.titles.downloadservice.Controller.Interfaces;

import com.titles.downloadservice.Model.Paper.Paper;

import java.util.List;

public interface Sender {
    /**
     *
     * @param papers
     * @return
     */
    Integer send(List<Paper> papers);
}
