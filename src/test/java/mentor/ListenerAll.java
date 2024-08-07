package mentor;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import community.ExtentReportsListener;

public class ListenerAll extends Baseclass implements ITestListener{


	ExtentTest test;
	ExtentReports extent= ExtentReportsListener.getreport();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());

	}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "test passed");

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 test.fail(result.getThrowable());
			 
		String filepath=null;
		try {
			filepath = capturefile(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());

			 try {
				driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "test is skipped");
		// TODO Auto-generated method stub
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		// TODO Auto-generated method stub
		
	}
	
}
