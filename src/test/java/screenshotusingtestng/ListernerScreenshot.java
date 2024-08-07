package screenshotusingtestng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerScreenshot extends Baseclass implements ITestListener{
	
	 public void onTestFailure(ITestResult result) {
		 
		 capturefile(result.getMethod().getMethodName()+".jpg");
		    // not implemented
		  }

	

	
}