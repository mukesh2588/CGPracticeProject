package framesProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProg {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "F:\\EclipseWorkspace\\ChromeDriverLatest\\chromedriver.exe");
		String driverPath=System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\";
		System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/switchClass/");

		driver.manage().window().maximize();

		//find frame By Web Element
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

		driver.findElement(By.id("button")).click();

	}

}
