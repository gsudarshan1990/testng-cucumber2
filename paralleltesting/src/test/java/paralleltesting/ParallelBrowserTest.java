package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelBrowserTest {

	private static WebDriver driver;
	
	@Test
	public void executionOne()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void executiontwo()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
	}
	
	@Test
	public void executionthree()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
	}
}
