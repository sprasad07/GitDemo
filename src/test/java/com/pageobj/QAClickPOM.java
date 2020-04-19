package com.pageobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class QAClickPOM 
{
    private WebDriver driver;    
    
    public QAClickPOM(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(css = "input.radioButton")
	private List<WebElement> radioBtns;
    
    @FindBy(css = "input[value='radio1']")
    private WebElement radio1;
    
    public List<WebElement> RadioBtns()
    {
    return radioBtns;
    }
    
    public WebElement Radio1() {
    	return radio1;
    }
}
