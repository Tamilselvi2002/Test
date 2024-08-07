package mentorLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignInClass {
	public static WebDriver driver;

	//@Test
	public void signin() throws InterruptedException {
		// Launch browser
		driver = new ChromeDriver();
		driver.get("https://community.medyaan.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Sign in
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9952346094");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//div[@class='login-button-box']")).click();

		// click student module
		Actions builder = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//div[text()='Student'])[2]"));
		builder.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.cssSelector("#hodquickFilter"));
		search.sendKeys("Aparna");
		System.out.println(driver.findElement(By.xpath("//span[@class='ag-cell-value']")).getText());
	}
}


