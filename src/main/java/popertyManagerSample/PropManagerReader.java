package popertyManagerSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropManagerReader {

	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();
		
		String filePath= System.getProperty("user.dir")+"\\Object_Repo.properties";
		
		File file=new File(filePath);
		
		FileInputStream fis= new FileInputStream(file);
		
		prop.load(fis);
		
		System.out.println("Property file loaded");
		
		String URLfromFile=prop.getProperty("URL");
		System.out.println(URLfromFile);
		
		fis.close();
	
	}

}
