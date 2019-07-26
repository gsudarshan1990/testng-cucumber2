package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LambdaTestLandingPage {
	
	public LambdaTestLandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String get_url(WebDriver driver)
	{
		return driver.getCurrentUrl();
	}

}
