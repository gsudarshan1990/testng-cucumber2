package pagefactorymodelexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GitHubHomePage;

public class TestNGExample {

	private static String property1="webdriver.chrome.driver";
	private static String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	public static WebDriver driver;
	private static String base_url="https://github.com/";
	GitHubHomePage githubhomepage;
	
	@BeforeClass
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void github_register()
	{
		driver.get(base_url);
		githubhomepage=new GitHubHomePage(driver);
		githubhomepage.enter_details("fistname2019", "firstname2019@gmail.com", "password1");
		githubhomepage.click_signup();
	}
	
	@AfterClass
	public void finalize()
	{
		driver.quit();
	}
}
