package mentor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MorbidityModule extends Baseclass{

	 //   @Test
	   // public void Morbi( WebDriver driver) throws InterruptedException {
	    	
	    	
	      // WebDriver driver=SignInClass.driver; 
	    @Test
	    public void clickmorbidity() throws InterruptedException {
	    Thread.sleep(2000);
	    Actions builder=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//div[text()='Morbidity'])[2]"));
		builder.moveToElement(element).click().build().perform();
		String text=element.getText();
		System.out.println(text);
		Thread.sleep(2000);
	    }
		
		// to click the view button
	    @Test
	    public void clickview() throws InterruptedException {
	    Thread.sleep(2000);
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='download-button']")));
		Thread.sleep(2000);
		
		String name="Mari Selvam";
		driver.findElement(By.xpath("//div[text()='"+name+"']/following::div/div/button")).click();
	
		//get the url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	    String url="https://community.medyaan.com/member-view/1465";
	   //using Assert 
	    Assert.assertEquals(url, currentUrl);
	    }
		  
	    
	    
		//click visit dropdown
	    @Test
	    public void totalmember() throws InterruptedException {
		Actions builder=new Actions(driver);
		WebElement element3 = driver.findElement(By.xpath("(//div[text()='Morbidity'])[2]"));
		builder.moveToElement(element3).click().build().perform();
		Thread.sleep(2000);
	    // to get the total member name
	    List<WebElement> mem = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
	    for (WebElement member : mem) {
	    System.out.println(member.getText());
			}
	    }
			

			
		// click the download button
	    @Test
	    public void download(){
		driver.findElement(By.xpath("//button[@data-test='download-button']")).click();
	    }
	    
	    
		// Area filter
			@Test
			public void area() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Area']")).click();
			String place="Moggapair";
			driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='"+place+"']")).click();
		    List<WebElement> pl = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
			for (WebElement web : pl) {
			System.out.println("Area Filter: "+ web.getText());
			}
			 }	
			
			
	     //Proficiency filter
			@Test
			public void proficiency() {
			driver.findElement(By.xpath("//button[text()='Proficiency']")).click();
			String prof="3";
			driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='"+prof+"']")).click();
			List<WebElement> li= driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
		     for (WebElement web1 : li) {
			System.out.println("Proficiency  Filter: "+web1.getText());
		    }
			 }
			
			
			// Morbidity filter
			@Test
		   public void morbidity() {
		   driver.findElement(By.xpath("//button[text()='Morbidity']")).click();
	       String mobidity="Cataract";
	       driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='"+mobidity+"']")).click();
		   List<WebElement> li2 = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
		   for (WebElement web2 : li2) {
		   System.out.println("Morbidity Filter: "+web2.getText());
			}
             }  
		        
			//visit filter
          @Test
          public void Visit() throws InterruptedException {
        	  
			driver.findElement(By.xpath("//button[text()='Visit No']")).click();
			Thread.sleep(2000);
			String num="3";
			driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='"+num+"']")).click();
		    List<WebElement> li3 = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
		    for (WebElement web3 : li3) {
		    	 System.out.println("Visit Filter: "+web3.getText());	
			}
             }
          
          @Test
			public void search() {
			WebElement search = driver.findElement(By.cssSelector("#hodfamilyquickFilter"));
			search.clear();
			search.sendKeys("malini");
			System.out.println(driver.findElement(By.xpath("//div[@class='custom-cell-icon-container']")).getText());
			}
		
		}
	  
		
		
		
		
		





