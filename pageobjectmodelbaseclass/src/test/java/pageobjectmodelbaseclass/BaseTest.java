package pageobjectmodelbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	protected WebDriver driver;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
	
}
