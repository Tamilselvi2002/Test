package mentor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentModule extends Baseclass {
	
	
		// to click student module
	@Test
		public void clickstudent() throws InterruptedException {
		//click student module
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[text()='Student'])[2]"));
		builder.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		}
		
		//To add Student and Submit it
	@Test
	public void addsubmit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.mb-1.mr-1.btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input")).sendKeys("pooja");
		driver.findElement(By.xpath("//label[text()='Last Name ']/following-sibling::input")).sendKeys("C");
		driver.findElement(By.xpath("//label[text()='Register No ']/following-sibling::input")).sendKeys("3456223");
		driver.findElement(By.xpath("//label[text()='Batch No ']/following-sibling::input")).sendKeys("34422323");
		WebElement down = driver.findElement(By.xpath("(//select[@class='custom-select'])[1]"));
		Select drop=new Select(down);
		drop.selectByIndex(2);
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Mobile Number ']/following-sibling::input")).sendKeys("2024202404");
		driver.findElement(By.xpath("//label[text()='Email ']/following-sibling::input")).sendKeys("pooja@gmail.com");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 col-6']/button[@class='btn back-nav-btn btn-secondary']")).click();
	    driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@class='el-message__content']")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 col-6']/button[@class='btn back-nav-btn btn-secondary']")).click();
	   driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
}
		
		
		// to add student and cancel
	@Test
	public void addcancel() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.mb-1.mr-1.btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input")).sendKeys("Risha");
		driver.findElement(By.xpath("//label[text()='Last Name ']/following-sibling::input")).sendKeys("Risha");
		driver.findElement(By.xpath("//label[text()='Register No ']/following-sibling::input")).sendKeys("9345");
		driver.findElement(By.xpath("//label[text()='Batch No ']/following-sibling::input")).sendKeys("8767788");
		WebElement down = driver.findElement(By.xpath("(//select[@class='custom-select'])[1]"));
		Select drop=new Select(down);
		drop.selectByIndex(2);
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Mobile Number ']/following-sibling::input")).sendKeys("7272727272");
		driver.findElement(By.xpath("//label[text()='Email ']/following-sibling::input")).sendKeys("risha123@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 col-6']/button[@class='btn back-nav-btn btn-secondary']")).click();
		driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
	}

	
	// to edit the the page  and save it
	 @Test
		public void editsubmit() throws InterruptedException {
		  String mail="divya@gmail.com";
		  driver.findElement(By.xpath("//div[contains(text(),'"+mail+"')]/following::div/div")).click(); 
		  Thread.sleep(2000);
		  WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input"));
		  firstname.clear();
		  firstname.sendKeys("Kani");
		  
		  WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name ']/following-sibling::input"));
		  lastname.clear();
		  lastname.sendKeys("Mozhi");
		  
		  WebElement register = driver.findElement(By.xpath("//label[text()='Register No ']/following-sibling::input"));
		  register.clear();
		  register.sendKeys("20001112");
		  
		  WebElement batch = driver.findElement(By.xpath("//label[text()='Batch No ']/following-sibling::input"));
		  batch.clear();
		  batch.sendKeys("454535");
		  
		  WebElement drop1 = driver.findElement(By.xpath("//select[@class='custom-select']"));
		  Select down1=new Select(drop1);
		  down1.selectByVisibleText("1");
		  
		  driver.findElement(By.xpath("//span[text()='Female']")).click();

		  WebElement edit = driver.findElement(By.xpath("//label[text()='Mobile Number ']/following-sibling::input"));
		  edit.clear();
		  edit.sendKeys("1000000002");
			
		  WebElement email= driver.findElement(By.xpath("//label[text()='Email ']/following-sibling::input"));
		  email.clear();
		  email.sendKeys("divya@gmail.com");
			
		  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		  Thread.sleep(2000);
		  System.out.println(driver.findElement(By.xpath("//p[@class='el-message__content']")).getText());
		  Thread.sleep(2000);
		}
	 
	 //// to edit the the page  and cancel it
	 @Test
	 public void editcancel() throws InterruptedException {
		 Thread.sleep(2000);
		 String mail1="test987@gmail.com";
		 Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[contains(text(),'"+mail1+"')]/following::div/div")).click(); 
		  Thread.sleep(2000);
		  
		  WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input"));
		  firstname.clear();
		  firstname.sendKeys("Steeve");
		  
		  WebElement lastname = driver.findElement(By.xpath("//label[text()='Last Name ']/following-sibling::input"));
		  lastname.clear();
		  lastname.sendKeys("harigton");
		  
		  WebElement register = driver.findElement(By.xpath("//label[text()='Register No ']/following-sibling::input"));
		  register.clear();
		  register.sendKeys("15111");
		  
		  WebElement batch = driver.findElement(By.xpath("//label[text()='Batch No ']/following-sibling::input"));
		  batch.clear();
		  batch.sendKeys("2002");
		  
		  WebElement drop1 = driver.findElement(By.xpath("//select[@class='custom-select']"));
		  Select down1=new Select(drop1);
		  down1.selectByVisibleText("1");
		  
		 driver.findElement(By.xpath("//span[text()='Female']")).click();

			WebElement edit = driver.findElement(By.xpath("//label[text()='Mobile Number ']/following-sibling::input"));
			edit.clear();
			edit.sendKeys("7878787878");
			
		 driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
			  driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
		  driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
		  Thread.sleep(2000);
		  
		  String name="Yuvan Shankar";
		  driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();
	 }
		 
	  
		// Update Profiviency and Update it
	 @Test
	 public void UpdateProficiency() throws InterruptedException {
	 String name="Kani Mozhi";
	  driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-1__BV_toggle_']")).click();
		driver.findElement(By.xpath("//a[text()='Update Proficiency']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//p[@class='el-message__content']")).getText();
		System.out.println(text);
		//String text1="Successfully Bulk Proficicency Update";
		//Assert.assertEquals(text,text1);
		
	 //driver.findElement(By.xpath("//div[text()='From Level']/following::div[text()='3']/../../../../../../../header/button[@class='close']")).click();
			
		// to click the cancel icon
	//	driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
		//Thread.sleep(2000);
		 //driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();
		
		}

		
		// Update proficiency and cancel it
	@Test 
	 public void CancelProficiency() throws InterruptedException {
	 String name="Kani Mozhi";
	  driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='dropdown-1__BV_toggle_']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Update Proficiency']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn back-nav-btn btn-secondary'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn back-nav-btn btn-secondary'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]/..")).click();
		 driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();

	 }
	
	  
	 
		
		
		//Upload the student file using Robot class
	@Test
	public void Uploadsubmit() throws InterruptedException, AWTException {
		Thread.sleep(2000);		
		 String name="Mohamad  siraj";
		  driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();
		driver.findElement(By.xpath("//button[@id='dropdown-1__BV_toggle_']")).click();
		driver.findElement(By.xpath("(//a[@class='dropdown-item text-primary'])[2]")).click();
		driver.findElement(By.xpath("//label[@class='custom-file-label']")).click();
		Thread.sleep(2000);
		Robot rob=new Robot();
		    StringSelection file=new StringSelection("\"C:\\Users\\tamil\\Downloads\\LION framework - April Week 04.xlsx\"");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);  
		    rob.keyPress(KeyEvent.VK_CONTROL);
		    rob.keyPress(KeyEvent.VK_V);
		    rob.keyRelease(KeyEvent.VK_CONTROL);
		    rob.keyRelease(KeyEvent.VK_V);
		    Thread.sleep(2000);
		    rob.keyPress(KeyEvent.VK_ENTER);
		    rob.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//button[contains(text(),' Submit')])[2]")).click();
		 String text = driver.findElement(By.xpath("(//p[@class='el-message__content'])[1]")).getText();
		 System.out.println(text);
		String text2 = driver.findElement(By.xpath("(//p[@class='el-message__content'])[2]")).getText();
		System.out.println(text2);
		  driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();

	}
	
	//Upload the student file using Robot class
	@Test
	public void Uploadcancel() throws InterruptedException, AWTException {
		Thread.sleep(2000);		
		 String name="Mohamad  siraj";
		  driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();

		driver.findElement(By.xpath("//button[@id='dropdown-1__BV_toggle_']")).click();
		driver.findElement(By.xpath("(//a[@class='dropdown-item text-primary'])[2]")).click();
		driver.findElement(By.xpath("//label[@class='custom-file-label']")).click();
		Thread.sleep(2000);
		Robot rob=new Robot();
		    StringSelection file=new StringSelection("\"C:\\Users\\tamil\\Downloads\\LION framework - April Week 04.xlsx\"");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);  
		    rob.keyPress(KeyEvent.VK_CONTROL);
		    rob.keyPress(KeyEvent.VK_V);
		    rob.keyRelease(KeyEvent.VK_CONTROL);
		    rob.keyRelease(KeyEvent.VK_V);
		    Thread.sleep(2000);
		    rob.keyPress(KeyEvent.VK_ENTER);
		    rob.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
	    
        driver.findElement(By.xpath("//button[@class='btn canceldetails back-nav-btn btn-secondary']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'  No')]")).click();
        
        driver.findElement(By.xpath("//button[@class='btn canceldetails back-nav-btn btn-secondary']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'  Yes')]")).click();
		driver.findElement(By.xpath("//div[@class='ag-selection-checkbox']/following-sibling::span[text()='"+name+"']")).click();

	}
	
	
	 // to archieve the student of below number
	@Test
		public void archievestudent() throws InterruptedException {
	    String archive="2024202404"; 
	    Thread.sleep(2000);
	    WebElement arc1 =driver.findElement(By.xpath("//div[text()='"+archive+"']"));
	    System.out.println(arc1.getText());
	    arc1.click();
	    driver.findElement(By.xpath("//button[@id='dropdown-1__BV_toggle_']")).click( );
	    driver.findElement(By.xpath("//a[text()='Archive']")).click(); 
	    Thread.sleep(2000);
	   String text = driver.findElement(By.xpath("//p[@class='el-message__content']")).getText();
	   System.out.println(text);
		}
		
		
		    
// to click proficiency filter
	@Test
	public void proficiencyfilter() {
		driver.findElement(By.xpath("//button[text()='Proficiency']")).click();
		String profi="3";
		driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox']/label[text()='"+profi+"']")).click();
		List<WebElement> mem = driver.findElements(By.xpath("//div[@class='ag-cell-wrapper']"));
		for (WebElement web : mem) {
	    System.out.println("proficieny filter:  " + web.getText());
		}	
	}
		
		
		//search
	@Test
	public void search() {
		WebElement search = driver.findElement(By.cssSelector("#hodquickFilter"));
		search.sendKeys("Bheem");
		System.out.println(driver.findElement(By.xpath("//span[@class='ag-cell-value']")).getText());
	}
	}
	


