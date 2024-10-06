package chromeOptions;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsSample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		//options.addArguments("--headless");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://ess.hgsbs.com/Login/Login");
		
		System.out.println("Page title is: "+driver.getTitle());
		

	}

}
