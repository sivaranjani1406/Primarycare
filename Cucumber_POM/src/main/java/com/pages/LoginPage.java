package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver driver;
	
	private By username =By.id("signIn-H6-User-Id-registered_input");
	
	private By password =By.id("signIn-H6-User-Password-registered_input");
	
	private By signin = By.id("signIn-button-handlesendOtp");
	
	//private By forgetpwdLink = By.id("signIn-H6-User-forgotPassword");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public void enterUserName(String userName)
	{
		driver.findElement(username).sendKeys(userName);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		
		driver.findElement(signin).click();
	}
	
	public RegisterPatientPage doLogin(String un, String pwd) throws Exception
	{
		
		
		  System.out.println(" login with "+ un +" and "+ pwd);
		  driver.findElement(username).sendKeys(un);
		  driver.findElement(password).sendKeys(pwd);
		  driver.findElement(signin).click();
		 
		
		Thread.sleep(2000);
		return new RegisterPatientPage(driver);
		
		
	}
	
}
