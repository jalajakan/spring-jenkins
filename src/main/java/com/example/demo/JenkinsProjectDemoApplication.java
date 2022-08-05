package com.example.demo;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JenkinsProjectDemoApplication {

	public static Log logger = LogFactory.getLog(JenkinsProjectDemoApplication.class);
	@PostConstruct
	public void init()
	{
		logger.info("Application started...");
	}
	public static void main(String[] args) {
		logger.info("Application executed...")
		SpringApplication.run(JenkinsProjectDemoApplication.class, args);
	}

}
