package testSU.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testSU.Pages.Homepage;
import utility.WebdriverManager;

public class TestHomePage {


	WebdriverManager webdriverManager = new WebdriverManager();
	WebDriver driver = webdriverManager.getBrowserCapabilities("chrome");
	Homepage homePage = new Homepage(driver);

	@Given("^Navigate to home page$")
	public void navigate_to_home_page() throws Throwable {
		webdriverManager.initialize();
	}

	@Then("^Check whether username, password and login button is present$")
	public void check_whether_username_password_and_login_button_is_present() throws Throwable {
		homePage.checkFields();
	}

	@And("^Input email address (.+) and password (.+) into the respective fields$")
	public void input_email_address_and_password_into_the_respective_fields(String emailaddress, String password)
			throws Throwable {
		homePage.sendInput(emailaddress, password);
		
		
	}

	// Test 2

	@When("^Check whether there are three values in the listgroup$")
	public void check_whther_there_are_three_values_in_the_listgroup() throws Throwable {
		homePage.listGroup();
	}

	@Then("^Check whether the second list item's badge value is 6$")
	public void check_whether_the_second_list_items_badge_value_is_6() throws Throwable {

	}

	@And("^check the second list item's value is set to \"([^\"]*)\"$")
	public void check_the_second_list_items_value_is_set_to_something(String strArg1) throws Throwable {
		homePage.listItem2Check();
		
			
	}

	// Test 3

	@When("^Check Option 1 is the default selected value$")
	public void check_option_1_is_the_default_selected_value() throws Throwable {

		homePage.option1Select();

	}

	@Then("^Select Option 3 from the select list$")
	public void select_option_3_from_the_select_list() throws Throwable {
		homePage.option3Select();
		

		

	}

	// Test 4

	@Then("^Check that the first button is enabled and that the second button is disabled$")
	  public void
	  check_that_the_first_button_is_enabled_and_that_the_second_button_is_disabled
	  () throws Throwable { homePage.buttonEnabled();
	  
	}

	// Test 5

	@When("^Click on the button once it's displayed$")
	public void click_on_the_button_once_its_displayed() throws Throwable {
		
		homePage.buttonDisplayed();
		
	}

	@Then("^Check that the button is now disabled$")
	public void check_that_the_button_is_now_disabled() throws Throwable {
		homePage.successMessage();
	}

	@And("^Once you've clicked the button, check that a success message is displayed$")
	public void once_youve_clicked_the_button_check_that_a_success_message_is_displayed() throws Throwable {
		homePage.buttonDisabled();
		
	}

	// Test 6

	@When("^Find the value of any cell on the grid$")
	public void find_the_value_of_any_cell_on_the_grid() throws Throwable {

		homePage.cellGrid();
	}

	@Then("^Check whether the value of the cell is \"([^\"]*)\"$")
	public void check_whether_the_value_of_the_cell_is_something(String strArg1) {
		homePage.coordinateCell();
	}

	@And("^Find the value of the cell at coordinates 2, 2$")
	public void find_the_value_of_the_cell_at_coordinates_2_2() throws Throwable {
		
		homePage.checkCoordinate();
		

	}

}
