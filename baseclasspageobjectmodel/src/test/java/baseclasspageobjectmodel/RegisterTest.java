package baseclasspageobjectmodel;

import org.testng.annotations.Test;

import pages.Register;

public class RegisterTest extends BaseTest{
	
	Register register;
	
	@Test
	public void registertest()
	{
		register=new Register(driver);
		register.loadURL(PAGE_URL);
		String[] hobbiess= {"Cricket","","Hockey"};
		register.enterDetails("Sudarshan", "Govindarajan", "Chennai", "sudarshang@hexaware.com", "1234567890", "Male", hobbiess, "Tamil", "Art Design", "Australia","Bangladesh", "1990", "June", "1", "password1", "password1");
		
	}

}
