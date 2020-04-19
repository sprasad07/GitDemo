package com.practice.app;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	//NewTest.class.getName()
	private static Logger log = LogManager.getLogger(NewTest.class);
	
	@Test
    public void shouldAnswerWithTrue()
    {
		Assert.assertTrue(true);
		System.out.println("New Test Pass");
		log.info("Test Case 1 Result Log");
    }
	
	@Test
	public void SampleTest()
	{
		Assert.assertTrue(true);
		System.out.println("Sample Test Pass");
		log.debug("SampleTest debug log");
		log.error("Sample test error log");
	}
}
