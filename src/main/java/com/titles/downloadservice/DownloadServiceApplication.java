package com.titles.downloadservice;

import com.titles.downloadservice.Controller.DownloadService;
import com.titles.downloadservice.Controller.NewsAPIFetcher;
import com.titles.downloadservice.Controller.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.List;

//  docker build -t download-service .

@SpringBootApplication
public class DownloadServiceApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private NewsAPIFetcher newsApiFetcher;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DownloadServiceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DownloadServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DownloadService ds = DownloadService.defaultService;
		SendService s = SendService.defaultService;
		ds.init(s, List.of(newsApiFetcher));
	}
}

