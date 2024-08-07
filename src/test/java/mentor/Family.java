package mentor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Family extends Baseclass{
	//Sign in
	@Test
	public void  clickfamily() throws InterruptedException {
		//click family module
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='custom v-list-item v-list-item--link theme--light']/div[text()='Family']"));
		builder.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);		
     }

	
	@Test
	  public void viewclick() throws InterruptedException {
	  Thread.sleep(2000); 
	  String Num="4598";
	  driver.findElement(By.xpath("//div[text()='"+Num+"']/following::div/div")).click();
	  Thread.sleep(2000);
	  Actions builder=new Actions(driver); Thread.sleep(2000); 
		 WebElement ele = driver.findElement(By. xpath("//div[@class='custom v-list-item v-list-item--link theme--light']/div[text()='Family']"));
		 builder.moveToElement(ele).click().build().perform();
		 Thread.sleep(2000);
	}

	@Test
  public void Transferclose() throws InterruptedException {
		Actions builder=new Actions(driver);
		WebElement dow = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		builder.moveToElement(dow).build().perform();
	Thread.sleep(2000);
	String box="Raju bhai";
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Raju bhai']/../../../div/div")));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='"+box+"']/../../../div/div")).click();
	//driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span/div/p[text()='"+box+"']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#dropdown-1__BV_toggle_")).click();
	driver.findElement(By.xpath("//a[text()='Transfer Family']")).click();
	Thread.sleep(2000);
	String name="Ribhadharshini B(171103)";
	WebElement drop = driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select down =new Select(drop);
	down.selectByVisibleText(name);
	//Yuvan Shankar(1234)
	//Ribhadharshini B(171103)
	
	driver.findElement(By.xpath("//button[@class='btn back-nav-btn btn-secondary']")).click();
}
	
	@Test
	public void Transfersubmit() throws InterruptedException {
		//String box="Raja";
		//driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span/div/p[text()='"+box+"']")).click();
		driver.findElement(By.cssSelector("#dropdown-1__BV_toggle_")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Transfer Family']")).click();
		Thread.sleep(2000);
		String name="Ribhadharshini B(171103)";
		WebElement drop = driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select down =new Select(drop);
		down.selectByVisibleText(name);
		
		// to click submit button and click no
		driver.findElement(By.xpath("//button[@class='btn ml-2 submit_button btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
		// to click submit button and click yes

		driver.findElement(By.xpath("//button[@class='btn ml-2 submit_button btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
		Thread.sleep(2000);
		//to get pop up message
		System.out.println(driver.findElement(By.xpath("//p[@class='el-message__content']")).getText());
	}
	

	@Test
	public void area() throws InterruptedException {
		//Actions builder=new Actions(driver);
		Thread.sleep(2000);
		//WebElement ele2 = driver.findElement(By.xpath("//span[text()='Area']"));
		
		//builder.moveToElement(ele2).build().perform();
		driver.findElement(By.xpath("//button[text()='Area']")).click();
		Thread.sleep(2000);
		String area="test";
		driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox']/label[text()='"+area+"']")).click();
		List<WebElement> mem = driver.findElements(By.xpath("//div[@class='ag-cell-wrapper']"));
		for (WebElement web : mem) {
	    System.out.println("Area filter names:  " + web.getText());
	}
	}
	
	
	@Test
	public void studentclick() {
		driver.findElement(By.xpath("//button[text()='Student']")).click();
		String student="Sarath K";
		driver.findElement(By.xpath("//div[@class='capitalize-text custom-control custom-checkbox']/label[contains(text(),'"+student+"')]")).click();
		List<WebElement> mem = driver.findElements(By.xpath("//div[@class='ag-cell-wrapper']"));
		for (WebElement web : mem) {
	    System.out.println("Student filter:  " + web.getText());
	}
	}
	
	
	@Test
	public void proficiencyclick() {
		driver.findElement(By.xpath("//button[text()='Proficiency']")).click();
		String profi="3";
		driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox']/label[text()='"+profi+"']")).click();
		List<WebElement> mem = driver.findElements(By.xpath("//div[@class='ag-cell-wrapper']"));
		for (WebElement web : mem) {
	    System.out.println("proficieny filter:  " + web.getText());
		}	
	}
	
	
	
	
	@Test
	public void download() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	@Test
	public void search() {
		driver.findElement(By.cssSelector("#hodfamilyquickFilter")).sendKeys("David");
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='ag-cell-value']"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
	}
	
	}
