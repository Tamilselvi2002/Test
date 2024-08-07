package mentor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Report extends Baseclass{
	
		
		
		@Test
			public void action() throws InterruptedException {
				Actions mov=new Actions(driver);
				//mov.scrollToElement(driver.findElement(By.xpath("//div[@class='v-list-item__icon']/i/following::div[text()='Report']")));
				Actions element = mov.moveToElement(driver.findElement(By.xpath("//div[@class='v-list-item__icon']/i/following::div[text()='Report']")));
		        element.click().build().perform();
		        Thread.sleep(3000);
		        mov.moveToElement(driver.findElement(By.xpath("//button[@class='btn btn-primary']"))).build().perform();
			}
			
			@Test
			public void fromDate() throws InterruptedException {
				Actions mov1=new Actions(driver);
				mov1.moveToElement(driver.findElement(By.cssSelector("#startDate"))).build().perform();
				Thread.sleep(3000);
				
				//click the cancel icon
				driver.findElement(By.cssSelector(".el-input__icon.el-icon-circle-close")).click();
				driver.findElement(By.cssSelector("#startDate")).click();
				Thread.sleep(3000);
			
				//choose the year
				driver.findElement(By.xpath("(//span[@class='el-date-picker__header-label'])[1]")).click();
				Thread.sleep(3000);
				String year="2024";
				driver.findElement(By.xpath("//table[@class='el-year-table']/tbody/tr/td[contains(@class,'available')]/a[text()='"+year+"']")).click();
				
				//choose the month
				Thread.sleep(3000);
				String month="Jul";
				driver.findElement(By.xpath("//table[@class='el-month-table']/tbody/tr/td/div/a[text()='"+month+"']")).click();
				
				//choose the date
				Thread.sleep(3000);
				String fromdate="1";
				driver.findElement(By.xpath("(//table[@class='el-date-table']/tbody/tr[@class='el-date-table__row']/td[@class='available']/div/span[contains(text(),'"+fromdate+"')])[1]")).click();
			}
			
			@Test
			public void toDate() throws InterruptedException {
				Actions mov2=new Actions(driver);
				mov2.moveToElement(driver.findElement(By.cssSelector("#endDate"))).build().perform();
				Thread.sleep(3000);
				
				//click the cancel icon
				driver.findElement(By.cssSelector(".el-input__icon.el-icon-circle-close")).click();
				driver.findElement(By.cssSelector("#endDate")).click();
				Thread.sleep(3000);	
				
				//select the year
				driver.findElement(By.xpath("(//span[@class='el-date-picker__header-label'])[3]")).click();
				Thread.sleep(3000);
				String year1="2024";
				driver.findElement(By.xpath("(//table[@class='el-year-table'])[2]/tbody/tr/td[contains(@class,'available')]/a[text()='"+year1+"']")).click();
				Thread.sleep(3000);
				
				//select the month
				String month1="Jul";
				driver.findElement(By.xpath("(//table[@class='el-month-table'])[2]/tbody/tr/td/div/a[text()='"+month1+"']")).click();
				Thread.sleep(3000);
				
				//select the date
				String todate="16";
				driver.findElement(By.xpath("((//table[@class='el-date-table'])[2]/tbody/tr/td/div/span[contains(text(),'"+todate+"')])[1]")).click();
			}
			
		 
			
			@Test
			public void report() throws InterruptedException {
				
				//select the report
				driver.findElement(By.cssSelector("#reportType")).click();
				Thread.sleep(3000);
				String rep="Treatment";
				driver.findElement(By.xpath("//select[@id='reportType']/option[text()='"+rep+"']")).click();
				Thread.sleep(3000);
				
				//click the submit button
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				Thread.sleep(3000);
			}
			
			
			@Test
			public void download() throws InterruptedException {
				
				//click the download button.
				driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
				Thread.sleep(3000);
				
				//print the member name
				List<WebElement> elements8 = driver.findElements(By.xpath("//div[@col-id='membername']"));
				for (WebElement web : elements8) {
					System.out.println(web.getText());
				}
			
			}
			@Test(dependsOnMethods="download")
			public void error1() throws InterruptedException {
				
		        //move to the ToDate
				Actions mov4=new Actions(driver);
				mov4.moveToElement(driver.findElement(By.cssSelector("#endDate"))).build().perform();
				Thread.sleep(3000);
				
				//click the cancel icon
				driver.findElement(By.cssSelector(".el-input__icon.el-icon-circle-close")).click();
				
				//click the submit button
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				Thread.sleep(3000);
				
				//get the error message
				List<WebElement> message = driver.findElements(By.xpath("//div[@class='error m-0']"));
				for (WebElement mess : message) {
					String err5 = mess.getText();
					System.out.println(err5);
					
					String err6="To Date is required";
					
					//verify the message
					Assert.assertEquals(err5, err6);
				}
					
				}
		 

	}


