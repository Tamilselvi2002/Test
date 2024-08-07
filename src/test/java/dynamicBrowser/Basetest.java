package dynamicBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Basetest {
public WebDriver driver;
	@BeforeTest
	public void initializedriver() throws IOException, InterruptedException {
		
		Properties prop=new Properties();
		FileInputStream stream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\dynamicBrowser\\Gobalbrowser.properties");
		prop.load(stream);
		
		String property =System.getProperty("browser")!=null? System.getProperty("browser"):prop.getProperty("browser");
		
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
}
