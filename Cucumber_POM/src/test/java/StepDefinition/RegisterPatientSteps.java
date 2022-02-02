package StepDefinition;

import java.util.Map;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;
import com.pages.RegisterPatientPage;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterPatientSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private RegisterPatientPage PatientPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) throws Exception {
	  
		List<Map<String, String>> credlist =dataTable.asMaps();
		
		String username = credlist.get(0).get("username");
		String password = credlist.get(0).get("password");
		
		DriverFactory.getDriver().get("https://primarycarefacility.int.ainqaplatform.in");
		PatientPage = loginPage.doLogin(username, password);
		
		//PatientPage.clickOnLogin();
		
		Thread.sleep(4000);
	}
	
	
	  @Given("user is on Dashboard page")
	  public void user_is_on_Dashboard_page() {
	  String accountTitle1 = PatientPage.getAccountTitle();
	  
	  System.out.println("Title of the page: "+accountTitle1); }
	  


	@Then("User clicks on Registernewpatient button")
	public void user_clicks_on_registernewpatient_button() throws InterruptedException {
		
		PatientPage.clickregnewpatientbutton();
		
		Thread.sleep(4000);
	    
	}
	
	@And("user clicks on RegisterPatient button")
public void user_clicks_on_RegisterPatient_button() throws InterruptedException {
		
		
	    PatientPage.clickregpatientbutton();
	    
	    Thread.sleep(5000);
	}
	
	@And("user fills Patient Details")
	
public void user_fills_Patient_Details() throws Exception {
		PatientPage.patientdetails();
		Thread.sleep(4000);
	    
	}

}
