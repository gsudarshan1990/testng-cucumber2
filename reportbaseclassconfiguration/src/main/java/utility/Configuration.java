package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	Properties prop;
	public Configuration()
	{
		File src=new File("./Configuration/config.property");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getChromePath()
	{
		return prop.getProperty("chromepath");
	}
	
	public String getURL()
	{
		return prop.getProperty("URL");
	}
	
	public String getemail()
	{
		return prop.getProperty("username");
	}
	
	public String getpassword()
	{
		return prop.getProperty("password");
	}

}
