package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;

	private By title1 = By.id("id_gender1");
	private By title2 = By.id("id_gender2");
//	private By name;
//	private By email;
	private By password = By.id("password");
	private By dobDate;
	private By dobMonth;
	private By dobYear;
	private By signUpCheckbox;
	private By reviceCheckbox;
	private By firstName;
	private By lastName;
	private By company;
	private By address;
	private By address2;
	private By contry;
	private By state;
	private By city;
	private By zipcode;
	private By mobileNumber;
	private By createAccount;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterTitlePass(String t, String p) {
		
		if (t.equalsIgnoreCase("Mr")) {
            driver.findElement(title1).click();
        } else {
            driver.findElement(title2).click();
        }
		driver.findElement(password).sendKeys(p);
	}

	public void enterDates(String dd, String mm, String yy) {
		driver.findElement(dobDate).sendKeys(dd);
		driver.findElement(dobMonth).sendKeys(mm);
		driver.findElement(dobYear).sendKeys(yy);
	}

	public void clickCheckBoxes() {
		driver.findElement(signUpCheckbox).click();
		driver.findElement(reviceCheckbox).click();
	}

	public void enterNameCompany(String firstN, String lastN, String comp) {
		driver.findElement(firstName).sendKeys(firstN);
		driver.findElement(lastName).sendKeys(lastN);
		driver.findElement(company).sendKeys(comp);
	}

	public void enterAddress(String add, String add2, String cont, String sta, String ci, String zip) {
		driver.findElement(address).sendKeys(add);
		driver.findElement(address2).sendKeys(add2);
		driver.findElement(contry).sendKeys(cont);
		driver.findElement(state).sendKeys(sta);
		driver.findElement(city).sendKeys(ci);
		driver.findElement(zipcode).sendKeys(zip);
	}

	public void enterMobileNumber(String mob) {
		driver.findElement(mobileNumber).sendKeys(mob);
	}

	public void clickOnCreateAccount() {
		driver.findElement(createAccount).click();
	}

}
