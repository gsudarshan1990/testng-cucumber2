package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	LoginPage loginpage;
	
	@Test(groups= {"second"}, dependsOnGroups="first")
	public void logintest()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginpage=new LoginPage(driver);
		String[] checkboxvalue= {"1",""};
		loginpage.enterDetails("Mr.", "Sudarshan", "suraj", "password1", "1", "6", "1990", checkboxvalue, "Accenture", "1-6-516", "Chaitanyapure", "Buffalo", "7", "500050", "21", "Nothing", "1234567890", "0987654321", "nothing@gmail.com");
		loginpage.click_register();
	}

}
