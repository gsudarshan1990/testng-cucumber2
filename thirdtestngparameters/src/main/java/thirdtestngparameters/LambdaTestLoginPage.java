package thirdtestngparameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaTestLoginPage {

	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	
	@FindBy(xpath="//button")
	private WebElement login_button;
	
	public LambdaTestLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_email()
	{
		return email;
	}
	
	public WebElement get_password()
	{
		return password;
	}
	
	public WebElement get_login_button()
	{
		return login_button;
	}
}
