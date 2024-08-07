package mentor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Profile extends Baseclass{
	Actions builder;
	@Test
public void clickprofile() throws InterruptedException {
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
	WebElement findElement = driver.findElement(By.xpath("//div[@class='v-list-item__icon']/following-sibling::div[text()='Profile']"));
	builder.moveToElement(findElement).click().build().perform();
   
		WebElement ele = driver.findElement(By.xpath("//div[@class='v-list-item__icon']/following-sibling::div[text()='Log Out']"));
		builder.moveToElement(ele).click().build().perform();
	}
}

