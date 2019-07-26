package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LambdaTestLandingPage;
import pages.LambdaTestLoginPage;

public class StepDefinitionClass {
	
	private static String property1="webdriver.chrome.driver";
	private static String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	public static WebDriver driver;
	private static String base_url="https://accounts.lambdatest.com/login";
	LambdaTestLoginPage lambdatestloginpage;
	LambdaTestLandingPage lambdatestlandingpage;
	
	
	@Before
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^User is on lamdbatest login page$")
	public void user_is_on_lamdbatest_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(base_url);
	   
	}

	@When("^User provides \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void user_provides_as_username_and_as_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		lambdatestloginpage=new LambdaTestLoginPage(driver);
		lambdatestloginpage.enter_details(arg1, arg2);
		lambdatestlandingpage=lambdatestloginpage.click_login(driver);
	}

	@Then("^User moves to landing page$")
	public void user_moves_to_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(lambdatestlandingpage.get_url(driver).equals("https://accounts.lambdatest.com/email/verify"));
	}
	
}
