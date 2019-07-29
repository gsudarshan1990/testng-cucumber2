package extentreportclass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestManager.startTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTestManager.getTest().log(LogStatus.FAIL, "Test failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	
		ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
		System.out.println("The following test failed with certain success percentage"+result.getMethod().getMethodName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Extent Report has been started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	
		System.out.println("Extent Report has been finished");
		ExtentTestManager.endTest();
		ExtentReports extent=ExtentManager.getReporter();
		extent.flush();
		extent.close();
	}

}
