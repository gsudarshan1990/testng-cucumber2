package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	Properties pro;
	public Configuration()
	{
		File src=new File("./Configuration/config.property");
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
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
		return pro.getProperty("ChromePath");
	}
	
	public String getURL()
	{
		return pro.getProperty("URL");
	}

}
