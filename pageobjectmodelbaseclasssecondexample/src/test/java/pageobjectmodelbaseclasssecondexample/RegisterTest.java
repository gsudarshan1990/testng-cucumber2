package pageobjectmodelbaseclasssecondexample;

import org.testng.annotations.Test;

import pages.LoginPage;

public class RegisterTest extends BaseTest {
	
	LoginPage loginpage;
	
	
	@Test
	public void login_test() throws Throwable
	{
	
		loginpage=new LoginPage(driver);
		loginpage.loadURL("https://www.facebook.com/");
		loginpage.enterDetails("Lakshmipathy", "sekar", "Lakshmipathysekar2019@gmail.com", "password1", "20", "6", "1989","2");
		Thread.sleep(3000);
		loginpage.click_signup();
	}

}
