package mentor;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Resubmission extends Baseclass {
	

		@Test
		
			public void move() throws InterruptedException {
				Actions builder=new Actions(driver);
			    Thread.sleep(2000);
		     	WebElement ele = driver.findElement(By.xpath("//div[@class='custom v-list-item v-list-item--link theme--light']/div[text()='Dashboard']"));
			    builder.moveToElement(ele).click().build().perform();
			    Thread.sleep(2000);		
		}
		    @Test
		    public void clickall() throws InterruptedException {
			    Thread.sleep(4000);
			    JavascriptExecutor js=(JavascriptExecutor)driver;
		        js.executeScript("window.scrollBy(0,500)");
			    Thread.sleep(3000);
		    }
			
		    @Test
		    public void sub() throws InterruptedException {
		    	
		    	// click the Re submission button
		    	driver.findElement(By.xpath("//a[contains(text(),'Resubmission Pending ')]")).click();
		    	Thread.sleep(3000);
		    	
		    	//click the view button according to the house number.
		    	String house="77";
		    	driver.findElement(By.xpath("//div[text()='"+house+"']/../div[contains(@class,'ag-cell-value ag-cell ag-cell-not-inline-editing ag-cell-normal-height acti')]/div/div/button")).click();
		    	Thread.sleep(3000);
		    	
		    	// click the comment and click the cancel icon.
		        driver.findElement(By.xpath("//a[@class='badge badge-primary']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//img[@class='profile-image']")).click();
		        Thread.sleep(3000);
		    }
		    
		//(//span[text()='Rr']/../../../../following-sibling::div[@name='center']/div/div/div)[1]/div[@col-id='required']/div/div/input
		 
		    @Test
		    public void visit() throws InterruptedException {
		    	
		    	// to select the visit
		    	String vis="Visit 1";
		    	driver.findElement(By.xpath("//a[text()='"+vis+"']")).click();
		    	Thread.sleep(3000);
		    	
		    	//click the download button
		    	driver.findElement(By.xpath("(//button[@class='btn visit-download m-1 btn-primary'])[2]")).click();
		    	
		    	//to get the pop up message
		    	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='el-message__content']")));
		    	System.out.println(driver.findElement(By.xpath("//p[@class='el-message__content']")).getText());
		    	Thread.sleep(3000);
		    	//a[text()='Visit 1']/../following::div/div[@aria-hidden='false']/div/button[@class='btn visit-download m-1 btn-primary']
		    }
		    @Test
		    public void proficiency() throws InterruptedException {
		    	
		    	//to select the proficiency
		    	driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-primary']")).click();
		    	Thread.sleep(3000);
		    	String profi="Proficiency Level 2";
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//li[@role='presentation']/a[text()='"+profi+"']")).click();
		    }
		 
		    @Test
		    public void locate() throws InterruptedException {	
		    	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
				//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//p[@class='location-button'])[1]" ))));
				Actions mov3=new Actions(driver);
		    	WebElement ele=driver.findElement(By.cssSelector("div[class='tab-content mt-1']>div[aria-hidden='false'] div div>p~p~p"));
		    	mov3.moveToElement(ele).click().perform();
			//	driver.findElement(By.cssSelector("div[class='tab-content mt-1']>div[aria-hidden='false'] div div>p~p~p" )).click();
				Thread.sleep(3000);
				 	
		    	Set<String> handles = driver.getWindowHandles();
		    	Iterator<String> iterator = handles.iterator();
		    	Thread.sleep(3000);
		    	String parent = iterator.next();
		    	String child = iterator.next();
		    	Thread.sleep(3000);
		    	driver.switchTo().window(child);
		    	String title = driver.getTitle();
		    	Thread.sleep(3000);
		    	System.out.println(title);
		    	Thread.sleep(3000);
		    	driver.close();
		    	driver.switchTo().window(parent);
		    	}
		    
			/*
			 * @Test(dependsOnMethods = "proficiency") public void ini() throws
			 * InterruptedException { FamilyMember obj=new FamilyMember(driver);
			 * obj.action(); }
			 */
		 
	}
