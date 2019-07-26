package steps;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String birthDate;
	

	public void set_firstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public void set_lastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public void set_birthDate(String birthDate)
	{
		this.birthDate=birthDate;
	}
	
	public String get_firstName()
	{
		return firstName;
	}
	
	public String get_lastName()
	{
		return lastName;
	}
	
	public String get_birthDate()
	{
		return birthDate;
	}
}
