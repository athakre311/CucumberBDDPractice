package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class HomePage {

	private static WebDriver driver;
	
	@FindBy(xpath="//li//a//b/..")
	WebElement   Logged_in_as_Text ;
	
	@FindBy(xpath ="//a[@href='/logout']")
	WebElement logoutButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogged_in_as_Text(String expected) {
		String actual = Logged_in_as_Text.getText();
		Assert.assertEquals(expected, actual);
	}
	
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}

}
