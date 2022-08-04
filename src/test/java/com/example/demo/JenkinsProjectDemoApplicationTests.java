package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectDemoApplicationTests {
	public static Log logger = LogFactory.getLog(JenkinsProjectDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing ..................");
		assertEquals(true, true);
	}

}
