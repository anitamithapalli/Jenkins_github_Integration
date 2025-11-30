package com.CRM.Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By link = By.linkText("Sign In");
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public String getTitle() {
		return driver.getTitle();
	}	
	public String getStatus() {
		 driver.findElement(link).click();
		 return driver.getCurrentUrl();
	} 
}
