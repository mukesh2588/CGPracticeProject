package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextNDoubleClick1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkhedkar\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement userName=driver.findElement(By.name("userName"));
		
		userName.sendKeys("Mktest1234");
		
		Actions act=new Actions(driver);
		
		//act.doubleClick(userName).pause(1000).contextClick().build().perform();
		
		act.doubleClick(userName).pause(1000).contextClick(userName).perform();
		
		//act.contextClick(userName).build().perform();

	}

}
