package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	
	@FindBy(name="reg_email__")
	private WebElement registeremail;
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement reenteremailaddress;
	
	@FindBy(name="reg_passwd__")
	private WebElement registerpassword;
	
	@FindBy(name="birthday_day")
	private WebElement select_birthday;
	
	@FindBy(name="birthday_month")
	private WebElement select_birthmonth;
	
	@FindBy(name="birthday_year")
	private WebElement select_birthyear;
	
	@FindBys(value = { @FindBy(xpath="//input[@type='radio']") })
	private List<WebElement> radiobuttons;
	
	@FindBy(xpath="//div[@id='reg_form_box']//button[contains(text(),'Sign Up')]")
	private WebElement signup;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails(String firstname,String lastname,String registeremail,String password,String day,String month,String year,String index)
	{
		setText(this.firstname,firstname);
		setText(this.lastname,lastname);
		setText(this.registeremail,registeremail);
		setText(this.reenteremailaddress,registeremail);
		setText(this.registerpassword,password);
		selectFromDropDown(this.select_birthday,day);
		selectFromDropDown(this.select_birthmonth,month);
		selectFromDropDown(this.select_birthyear,year);
		select_radioButton(this.radiobuttons,index);
		
		
	}
	
	public void click_signup()
	{
		click_element(this.signup);
	}
	

}
