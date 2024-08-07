package community;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsListener {
	public static ExtentReports getreport() {
		String path=System.getProperty("user.dir")+"\\Report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation test results");
		reporter.config().setDocumentTitle("TestReport");
		
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Tamilselvi");
		return extent;
	}
}
