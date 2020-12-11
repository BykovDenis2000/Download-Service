package com.titles.downloadservice.View;

import com.titles.downloadservice.Controller.DownloadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {

    DownloadService service = DownloadService.defaultService;

    @GetMapping("/")
    public String test()  {
        return "Working";
    }

    @GetMapping("/test")
    public String fetchTest()  {
        return service.test();
    }

    @GetMapping("/fetch")
    public String fetch()  {
        Integer res = service.fetch();
        return res.toString();
    }

}