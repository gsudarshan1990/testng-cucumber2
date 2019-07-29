package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Register  extends BasePage{
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@ng-model='LastName']")
	private WebElement lastname;
	
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
	
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	private WebElement emailaddress;
	
	@FindBy(xpath="//input[@ng-model='Phone']")
	private WebElement phone;
	
	@FindBys(value = { @FindBy(xpath="//input[@type='radio']") })
	private List<WebElement> radiobuttons;
	
	@FindBys(value = { @FindBy(xpath="//input[@type='checkbox']") })
	private List<WebElement> checkboxes;
	
	@FindBy(id="msdd")
	private WebElement languages;
	
	@FindBy(id="Skills")
	private WebElement skills;
	
	@FindBy(id="countries")
	private WebElement country;
	
	@FindBy(id="country")
	private WebElement selectcountry;
	
	@FindBy(id="yearbox")
	private WebElement year;
	
	@FindBy(xpath="//select[@ng-model='monthbox']")
	private WebElement month;
	
	@FindBy(id="daybox")
	private WebElement day;
	
	@FindBy(id="firstpassword")
	private WebElement firstpassword;
	
	@FindBy(id="secondpassword")
	private WebElement secondpassword;
	
	@FindBy(name="signup")
	private WebElement submitbutton;

	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void enterDetails(String Firstname,String Lastname,String Address,String emailaddress,String phone, String gender,String[] hobbies,String languages, String skill,String country,String selectcountry,String year,String month,String day,String firstpassword,String secondpassword)
	{
		
		
		
		setText(this.firstname,Firstname);
		setText(this.lastname,Lastname);
		setText(this.address,Address);
		setText(this.emailaddress,emailaddress);
		setText(this.phone,phone);
		select_radiobutton(radiobuttons,gender);
		select_checkbox(checkboxes,hobbies[0],hobbies[1],hobbies[2]);
		//setText(this.languages,languages);
		select_dropdown(this.skills,skill);
		select_dropdown(this.country,country);
		select_dropdown(this.selectcountry,selectcountry);
		select_dropdown(this.year,year);
		select_dropdown(this.month,month);
		select_dropdown(this.day,day);
		setText(this.firstpassword,firstpassword);
		setText(this.secondpassword,secondpassword);
		
	}
	
	public void click_submit()
	{
		click_element(this.submitbutton);
	}
	
}
