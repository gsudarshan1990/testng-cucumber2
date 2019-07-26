package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	@FindBy(xpath="//input[@title='Search']")
	private WebElement search_box;
	
	@FindBy(xpath="//div[@class='FPdoLc VlcLAe']//center//input[@value='Google Search']")
	private WebElement search_button;
	
	private GoogleSearchedPage googlesearchedpage;
	
	public GoogleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_data_search(String keyword)
	{
		this.search_box.sendKeys(keyword);
	}
	
	public GoogleSearchedPage click_search_button(WebDriver driver)
	{
		this.search_button.click();
		googlesearchedpage=new GoogleSearchedPage(driver);
		return googlesearchedpage;
	}
}
