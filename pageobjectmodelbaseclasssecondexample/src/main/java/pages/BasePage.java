package pages;

import java.util.List;

import org.openqa.selenium.By;
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
	
	public void setText(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	
	public void selectFromDropDown(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public void click_element(WebElement element)
	{
		element.click();
	}
	
	public void select_radioButton(List<WebElement> radiobuttons,String index)
	{
		
		for(WebElement radiobutton:radiobuttons)
		{
			if(radiobutton.getAttribute("value").equals(index))
			{
					radiobutton.click();
			}
		}
	
	}
}
