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

public class FamilyMember extends Baseclass {
	
		
		/*
		 * WebDriver driver;
		 * 
		 * public FamilyMember(WebDriver driver) { // TODO Auto-generated constructor
		 * stub this.driver=driver; }
		 */
		Actions mov;
		
		@Test
			public void action() throws InterruptedException {
			mov=new Actions(driver);
				Actions element = mov.moveToElement(driver.findElement(By.xpath("//div[@class='v-list-item__icon']/i/following::div[text()='Family Member']")));
		        element.click().build().perform();
		        Thread.sleep(9000);
		        
				/*
				 * viewButton(); student(); area(); search2(); download2(); init1();
				 */
		        
			}
		   
		    @Test
		    //click the view button
		    public void viewButton() throws InterruptedException {
		    	
		        
		        
		      WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(32));
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ag-theme-alpine.aggridcustomise")));
			    String houseNo="12";
		    	driver.findElement(By.xpath("(//div[text()='"+houseNo+"']/following::div/div/div/button)[1]")).click();
		        Thread.sleep(2000);
		        //print the heading
		        System.out.println(driver.findElement(By.xpath("(//h4[@class='mb-0'])[2]")).getText());
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//button[@class='close text-dark'])[2]")).click();
		        Thread.sleep(2000);
		        
		        
		    }
		    
		    @Test
			public void student() throws InterruptedException {
				
		    	//Choose the student 
		    	driver.findElement(By. xpath("//button[text()='Student']")).click();
		    	Thread.sleep(3000);
		   	    String student="Rosy A";
		   	    Thread.sleep(3000);
		   	    driver.findElement(By.xpath("//div[@class='capitalize-text custom-control custom-checkbox']/label[text()='"+student+"']")).click();
		   	    
		   	    //print the list.
		   	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']/p"));
		   	    Thread.sleep(3000);
		   	    for (WebElement list : elements) {
					System.out.println("The members of the Student"+"  "+list.getText());		
				}   	   
		   	    }
		    
		    @Test
		    public void area() throws InterruptedException {
		    	
		    	//choose the area
			    Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-primary']")).click();
		        String area="Gandhi nagar";
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox']/label[text()='"+area+"']")).click();
		        Thread.sleep(3000);
		        
		        //print the list
		        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
		        for (WebElement name : elements) {
		        	System.out.println("The members of the Particular Area"+"  "+name.getText());
				}
		        
		        Thread.sleep(3000);
		        }
		    
		    @Test
		   	public void search2() throws InterruptedException {
				
		    	//search the name in search box
		   		driver.findElement(By.cssSelector("#hodmemberquickFilter")).sendKeys("priya");
		   		Thread.sleep(3000);
		   		
		   		//verify the name
		   		String names = driver.findElement(By.cssSelector(".custom-cell-icon-container p")).getText();
		   		System.out.println(names);
		   		Thread.sleep(3000);
		   		String names1="priya";
		   		Assert.assertEquals(names, names1);
		   		Thread.sleep(3000);
		   		
		   		//click the view button
		   	    driver.findElement(By.cssSelector(".btn.common-view-edit-btn-css.btn-secondary")).click();
		   	    Thread.sleep(3000);
		   	    driver.findElement(By.xpath("(//button[@class='close text-dark'])[2]")).click();
		   	}
		    
		    @Test
		    public void download2() throws InterruptedException {
		    	
		    	//click the download button.
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		    }
		    
			/*
			 * public void init1() throws InterruptedException { Visit vis=new
			 * Visit(driver); vis.move(); }
			 */
		 

	}


