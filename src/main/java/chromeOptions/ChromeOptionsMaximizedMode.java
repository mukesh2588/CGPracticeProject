package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsMaximizedMode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkspace\\ChromeDriverLatest\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://smartbear.com/blog/how-and-when-to-use-javas-threadlocal-object/");

	}

}
