package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginPage {

	private static WebDriver driver;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement  Signup_Login_Btn;
	
	@FindBy(xpath="//div[@class='login-form']//input[@name='email']")
	WebElement loginEmail;
	
	@FindBy(xpath="//div[@class='login-form']//input[@name='password']")
	WebElement loginPassword;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement LoginButton;
	
	@FindBy(xpath="//div[@class='signup-form']//input[@name='email']")
	WebElement signupEmail;
	
	@FindBy(xpath="//div[@class='signup-form']//input[@name='name']")
	WebElement signupName;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement signupButton;
	
	@FindBy(xpath="//div[@class='login-form']//h2")
	WebElement LoginToYourAccountText;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn_Signup_Login_Btn() {
		Signup_Login_Btn.click();
	}
	
	public void enterLoginEmail(String str) {
		loginEmail.sendKeys(str);
	}
	
	public void enterLoginPassword(String str) {
		loginPassword.sendKeys(str);
	}
	
	public static void clickHidden(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void clickLoginButton() {
		clickHidden(LoginButton);
	}
	
	public void enterSignupEmail(String str) {
		signupEmail.sendKeys(str);
	}
	
	public void enterSignupName(String str) {
		signupName.sendKeys(str);
	}
	
	public void clickSignupButton() {
		clickHidden(signupButton);
	}
	
	public void verifyLoginToYourAccountText(String expected) {
		String actual = LoginToYourAccountText.getText();
		Assert.assertEquals(expected, actual);
	}
	
}
