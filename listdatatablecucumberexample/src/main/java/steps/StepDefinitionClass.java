package steps;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass {
	
	private List<Double> numberlist;
	private int total;
	
	@Given("^a list of real numbers$")
	public void a_list_of_real_numbers(List<Double> numberlist) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		this.numberlist=numberlist;
	  
	}

	@When("^I calculate sum of them$")
	public void i_calculate_sum_of_them() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   for(Double number:numberlist)
	   {
		   total+=number;
	   }
	}

	@Then("^I will get (\\d+)\\.(\\d+)$")
	public void i_will_get(int arg1,int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		double actual=(double)total;
		double expectedvalue=(double)arg1;
		System.out.println(actual);
		System.out.println(expectedvalue);
		
		Assert.assertEquals(expectedvalue, actual,0.0f);
		
	}

}
