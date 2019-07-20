package testingparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowserTesting {

	private static WebDriver driver;
	
	
	@Test
	@Parameters({"base_url1","property1","property2"})
	public void executionone(String base_url1,String property1,String property2)
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.get(base_url1);
	}
	
	@Test
	@Parameters({"base_url2","property1","property2"})
	public void executiontwo(String base_url2,String property1,String property2)
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.get(base_url2);
	}
	
	@Test
	@Parameters({"base_url3","property1","property2"})
	public void executionthree(String base_url3,String property1,String property2)
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.get(base_url3);
	}
	
	@AfterTest
	public void finalize()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
