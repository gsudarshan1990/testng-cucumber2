package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basepage {

	WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void loadURL(String url)
	{
		driver.get(url);
	}
	
	public void setText(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	
	public void click_element(WebElement element)
	{
		element.click();
	}
}
