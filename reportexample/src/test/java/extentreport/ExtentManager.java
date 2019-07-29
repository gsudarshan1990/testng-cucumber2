package extentreport;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	ExtentReports extentreport;
	String filename="TestReport.html";
	
	
	public  ExtentReports getReporter()
	{
	
		String filelocation=System.getProperty("user.dir")+"\\ExtentReport"+"\\"+filename;
		extentreport=new ExtentReports(filelocation,true);
		return extentreport;
	}
}
