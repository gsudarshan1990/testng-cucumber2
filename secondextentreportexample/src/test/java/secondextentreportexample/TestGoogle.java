package secondextentreportexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestGoogle {
	
	ExtentManager extentmanager;
	ExtentReports testextentreport;
	ExtentTest extenttest;
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		extentmanager=new ExtentManager();
		testextentreport=extentmanager.getReporter();
		extenttest=testextentreport.startTest("Extent Report Example");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		extenttest.log(LogStatus.PASS, "Chrome Driver is Loaded");
	}

	@Test
	public void test_google()
	{
		driver.get("https://www.google.com/");
		extenttest.log(LogStatus.PASS, "URL is loaded");
		if(driver.getTitle().contains("Google"))
		{
			extenttest.log(LogStatus.PASS, "Title contains Google");
		}
		else
		{
			extenttest.log(LogStatus.FAIL,"Title doesnt contain Google");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		testextentreport.endTest(extenttest);
		testextentreport.flush();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
