package com.titles.downloadservice.Controller.Interfaces;

import com.titles.downloadservice.Model.Paper;

import java.util.List;

public interface Sender {
    Integer send(List<Paper> papers);
}
