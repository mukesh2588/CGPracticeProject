package chromeOptions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.tools.javac.main.Option;

public class ChromeOptionsSample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		DesiredCapabilities capabilitis =new DesiredCapabilities();
		capabilitis.setAcceptInsecureCerts(true);   //accept insecure certificate
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		//options.addArguments("--headless");
		options.merge(capabilitis);       // to merge exiting capabilities
		
		
		WebDriver driver=new ChromeDriver(options);
		//driver.get("https://ess.hgsbs.com/Login/Login");
		driver.get("http://www.cacert.org/");
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		System.out.println("Page title is: "+driver.getTitle());
		

	}

}
