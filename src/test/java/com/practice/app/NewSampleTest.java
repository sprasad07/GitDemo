package com.practice.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewSampleTest {

	private static Logger log = LogManager.getLogger(NewSampleTest.class);
	@Test
	public void SampleTest()
	{
		Assert.assertTrue(true);
		System.out.println("Sample Test Pass");
		log.debug("SampleTest debug log");
		log.error("Sample test error log");
	}
}
