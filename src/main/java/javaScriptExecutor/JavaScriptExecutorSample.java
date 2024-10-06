package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://blog.testproject.io/2020/01/16/selenium-browser-method-categories-browser-methods/");
		
	//	JavascriptExecutor js=(JavascriptExecutor)driver;    // When WebDriver driver=new ChromeDriver(); used
		
		JavascriptExecutor js=driver;                       // when ChromeDriver driver= new ChromeDriver(); used
		
		js.executeScript("window.scrollBy(0,1600)");

	}

}
