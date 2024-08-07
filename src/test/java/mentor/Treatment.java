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

public class Treatment extends Baseclass {
	
		
		
		@Test
			 public void treat() throws InterruptedException {
			    	
				    //Move to the Treatment	
					Actions mov=new Actions(driver);
					mov.moveToElement(driver.findElement(By.xpath("(//div[@class='custom v-list-item v-list-item--link theme--light'])[6]"))).build().perform();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("(//div[text()='Treatment'])[2]")).click();	  
				    Thread.sleep(3000);
				    mov.moveToElement(driver.findElement(By.cssSelector("#treatmentDetailfilter"))).build().perform();
				    Thread.sleep(9000);
			}
			@Test
			public void print() throws InterruptedException {
				    //print the members name
				    Thread.sleep(3000);
				    List<WebElement> elements4 = driver.findElements(By.xpath("//div[contains(@class,'ell-normal-height ag')]"));
				    for (WebElement web : elements4) {
						String text = web.getText();
						System.out.println(text);
					}
				    //print the title
				    String title = driver.getTitle();
				    System.out.println(title);
				    Thread.sleep(3000);
				    String title1="Medyaan CM";
				    System.out.println(title1);
				    
				    //verify the title
				    if(title.equals(title1)) {
				    	System.out.println("The title is correct");	    	
				    }
				    Thread.sleep(9000);
			}
				    //Assert.assertEquals(title1, title);
			@Test
			public void view() throws InterruptedException {
				   //Click the View button by providing the IP number
				    Thread.sleep(9000);
				    String ipNumber="no";
				    driver.findElement(By.xpath("((//div[text()='"+ipNumber+"']/../div)/div/div/button[contains(@class,'btn c')])[1]")).click();
				    Thread.sleep(3000);
				    System.out.println(driver.findElement(By.cssSelector(".d-flex.justify-content-between.py-1 h4")).getText());
				    driver.findElement(By.xpath("(//button[@class='btn back-nav-btn btn-secondary'])[1]")).click();
				    Thread.sleep(3000);
				    
				    //Click the View button in Action by providing the IP number
				    String ipNum="no";
				    Thread.sleep(7000);
				    driver.findElement(By.xpath("((//div[text()='"+ipNum+"']/../div)/div/div/button[contains(@class,'btn c')])[2]")).click();
				    Thread.sleep(3000);
				    System.out.println(driver.findElement(By.cssSelector(".left-header-section >h3")).getText());
				    
				    //navigate backward.
				    Actions act2=new Actions(driver);
				    act2.moveToElement(driver.findElement(By.xpath("(//div[@class='custom v-list-item v-list-item--link theme--light'])[6]"))).build().perform();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("(//div[text()='Treatment'])[2]")).click();	
				    Thread.sleep(3000);
				    act2.moveToElement(driver.findElement(By.cssSelector("#treatmentDetailfilter"))).build().perform();
				    Thread.sleep(3000);
				    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(38));
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ag-header.ag-focus-managed.ag-pivot-off")));
			    	
				    
			}
			@Test
			public void search() throws InterruptedException {
				
				//search the particular name
				driver.findElement(By.cssSelector("#treatmentDetailfilter")).sendKeys("baskar");
				Thread.sleep(3000);
				WebElement element = driver.findElement(By.cssSelector(".custom-cell-icon-container"));
				Thread.sleep(3000);
				String text = element.getText();
				System.out.println(text);
				Thread.sleep(3000);
				String text1="Baskar P";
				
				//verify that name
				//Assert.assertEquals(text, text1);
			}
			@Test
			public void download() {
				
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			}
		 
		 

	}


