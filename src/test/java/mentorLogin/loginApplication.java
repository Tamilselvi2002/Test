package mentorLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import community.LoginPages;
import mentor.MorbidityModule;

public class loginApplication {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	LoginPages login=new LoginPages(driver);
	login.Applicationurl();
	login.Application("9952346094","Admin@123");
	
	
}
}