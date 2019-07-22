package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EdxRegistrationPage {
	
	@FindBy(id="register-email")
	private WebElement registeremail; 
	
	@FindBy(id="register-name")
	private WebElement fullname;
	
	
	@FindBy(id="register-username")
	private WebElement username;
	
	@FindBy(id="register-password")
	private WebElement password;
	
	@FindBy(id="register-country")
	private WebElement select;
	
	@FindBy(id="toggle_optional_fields")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement create_account_button;
	
	
	public EdxRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_email()
	{
		return registeremail;
	}
	
	public WebElement get_fullname()
	{
		return fullname;
	}
	
	public WebElement get_username()
	{
		return username;
	}
	
	public WebElement get_password()
	{
		return password;
	}
	
	public WebElement get_select()
	{
		return select;
	}
	
	public WebElement get_checkbox()
	{
		return checkbox;
	}
	
	public WebElement get_button()
	{
		return create_account_button;
	}
}
