package secondtestngparameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {

	private WebDriver driver;
	
	
	
	@BeforeClass
	@Parameters({"property1","property2"})
	public void init(String property1,String property2)
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	@Parameters({"base_url"})
	public void navigate_url(String base_url)
	{
		driver.get(base_url);
	}
	
	
	@AfterClass
	public void finalize()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
