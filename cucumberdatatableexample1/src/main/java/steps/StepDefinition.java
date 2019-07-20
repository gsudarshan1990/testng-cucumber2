package steps;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	private List<Integer> classnumbers;
	private int sum;
	
	@Given("^There exists three numbers$")
	public void there_exists_three_numbers(List<Integer> numbers) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    this.classnumbers=numbers;
	}

	@When("^I sum all of them$")
	public void i_sum_all_of_them() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   for(Integer number:classnumbers)
	   {
		   sum+=number;
	   }
	}

	@Then("^sum should be (\\d+)$")
	public void sum_should_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(sum,arg1);
	}
	
}
