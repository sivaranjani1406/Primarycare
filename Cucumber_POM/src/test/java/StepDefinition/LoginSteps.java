package StepDefinition;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static String Title;
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  DriverFactory.getDriver().get("https://primarycarefacility.int.ainqaplatform.in");
	
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		Title = loginPage.getLoginPageTitle();
		System.out.println("Login page title: "+Title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String exptitlename) {
		Assert.assertTrue(Title.contains(exptitlename));
	}


	@When("user enters username {string}")
	public void user_enters_username(String username) {
	
		loginPage.enterUserName(username);
		
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	 loginPage.enterPassword(password);
	}

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	
		loginPage.clickOnLogin();
		
	}

}
