package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaTestRegister extends Basepage {

	@FindBy(name="organization_name")
	private WebElement organization_name;
	
	@FindBy(name="name")
	private WebElement fullname;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(id="terms_of_service")
	private WebElement agreecheckbox;
	
	@FindBy(xpath="//button[contains(text(),'Free Signup')]")
	private WebElement signup;
	
	public LambdaTestRegister(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void enterdetails(String organization_name,String fullname,String email,String password,String phone)
	{
		setText(this.organization_name,organization_name);
		setText(this.fullname,fullname);
		setText(this.email,email);
		setText(this.password,password);
		setText(this.phone,phone);
	}

	public void agreeterms()
	{
		click_element(agreecheckbox);
	}
	
	public void click_signup()
	{
		click_element(signup);
	}
}
