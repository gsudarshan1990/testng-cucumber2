package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionClass {
	
	private List<Map<String,String>> details;
	private List<String> map_firstname;
	private List<String> map_lastname;
	private List<String> map_birthdate;
	private List<UserDetails> listuserdetails;
	private List<String> list_firstname;
	private List<String> list_lastname;
	private List<String> list_birthDate;
	private List<List<String>> listoflistdetails;
	private List<String> listoflistfirstname;
	private List<String> listoflistlastname;
	private List<String> listoflistbirthdate;
	
	@Given("^firstname and lastname and birthDate$")
	public void firstname_and_lastname_and_birthDate(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		map_firstname=new ArrayList<String>();
		map_lastname=new ArrayList<String>();
		map_birthdate=new ArrayList<String>();
		this.details=arg1.asMaps(String.class, String.class);
		for(Map<String,String> detail:details)
		{
			map_firstname.add(detail.get("firstName"));
			map_lastname.add(detail.get("lastName"));
			map_birthdate.add(detail.get("birthDate"));
			
		}
	   
		listuserdetails=arg1.asList(steps.UserDetails.class);
		list_firstname=new ArrayList<String>();
		list_lastname=new ArrayList<String>();
		list_birthDate=new ArrayList<String>();
		for(UserDetails userdetail:listuserdetails)
		{
			list_firstname.add(userdetail.get_firstName());
			list_lastname.add(userdetail.get_lastName());
			list_birthDate.add(userdetail.get_birthDate());
		}
		
		listoflistdetails=arg1.asLists(String.class);
		listoflistfirstname=new ArrayList<String>();
		listoflistlastname=new ArrayList<String>();
		listoflistbirthdate=new ArrayList<String>();
		for(int i=1;i<listoflistdetails.size();i++)
		{
			List<String> listdetails=listoflistdetails.get(i);
			listoflistfirstname.add(listdetails.get(0));
			listoflistlastname.add(listdetails.get(1));
			listoflistbirthdate.add(listdetails.get(2));
		}
	}

	@Then("^print in three formats map and list and list of list$")
	public void print_in_three_formats_map_and_list_and_list_of_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Map Format");
		System.out.println(details);
		System.out.println(map_firstname);
		System.out.println(map_lastname);
		System.out.println(map_birthdate);
		System.out.println("==========================");
		System.out.println("List<Class> Format");
		System.out.println(listuserdetails);
		System.out.println(list_firstname);
		System.out.println(list_lastname);
		System.out.println(list_birthDate);
		System.out.println("============================");
		System.out.println("List<List<String>> Format");
		System.out.println(listoflistfirstname);
		System.out.println(listoflistlastname);
		System.out.println(listoflistbirthdate);
	}



}
