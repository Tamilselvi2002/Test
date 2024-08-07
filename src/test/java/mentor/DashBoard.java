package mentor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoard extends Baseclass{

	@Test
	public void  clickDashboard() throws InterruptedException {
		//click family module
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='custom v-list-item v-list-item--link theme--light']/div[text()='Dashboard']"));
		builder.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.cssSelector("#student_chart svg g~text")).getText();
		String text2 = driver.findElement(By.cssSelector("#student_chart svg g g g.apexcharts-datalabels-group text~text")).getText();
		System.out.println(text +": " +  text2);
		String num="36";
		Assert.assertEquals(text2, num);
		
		String gender = driver.findElement(By.cssSelector("#student_gender_chart svg g~text")).getText();
		String gender1 = driver.findElement(By.cssSelector("#student_gender_chart svg g g g.apexcharts-datalabels-group text~text")).getText();
         System.out.println(gender +": " +gender1);
         Assert.assertEquals(gender1, num);
         
         String family = driver.findElement(By.cssSelector("#family_chart svg g~text")).getText();
 		String family1 = driver.findElement(By.cssSelector("#family_chart svg g g g.apexcharts-datalabels-group text~text")).getText();
 		System.out.println(family +":  "+family1);
 		String count="68";
 		Assert.assertEquals(family1, count);
 		
 		String familygender = driver.findElement(By.cssSelector("#family_gender_chart svg g~text")).getText();
       String familygender1= driver.findElement(By.cssSelector("#family_gender_chart svg g g g.apexcharts-datalabels-group text~text")).getText(); 
		System.out.println(familygender+ ": "+ familygender1);
		String count1="210";
		Assert.assertEquals(familygender1, count1);
		
		Thread.sleep(2000);
		String age = driver.findElement(By.cssSelector("#family_age_chart svg g~text")).getText();
		String age1 = driver.findElement(By.cssSelector("#family_age_chart svg g g g.apexcharts-datalabels-group text~text")).getText();
		System.out.println(age +": " +age1);
		Assert.assertEquals(age1, count1);
		
		Thread.sleep(2000);
		String familytype = driver.findElement(By.cssSelector("#family_familytype_chart svg g~text")).getText();
		String familytype1 = driver.findElement(By.cssSelector("#family_familytype_chart svg g g g.apexcharts-datalabels-group text~text")).getText();
		System.out.println(familytype +": "+familytype1);
		Assert.assertEquals(familytype1, count);
		
		String house = driver.findElement(By.cssSelector("#family_house_chart svg g~text")).getText();
	    String house1 = driver.findElement(By.cssSelector("#family_house_chart svg g g g.apexcharts-datalabels-group text~text")).getText();
	    System.out.println(house+": " +house1);
	    Assert.assertEquals(house1,count);
	    
	    String average = driver.findElement(By.xpath("//p[@class='total-visit text-left']")).getText();
	   String average1=driver.findElement(By.xpath("//span[text()='3']")).getText();
	   System.out.println(average+ ": " +average1);
	   String count5="3";
	   Assert.assertEquals(average1, count5);
	   
	   System.out.println(driver.findElement(By.cssSelector(".morbidity-class")).getText());
	   List<WebElement> list = driver.findElements(By.cssSelector(".chart g text"));
	   for (WebElement web1 : list) {
		  System.out.println(web1.getText());
	}
	  
	   List<WebElement> list1= driver.findElements(By.cssSelector(".apexcharts-bar-series.apexcharts-plot-series g path"));
	   for (WebElement web2 : list1) {
		String attribute = web2.getAttribute("val");
		System.out.println(attribute);
	}
     }
	
	
	@Test
	public void clickall() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		 
		// to click header proficiency
		//String header="All";
		//driver.findElement(By.xpath("//a[contains(text(),'"+header+"')]")).click();
		
		// to click view button using house number
		String student="Mahesh N";
		driver.findElement(By.xpath("((//div[text()='"+student+"'])[1]/following-sibling::div)[4]/div/div/button[contains(text(),'View')]")).click();
		
		// to click view button using view button
		// String houseno="12";
		// driver.findElement(By.xpath("//div[text()='"+houseno+"']/../div[contains(@class,'ag-cell-value ag-cell ag-cell-not-inline-editing ag-cell-normal-height acti')]/div/div/button ")).click();
		 Thread.sleep(2000);
		 
		// driver.findElement(By.xpath("//button[@class='btn view-btn btn-secondary']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@class='btn family-edit-btn btn-secondary']")).click();
		 
		 // to print the id of student
		 System.out.println("Student details  "+ driver.findElement(By.cssSelector("#student-contact-card")).getText());
		
		// to print the member name in that family
	     List<WebElement> mem = driver.findElements(By.xpath("//div[@class='container-wrapper member-card']/div/div"));
	     for (WebElement webElement : mem) {
	    	System.out.println(webElement.getText());	
		}
	     }
	
	
	@Test
	public void Treatment() {
		driver.findElement(By.xpath("(//div[@class='family-treatment-card'])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),' Close')])[2]")).click();
	}
	
	
	@Test
	public void clickvisit() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-primary']")).click();
		Thread.sleep(2000);
		
		// to change the proficiency level
		String prof="Proficiency Level 3";
		driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/li/a[text()='"+prof+"']")).click();
		
		// to click download button by clicking visit
		String vis="Visit 3";
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li/a[text()='"+vis+"']")).click();
		driver.findElement(By.xpath("//a[text()='"+vis+"']/../following::div/div[@aria-hidden='false']/div/button[@class='btn visit-download m-1 btn-primary']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='el-message el-message--success']/p[@class='el-message__content']")).getText();
		System.out.println(text);
		
		// to  click the visit
		String visit="Visit 4";
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li/a[text()='"+visit+"']")).click();
	}
	
	
		@Test
		public void Edit() throws InterruptedException, AWTException {
		// to click the edit button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn edit-btn btn-secondary']")).click();
  //	driver.findElement(By.xpath("(//button[@class='btn visit-download m-1 btn-primary'])[1]")).click();
		
		//to click the name 
         Thread.sleep(2000);
		String name="Kamal";
		driver.findElement(By.xpath("//li[@class='nav-item']/a/p[contains(text(),'"+name+"')]")).click();
		
		// to edit  available
		WebElement drop = driver.findElement(By.xpath("(//select[@class='custom-select profile-input'])[1]"));
		Select down=new Select(drop);
		down.selectByVisibleText("Available");
		
		// to enter the date
		driver.findElement(By.xpath("//input[@name='datepicker']")).sendKeys("23-07-2024");
		
		//to edit the deitary habits
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[1]")).click();
		String DietaryHabits="Vegetarian";
		driver.findElement(By.xpath("//span[text()='"+DietaryHabits+"']")).click();
		
		
		// to edit the occupation field
		WebElement occupation = driver.findElement(By.xpath("//div[@id='infooccupation']/div/div/input[@class='form-control profile-input']"));
		occupation.clear();
		occupation.sendKeys("farmer");
		// to edit personal history
		
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).click();
		String personal="Tobacco smoking";
		driver.findElement(By.xpath("//span[text()='"+personal+"']")).click();
		
		// to edit Height 
		WebElement height = driver.findElement(By.xpath("//div[@id='infoheight']/div/div/input[@class='form-control profile-input']"));
		height.clear();
		height.sendKeys("171");
		
		// to edit the weight
		WebElement weight = driver.findElement(By.xpath("//div[@id='infoweight']/div/div/input[@class='form-control profile-input']"));
		weight.clear();
		weight.sendKeys("45");
		
		WebElement BMI = driver.findElement(By.xpath("//div[@id='infobmi']/div/div/input[@class='form-control profile-input']"));
		BMI.clear();
		BMI.sendKeys("19");
		
		WebElement pulse= driver.findElement(By.xpath("//div[@id='infopulse']/div/div/input[@class='form-control profile-input']"));
		pulse.clear();
		pulse.sendKeys("77");
		
		WebElement SBP= driver.findElement(By.xpath("//div[@id='infosbp']/div/div/input[@class='form-control profile-input']"));
		SBP.clear();
		SBP.sendKeys("45");
		
		WebElement DBP= driver.findElement(By.xpath("//div[@id='infodbp']/div/div/input[@class='form-control profile-input']"));
		DBP.clear();
		DBP.sendKeys("45");
		
		WebElement RR= driver.findElement(By.xpath("//div[@id='inforr']/div/div/input[@class='form-control profile-input']"));
		RR.clear();
		RR.sendKeys("18");
		
		WebElement chief= driver.findElement(By.xpath("//div[@id='infochief_complaints']/div/div/input[@class='form-control profile-input']"));
		chief.clear();
		chief.sendKeys("test");
		
		// to edit  available
	    WebElement drop1 = driver.findElement(By.xpath("(//select[@class='custom-select profile-input'])[2]"));
		Select down1=new Select(drop1);
		down1.selectByVisibleText("Negative");
		
		// to edit  available
	    WebElement drop2 = driver.findElement(By.xpath("(//select[@class='custom-select profile-input'])[3]"));
		Select down2=new Select(drop2);
		down2.selectByVisibleText("Trace");
		
		WebElement sugar= driver.findElement(By.xpath("//div[@id='infoblood_sugar']/div/div/input[@class='form-control profile-input']"));
		sugar.clear();
		sugar.sendKeys("180");
		
		WebElement general= driver.findElement(By.xpath("//div[@id='infogeneral_hygiene']/div/div/input[@class='form-control profile-input']"));
		general.clear();
		general.sendKeys("testing");
		
		WebElement oral= driver.findElement(By.xpath("//div[@id='infooral_hygiene']/div/div/input[@class='form-control profile-input']"));
		oral.clear();
		oral.sendKeys("testing");
		
		// to edit immunization 
		WebElement immune= driver.findElement(By.xpath("//div[@id='infoimmunization_status']/div/div/input[@class='form-control profile-input']"));
		immune.clear();
		immune.sendKeys("no");
		
		//to edit the morbidity
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[3]")).click();
		String morbidity="Abdominal hernia";
		driver.findElement(By.xpath("//span[text()='"+morbidity+"']")).click();
		
		// to edit the Contracepation
		WebElement drop3= driver.findElement(By.xpath("(//select[@class='custom-select profile-input'])[4]"));
		Select down3=new Select(drop3);
		down3.selectByVisibleText("Caps");
		
	//	to edit the notes field
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@class='val-select']/textarea[@class='form-control profile-input']"));
		element.clear();
		element.sendKeys("okok");
		
		//to click add button
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		driver.findElement(By.xpath("//button[text()='Preview']")).click();
		
		 // to click down load button
		driver.findElement(By.xpath("//div[@class='placeholder-image-container']")).click();
		driver.findElement(By.xpath("//p[text()='Drag and drop files here to upload']")).click();
		Thread.sleep(2000);
		Robot rob=new Robot();
	    StringSelection file=new StringSelection("\"C:\\Users\\tamil\\OneDrive\\Pictures\\Screenshots\\CM_Student_09.mp4\"");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);  
	    rob.keyPress(KeyEvent.VK_CONTROL);
	    rob.keyPress(KeyEvent.VK_V);
	    rob.keyRelease(KeyEvent.VK_CONTROL);
	    rob.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
		}
	    
	 // to delele the picture
	   // driver.findElement(By.xpath("(//img[@class='img-fluid delete-icon'])[3]")).click();
	    
	    // to click the save button
	    @Test
	    public void save() throws InterruptedException  {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@class='btn visit-edit-btn mr-5 btn-secondary'])[3]")).click();
	    String text = driver.findElement(By.cssSelector(".el-message__content")).getText();
	    System.out.println(text);
	    }
	  //  driver.findElement(By.xpath("(//a[@aria-selected='true']/p[contains(text(),'"+name+"')]/../../../../following-sibling::div/div//div)[1]/div[@class='row bottom_button']//button[contains(text(),'Save')]")).click();
	  // System.out.println(driver.findElement(By.xpath("//p[@class='el-message__content']")).getText());
	    
	    @Test
	    public void back() {
	    //to click back button and click no
	   driver.findElement(By.xpath("//button[@class='btn back back-nav-btn pl-2 btn-secondary']")).click();
	   driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
	    
	    //to click back button and click yes
	   driver.findElement(By.xpath("//button[@class='btn back back-nav-btn pl-2 btn-secondary']")).click();
	   driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
	    }
	   
	
	
	    // to click approve button
	   @Test
	    public void Approve() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-primary']")).click();
	    Thread.sleep(2000);
	    
		String prof="Proficiency Level 3";
		driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/li/a[text()='"+prof+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
		driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
		driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
		Thread.sleep(2000);
	  String text = driver.findElement(By.xpath("//div[@class='el-message el-message--success']/p[@class='el-message__content']")).getText();
	  System.out.println(text);
	    }
		
	    
		// to click resubmit button
		@Test
		public void Resubmit() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[contains(text(),'Resubmit')]")).click();
	   Thread.sleep(2000);
	   WebElement element2 = driver.findElement(By.xpath("//div[@class='text-left col-12']/select[@class='custom-select']"));
		String dropdown="Maha (F/28)";
		Select drop=new Select(element2);
	   drop.selectByVisibleText(dropdown);
	   // to click cancel and click no
	   driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	   driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
	   
	   //to click cancel and click yes
	   driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	   driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
	   
	   driver.findElement(By.xpath("//button[contains(text(),'Resubmit')]")).click();
	   Thread.sleep(2000);
	   WebElement element1 = driver.findElement(By.xpath("//div[@class='text-left col-12']/select[@class='custom-select']"));
		String dropdown1="Maha (F/28)";
		Select drop1=new Select(element1);
	   drop1.selectByVisibleText(dropdown1);
	   
	// to click submit and click no and yes
	   driver.findElement(By.xpath("//button[text()=' Submit']")).click();
       driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small']")).click();
       
	   driver.findElement(By.xpath("//button[text()=' Submit']")).click();
	   driver.findElement(By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']")).click();
      }
		////span[text()='Rr']/../../../../following-sibling::div/div/div/div/div/div/div/input[@type='checkbox'] Resubmit
		
	    //to click  the save button and get the pop up message
	   // Thread.sleep(2000);
	  //  driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();//xpath://p[contains(text(),'Arjun')]/../../following::div/div
	  //  Thread.sleep(2000);
	  // System.out.println( driver.findElement(By.xpath("//p[@class='el-message__content']")).getText());
	
		
		
	}

