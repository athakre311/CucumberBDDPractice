package stepDefinations.stepDefination_AE;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class AE_02_LoginStepDefinationAE {
	
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
//	Properties prop;

	@Given("User is on login_Register page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.automationexercise.com/");
		loginPage.clickOn_Signup_Login_Btn();
	}

	@When("User enter valid userName {string} and password {string}")
	public void user_enter_valid_user_name(String uname, String pass ) {
		loginPage.enterLoginEmail(uname);	
		loginPage.enterLoginPassword(pass);
		}

	@And("user click on login button")
	public void user_click_on_submit_button() {
		loginPage.clickLoginButton();
		
	}

	@Then("User should redirect to dashboard")
	public void user_should_redirect_to_dashboard() {
		System.out.println(" Step >>> 001");
	}

	@Then("Dashboard welcome message should be displayed")
	public void dashboard_welcome_message_should_be_displayed() {
//		String str = driver.findElement(By.xpath("//a[@href='/logout']")).getText();
//		Assert.assertEquals(str, "Logout");
	}

}
