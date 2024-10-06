package CGTraining.CGPracticeProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSite {

	public static void main(String[] args) {
	//	Properties prop=new Properties();
		Properties prop=new Properties();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://beginnersbook.com/2013/03/oops-in-java-encapsulation-inheritance-polymorphism-abstraction/");
		
		try {
			String filePath=System.getProperty("user.dir")+"\\config.properties";
			
			File file=new File(filePath);
			
			FileInputStream fileInputStream=new FileInputStream(file);
			
			prop.load(fileInputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url=prop.getProperty("URL");
		driver.get(url);
		driver.manage().window().maximize();

	}

}
