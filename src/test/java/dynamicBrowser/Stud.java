package dynamicBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Stud extends Basetest{
	
		
	@Test
	public void student() throws InterruptedException {
	driver.get("https://community.medyaan.com/");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9952346094");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//div[@class='login-button-box']")).click();
	
	
	//click student module
	Actions builder=new Actions(driver);
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("(//div[text()='Student'])[2]"));
	builder.moveToElement(ele).click().build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='btn mb-1 mr-1 btn-primary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input")).sendKeys("Risha");
	driver.findElement(By.xpath("//label[text()='Last Name ']/following-sibling::input")).sendKeys("shanthi");
	driver.findElement(By.xpath("//label[text()='Register No ']/following-sibling::input")).sendKeys("9345");
	driver.findElement(By.xpath("//label[text()='Batch No ']/following-sibling::input")).sendKeys("4545");
	
	
	driver.findElement(By.xpath("//label[text()='Mobile Number ']/following-sibling::input")).sendKeys("7272727272");
	driver.findElement(By.xpath("//label[text()='Email ']/following-sibling::input")).sendKeys("risha@123");
	
	
}
}