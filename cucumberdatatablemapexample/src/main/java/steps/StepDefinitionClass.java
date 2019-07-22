package steps;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionClass {
	
	Map<String,Integer> pricelist;
	int total_cost;
	
	@Given("^the price list of the coffee shop$")
	public void the_price_list_of_the_coffee_shop(Map<String,Integer> pricelist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   this.pricelist=pricelist;
	}

	@When("^I order (\\d+) \"([^\"]*)\"$")
	public void i_order(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    int cost=pricelist.get(arg2);
	    total_cost+=cost;
	}

	@Then("^price is (\\d+)$")
	public void price_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(total_cost);
	   System.out.println(arg1);
	   Assert.assertEquals(total_cost, arg1);
	}


}
