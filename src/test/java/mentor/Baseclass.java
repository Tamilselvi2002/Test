package mentor;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
public static WebDriver driver;




long start;


@BeforeSuite
public void sTime() {
    start = System.currentTimeMillis();
	System.out.println(start);
}


@BeforeTest
public void initializedriver() throws IOException, InterruptedException {
	Properties prop=new Properties();
	FileInputStream stream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\dynamicBrowser\\Gobalbrowser.properties");
	prop.load(stream);
	String property = prop.getProperty("browser");
	if(property.equalsIgnoreCase("chrome")) 
	{
	driver=new ChromeDriver();
	}
	else if(property.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else if(property.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();	
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://community.medyaan.com/");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9952346094");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//div[@class='login-button-box']")).click();
	Thread.sleep(2000);
}
 
 
// @AfterTest
// public void closedriver() {
//	 driver.quit();
 //}
 public String capturefile(String Name,WebDriver driver) throws IOException   {
	 TakesScreenshot take=(TakesScreenshot) driver;
	 File source = take.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"//screenshot//"+Name+".png");
				FileUtils.copyFile(source, des);
			return System.getProperty("user.dir")+"//screenshot//"+Name+".png";
			
	}
 
 @AfterSuite
 public void eTime() {
	  long end = System.currentTimeMillis();
	  System.out.println(end);  
	  double between = end-start;
	  System.out.println(between);
	  double minutes = between/60000.0;
	  System.out.println(minutes + " " +"mins");
 }

 
 
}
