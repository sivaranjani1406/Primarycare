package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AssemblePages {
	
private WebDriver driver;
	
	private By signin = By.id("signIn-button-handlesendOtp");
	
	private By registernewpatient = By.id("dashboard_search_pid_image");
	
	private By registernewpatienbutton = By.xpath("//span[text()='Register New Patient']");
	
	private By idtype = By.xpath("//div[@id='Register_Patient_patientdetails_0_patientidentification_id_type_select_div']");
	
	private By idtype_type = By.id("Register_Patient_patientdetails_0_patientidentification_id_type_select_input");
	
	private By idnumber=By.id("Register_Patient_patientdetails_0_patientidentification_id_number_textinput_input");
	
	public AssemblePages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	  
	  public String getAccountTitle() { return driver.getTitle(); }
	 
	
	public void clickregnewpatientbutton()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(registernewpatient).click();
	}
	
	public void clickregpatientbutton()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(registernewpatienbutton).click();
	}
	
	public void patientdetails(String idtype1, String idnumber1) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  driver.findElement(idtype).click(); 
		  Thread.sleep(2000);
		  driver.findElement(idtype_type).sendKeys(idtype1);
		  
		  driver.findElement(idtype_type).sendKeys(Keys.DOWN);
		  driver.findElement(idtype_type).sendKeys(Keys.ENTER);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(idnumber).sendKeys(idnumber1);
		 
	}


}
