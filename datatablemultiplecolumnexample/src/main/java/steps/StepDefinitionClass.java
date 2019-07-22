package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionClass {
	List<String> title;
	List<String> amount;
	List<String> probability;
	List<String> commission;
	List<Map<String,String>> datatable_details;
	
	@Given("^from the multiple column datatable$")
	public void from_the_multiple_column_datatable(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    this.datatable_details=arg1.asMaps(String.class, String.class);
	    title=new ArrayList<String>();
	    amount=new ArrayList<String>();
	    probability=new ArrayList<String>();
	    commission=new ArrayList<String>();
	    for(Map<String,String> single_detail:datatable_details)
	    {
	    	
	    	title.add(single_detail.get("title"));
	    	amount.add(single_detail.get("amount"));
	    	probability.add(single_detail.get("probability"));
	    	commission.add(single_detail.get("commission"));
	    }
	}

	@When("^Print the titles,amount,probability,commission$")
	public void print_the_titles_amount_probability_commission() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println(title);
		System.out.println(amount);
		System.out.println(probability);
		System.out.println(commission);
	}


}
