package stepDefinations.stepDefination_old;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {

		driver.get("https://www.saucedemo.com/");

	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String string) {
		System.out.println("Method 2 " + string);

	}

	@And("^Enter valid password (.+)$")
	public void enter_valid_password(String string) {
		System.out.println("Method 3 " + string);

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Method 4 ");

	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("Method 5 ");
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String string) {
		System.out.println(">>User enters invalid email address" + string);

	}

	@When("Enter invalid password {string}")
	public void enter_valid_inpassword(String string) {
		System.out.println(">>Enter invalid password" + string);

	}

	@Then("User should get warning massage")
	public void user_should_get_warning_massage() {
		System.out.println(">>User should get warning massage");

	}

}
