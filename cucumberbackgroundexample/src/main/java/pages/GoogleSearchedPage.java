package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchedPage {
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement searched_item;
	
	@FindAll(value = { @FindBy(xpath="//div[@class='r']//h3") })
	private List<WebElement> allsearchresult;
	
	
	public GoogleSearchedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement get_searched_item()
	{
		return searched_item;
	}
	
	public List<WebElement> get_all_search_list()
	{
		return allsearchresult;
	}
	
}
