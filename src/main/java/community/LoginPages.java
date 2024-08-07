package community;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	WebDriver driver;

	public LoginPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Applicationurl() {
		driver.get("https://community.medyaan.com/");
	}

	@FindBy(xpath = "//input[@name='phone']")
	WebElement username;
	
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//div[@class='login-button-box']")
	WebElement submit;

	public void Application(String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		submit.click();
	}

	
}