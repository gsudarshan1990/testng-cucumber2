package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		element.clear();
		element.sendKeys(text);
	}
	
	public void click_element(WebElement element)
	{
		element.click();
	}
	
	
	public void select_radiobutton(List<WebElement> radiobuttons,String value)
	{
		for(WebElement radiobutton:radiobuttons)
		{
			if(radiobutton.getText().trim().contentEquals(value))
			{
				radiobutton.click();
			}
		}
	}
	
	public void select_dropdown(WebElement element, String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public void select_checkbox(List<WebElement> checkboxes,String[] value)
	{
		if(checkboxes.get(0).getText().trim().equals(value[0]))
		{
			checkboxes.get(0).click();
		}
		
		if(checkboxes.get(1).getText().trim().equals(value[1]))
		{
			checkboxes.get(0).click();
		}
	}
}
