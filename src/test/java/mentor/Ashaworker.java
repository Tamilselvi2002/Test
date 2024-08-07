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

public class Ashaworker extends Baseclass {
	
		@Test
			public void launch() throws InterruptedException {	
		 
			
				//Move to Asha worker
				Actions move=new Actions(driver);
				move.moveToElement(driver.findElement(By.xpath("(//div[@class='v-list-item__icon'])[7]"))).build().perform();
				driver.findElement(By.xpath("(//div[text()='Asha Worker'])[2]")).click();
				Thread.sleep(2000);
				move.moveToElement(driver.findElement(By.xpath("//h4[@class='text-left']"))).build().perform();
				Thread.sleep(2000);
				/*
				 * driver.findElement(By.xpath("//button[@data-test='download-button']")).click(
				 * ); Thread.sleep(3000);
				 */
				}
			@Test
			public void error() throws InterruptedException{
				
				//click the Add asha worker button
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				Thread.sleep(2000);
				
				//click the submit button
		        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		        Thread.sleep(2000);
		        
		        //print the error message
				List<WebElement> elements = driver.findElements(By.xpath("//div[@class='error-css']"));
				for (WebElement error : elements) {
					System.out.println(error.getText());
				}
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".btn.back-nav-btn.btn-secondary")).click();
				driver.findElement(By.cssSelector(".el-button.el-button--default.el-button--small.el-button--primary ")).click();
			}
			@Test
			public void add() throws InterruptedException{
				
				//Add new worker
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
				Thread.sleep(2000);
			    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Meera");
			    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("21");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//div[@class='custom-control custom-control-inline custom-radio'])[2]")).click();
			    driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("9500285403");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Trichy");
			    driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("621305");
			    Thread.sleep(2000);
			}
			@Test
			
			public void cancel() throws InterruptedException{    
			    //Click the cancel button
			    driver.findElement(By.cssSelector(".btn.back-nav-btn.btn-secondary")).click();
			    //get the pop up message
			    String can = driver.findElement(By.cssSelector(".el-message-box__message p")).getText();
			    Thread.sleep(2000);
			    System.out.println(can);
			   // String can1="Cancelling will discard all the changes, Are you sure to continue?";
			    Thread.sleep(2000);
			    
			    //verify that message
			  //  Assert.assertEquals(can, can1);
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.cssSelector(".btn.back-nav-btn.btn-secondary")).click();
			    driver.findElement(By.cssSelector(".el-button.el-button--default.el-button--small.el-button--primary ")).click();
			    Thread.sleep(2000);
			    
			}
			@Test
			public void save() throws InterruptedException {
			    
			    //Click the save button
			    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				Thread.sleep(2000);
			    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Meera");
			    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("21");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//div[@class='custom-control custom-control-inline custom-radio'])[2]")).click();
			    driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("9500285403");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Trichy");
			    driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("621305");
			    Thread.sleep(2000);
		        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		       
			}
			@Test
			public void success() throws InterruptedException {
		        //get the successful pop up message.
		        Thread.sleep(2000);
		      WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".el-message__content")));
		        String name = driver.findElement(By.cssSelector(".el-message__content")).getText();
		        Thread.sleep(3000);
		        System.out.println(name);
		        String name1="Meera is added as asha worker successfully";
		        Thread.sleep(2000);
		        //verify the message
		        Assert.assertEquals(name, name1);
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
			}
			@Test
			public void edit() throws InterruptedException {
				
				//Edit the added worker
				driver.findElement(By.xpath("//button[@class='btn common-view-edit-btn-css mr-3 btn-secondary']")).click();
				Thread.sleep(2000);
				
				WebElement element = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
				element.clear();
				element.sendKeys("7806855311");
				driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
				Thread.sleep(32000);
				 //Edit the worker
		  	    driver.findElement(By.cssSelector("#quickFilter")).sendKeys("Hema");
			    Thread.sleep(2000);
			    driver.findElement(By.cssSelector(".btn.common-view-edit-btn-css.mr-3.btn-secondary")).click();
			    WebElement element1 = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
			    Thread.sleep(2000);
			    element1.clear();
			    element1.sendKeys("Manapparai");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
			    Thread.sleep(2000);
				//get the message for the edit
				String name3 = driver.findElement(By.cssSelector(".el-message__content")).getText();
				System.out.println(name3);
				Thread.sleep(2000);
				String name4="Hema profile updated successfully";
				//verify the message
				Assert.assertEquals(name3, name4);
				Thread.sleep(2000);
			}
				
				
				/*List<WebElement> elements = driver.findElements(By.cssSelector(".empty-1.col-12"));	
				List<WebElement> collect = elements.stream().collect(Collectors.toList());
				Thread.sleep(3000);  */   
				       
			
			@Test
			public void delete() throws InterruptedException {
				//Delete the created worker
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@class='btn delete-asha-btn btn-secondary']")).click();
				driver.findElement(By.xpath("//div[@class='el-message-box__btns']/button[2]")).click();
				Thread.sleep(2000);
				
				//get the deleted message
				String name5 = driver.findElement(By.cssSelector(".el-message__content")).getText();
				System.out.println(name5);
				Thread.sleep(2000);
				String name6="Asha Worker has been deleted";
				
				//verify that message
				Assert.assertEquals(name5, name6);
			
		       				
			  //delete the worker.
				/*
				 * Thread.sleep(3000); WebElement element2 =
				 * driver.findElement(By.cssSelector("#quickFilter")); element2.clear();
				 * element2.sendKeys("Priya"); Thread.sleep(3000);
				 * driver.findElement(By.cssSelector(".btn.delete-asha-btn.btn-secondary")).
				 * click(); Thread.sleep(3000); driver.findElement(By.
				 * cssSelector(".el-button.el-button--default.el-button--small.el-button--primary "
				 * )).click(); //get the pop up message Thread.sleep(3000);
				 * System.out.println(driver.findElement(By.cssSelector(".el-message__content"))
				 * .getText());
				 */
				
			}
			@Test
			public void totalashaworker() {
			    
			    driver.findElement(By.cssSelector("#quickFilter")).clear();
			    
			    //print the list.
			    List<WebElement> elements3 = driver.findElements(By.cssSelector(".ag-root-wrapper.ag-layout-normal.ag-ltr"));
			    for (WebElement list : elements3) {
			    	String text = list.getText();
			    	System.out.println(text);
			    }
		}
		 
		 

	}


