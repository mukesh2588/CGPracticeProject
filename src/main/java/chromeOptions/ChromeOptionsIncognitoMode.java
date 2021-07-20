package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionsIncognitoMode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkspace\\ChromeDriverLatest\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver=new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.guru99.com/chrome-options-desiredcapabilities.html");
		driver.manage().window().maximize();
		
		
		

	}

}
	