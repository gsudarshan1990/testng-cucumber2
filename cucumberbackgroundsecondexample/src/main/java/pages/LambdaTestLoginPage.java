package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaTestLoginPage {
	
	@FindBy(name="email")
	private WebElement email;
	
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	private WebElement login_button;
	
	private LambdaTestLandingPage lambdatestlandingpage;
	
	public LambdaTestLoginPage(WebDriver driver)
	{
		PageFactory.initElements(steps.StepDefinitionClass.driver, this);
	}

	public void enter_details(String username,String password)
	{
		this.email.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public LambdaTestLandingPage click_login(WebDriver driver)
	{
		this.login_button.click();
		lambdatestlandingpage=new LambdaTestLandingPage(driver);
		return lambdatestlandingpage;
	}
	
}
