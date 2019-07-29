package reportexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extentreport.ExtentManager;

public class ExtentReportExample {

	WebDriver driver;
	ExtentManager extentmanager;
	ExtentTest extenttest;
	ExtentReports extentreport;

	
	@BeforeTest
	public void setUp()
	{
		extentmanager=new ExtentManager();
		extentreport=extentmanager.getReporter();
		extenttest=extentreport.startTest("My Fist Test");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		extenttest.log(LogStatus.PASS, "Chrome Driver is Opened");
	}
	
	@Test
	public void test_googlepage()
	{
		driver.get("https://blogs.perficient.com/2017/01/20/driver-manager-for-selenium-web-driver-and-extent-reports/");
		extenttest.log(LogStatus.PASS, "URL is opened");
	}
	
	@AfterTest
	public void tearDown()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentreport.endTest(extenttest);
		extentreport.flush();
		driver.quit();
	}
}
