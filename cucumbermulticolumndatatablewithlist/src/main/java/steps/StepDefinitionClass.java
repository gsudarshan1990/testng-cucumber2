package steps;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionClass {
	
	private List<String> username;
	private List<String> password;
	private List<UserDetails> userdetails;
	
	@Given("^username and password$")
	public void username_and_password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
		this.userdetails=arg1.asList(steps.UserDetails.class);
		username=new ArrayList<String>();
		password=new ArrayList<String>();
	
		for(UserDetails userdetail:userdetails)
		{
			username.add(userdetail.get_username());
			password.add(userdetail.get_password());
		}
	
	}

	@Then("^display the username and password$")
	public void display_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(username);
	    System.out.println(password);
	}

}
