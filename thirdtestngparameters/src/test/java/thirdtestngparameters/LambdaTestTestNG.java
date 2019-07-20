package thirdtestngparameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LambdaTestTestNG {
	
	private WebDriver driver;
	LambdaTestLoginPage lambdatestloginpage;
	
	@BeforeTest
	@Parameters({"property1","property2"})
	public void init(String property1,String property2)
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	@Parameters({"base_url","username","password"})
	public void test_login_page(String base_url,String username,String password)
	{
		driver.get(base_url);
		lambdatestloginpage=new LambdaTestLoginPage(driver);
		lambdatestloginpage.get_email().sendKeys(username);
		lambdatestloginpage.get_password().sendKeys(password);
		lambdatestloginpage.get_login_button().click();
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
