package framesProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProg2 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/switchClass/");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//find frame with Index
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("button")).click();
		
	}

}
