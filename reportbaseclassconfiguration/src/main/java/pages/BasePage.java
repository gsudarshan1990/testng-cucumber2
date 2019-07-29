package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loadURL(String url)
	{
		driver.get(url);
	}

	public void setText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public void click_element(WebElement element)
	{
		element.click();
	}
	
	public String get_url()
	{
		return driver.getCurrentUrl();
	}
}
