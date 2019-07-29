package secondextentreportexample;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	ExtentReports extentreports;
	String filename="Report.html";
	
	public ExtentReports getReporter()
	{
		String final_filename=System.getProperty("user.dir")+"\\ExtentReport"+"\\"+filename;
		extentreports=new ExtentReports(final_filename,true);
		return extentreports;
	}

}
