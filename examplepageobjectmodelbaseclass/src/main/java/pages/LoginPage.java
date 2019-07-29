package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	@FindBys(value = { @FindBy(xpath="//input[@type='radio']") })
	private List<WebElement> radiobuttons;
	
	@FindBy(id="customer_firstname")
	private WebElement firstname;
	
	@FindBy(id="customer_lastname")
	private WebElement lastname;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="days")
	private WebElement days;
	
	@FindBy(id="months")
	private WebElement months;
	
	@FindBy(id="years")
	private WebElement years;
	
	@FindBys(value = { @FindBy(xpath="//input[@type='checkbox']") })
	private List<WebElement> checkboxes;

	@FindBy(id="company")
	private WebElement company;
	
	@FindBy(id="address1")
	private WebElement addressline1;
	
	@FindBy(id="address2")
	private WebElement addressline2;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement selectstate;
	
	@FindBy(id="postcode")
	private WebElement zipcode;
	
	@FindBy(id="id_country")
	private WebElement selectcountry;
	
	@FindBy(id="other")
	private WebElement additionalinformation;
	
	@FindBy(id="phone")
	private WebElement homephone;
	
	@FindBy(id="phone_mobile")
	private WebElement mobilephone;
	
	@FindBy(id="alias")
	private WebElement aliasemailaddress;
	
	@FindBy(id="submitAccount")
	private WebElement register;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void enterDetails(String gender,String firstname,String lastname,String password,String day,String month,String year,String[] checkboxvalue,String company,String addressline1,String addressline2,String city,String state,String zipcode,String country,String additionalinformation,String homephone,String mobilephone,String aliasemailaddress)
	{
		select_radiobutton(this.radiobuttons,gender);
		setText(this.firstname,firstname);
		setText(this.lastname,lastname);
		setText(this.password,password);
		select_dropdown(this.days,day);
		select_dropdown(this.months,month);
		select_dropdown(this.years,year);
		select_checkbox(this.checkboxes,checkboxvalue);
		setText(this.company,company);
		setText(this.addressline1,addressline1);
		setText(this.addressline2,addressline2);
		setText(this.city,city);
		select_dropdown(this.selectstate,state);
		setText(this.zipcode,zipcode);
		select_dropdown(this.selectcountry,country);
		setText(this.additionalinformation,additionalinformation);
		setText(this.homephone,homephone);
		setText(this.mobilephone,mobilephone);
		setText(this.aliasemailaddress,aliasemailaddress);
		
	}
	
	public void click_register()
	{
		click_element(this.register);
	}
}
