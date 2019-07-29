package tests;

import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.LoginPage;

public class AuthenticationPageTest extends BaseTest{

	AuthenticationPage authenticationpage;
	
	@Test(groups= {"first"})
	public void authenticationtest()
	{
		authenticationpage=new AuthenticationPage(driver);
		authenticationpage.loadURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		authenticationpage.authenticationpageenterdetails("sudarshang@gmail.com");
		authenticationpage.authenticationpagecreateaccount();
	}
	
}

