package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.GoogleHomePage;
import pages.GoogleSearchedPage;

public class StepDefinitionClass {

	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private static WebDriver driver;
	private String base_url="http://www.google.com";
	GoogleHomePage googlehomepage;
	GoogleSearchedPage googlesearchedpage;
	WebDriverWait wait;
	
	@Before
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("^user is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(base_url);
	    googlehomepage=new GoogleHomePage(driver);
	}

	@When("^the search phrase \"([^\"]*)\" is entered$")
	public void the_search_phrase_is_entered(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		googlehomepage.enter_data_search(arg1);
		googlesearchedpage=googlehomepage.click_search_button(driver);
	}

	@Then("^results of \"([^\"]*)\" is shown$")
	public void results_of_is_shown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> allsearchresult=googlesearchedpage.get_all_search_list();
		for(int i=0;i<allsearchresult.size();i++)
		{
			if (allsearchresult.get(i).getText().toLowerCase().isEmpty())
			{
				continue;
			}
			else
			{
				Assert.assertTrue(allsearchresult.get(i).getText().toLowerCase().contains(arg1));
			}
			
		}
		
	}
	
}
