package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubHomePage {
	
	@FindBy(id="user[login]")
	private WebElement username;
	
	@FindBy(id="user[email]")
	private WebElement email;
	
	@FindBy(id="user[password]")
	private WebElement password;
	
	@FindBy(xpath="(//button[contains(text(),'Sign up for GitHub')])[1]")
	private WebElement signup_button;
	
	public GitHubHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enter_details(String username,String email, String password)
	{
		this.username.sendKeys(username);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
	}
	
	public void click_signup()
	{
		this.signup_button.click();
	}
}
