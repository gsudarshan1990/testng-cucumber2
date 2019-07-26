package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionClass {
	
	private List<String> username;
	private List<String> password;
	private List<Map<String,String>> credentials;
	

	@Given("^username and pass$")
	public void username_and_pass(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		this.credentials=arg1.asMaps(String.class, String.class);
		username=new ArrayList<String>();
		password=new ArrayList<String>();
		
		for(Map<String,String> credential:credentials)
		{
			username.add(credential.get("userName"));
			password.add(credential.get("password"));
		}
	  
	}

	@When("^display the username and password$")
	public void display_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		System.out.println(username);
		System.out.println(password);
	}


	
	
}
