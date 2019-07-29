package reportbaseclassconfiguration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Configuration;

public class LoginPageTest extends BaseTest {

	LoginPage loginpage;
	Configuration config;
	@Test(groups="B",dependsOnGroups="firsttest")
	public void logintest()
	{
		
		loginpage=new LoginPage(driver);
		Assert.assertEquals(true, loginpage.get_url().equals("https://www.n11.com/giris-yap"));
		config=new Configuration();
		loginpage.enterDetails(config.getemail(), config.getpassword());
		loginpage.click_sign();
	}
}
