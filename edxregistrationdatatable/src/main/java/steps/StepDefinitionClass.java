package steps;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EdxRegistrationPage;

public class StepDefinitionClass {
	
	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private static WebDriver driver;
	private String base_url="https://courses.edx.org/register";
	private Map<String,String> information;
	EdxRegistrationPage edxregistrationpage;
	
	@Before
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("^User is on edx registration page$")
	public void user_is_on_edx_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get(base_url);
	}

	@When("^User enter details$")
	public void user_enter_details(Map<String,String> details) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		this.information=details;
		edxregistrationpage=new EdxRegistrationPage(driver);
		edxregistrationpage.get_email().sendKeys(information.get("email"));
		edxregistrationpage.get_fullname().sendKeys(information.get("fullname"));
		edxregistrationpage.get_username().sendKeys(information.get("username"));
		edxregistrationpage.get_password().sendKeys(information.get("password"));
		Select select_dropbox=new Select(edxregistrationpage.get_select());
		select_dropbox.selectByValue(information.get("country"));
		edxregistrationpage.get_checkbox().click();
		edxregistrationpage.get_button().click();
		
	}

	@Then("^user gets registered$")
	public void user_gets_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
