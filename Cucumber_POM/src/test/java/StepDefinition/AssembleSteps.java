package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.pages.AssemblePages;
import com.util.ExcelReader;

public class AssembleSteps {

	private WebDriver driver;
	private AssemblePages AssemblePages = new AssemblePages(DriverFactory.getDriver());

	@Given("user navigates to Register New Patient screen")
	public void user_navigates_to_register_new_patient_screen() {
		
		AssemblePages.clickregnewpatientbutton();
		AssemblePages.clickregpatientbutton();


	}

	@When("user fills patient details from sheetname {string} and rownumber {int}")
	public void user_fills_patient_details_from_sheetname_and_rownumber(String sheetName, Integer rowNumber)
			throws InvalidFormatException, Exception {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader
				.getData("C:/Users/SivaranjaniManoharan/Desktop/Primary Care/automationexcel.xlsx", sheetName);

		String idtype = testdata.get(rowNumber).get("ID Type");
		String idNumber = testdata.get(rowNumber).get("ID Number");

		AssemblePages.patientdetails(idtype, idNumber);

	}

}
