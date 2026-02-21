package stepDefinations.stepDefination_AE;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.LoginPage;

public class AE_01_Demo_RegisterStepDefinationAE2 {
	WebDriver driver;
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());;

//	@When("enter required field")
	public void enter_required_field() {
		
	}

//	@Then("then user able to register and success message display")
	public void then_user_able_to_register_and_success_message_display() {
	    System.out.println(">>> Hello Abby <<<");
	}
	
//	@Then("{string} text should be visible")
	public void text_should_be_visible(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@When("User enters name and email address")
	public void user_enters_name_and_email_address() {
		loginPage.enterSignupName("tesr3467");
		loginPage.enterSignupEmail("tesr3467@test.me");
		
	}

//	@When("User clicks on Signup button")
	public void user_clicks_on_Signup_button(){
		driver = loginPage.clickSignupButton();
	}

//	@When("User fills account details:")
	public void user_fills_account_details(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);

        // Select Title (Radio Button)
        if (data.get("Title").equalsIgnoreCase("Mr")) {
            driver.findElement(By.id("id_gender1")).click();
        } else {
            driver.findElement(By.id("id_gender2")).click();
        }

        // Enter Name
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(data.get("Name"));

        // Enter Email (if editable)
        // driver.findElement(By.id("email")).clear();
        // driver.findElement(By.id("email")).sendKeys(data.get("Email"));

        // Enter Password
        driver.findElement(By.id("password")).sendKeys(data.get("Password"));

        // Select Date of Birth
        driver.findElement(By.id("days")).sendKeys(data.get("Day"));
        driver.findElement(By.id("months")).sendKeys(data.get("Month"));
        driver.findElement(By.id("years")).sendKeys(data.get("Year"));
	}

//	@And("User selects checkbox {string}")
    public void user_selects_checkbox(String checkboxText) {

        if (checkboxText.equalsIgnoreCase("Sign up for our newsletter!")) {
            driver.findElement(By.id("newsletter")).click();
        } 
        else if (checkboxText.equalsIgnoreCase("Receive special offers from our partners!")) {
            driver.findElement(By.id("optin")).click();
        }
    }

    // ---------------- Address Details ----------------

//    @And("User fills address details:")
    public void user_fills_address_details(DataTable dataTable) {

        Map<String, String> data = dataTable.asMap(String.class, String.class);

        driver.findElement(By.id("first_name")).sendKeys(data.get("FirstName"));
        driver.findElement(By.id("last_name")).sendKeys(data.get("LastName"));
        driver.findElement(By.id("company")).sendKeys(data.get("Company"));
        driver.findElement(By.id("address1")).sendKeys(data.get("Address"));
        driver.findElement(By.id("address2")).sendKeys(data.get("Address2"));

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText(data.get("Country"));

        driver.findElement(By.id("state")).sendKeys(data.get("State"));
        driver.findElement(By.id("city")).sendKeys(data.get("City"));
        driver.findElement(By.id("zipcode")).sendKeys(data.get("Zipcode"));
        driver.findElement(By.id("mobile_number")).sendKeys(data.get("Mobile"));
    }

    // ---------------- Button Click ----------------


//    @When("User clicks on {string} button")
    public void user_clicks_on_button(String buttonName) {

        driver.findElement(By.xpath("//button[contains(text(),'" + buttonName + "')]")).click();
    }
    
    
//    @When("User clicks on Delete Account button")
    public void user_clicks_on_Delete_Account_button() {
        driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click();
    }
    
//    @When("User clicks on Continue button")
    public void user_clicks_on_Continue_button() {
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
    }

    // ---------------- Text Verification ----------------

//    @Then("{string} text should be visible")
//    public void text_should visible(String expectedText) {
//
//        String actualText = driver.findElement(By.xpath("//*[contains(text(),'" + expectedText + "')]"))
//                                  .getText();
//
//        Assert.assertTrue(actualText.contains(expectedText),
//                "Expected text not found: " + expectedText);
//    }

//    @Then("{string} should be visible")
//    public void logged_in_text_should_be_visible(String expectedText) {
//
//        String actualText = driver.findElement(By.xpath("//*[contains(text(),'" + expectedText + "')]"))
//                                  .getText();
//
//        Assert.assertTrue(actualText.contains(expectedText),
//                "Expected text not visible: " + expectedText);
//    }

}
