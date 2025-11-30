package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	private By emailid = By.id("email-id");
	private By pass = By.id("password");
	private By btn = By.name("submit-name");
	
	
	public String doLogin(String em, String ps)
	{
		driver.findElement(emailid).sendKeys(em);
		driver.findElement(pass).sendKeys(ps);
		driver.findElement(btn).click();
		return driver.getCurrentUrl();
	}
	

}
