package com.another.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobj.QAClickPOM;

public class QAClick extends TestBase{
	
	//QAClickPOM qa = PageFactory.initElements(driver, QAClickPOM.class);
	
	
	@Test
	public void RadioButton() 
	{
		QAClickPOM qa = new QAClickPOM(driver);
		//System.out.println(driver.findElements(By.cssSelector("input.radioButton")).size());
		qa.Radio1().click();
		System.out.println("Number of radio Buttons " + qa.RadioBtns().size());
		
		
	}

}
