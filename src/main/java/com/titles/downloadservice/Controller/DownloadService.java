package com.titles.downloadservice.Controller;

import com.titles.downloadservice.Controller.Interfaces.Sender;
import com.titles.downloadservice.Controller.Interfaces.Source;
import com.titles.downloadservice.Model.Paper.Paper;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * DownloadService
 */
@Service
public class DownloadService {

    private Sender sender;
    private List<Source> sources;

    /**
     * Singleton object
     */
    public static DownloadService defaultService = new DownloadService();

    private DownloadService() { }

    /**
     *
     * @param sender
     * @param sources
     */
    public void init(Sender sender, List<Source> sources) {
        this.sender = sender;
        this.sources = sources;
    }

    /**
     *
     * @return
     */
    private List<Paper> fetchData() {
        ArrayList<Paper> res = new ArrayList<>();
        for (Source s: sources) {
            res.addAll(s.getData());
        }
        return res;
    }

    /**
     *
     * @param data
     * @return
     */
    private Integer sendData(List<Paper> data) {
        return sender.send(data);
    }

    // TODO: remove this after testing
    public JSONArray test() {
        List<Paper> data = fetchData();// data
        return JSONMaker.makeJSON(data);
    }

    /**
     *
     * @return
     */
    public Integer fetch() {
        List<Paper> data = fetchData();
        if (data.isEmpty())
            return 0;
        return sendData(data);
    }

}



