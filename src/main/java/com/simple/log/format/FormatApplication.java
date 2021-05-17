package com.simple.log.format;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientAutoConfiguration;


@SpringBootApplication(exclude = ReactiveElasticsearchRestClientAutoConfiguration.class)
public class FormatApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormatApplication.class, args);
	}

}
