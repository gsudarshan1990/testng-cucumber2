package objectrepositoryexample;

import utility.Configuration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestConfigFile {
	WebDriver driver;
	Configuration config;
	@BeforeClass
	public void setUp()
	{
		config=new Configuration();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void testURL() throws Exception
	{
		
		driver.get(config.getURL());
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
