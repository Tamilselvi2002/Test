package screenshotusingtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestClass extends Baseclass {
	@Test
public void orange() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Test
	public void google() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("note" , Keys.ENTER);
	}
	@Test
	public void amazon() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("shoe", Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='enN Walk Calm E Shoes UK 9 Color Black (8596143)']")).click();
	}
}
