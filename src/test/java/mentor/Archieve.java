package mentor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Archieve extends Baseclass {
	
			  // to click Archievemodule
			  
			  @Test 
			  public void achievelist() throws InterruptedException {
			
			  String archive="2024202404";
			  Actions builder=new Actions(driver);
			  Thread.sleep(2000);
			  WebElement icon = driver.findElement(By. xpath("//i[@class= 'v-icon notranslate custom-icon mdi mdi-archive theme--light']" ));
			  builder.moveToElement(icon).click().build().perform();
			  Thread.sleep(2000);
			  
			  // to verify  archieve number
			  List<WebElement>  num = driver.findElements(By.xpath( "//div[@class='ag-center-cols-container']/div/div[@col-id='mobileno']"));
			  for(int i=0; i<num.size();i++) { 
				  String el=num.get(i).getText();
			  if(archive.equals(el))
			  { 
				  System.out.println("Number is archieved  "+ el); 
			      break;
			  }
			  else 
			  {
				  System.out.println("Number not found"); 
			  }
			 
			} 
			  }
			 
}
