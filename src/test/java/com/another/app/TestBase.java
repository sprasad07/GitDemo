package com.another.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

private static Logger log = LogManager.getLogger(TestBase.class);
public static WebDriver driver;	

	@Test
    public void shouldAnswerWithTrue()
    {
		Assert.assertTrue(true);
		System.out.println("ABC Test Pass");
		log.info("ABC Test Case 1 Info Log");
		log.error("ABC Test Case 1 Error Log");
    }
	
	@BeforeSuite
	public static void setBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
	}

	/*
	 * public static WebDriver getDriver() { return driver; }
	 */


	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
