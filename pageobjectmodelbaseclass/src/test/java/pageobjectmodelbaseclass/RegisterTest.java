package pageobjectmodelbaseclass;

import org.testng.annotations.Test;

import pages.LambdaTestRegister;

public class RegisterTest extends BaseTest {
	
	LambdaTestRegister lambdatestregister;
	
	@Test
	public void register_test()
	{
		lambdatestregister=new LambdaTestRegister(driver);
		lambdatestregister.loadURL("https://accounts.lambdatest.com/register");
		lambdatestregister.enterdetails("Accenture", "sudarshan2019", "sudarshang@accenture.com", "password1", "123456789");
		lambdatestregister.agreeterms();
		lambdatestregister.click_signup();
		
	}

}
