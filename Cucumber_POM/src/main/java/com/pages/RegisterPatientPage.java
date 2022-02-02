package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegisterPatientPage {
	
	private WebDriver driver;
	
	private By signin = By.id("signIn-button-handlesendOtp");
	
	private By registernewpatient = By.id("dashboard_search_pid_image");
	
	private By registernewpatienbutton = By.xpath("//span[text()='Register New Patient']");
	
	private By idtype = By.xpath("//div[@id='Register_Patient_patientdetails_0_patientidentification_id_type_select_div']");
	
	private By idtype_type = By.id("Register_Patient_patientdetails_0_patientidentification_id_type_select_input");
	
	public RegisterPatientPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	  
	  public String getAccountTitle() { return driver.getTitle(); }
	 
	
	public void clickregnewpatientbutton()
	{
		driver.findElement(registernewpatient).click();
	}
	
	public void clickregpatientbutton()
	{
		driver.findElement(registernewpatienbutton).click();
	}
	
	public void patientdetails() throws Exception
	{
		driver.findElement(idtype).click();
		Thread.sleep(2000);
		driver.findElement(idtype_type).sendKeys("PAN Card");
		
		  driver.findElement(idtype_type).sendKeys(Keys.DOWN);
		  driver.findElement(idtype_type).sendKeys(Keys.ENTER);
		 
	}

}
