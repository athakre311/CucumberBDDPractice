package stepDefinations.stepDefination_AE;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class AE_04_ContactUsStepDefination {
	WebDriver driver;
	LoginPage loginPage;

	@When("enter required field")
	public void enter_required_field() {
		loginPage.enterSignupName("tesr3467");
		loginPage.enterSignupEmail("tesr3467@test.me");
		loginPage.clickSignupButton();
	}

	@Then("then user able to register and success message display")
	public void then_user_able_to_register_and_success_message_display() {
	    System.out.println(">>> Hello Abby <<<");
	}

}
