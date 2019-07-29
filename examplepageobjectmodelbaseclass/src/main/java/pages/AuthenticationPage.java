package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {
	
	LoginPage loginpage;
	
	@FindBy(id="email_create")
	private WebElement email;
	
	@FindBy(id="SubmitCreate")
	private WebElement submitcreate;

	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void authenticationpageenterdetails(String email)
	{
		setText(this.email,email);
	}
	
	public void authenticationpagecreateaccount()
	{
		click_element(this.submitcreate);
		
	}
}
