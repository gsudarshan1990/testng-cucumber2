package extentreportclass;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {

	static Map<Integer, ExtentTest> extentTestMap=new HashMap<Integer,ExtentTest>();
	static ExtentReports extent=ExtentManager.getReporter();
	
	public static synchronized ExtentTest getTest()
	{
		return (ExtentTest)extentTestMap.get((int)(long)(Thread.currentThread().getId()));
	}
	
	public static synchronized void endTest()
	{
		extent.endTest((ExtentTest)extentTestMap.get((int)(long)(Thread.currentThread().getId())));
	}
	
	public static synchronized ExtentTest startTest(String testname)
	{
		ExtentTest extenttest=extent.startTest(testname);
		extentTestMap.put((int)(long)(Thread.currentThread().getId()),extenttest);
		return extenttest;
		
	}
}
