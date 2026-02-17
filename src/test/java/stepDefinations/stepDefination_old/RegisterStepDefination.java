package stepDefinations.stepDefination_old;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefination {

	@Given("user navigate to Register page")
	public void user_navigate_to_register_page() {
		System.out.println("Register 1 ");
	}

	@When("User enters firstname below details into fields")
	public void User_enters_firstname_below_details_into_fields(DataTable dataTable) {
		
		Map<String, String> map1= dataTable.asMap(String.class, String.class);
		
		System.out.println("enter first name "+map1.get("firstname"));
		System.out.println("enter first name "+map1.get("lastname"));
		System.out.println("enter first name "+map1.get("email"));
		System.out.println("enter first name "+map1.get("password"));

		
	}

	@When("User select privacy policy field")
	public void user_select_privacy_policy_field() {
		
	}

	@When("click on continue button")
	public void click_on_continue_button() {
		
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		
	}

}
