package steps;

public class UserDetails {

	private String userName;
	private String password;
	
	public void set_username(String username)
	{
		this.userName=username;
	}
	
	
	public void set_password(String password)
	{
		this.password=password;
	}
	
	public String get_username()
	{
		return userName;
	}
	
	public String get_password()
	{
		return password;
	}
}
