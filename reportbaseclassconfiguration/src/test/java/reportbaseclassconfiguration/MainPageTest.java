package reportbaseclassconfiguration;

import org.testng.annotations.Test;

import pages.MainPage;
import utility.Configuration;

public class MainPageTest extends BaseTest {
	
	MainPage mainpage;
	Configuration config;
	@Test(groups="firsttest")
	public void test_homepage()
	{
		 mainpage=new MainPage(driver);
		 config=new Configuration();
		 mainpage.loadURL(config.getURL());
		 mainpage.clickloginpagebutton();
	}

}
