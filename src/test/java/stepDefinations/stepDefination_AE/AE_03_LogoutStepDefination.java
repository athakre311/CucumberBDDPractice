package stepDefinations.stepDefination_AE;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.LoginPage;

public class AE_03_LogoutStepDefination {
	
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Then("verify {string} should be visible")
	public void verify_should_be_visible(String string) {
		homePage.verifyLogged_in_as_Text(string);
	}

	@When("user clicks on Logout button")
	public void user_clicks_on_button() {
		homePage.clickOnLogoutButton();
	}

	@Then("Verify user should be navigated to login page")
	public void verifyuser_should_be_navigated_to_login_page() {
	  String expected = "Login to your account";
	  loginPage.verifyLoginToYourAccountText(expected);
	}

	
}
