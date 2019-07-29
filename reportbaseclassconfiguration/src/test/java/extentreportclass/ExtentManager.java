package extentreportclass;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	private static String reportfilename="Automation_Report"+".html";
	private static String filerepository="\\ExtentReport";
	static String workingdir=System.getProperty("user.dir");

	
	/*
	public static void main(String[] args)
	{
		System.out.println(workingdir+filerepository+"\\"+reportfilename);
	}
	*/
	
	public static ExtentReports getReporter()
	{
		String final_filename=workingdir+filerepository+"\\"+reportfilename;
		System.out.println(final_filename);
		extent=new ExtentReports(final_filename,true);
		return extent;
	}

}
