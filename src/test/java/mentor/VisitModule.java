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

public class VisitModule extends Baseclass{
	

		/*
		 * WebDriver driver;
		 * 
		 * public Visit(WebDriver driver) { this.driver=driver; }
		 */

		@Test

		public void move() throws InterruptedException {

			// move to Visit
			Actions act1 = new Actions(driver);
			act1.moveToElement(driver.findElement(By.xpath("(//div[@class='custom v-list-item v-list-item--link theme--light'])[5]"))).click().build().perform();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//div[text()='Visits'])[2]")).click();
			//Thread.sleep(2000);
		}	

		@Test
		public void calendarwithCancelbutton() throws InterruptedException {

			Actions act = new Actions(driver);
			act.moveToElement(
					driver.findElement(By.xpath("(//div[@class='custom v-list-item v-list-item--link theme--light'])[5]")))
					.build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='v-list-item__icon'])[6]")).click();
			Thread.sleep(7000);
			act.moveToElement(driver.findElement(By.xpath("//button[text()='Visit Status']"))).build().perform();
			Thread.sleep(2000);

			// click the calendar
			driver.findElement(By.xpath("//div[@class='vd-picker__input']")).click();
			Thread.sleep(2000);

			// click the cancel button
			driver.findElement(By.cssSelector(".vd-picker-validate__button.vd-picker-validate__button-cancel")).click();
			Thread.sleep(7000);
		}

		@Test
		public void calendarwithOkbutton() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='vd-picker__input']"))));
			driver.findElement(By.xpath("//div[@class='vd-picker__input']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='vd-picker__controls-label'])[2]")).click();
			Thread.sleep(3000);

			// Click the year
			String year = "2024";
			driver.findElement(By.xpath("//div[@class='vd-picker__body']/ul/li[text()='" + year + "']")).click();
			Thread.sleep(2000);

			// click the month
			String month = "Jul";
			driver.findElement(By.xpath("//div[@class='vd-picker__months-button__wrapper']/button[text()='" + month + "']"))
					.click();
			Thread.sleep(2000);

			// Click the start date
			String startdate = " 1";
			driver.findElement(
					By.xpath("(//span[@class='vd-picker__table-day__text']/span[contains(text(),'" + startdate + "')])[1]"))
					.click();
			Thread.sleep(2000);

			// Click the End date
			String enddate = "22";
			driver.findElement(
					By.xpath("(//span[@class='vd-picker__table-day__text']/span[contains(text(),'" + enddate + "')])[1]"))
					.click();
			Thread.sleep(2000);

			// click the OK button
			driver.findElement(By.cssSelector(".vd-picker-validate__button.vd-picker-validate__button-validate")).click();

			List<WebElement> elements5 = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']"));
			for (WebElement web : elements5) {
				System.out.println(web.getText());
			}

		}

		@Test
		public void prof() throws InterruptedException {

			/*
			 * // back to the visit page Actions act = new Actions(driver);
			 * act.moveToElement( driver.findElement(By.
			 * xpath("(//div[@class='custom v-list-item v-list-item--link theme--light'])[5]"
			 * ))) .build().perform(); Thread.sleep(2000);
			 * driver.findElement(By.xpath("(//div[@class='v-list-item__icon'])[6]")).click(
			 * ); Thread.sleep(2000);
			 * act.moveToElement(driver.findElement(By.cssSelector(".mt-1.col-12"))).build()
			 * .perform(); Thread.sleep(2000);
			 */

			// Click the proficiency
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Proficiency']")).click();
			Thread.sleep(2000);
			String proficiency = "3";
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='" + proficiency + "']"))
					.click();
			Thread.sleep(2000);
		}

		@Test
		public void visit() throws InterruptedException {

			// click the visit
			driver.findElement(By.xpath("//button[text()='Visit No']")).click();
			Thread.sleep(2000);
			String visit = "9";
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='" + visit + "']")).click();
			Thread.sleep(2000);
		}

		@Test
		public void visitStatus() throws InterruptedException {

			// click the visit status
			driver.findElement(By.xpath("//button[text()='Visit Status']")).click();
			Thread.sleep(2000);
			String visitstatus = "approved";
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div/label[text()='" + visitstatus + "']")).click();
			Thread.sleep(2000);

			// print the names
			List<WebElement> elements6 = driver.findElements(By.xpath("//div[@class='custom-cell-icon-container']/p"));
			for (WebElement nameList : elements6) {
				System.out.println(nameList.getText());
			}
			Thread.sleep(3000);
		}

		@Test

		public void search1() throws InterruptedException {

			// search the particular name.
			driver.findElement(By.cssSelector(".input-search.form-control")).sendKeys("mani");

			// verify the name
			String text5 = driver.findElement(By.cssSelector(".custom-cell-icon-container p")).getText();
			Thread.sleep(2000);
			System.out.println(text5);
			String text6 = "Mani kandan";
			Thread.sleep(2000);
			Assert.assertEquals(text5, text6);
		}

		@Test
		public void download1() throws InterruptedException {

			// click the download button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			String name = "Mani kandan ";
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//p[text()='" + name	+ "']/../following::div/div/button[@class='btn common-view-edit-btn-css btn-secondary'])[1]")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.cssSelector(".left-header-section h3")).getText());

		}

	}


