package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;
	
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
		element.clear();
		element.sendKeys(text);
	}

	public void select_radiobutton(List<WebElement> radiobuttons,String value)
	{
	
		for(WebElement radiobutton:radiobuttons)
		{
			if(radiobutton.getAttribute("value").equals(value))
			{
				radiobutton.click();
			}
		}
	}
	
	public void select_checkbox(List<WebElement> checkboxes,String value1,String value2,String value3)
	{
		if(checkboxes.get(0).getAttribute("value").equals(value1))
		{
			checkboxes.get(0).click();
		}
		if(checkboxes.get(1).getAttribute("value").equals(value2))
		{
			checkboxes.get(1).click();
		}
		if(checkboxes.get(2).getAttribute("value").equals(value3))
		{
			checkboxes.get(2).click();
		}
	}
	
	public void select_dropdown(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public void click_element(WebElement element)
	{
		element.click();
	}
}
