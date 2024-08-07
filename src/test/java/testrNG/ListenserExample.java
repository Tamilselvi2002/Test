package testrNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenserExample implements ITestListener{
	
public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
			}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("it execute last");
		// TODO Auto-generated method stub
		
	}

public void onTestStart(ITestResult result) {
	   System.out.println("started");
	  }
}
