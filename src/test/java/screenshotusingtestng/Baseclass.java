package screenshotusingtestng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
public static WebDriver driver;
 @BeforeTest
 public void setup() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 }
 @AfterTest
 public void closedriver() {
	 driver.quit();
 }
 public void capturefile(String Name)   {
	 TakesScreenshot take=(TakesScreenshot) driver;
	 File source = take.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/1"+ Name);
		//try {
			try {
				FileUtils.copyFile(source, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

 }
 
}
